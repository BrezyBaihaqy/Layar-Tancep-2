package com.dicoding.cinemaxx.tvshow;

import java.util.ArrayList;

public class TvShowData {
    public static String [][] data = new String[][]{
        {"Fear the Walking Dead",
        "What did the world look like as it was transforming into the horrifying apocalypse depicted in The Walking Dead? This spin-off set in Los Angeles, following new characters as they face the beginning of the end of the world, will answer that question.",
        "https://image.tmdb.org/t/p/w600_and_h900_bestv2/aOdTWn8dXlS0tA5xl0ZBr8Ws15R.jpg",
        "Drama, Thriller",
        "Alycia Debnam-Carey, Colman Domingo, Kim Dickens, Frank Dillane."},

        {"The Arrow",
        "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
        "https://image.tmdb.org/t/p/w600_and_h900_bestv2/mo0FP1GxOFZT4UDde7RFDz5APXF.jpg",
        "Crime, Drama, Mystery, Action & Adventure",
        "Stephen Amell, David Ramsey, Katie Cassidy, Emily Bett"},

        {"Family Guy",
        "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
        "https://image.tmdb.org/t/p/w600_and_h900_bestv2/gBGUL1UTUNmdRQT8gA1LUV4yg39.jpg",
        "Animation, Comedy",
        "Seth MacFarlane, Alex Borstein, Seth Green, Mila Kunis"},
        {"The Flash",
        "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only meta-human who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
        "https://image.tmdb.org/t/p/w600_and_h900_bestv2/wHa6KOJAoNTFLFtp7wguUJKSnju.jpg",
        "Drama, Sci-Fi & Fantasy",
        "Grant Gustin, Candice Patton, Carlos Valdes, Danielle Panabaker"},
        {"Supernatural",
        "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
        "https://image.tmdb.org/t/p/w600_and_h900_bestv2/3iFm6Kz7iYoFaEcj4fLyZHAmTQA.jpg",
        "Drama, Sci-Fi & Fantasy, Mystery",
        "Jensen Ackles, Jared Padalecki, Misha Collins, Ruth Connell"},
        {"The Simpons",
        "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
        "https://image.tmdb.org/t/p/w600_and_h900_bestv2/yTZQkSsxUFJZJe67IenRM0AEklc.jpg",
        "Animation, Comedy",
        "Dan Castallaneta, Julie Kavner, Nancy Cartwright, Yeardley Smith"},
        {"Gotham",
        "Before there was Batman, there was GOTHAM. Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
        "https://image.tmdb.org/t/p/w600_and_h900_bestv2/4XddcRDtnNjYmLRMYpbrhFxsbuq.jpg",
        "Drama, Comedy, Crime",
        "Ben McKenzie, Donal Logue, David Mazouz, Sean Pertwee"},
        {"American Horror Story",
        "An anthology horror drama series centering on different characters and locations, including a house with a murderous past, an asylum, a witch coven, a freak show, a hotel, a farmhouse in Roanoke and a cult.",
        "https://image.tmdb.org/t/p/w600_and_h900_bestv2/uR2K0Ui9UsOqnzb5IrV6tLUcUHl.jpg",
        "Drama, Mystery, Sci-Fi & Fantasy",
        "Evan Peters, Sarah Paulson, Denis OHare, Kathy Bates"},
        {"The I-Land",
        "Wiped clean of memories and thrown together, a group of strangers fight to survive harsh realities -- and the island that traps them.",
        "https://image.tmdb.org/t/p/w600_and_h900_bestv2/Muev370hN3vdjGsC1ip1HcWqbT.jpg",
        "Drama, Sci-Fi & Fantasy",
        "Natalie Martinez, Kate Bosworth, Ronald Peet, Sibylla Deen"},
        {"The Boys",
        "A group of vigilantes known informally as “The Boys” set out to take down corrupt superheroes with no more than blue-collar grit and a willingness to fight dirty.",
        "https://image.tmdb.org/t/p/w600_and_h900_bestv2/dzOxNbbz1liFzHU1IPvdgUR647b.jpg",
        "Sci-Fi & Fantasy, Action & Adventure",
        "Karl Urban, Jack Quaid, Erin Moriarty, Anthony Starr"}
    };

    public static ArrayList<TvShow> getListData(){
        ArrayList<TvShow> list = new ArrayList<>();
        for (String[] aData : data){
            TvShow tvShow = new TvShow();
            tvShow.setTvshowname(aData[0]);
            tvShow.setTvshowdescription(aData[1]);
            tvShow.setTvshowphoto(aData[2]);
            tvShow.setTvshowgenre(aData[3]);
            tvShow.setTvshowartist(aData[4]);

            list.add(tvShow);
        }

        return list;
    }
}
