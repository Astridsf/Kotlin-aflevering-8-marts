package com.example.figma


import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.figma.ui.theme.FigmaTheme


class forsiden : ComponentActivity() {

    override fun applyOverrideConfiguration(overrideConfiguration: Configuration?) {
        super.applyOverrideConfiguration(overrideConfiguration)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            FigmaTheme()  {
                forside(
                    modifier = Modifier.fillMaxSize()
                )

            }
        }
    }
}




@Composable
fun forside(modifier: Modifier = Modifier) {


    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 200.dp) //her kan man ændre på padding, og så kan rykke ned
    ) {
        Box(
            modifier = modifier
                .requiredWidth(width = 412.dp)
                .requiredHeight(height = 1160.dp)
                .background(color = Color(0xff26234f))
        ) {
            Image(
                painter = painterResource(id = R.drawable.namelogo),
                contentDescription = "8f945f3c-dbc8-4ef9-b6c8-7c7b64061b2f 1",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 110.dp,
                        y = (80).dp
                    )
                    .requiredWidth(width = 210.dp)
                    .requiredHeight(height = 50.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "8f945f3c-dbc8-4ef9-b6c8-7c7b64061b2f 2",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 55.dp,
                        y = 75.dp
                    )
                    .requiredWidth(width = 50.dp)
                    .requiredHeight(height = 50.dp)
            )
            Text(
                text = "Del kompetencer. Undgå afskedigelser. Skab værdi.",
                color = Color(0xfff8f9fa),
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 12.sp
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(
                        x = 4.5.dp,
                        y = 172.dp
                    )
                    .requiredWidth(width = 241.dp)
                    .requiredHeight(height = 73.dp)
            )
            Text(
                text = "EmpySwap forbinder virksomheder, så kompetencer kan flyde derhen, hvor de skaber mest værdi.",
                color = Color(0xfff8f9fa),
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 38.dp,
                        y = 252.dp
                    )
                    .requiredWidth(width = 336.dp)
                    .requiredHeight(height = 89.dp)
            )
            Text(
                text = "Populærer profiler:",
                color = Color(0xfff8f9fa),
                lineHeight = 1.25.em,
                style = TextStyle(
                    fontSize = 16.sp,
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 40.dp,
                        y = 377.dp
                    )
                    .requiredWidth(width = 195.dp)
                    .requiredHeight(height = 51.dp)
            )
            Text(
                text = "Hugh Jass",
                color = Color(0xfff8f9fa),
                style = TextStyle(
                    fontSize = 10.sp
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 173.dp,
                        y = 417.dp
                    )
                    .requiredWidth(width = 93.dp)
                    .requiredHeight(height = 25.dp)
            )
            Text(
                text = "Ella Hansen",
                color = Color(0xfff8f9fa),
                style = TextStyle(
                    fontSize = 10.sp
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 62.dp,
                        y = 417.dp
                    )
                    .requiredWidth(width = 96.dp)
                    .requiredHeight(height = 22.dp)
            )
            Text(
                text = "Chris P. Bacon",
                color = Color(0xfff8f9fa),
                style = TextStyle(
                    fontSize = 10.sp
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 269.dp,
                        y = 418.dp
                    )
                    .requiredWidth(width = 142.dp)
                    .requiredHeight(height = 34.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.ella),
                contentDescription = "Group 48",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 48.dp,
                        y = 431.dp
                    )
                    .requiredWidth(width = 89.dp)
                    .requiredHeight(height = 83.dp)
            )
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 155.dp,
                        y = 431.dp
                    )
                    .requiredWidth(width = 89.dp)
                    .requiredHeight(height = 83.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.hugh),
                    contentDescription = "Ellipse 6",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .requiredWidth(width = 89.dp)
                        .requiredHeight(height = 83.dp)
                )
            }
            Image(
                painter = painterResource(id = R.drawable.chris),
                contentDescription = "Group 48",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 262.dp,
                        y = 431.dp
                    )
                    .requiredWidth(width = 89.dp)
                    .requiredHeight(height = 83.dp)
            )
            Text(
                text = "Jura & Compliance",
                color = Color(0xfff8f9fa),
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 8.sp,
                    fontWeight = FontWeight.Medium
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 211.dp,
                        y = 521.dp
                    )
                    .requiredWidth(width = 192.dp)
                    .requiredHeight(height = 47.dp)
            )
            Text(
                text = "Marketing & Kommunikation",
                color = Color(0xfff8f9fa),
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 8.sp,
                    fontWeight = FontWeight.Medium
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 0.dp,
                        y = 521.dp
                    )
                    .requiredWidth(width = 185.dp)
                    .requiredHeight(height = 38.dp)
            )
            Text(
                text = "Økonomi & Regnskab",
                color = Color(0xfff8f9fa),
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 8.sp,
                    fontWeight = FontWeight.Medium
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 107.dp,
                        y = 521.dp
                    )
                    .requiredWidth(width = 192.dp)
                    .requiredHeight(height = 47.dp)
            )
            Divider(
                color = Color(0xffd9d9d9),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 12.78.dp,
                        y = 568.dp
                    )
                    .requiredWidth(width = 369.dp)
                    .rotate(degrees = 0.16f)
            )
            Image(
                painter = painterResource(id = R.drawable.hand),
                contentDescription = "artikel 1",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 17.78.dp,
                        y = 576.dp
                    )
                    .requiredSize(size = 100.dp)
            )
            Text(
                text = "Når du bygger relationer, følger resultaterne",
                color = Color(0xfff8f9fa),
                lineHeight = 1.25.em,
                style = TextStyle(
                    fontSize = 16.sp
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 131.78.dp,
                        y = 576.dp
                    )
                    .requiredWidth(width = 259.dp)
                    .requiredHeight(height = 35.dp)
            )
            Text(
                text = "Organisationers succes afhænger ofte af kvaliteten i relationerne. Når tillid og motivation er til stede, bliver samarbejdet enklere, og målene lettere at nå. Det kræver ledere, der er nærværende og skaber klarhed om retningen.",
                color = Color(0xfff8f9fa),
                style = TextStyle(
                    fontSize = 8.sp
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 131.78.dp,
                        y = 629.dp
                    )
                    .requiredWidth(width = 245.dp)
                    .requiredHeight(height = 50.dp)
            )

            Divider(
                color = Color(0xffd9d9d9),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 12.78.dp,
                        y = 690.dp
                    )
                    .requiredWidth(width = 369.dp)
                    .rotate(degrees = 0.16f)
            )


            Text(
                text = "Så meget sparede DSV ved hjælp af EmpySwap",
                color = Color(0xfff8f9fa),
                lineHeight = 1.25.em,
                style = TextStyle(
                    fontSize = 16.sp
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 22.78.dp,
                        y = 708.dp
                    )
                    .requiredWidth(width = 254.dp)
                    .requiredHeight(height = 70.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.mobil),
                contentDescription = "artikel 2",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 280.dp,
                        y = 700.dp
                    )
                    .requiredSize(size = 100.dp)
            )
            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ",
                color = Color(0xfff8f9fa),
                style = TextStyle(
                    fontSize = 8.sp
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 21.78.dp,
                        y = 759.dp
                    )
                    .requiredWidth(width = 245.dp)
                    .requiredHeight(height = 50.dp)
            )

            Box(modifier = Modifier.fillMaxSize()) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(80.dp)
                        .background(Color(0xFF26234F))
                        .offset(
                            x = 0.dp,
                            y = 800.dp
                        ),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    SearchIcon{ println ("Search clicked!")}
                    AddButton{ println("Add clicked!")}
                    MenuIcon{println("Menu clicked!")}
                }
            }

            Image(
                painter = painterResource(id = R.drawable.bil),
                contentDescription = "artikel 3",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 17.78.dp,
                        y = 880.dp
                    )
                    .requiredSize(size = 100.dp)
            )
            Text(
                text = "Læs om Clever’s brug af EmpySwap",
                color = Color(0xfff8f9fa),
                lineHeight = 1.25.em,
                style = TextStyle(
                    fontSize = 16.sp
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 136.78.dp,
                        y = 880.dp
                    )
                    .requiredWidth(width = 259.dp)
                    .requiredHeight(height = 35.dp)
            )
            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ",
                color = Color(0xfff8f9fa),
                style = TextStyle(
                    fontSize = 8.sp
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 136.78.dp,
                        y = 910.dp
                    )
                    .requiredWidth(width = 245.dp)
                    .requiredHeight(height = 50.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.lasy),
                contentDescription = "artikel 4",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 282.dp,
                        y = 970.dp
                    )
                    .requiredSize(size = 100.dp)
            )
            Text(
                text = "Sådan sikrer du succes med EmpySwap fra dag 1",
                color = Color(0xfff8f9fa),
                lineHeight = 1.25.em,
                style = TextStyle(
                    fontSize = 16.sp
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 22.dp,
                        y = 990.dp
                    )
                    .requiredWidth(width = 259.dp)
                    .requiredHeight(height = 35.dp)
            )

            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ",
                color = Color(0xfff8f9fa),
                style = TextStyle(
                    fontSize = 8.sp
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 23.dp,
                        y = 1020.dp
                    )
                    .requiredWidth(width = 245.dp)
                    .requiredHeight(height = 50.dp)
            )
        }
    }
}
@Composable
fun SearchIcon(onClick: () -> Unit) {
    Box(
        modifier = Modifier.size(40.dp),
        contentAlignment = Alignment.Center
    ) {

        Box(
            modifier = Modifier
                .size(30.dp)
                .background(Color.Transparent)
                .border(width = 3.dp, color = Color(0xFFCDE6C6), shape = CircleShape)
        )

        Box(
            modifier = Modifier
                .width(18.dp)
                .height(3.dp)
                .offset(x = 15.dp, y = 14.dp)
                .rotate(45f)
                .background(Color(0xFFCDE6C6))
        )
    }
}

@Composable
fun AddButton(onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .size(53.dp)
            .clip(CircleShape)
            .background(Color(0xFFCDE6C6)),
        contentAlignment = Alignment.Center
    ) {

        Box(Modifier.width(28.dp).height(3.dp).background(Color(0xFF26234F)))

        Box(Modifier.width(3.dp).height(28.dp).background(Color(0xFF26234F)))
    }
}

@Composable
fun MenuIcon(onClick: () -> Unit) {
    Column(
        modifier = Modifier.width(35.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Box(Modifier.fillMaxWidth().height(2.dp).background(Color(0xFFCDE6C6)))
        Box(Modifier.fillMaxWidth().height(2.dp).background(Color(0xFFCDE6C6)))
        Box(Modifier.fillMaxWidth().height(2.dp).background(Color(0xFFCDE6C6)))
    }
}
