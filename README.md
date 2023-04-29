# Sping Boot API Example

This project consists of an example REST API built with Spring Boot that queries a PostgreSQL database and publishes
messages to a Kafka stream.

For this example project, the scenario would be a API for a public library. The following model classes are needed:
* Book
* Floor
* Client

And the following endpoints are needed:
* GET /book/status -> returns whether a book has been checked in or not
* POST /book/status -> sets the checked in status of a book
* PATCH /book -> updates the book's information
* POST /client -> creates a new user
* PATCH /client -> updates a user
* DELETE /client -> deletes a user
* GET /client -> gets a user's information