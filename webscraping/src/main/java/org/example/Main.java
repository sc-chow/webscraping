package org.example;
import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Document doc;
        String url = "https://pokemondb.net/pokedex/national";
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //Testing to get header 1 = List of Pokemon
        Elements header1 = doc.select("h1");
        //Testing output
        System.out.println(header1.html());

        //Elements gen1pkmlist = doc.select("div.infocard-list infocard-list-pkmn-lg").select("div.infocard");

        //System.out.println(gen1pkmlist.html());



    }
}