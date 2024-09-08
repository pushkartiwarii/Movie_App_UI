package com.api.myapplication.ui.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import com.api.myapplication.ui.models.Movie
import com.api.myapplication.ui.models.MovieThumbnailState

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    homeState: HomeState,
    loginState: LoginState,
    onEvent: (HomeEvent) -> Unit = {},
    onLoginEvent: (LoginEvent) -> Unit = {},


)
    {
        val scrollState = rememberScrollState()

        Column(
            modifier = modifier
                .verticalScroll(scrollState)
                .padding(vertical = 24.dp),
            verticalArrangement = Arrangement.spacedBy(32.dp)
        ) {
            FeaturedMoviesSection(
                data = homeState.featuredMovies
            )
            ComingSoonSection(
                data = homeState.upcomingMovies,
                modifier = Modifier.padding(horizontal = 18.dp)
            )
            HorizontalSection(
                data = homeState.recentlyWatchedMovies,
                name = "Recently Watched"
            )
            HorizontalSection(
                data = homeState.streamingMovies,
                name = "Stream On Demand"
            )
        }
    }
//) {
//    val gridState = rememberLazyGridState()
//
//    // Automatically scroll the grid
//    LaunchedEffect(key1 = gridState) {
//        while (true) {
//            delay(100) // Adjust delay for scroll speed
//            gridState.scrollBy(10f) // Adjust scroll amount for speed
//        }
//    }
//    Column(
//        modifier = modifier.background(MaterialTheme.colorScheme.background),
//
//        ) {
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .background(Color.Gray.copy(alpha = 0.2f))
//        ) {
//            Row(
//                verticalAlignment = Alignment.CenterVertically,
//            ) {
//                Box(
//                    modifier = Modifier
//                        .size(60.dp)
//                        .padding(8.dp)
//                        .background(Color.Gray, shape = CircleShape),
//                    contentAlignment = Alignment.Center,
//                ) {
//                    Icon(
//                        imageVector = Icons.Default.Person,
//                        contentDescription = "person"
//                    )
//                }
//
//            }
//
//        }
//
//
//
//
//
//
//
//        Spacer(modifier = Modifier.height(40.dp))
//
//        LazyVerticalGrid(
//            columns = GridCells.Fixed(2),
//            contentPadding = PaddingValues(8.dp)
//        ) {
//            items(homeState.movieList) { movie ->
//                MovieCard(movie = movie) { selectedMovie ->
//                    onEvent(HomeEvent.OnMovieClick(selectedMovie))
//                }
//            }
//        }
//    }
//}



//@Composable
//fun MovieCard(
//    modifier: Modifier = Modifier,
//    movie: Movie?,
//    onMovieSelected: (Movie) -> Unit,

//    ) {
//
//    Card(
//        onClick = {
//            if (movie != null) {
//                onMovieSelected(movie)
//            }
//        },
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(4.dp, 8.dp),
//        shape = RoundedCornerShape(8.dp)
//
//        ) {
//        Box(modifier = Modifier.fillMaxSize()) {
//            if (movie != null) {
//                AsyncImage(
//                    movie.imgUrl,
//                    contentDescription = movie.title,
//                    modifier = Modifier.height(300.dp),
//                    contentScale = ContentScale.Crop
//                )
//            }
//
//
//            Column(
//                modifier = Modifier
//                    .align(Alignment.BottomStart)
//                    .background(
//                        Brush.verticalGradient(
//                            colors = listOf(
//                                Color.Transparent,
//                                Color.Gray,
//                            ),
//                            startY = 10f,
//                            endY = 150f,
//                        )
//                    )
//                    .padding(8.dp)
//            ) {
////                Image(
////                    painter = painterResource(id = R.drawable.play_button), contentDescription = null,
////                    modifier = Modifier.size(90.dp),Alignment.Center,
////                )
//
//                if (movie != null) {
//                    Text(
//                        text = movie.title, fontSize = 18.sp,
//                        fontWeight = FontWeight.Bold,
//                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
//                    )
//                }
//                Row(
//                    verticalAlignment = Alignment.CenterVertically,
//                    horizontalArrangement = Arrangement.SpaceBetween,
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(horizontal = 8.dp)
//                        .padding(bottom = 8.dp)
//                ) {
//
////                    if (movie != null) {
////                        Text(
////                            text = movie.director,
////                            fontSize = 12.sp,
////                        )
////                    }
//                    Row(
//                        verticalAlignment = Alignment.CenterVertically,
//                    ) {
////                        Icon(
////                            imageVector = Icons.Default.PlayArrow,
////                            modifier = Modifier.size(16.dp),
////                            contentDescription = null
////                        )
////                        Spacer(modifier = Modifier.width(2.dp))
//                        if (movie != null) {
//                            Text(
//                                text = "${movie.year}",
//                                fontSize = 12.sp,
//                                fontWeight = FontWeight.Bold
//                            )
//                        }
//                    }
//                }
//            }
//        }
//    }
//}


@Composable
fun MovieThumbnail(
    modifier: Modifier = Modifier,
    img: Int,

) {
    Image(
        painter = painterResource(img),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = modifier.height(240.dp)
    )
}

@Composable
fun SectionHeader(
    modifier: Modifier = Modifier,
    text: String
) {
    Text(
        text = text,
        style = MaterialTheme.typography.headlineLarge,
        modifier = modifier.fillMaxWidth()
    )
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ComingSoonSection(
    modifier: Modifier = Modifier,
    data: List<MovieThumbnailState>,

) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        SectionHeader(
            text = "Coming Soon"
        )
        FlowRow(


            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(18.dp),
            horizontalArrangement = Arrangement.spacedBy(18.dp),
            maxItemsInEachRow = 2
        ) {
            data.onEach { thumbnail ->
                MovieThumbnail(
                    img = thumbnail.img,
                    modifier = Modifier.weight(weight = 1f)

                )
            }
        }
    }
}

@Composable
fun FeaturedMoviesSection(
    modifier: Modifier = Modifier,
    data: List<Movie>
) {
    Spacer(
        modifier = Modifier.height(24.dp)
    )
    Column(
        modifier = modifier.padding(horizontal = 18.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        SectionHeader(
            text = "Featured Movies"
        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(
                items = data,
                key = { it.id }
            ) { movie ->
                FeaturedMovie(
                    item = movie
                )
            }
        }
    }
}


@Composable
private fun FeaturedMovie(
    modifier: Modifier = Modifier,
    item: Movie
) {
    Column(
        modifier = modifier.width(224.dp)
    ) {
        Image(
            painter = painterResource(item.imgUrl),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(324.dp)
        )
        Spacer(
            modifier = Modifier.height(8.dp)
        )
        Text(
            text = item.title,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            style = MaterialTheme.typography.titleMedium
        )
        Spacer(
            modifier = Modifier.height(8.dp)
        )
        Text(
            text = item.body,
            maxLines = 3,
            overflow = TextOverflow.Ellipsis,
            style = MaterialTheme.typography.bodySmall
        )
        Spacer(
            modifier = Modifier.height(18.dp)
        )
    }
    }

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HorizontalSection(
    modifier: Modifier = Modifier,
    data: List<MovieThumbnailState>,
    name: String
) {
    val pagerState = rememberPagerState(pageCount = { data.size })

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        SectionHeader(
            text = name,
            modifier = Modifier.padding(horizontal = 18.dp)
        )

        HorizontalPager(
            state = pagerState,
            contentPadding = PaddingValues(horizontal = 18.dp),
            pageSpacing = 18.dp,
            pageSize = TwoPagesPerViewport
        ) { pageIndex ->
            MovieThumbnail(
                img = data[pageIndex].img,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
private val TwoPagesPerViewport = object : PageSize {
    override fun Density.calculateMainAxisPageSize(availableSpace: Int, pageSpacing: Int): Int =
        (availableSpace - pageSpacing) / 2
}