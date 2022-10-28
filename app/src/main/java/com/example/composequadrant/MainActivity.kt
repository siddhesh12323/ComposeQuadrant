package com.example.composequadrant

import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.RecomposerInfo
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Screen(
                        greenTitle = stringResource(id = R.string.greenTitle),
                        greenInfo = stringResource(id = R.string.greenInfo),
                        yellowTitle = stringResource(id = R.string.yellowTitle),
                        yellowInfo = stringResource(id = R.string.yellowInfo),
                        cyanTitle = stringResource(id = R.string.cyanTitle),
                        cyanInfo = stringResource(id = R.string.cyanInfo),
                        lightGrayTitle = stringResource(id = R.string.lightGrayTitle),
                        lightGrayInfo = stringResource(id = R.string.lightGrayInfo)
                    )
                }
            }
        }
    }
}

@Composable
fun Screen(greenTitle : String, greenInfo : String,
            yellowTitle : String, yellowInfo: String,
            cyanTitle : String, cyanInfo : String,
            lightGrayTitle : String, lightGrayInfo :String) {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            Column(modifier = Modifier
                .background(color = Color.Green)
                .padding(all = 16.dp)
                .fillMaxSize()
                .weight(1f),
            verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(text = greenTitle, fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center, modifier = Modifier
                        .padding(bottom = 16.dp))

                Text(text = greenInfo, textAlign = TextAlign.Justify)
            }
            Column(modifier = Modifier
                .background(color = Color.Yellow)
                .padding(all = 16.dp)
                .fillMaxSize()
                .weight(1f),
                verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = yellowTitle, fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center, modifier = Modifier.padding(bottom = 16.dp))
                
                Text(text = yellowInfo, textAlign = TextAlign.Justify)
            }
        }

        Row(Modifier.weight(1f)) {
            Column(modifier = Modifier
                .background(color = Color.Cyan)
                .padding(all = 16.dp)
                .fillMaxSize()
                .weight(1f),
                verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally) {

                Text(text = cyanTitle, fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center, modifier = Modifier.padding(bottom = 16.dp))

                Text(text = cyanInfo, textAlign = TextAlign.Justify)
            }
            Column(modifier = Modifier
                .background(color = Color.LightGray)
                .padding(all = 16.dp)
                .fillMaxSize()
                .weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(text = lightGrayTitle, fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center, modifier = Modifier.padding(bottom = 16.dp))

                Text(text = lightGrayInfo, textAlign = TextAlign.Justify)
            }
        }
    }
}

/*@Composable
private fun ComposableInfoCard
    (title : String, description : String,
    backgroundColor : Color, modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}
*/

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantTheme {
        Screen(
            greenTitle = stringResource(id = R.string.greenTitle),
            greenInfo = stringResource(id = R.string.greenInfo),
            yellowTitle = stringResource(id = R.string.yellowTitle),
            yellowInfo = stringResource(id = R.string.yellowInfo),
            cyanTitle = stringResource(id = R.string.cyanTitle),
            cyanInfo = stringResource(id = R.string.cyanInfo),
            lightGrayTitle = stringResource(id = R.string.lightGrayTitle),
            lightGrayInfo = stringResource(id = R.string.lightGrayInfo)
        )
    }
}