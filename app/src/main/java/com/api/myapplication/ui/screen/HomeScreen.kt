package com.api.myapplication.ui.screen

import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter
import coil.compose.rememberImagePainter
import com.api.myapplication.ui.models.Movie
import com.api.myapplication.ui.retrofitutilities.Data

sealed class HomeEvent {

    data class OnMovieClick(val movie: Movie?) : HomeEvent()
}




@Composable
fun MovieScreen(
//    navController: NavHostContr
    modifier: Modifier = Modifier,
    homeState: HomeState,
    loginState: LoginState,
    onEvent: (HomeEvent) -> Unit = {},

    ) {
    BackHandler {
        onEvent(HomeEvent.OnMovieClick(null))
    }
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        AsyncImage(
            homeState.selectedMovie?.imgUrl,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .clickable {  },
        )
        Text(
            text = homeState.selectedMovie?.title ?: "No Title",
            style = MaterialTheme.typography.headlineLarge
        )
        Text(
            text = homeState.selectedMovie?.year.toString(),
            style = MaterialTheme.typography.bodyMedium
        )
        Text(
            text = homeState.selectedMovie?.director ?: "No Director",
            style = MaterialTheme.typography.bodySmall
        )
        Text(
            text = homeState.selectedMovie?.body ?: "No Body",
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

