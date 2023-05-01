package org.example;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.ConnectionString;
import com.mongodb.ServerAddress;
import com.mongodb.MongoCredential;
import com.mongodb.MongoClientOptions;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.model.CreateCollectionOptions;
import com.mongodb.client.model.ValidationOptions;

import java.util.Arrays;
public class mongodb {
    public static void main(String [] args) {
        //create a MongoDB that is created locally
        MongoClient mongoClient = MongoClients.create("mongodb://host1:27017");
        //get database named pokemon, if it is not created, it will be created when data is added to the db
        MongoDatabase database = mongoClient.getDatabase("pokemon");

        //Create a collection
        database.createCollection("AllPokemon");
    }
}
