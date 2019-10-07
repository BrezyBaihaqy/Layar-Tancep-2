package com.dicoding.cinemaxx.film;

import java.util.ArrayList;

public class FilmData {
    public static String [][] data = new String[][]{
            {"The Old Man and The Gun", "The true story of Forrest Tucker, from his audacious escape from San Quentin at the age of 70 to an unprecedented string of heists that confounded authorities and enchanted the public.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/a4BfxRK8dBgbQqbRxPs8kmLd8LG.jpg", "Comedy, Crime, Drama", "Robert Redford, Sissy Spacek, Casey Affleck, Danny Glover"},
            {"The Lion King", "Simba idolises his father, King Mufasa, and takes to heart his own royal destiny. But not everyone in the kingdom celebrates the new cubs arrival.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/pSfwXxP94xktZKn3UaeVe6VdFZl.jpg", "Adventure, Animation, Family, Drama, Action", "Donald Glover, Beyonce Knowles, James Earl Jones, Chiwetel Ejiofor"},
            {"Fast and Furious Presents Hobbs and Shaw", "A spinoff of The Fate of the Furious, focusing on Johnsons US Diplomatic Security Agent Luke Hobbs forming an unlikely alliance with Stathams Deckard Shaw.", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/keym7MPn1icW1wWfzMnW3HeuzWU.jpg", "Action", "Dwayne Johnson, Jason Statham, Idris Elba, Vanessa Kirby"},
            {"Men in Black: International", "The Men in Black have always protected the Earth from the scum of the universe. In this new adventure, they tackle their biggest, most global threat to date: a mole in the Men in Black organization.", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/dPrUPFcgLfNbmDL8V69vcrTyEfb.jpg", "Action, Comedy, Science Fiction, Adventure", "Chris Hemsworth, Tessa Thompson, Liam Neeson, Rebecca Ferguson"},
            {"John Wick Chapter 3 Parabellum", "Super-assassin John Wick returns with a $14 million price tag on his head and an army of bounty-hunting killers on his trail. After killing a member of the shadowy international assassins guild.", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/ziEuG1essDuWuC5lpWUaw1uXY2O.jpg", "Crime, Action, Thriller", "Keanu Reeves, Halle Berry, Ian McShane, Laurence Fishburne"},
            {"Aladdin", "A kindhearted street urchin named Aladdin embarks on a magical adventure after finding a lamp that releases a wisecracking genie while a power-hungry Grand Vizier vies for the same lamp.", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/3iYQTLGoy7QnjcUYRJy4YrAgGvp.jpg", "Adventure, Fantasy, Romance, Comedy, Family", "Mena Massoud, Naomi Scott, Will Smith, Marwan Kenzari"},
            {"Angel Has Fallen", "Secret Service Agent Mike Banning is framed for the attempted assassination of the President and must evade his own agency and the FBI as he tries to uncover the real threat.", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/fapXd3v9qTcNBTm39ZC4KUVQDNf.jpg", "Action", "Gerard Butler, Morgan Freeman, Jada Pinkett Smith, Lance Reddick"},
            {"Hello Love Goodbye", "A love story of Joy and Ethan, Filipino workers based in Hong Kong. Ethan, a bartender, is keen on romantically pursuing Joy, a domestic helper who is wholly dedicated to providing for her family.", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/kTca5fpKhFOKIiG0tz8tynhsWs5.jpg", "Romance, Drama", "Kathryn Bernardo, Alden Richards, Maymay Entrata, Maricel Laxa"},
            {"Avengers Endgame", "After the devastating events of Avengers: Infinity War, the universe is in ruins due to the efforts of the Mad Titan, Thanes. With the help of remaining allies, the Avengers must assemble once more.", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/or06FN3Dka5tukK1e9sl16pB3iy.jpg", "Adventure, Science Fiction, Action", "Robert Downey Jr., Chris Evans, Mark Ruffalo, Chris Hemsworth"},
            {"Red Shoes and the Seven Dwarfs", "Princes who have been turned into Dwarfs seek the red shoes of a lady in order to break the spell, although it will not be easy.", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/MBiKqTsouYqAACLYNDadsjhhC0.jpg", "Animation, Romance", "Chloe Grace Moretz, Sam Claflin, Gina Gershon, Jim Rash"},
        };

    public static ArrayList<Film> getListData(){
        ArrayList<Film> list = new ArrayList<>();
        for (String[] aData : data){
            Film film = new Film();
            film.setName(aData[0]);
            film.setDescription(aData[1]);
            film.setPhoto(aData[2]);
            film.setGenre(aData[3]);
            film.setArtist(aData[4]);

            list.add(film);
        }

        return list;
    }
}
