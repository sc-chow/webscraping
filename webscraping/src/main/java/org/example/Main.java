package org.example;
import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
import java.io.IOException;

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
        //System.out.println(header1.html());

        //Testing to get all h2
        Elements header2 = doc.select("h2");
        //Testing output = Gen 1 - 9 Pokemons
        //System.out.println(header2.html());

        //Testing to get Gen 1 Pokemon info
        Elements div_infocard = doc.getElementsByClass("infocard");

        int generation_num = 1;

        //Iterate through all info cards
        //same as (int i = 0;i<div_infocard.size;i++)
        for (Element element : div_infocard) {

            String name = element.select("a.ent-name").text();

            Elements small = element.select("small");

            String num = small.get(0).text();

            String type = small.get(1).text();
            //Determine generation of the pokemons

            //Gen 1
            if (generation_num <= 151){
                String gen = "1";
                generation_num++;
            }
            //Gen 2
            else if(generation_num >= 152 && generation_num <= 251){
                String gen = "2";
                generation_num++;
            }
            //Gen 3
            else if(generation_num >=252 && generation_num <= 386){
                String gen = "3";
                generation_num++;
            }

            //Gen 4
            else if(generation_num >=387 && generation_num <= 493){
                String gen = "4";
                generation_num++;
            }
            //Gen 5
            else if(generation_num >= 494 && generation_num <=649){
                String gen = "5";
                generation_num++;
            }
            //Gen 6
            else if(generation_num >= 650 && generation_num <= 721){
                String gen = "6";
                generation_num++;
            }
            //Gen 7
            else if(generation_num >= 722 && generation_num <= 809){
                String gen = "7";
                generation_num++;
            }
            //Gen 8
            else if(generation_num >= 810 && generation_num <= 905){
                String gen = "8";
                generation_num++;
            }
            //Gen 9
            else if(generation_num >= 906 && generation_num <= 1010){
                String gen = "9";
                generation_num++;
            }
        }




    }
}