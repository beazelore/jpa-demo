#!/bin/bash

docker run --name mysql-server -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=mytestbase -d mysql:8

docker build -t my-jpa-demo

docker run --name jpa-demo-app -p 8787:8080 --link mysql-server:mysql -d my-jpa-demo

echo Application is available on localhost:8787