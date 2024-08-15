# quarkus-pure-jdbc-with-transaction-sample

This is a simple PoC project to test quarkus pure jdbc connection to the database using transactions management.

## Stack

- Quarkus
- Kotlin 2.0
- Docker 
- Postgres

## Starting database

To start the postgres database locally we can use the docker compose file present on `docker/` folder.

```shell
cd docker
docker compose up
```

## Run the app

After start the postgres you can simply start the app on your local and navigate to the swagger: http://localhost:8080/q/swagger-ui 

There are 3 endpoints:
- POST /client: It'll successfully save a new client on db under a transaction.
- POST /client/error: It'll try to save a client on database, however it'll throw an exception right after save it which will rollback the transaction.
- GET /client/{id}: Fetch one client by id, without any transaction control.