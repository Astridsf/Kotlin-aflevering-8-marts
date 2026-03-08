package com.example.figma

import android.R.attr.top
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.figma.ui.theme.FigmaTheme
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.TextField

import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Arrangement

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App()
        }
    }
}

@Composable
fun App() {

    var fornavn by remember { mutableStateOf("") }
    var efternavn by remember { mutableStateOf("") }
    var alder by remember { mutableStateOf("") }
    var stilling by remember { mutableStateOf("") }
    var kompetencer by remember { mutableStateOf("") }
    var om by remember { mutableStateOf("") }

    val applicationList: MutableList<Application> = remember {
        mutableStateListOf()
    }

    LazyColumn(
        modifier = Modifier
            .background(Color(0xFF26234F)),
        contentPadding = PaddingValues(horizontal = 24.dp, vertical = 24.dp)
    ) {
        item {
            AppImage(R.drawable.logo)

            Text(
                text = "Opret Ansøgning",
                color = Color.White,
                fontSize = 45.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                textAlign = TextAlign.Center
            )

            CvButtons()

            //fornavn
            Text(
                text = "Fornavn:",
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(top = 50.dp)
            )
            TextField(
                value = fornavn,
                onValueChange = { newText -> fornavn = newText },
                //placeholder = { Text("Skriv fornavn") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
                    .padding(bottom = 15.dp)
            )

            //efternavn
            Text(
                text = "Efternavn:",
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(top = 20.dp)
            )
            TextField(
                value = efternavn,
                onValueChange = { newText -> efternavn = newText },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
                    .padding(bottom = 15.dp)
            )

            //alder
            Text(
                text = "Alder:",
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(top = 20.dp)
            )
            TextField(
                value = alder,
                onValueChange = { newText -> alder = newText },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
                    .padding(bottom = 15.dp)
            )

            //stilling
            Text(
                text = "Stilling:",
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(top = 20.dp)
            )
            TextField(
                value = stilling,
                onValueChange = { newText -> stilling = newText },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
                    .padding(bottom = 15.dp)
            )

            //kompetencer
            Text(
                text = "Kompetencer:",
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(top = 20.dp)
            )
            TextField(
                value = kompetencer,
                onValueChange = { newText -> kompetencer = newText },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .padding(top = 8.dp)
                    .padding(bottom = 15.dp)
            )
            LanguageButtons()

            HorizontalDivider(
                thickness = 2.dp,
                modifier = Modifier
                    .padding(top = 40.dp)
            )
            Text(
                text = "Om:",
                color = Color.White,
                fontSize = 25.sp,
                modifier = Modifier
                    .padding(top = 40.dp)
                    .padding(bottom = 15.dp)
            )
            TextField(
                value = om,
                onValueChange = { newText -> om = newText },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 15.dp)
                    .height(200.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, bottom = 20.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Button(
                    onClick = {
                        applicationList.add(
                            Application(fornavn, efternavn, alder, stilling, kompetencer, om)
                        )
                        fornavn = ""
                        efternavn = ""
                        alder = ""
                        stilling = ""
                        kompetencer = ""
                        om = ""
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFF8F9FA)
                    )
                ) {
                    Text(
                        text = "Opret ansøgning",
                        fontSize = 20.sp,
                        color = Color(0xFF26234F)
                    )
                }
            }
        }
        //rendering:
        items(applicationList) { app ->
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
            ) {
                Text(
                    text = "Din ansøgning:",
                    fontSize = 22.sp,
                    modifier = Modifier
                        .padding(bottom = 15.dp),
                    color = Color.White
                )
                Text(
                    text = "Fornavn: ${app.fornavn}",
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(bottom = 15.dp),
                    color = Color.White
                )
                Text(
                    text = "Efternavn: ${app.efternavn}",
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(bottom = 15.dp),
                    color = Color.White
                )

                Text(
                    text = "Alder: ${app.alder}",
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(bottom = 15.dp),
                    color = Color.White
                )
                Text(
                    text = "Stilling: ${app.stilling}",
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(bottom = 15.dp),
                    color = Color.White
                )
                Text(
                    text = "Kompetencer: ${app.kompetencer}",
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(bottom = 15.dp),
                    color = Color.White
                )
                Text(
                    text = "Om: ${app.om}",
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(bottom = 15.dp),
                    color = Color.White
                )
            }
        }
    }
}

@Composable
//kildehenvisning: https://developer.android.com/codelabs/basic-android-kotlin-compose-add-images?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-add-images#2
fun AppImage(imageRes: Int) {
    val image = painterResource(imageRes)

    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier
            .size(200.dp)
            .fillMaxWidth()
            .wrapContentWidth(Alignment.Start)
    )
}

@Composable
fun CvButtons() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 50.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            onClick = {},
            modifier = Modifier
                .padding(top = 15.dp),
            //shape = RoundedCornerShape(50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF8F9FA)
            )
        ) {
            Text(
                text = "tilføj foto",
                fontSize = 20.sp,
                color = Color(0xFF26234F)
            )
        }
        Button(
            onClick = {},
            modifier = Modifier
                .padding(top = 15.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF8F9FA)
            )
        ) {
            Text(
                text = "tilføj cv",
                fontSize = 20.sp,
                color = Color(0xFF26234F)
            )
        }

    }
}


@Composable
fun LanguageButtons() {
    Text(
        text = "Sprog:",
        color = Color.White,
        fontSize = 20.sp,
        modifier = Modifier
            .padding(top = 20.dp)
    )
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            onClick = {},
            modifier = Modifier
                .padding(top = 15.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF8F9FA)
            )
        ) {
            Text(
                text = "Dansk",
                fontSize = 20.sp,
                color = Color(0xFF26234F)
            )
        }
        Button(
            onClick = {},
            modifier = Modifier
                .padding(top = 15.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF8F9FA)
            )
        ) {
            Text(
                text = "Engelsk",
                fontSize = 20.sp,
                color = Color(0xFF26234F)
            )
        }
        Button(
            onClick = {},
            modifier = Modifier
                .padding(top = 15.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF8F9FA)
            )
        ) {
            Text(
                text = "Tysk",
                fontSize = 20.sp,
                color = Color(0xFF26234F)
            )
        }

    }
}
/*
@Composable
fun CreateApplication() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp)
            .padding(bottom = 20.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            onClick = {
                applicationList.add(Application(fornavn, efternavn, alder, stilling))
                fornavn = ""
                efternavn = ""
                alder = ""
                stilling = ""
                kompetencer = ""
            },
            modifier = Modifier
                .padding(top = 15.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF8F9FA)
            )
        ) {
            Text(
                text = "Se layout",
                fontSize = 20.sp,
                color = Color(0xFF26234F)
            )
        }
        Button(
            onClick = {},
            modifier = Modifier
                .padding(top = 15.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF8F9FA)
            )
        ) {
            Text(
                text = "Opret ansøgning",
                fontSize = 20.sp,
                color = Color(0xFF26234F)
            )
        }
    }
}

 */
