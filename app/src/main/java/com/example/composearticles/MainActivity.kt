package com.example.composearticles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticles.ui.theme.ComposeArticlesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticlesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Article("Android")
                }
            }
        }
    }
}

@Composable
fun Body(modifier: Modifier = Modifier) {


    Column(modifier) {
        Text(
            text = stringResource(R.string.article_title),
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp)
        )
        Text(
            text = stringResource(R.string.article_introduction),
            textAlign = TextAlign.Justify,
            modifier = modifier
                .padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = stringResource(R.string.article_body),
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(16.dp)
        )

    }

}

@Composable
fun Article(name: String, modifier: Modifier = Modifier) {

    Column {
        Image(
            painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = "Article heading",

        )
        Body(modifier)

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeArticlesTheme {
        Article("Android")
    }
}