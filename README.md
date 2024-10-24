# Java-Spring-Boot-Application

Java Spring Boot Application: Event Managment System

Develop a Java Spring Boot Application to manage events, Venues, and organizers.
The Applications support CRUD operations for these entities.

Entities:
Event
    Fields: id, eventName, eventDate, description
Relationships:
    An Event is organized by one Organizer.
    An Event takes place at one Venue.
-------------------------------------------------------
Venue
    Fields: id, name, location, capacity
Relationships:
    One Venue can host one Event.
-------------------------------------------------------
Organizer
    Fields: id, name, contactInfo
Relationships:
    An Organizer can organize multiple Events.
--------------------------------------------------------

*How to run*
1- Open Event Managment System folder in VS Code.
2- Go to Event Managment System/demo/src/main/resources/application.properties file and configure with MySql database.
3- Open file { Event Managment System/demo/src/main/java/com/example/demo/DemoApplication.java } and Run this file.

You can perform CRUD operation on Postman.    

API List:

    Event:
Create a New Event 

( http://localhost:8888/EvntAdd ) method- post, Body raw/JSON 

    Like this formate
{
        "eventName": "   ",
        "eventDate": "  ",
        "description": "   ",
        "venue": {
            "name": " ",
            "location": " ",
            "capacity": " "
        },
        "organizer": {
            "id": 3,
            "name": " ",
            "contactInfo": " "
        }
    }

    or 

   Add new event ( http://localhost:8888/Add ) method- post


Get All Events ( http://localhost:8888/AllEvnt ) method- get

Get Event by ID ( http://localhost:8888/AllEvnt ) method- get

Update Event    ( http://localhost:8888/updateEvent ) method- put

Delete Event    ( http://localhost:8888/deletEventById/{id} ) method- delete

Get Event by Venue ( http://localhost:8888/EvntByVenue/{id} ) method- get

Get Events by Organizer ( http://localhost:8888/EvntByOrganizer/{id} ) method- get

    Venue:
Create a New Venue( http://localhost:8888/VenueAdd ) method- post

Get Venue by ID     ( http://localhost:8888/Venue/{id} ) method- get

Update Venue    ( http://localhost:8888/updateVenue) method- put

Delete Venue    ( http://localhost:8888/deletVenueById/{id} ) method- delete

    Organizer:
Create a New Organizer ( http://localhost:8888/OrgAdd ) method- post

Get Organizer by ID ( http://localhost:8888/Org/{id} ) method- get

Update Organizer    ( http://localhost:8888/updateOrg) method- put

Delete Organizer    ( http://localhost:8888/deletOrgById/{id} ) method- delete
