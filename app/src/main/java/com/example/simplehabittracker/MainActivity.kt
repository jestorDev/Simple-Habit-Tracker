package com.example.simplehabittracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.ColorInt
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.simplehabittracker.ui.theme.SimpleHabitTrackerTheme
import androidx.compose.ui.Modifier


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SimpleHabitTrackerTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {

                    Box(
                        Modifier.fillMaxSize())

                        {

                            CountTxt(count = 13)

                            Column(
                                verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center,
                                horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally


                            ) {
                                MyScreenContent();
                                androidx.compose.material.Divider()
                                Counter()
                            }

                        }



                }
            }
        }
    }
}


@Composable
fun Counter (){
    Button(onClick = { /*TODO*/ }) {
        Text(text = "Contador")
    }
}



@Preview(showBackground = true)
@Composable
fun MyScreenContent( names : List <String> = listOf("Android","Here","Text","Doritos") ){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        for ( name in names){
            Greeting(name = name)
            Divider(thickness = 10.dp)

        }
    }
}



@Composable
fun CountTxt(count: Int) {

    androidx.compose.material.Surface( color = Color.Cyan) {
        Text(
            text = count.toString(),
            modifier = Modifier
                .padding(16.dp)
                .size(72.dp)
                .background(color = Color.Magenta)
        )

    }

}





@Composable
fun Greeting(name: String) {

    androidx.compose.material.Surface( color = Color.Cyan) {
        Text(
            text = "Hello $name!",
            modifier = Modifier
                .padding(16.dp)
                .background(color = Color.Magenta)

        )

    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SimpleHabitTrackerTheme {
        Greeting("Android")
    }
}