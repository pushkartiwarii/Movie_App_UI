package com.api.myapplication.ui.screen

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateIntOffsetAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.InsertEmoticon
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImagePainter.State.Empty.painter
import com.api.myapplication.R


sealed class LoginEvent {
    data object OnLoginClick : LoginEvent()

}


@Composable
fun application(
    modifier: Modifier=Modifier,
    state: LoginState,
    onEvent: (LoginEvent) -> Unit = {},
)  {
    var isClicked by remember { mutableStateOf(false) }
    val firstColor = Color.Black.copy(alpha = .5f)

    val animatedColor by animateColorAsState(
        targetValue = firstColor ,
        label = "Card Color",
    )
    val animateSize by animateDpAsState(
        targetValue = if (isClicked) 400.dp else 200.dp,
        label = "Card Size",
        animationSpec = tween(
            durationMillis = 1000,
            delayMillis = 500
        )
    )
    val animateOffset by animateIntOffsetAsState(
        targetValue = if (isClicked) IntOffset(0, -100) else IntOffset(0, 100),
        label = "Card Offset",
    )

    Box(
        modifier = Modifier.background(Color.Black)
    ) {
        Image(painter = painterResource(id = R.drawable.moviecollage), contentDescription = null,
            modifier = Modifier.fillMaxSize(), contentScale = ContentScale.FillHeight)
        Column(
            modifier = Modifier
                .fillMaxSize()
                ,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier.fillMaxSize()
                    .background(firstColor)
                    , contentAlignment = Alignment.Center
            ) {

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Box(
                        modifier = Modifier
                            .clip(CircleShape),
                        contentAlignment = Alignment.Center,
                    )

                     {
                        Image(

                            painter = painterResource(id = R.drawable.ng),
                            contentDescription = null,

                            modifier = Modifier
                                .clip(CircleShape)
                                .size(150.dp)
                        )
                    }
                    Column(
                        modifier = Modifier
                            ,
                        horizontalAlignment = Alignment.CenterHorizontally,

                    ){
                        ButtonComponent(
                            modifier = Modifier
                                .padding(20.dp)
                                .height(60.dp)
                        ) {
                            onEvent(LoginEvent.OnLoginClick)
                        }

                    }
                }
            }

        }


    }
}
@Composable
fun ButtonComponent(
    modifier: Modifier = Modifier,
    text: String = stringResource(id = R.string.get_started),
    backgroundColor: Color = Color.White,
    foregroundColor: Color = Color.Black,
    elevation: ButtonElevation = ButtonDefaults.elevatedButtonElevation(0.dp),
    colors: ButtonColors = ButtonDefaults.buttonColors(
        containerColor = backgroundColor ),
    onClick: () -> Unit
) {

    Button(
        onClick = onClick, modifier = modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(100.dp),
        elevation = elevation,
        colors = colors
    ) {
        Text(
            text = "Get Started", style = TextStyle(
                color = foregroundColor,
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold
            )
        )
    }

}