package projet.java.iot.mouly.tp_navigation.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.delay
import projet.java.iot.mouly.tp_navigation.R
import projet.java.iot.mouly.tp_navigation.ui.theme.TP_NavigationTheme
import kotlin.time.Duration.Companion.seconds

class SplashScreenActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LaunchedEffect(Unit) {
                delay(3.seconds)
                // Lunch MainActivity
                Intent(applicationContext, MainActivity::class.java).also {
                    startActivity(it)
                }
            }

            TP_NavigationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SplashScreen(modifier = Modifier.fillMaxSize())
                }
            }
        }
    }
}

@Composable
fun SplashScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Image(painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo of the App",
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    TP_NavigationTheme {
        SplashScreen()
    }
}