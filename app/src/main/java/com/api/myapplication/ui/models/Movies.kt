package com.api.myapplication.ui.models

import com.api.myapplication.R

data class Movie(
    val id: Int ,

    val imgUrl: Int,
    val title: String="",
    val body: String="",
    val director: String = "",
    val year: Int = 0,
)
fun getMovies(): List<Movie> {
    return listOf(
        Movie(
            id = 0,

            imgUrl = R.drawable.iron_man,
            title ="Iron Man",
            body ="After being held captive in an Afghan cave, billionaire engineer Tony Stark creates a unique weaponized suit of armor to fight evil.",
            director ="Jon Favreau",
            year =2008
        ),
        Movie(
            id = 1,

            imgUrl =R.drawable.ironman2,
            title ="Iron Man 2",
            body ="With the world now aware of his identity as Iron Man, Tony Stark must contend with both his declining health and a vengeful madman with ties to his father's legacy.",
            director ="Jon Favreau",
            year =2010
        ),
        Movie(
            id = 2,

            imgUrl =R.drawable.iron_man_3_,
            title ="Iron Man 3",
            body ="When Tony Stark's world is torn apart by a formidable terrorist called the Mandarin, he starts an odyssey of rebuilding and retribution.",
            director ="Shane Black",
            year =2013
        ),

        Movie(
            id = 3,

            imgUrl = R.drawable.inception,
            title ="Inception",
            body ="A skilled thief who steals corporate secrets through the use of dream-sharing technology.",
            director ="Christopher Nolan",
            year =2010
        ),
        Movie(
            id = 4,

            imgUrl =R.drawable.the_matrix_movie_poster,
            title ="The Matrix",
            body ="A computer hacker learns from mysterious rebels about the true nature of his reality and his role in the war against its controllers.",
            director ="The Wachowskis",
            year =1999
        ),
        Movie(
            id = 5,

            imgUrl =R.drawable.interstellar_film,
            title ="Interstellar",
            body ="A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.",
            director ="Christopher Nolan",
            year =2014
        ),
        Movie(
            id = 6,

            imgUrl =R.drawable.dark,
            title ="The Dark Knight",
            body ="Batman battles the Joker, who threatens to plunge Gotham City into anarchy.",
            director ="Christopher Nolan",
            year =2008
        ),

        Movie(
            id = 7,

            imgUrl =R.drawable.pulpfiction,
            title ="Pulp Fiction",
            body ="The lives of two mob hitmen, a boxer, a gangster's wife, and a pair of diner bandits intertwine in four tales of violence and redemption.",
            director ="Quentin Tarantino",
            year =1994
        ),

        Movie(
            id = 8,

            imgUrl =R.drawable.thegodfather,
            title ="The Godfather",
            body ="The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.",
            director ="Francis Ford Coppola",
            year =1972
        ),
        Movie(
            id = 9,

            imgUrl =R.drawable.forestgump,
            title ="Forrest Gump",
            body ="The presidencies of Kennedy and Johnson, the Vietnam War, the Watergate scandal and other historical events unfold from the perspective of an Alabama man with an IQ of 75.",
            director ="Robert Zemeckis",
            year =1994
        ),
        Movie(
            id = 10,

            imgUrl = R.drawable.venom,
            title = "Venom-The last Dance",
            body = "Eddie and Venom are on the run. Hunted by both of their worlds and with the net closing in, the duo are forced into a devastating decision that will bring the curtains down on Venom and Eddie's last dance.",
            director = "Kelly Marcel",
            year = 2024,

        ),
        Movie(
            id = 11,

            imgUrl =R.drawable.theconjuring,
            title = "The Conjuring: 4",
            body = "Paranormal investigators Ed and Lorraine Warren take on one last terrifying case involving mysterious entities they must confront.",
            director ="Michael Chaves",
            year = 2025,

        ),
        Movie(
            id = 12,

            imgUrl = R.drawable.captain_america_brave_new_world_poster,
            title = "Captain America:Brave New World",
            body = "Sam Wilson, who's officially taken up the mantle of Captain America, finds himself in the middle of an international incident.",
            director = "Julius Onah",
            year = 2025
        ),
        Movie(
            id = 13,
            imgUrl = R.drawable.kraven_the_hunter__film__poster,
            title = "Kraven The Hunter",
            body = "Kraven 's complex relationship with his ruthless father, Nikolai Kravinoff, starts him down a path of vengeance with brutal consequences, motivating him to become not only the greatest hunter in the world, but also one of its most feared.",
            director = "J.C. Chandor",
            year = 2024
        )

    )
}