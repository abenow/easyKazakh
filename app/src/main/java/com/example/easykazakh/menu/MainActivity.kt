package com.example.easykazakh.menu

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.easykazakh.R
import com.example.easykazakh.firstLevel.FirstLevelScreenFirst
import com.example.easykazakh.firstLevel.FirstLevelScreenSecond
import com.example.easykazakh.firstLevel.FirstLevelScreenThird
import com.example.easykazakh.firstLevel.FirstLevelScreenUFourth
import com.example.easykazakh.secondLevel.SecondLevelScreenFirst
import com.example.easykazakh.secondLevel.SecondLevelScreenSecond
import com.example.easykazakh.secondLevel.SecondLevelScreenThird
import com.example.easykazakh.secondLevel.SecondLevelScreenUFourth
import com.example.easykazakh.firstLevel.FirstLevelScreenUFourthSecond
import com.example.easykazakh.thirdLevel.ThirdLevelScreenFirst
import com.example.easykazakh.thirdLevel.ThirdLevelScreenSecond
import com.example.easykazakh.thirdLevel.ThirdLevelScreenThird
import com.example.easykazakh.thirdLevel.ThirdLevelScreenUFourth
import com.example.easykazakh.fourthLevel.FourthLevelScreen
import com.example.easykazakh.fifthLevel.FifthLevelFirstScreen
import com.example.easykazakh.fifthLevel.FifthLevelSecondScreen
import com.example.easykazakh.fifthLevel.FifthLevelThirdScreen
import com.example.easykazakh.fifthLevel.FifthLevelUFourthScreen


class MainActivity : ComponentActivity() {


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            NavHost()
        }

    }

}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun NavHost() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = com.example.easykazakh.firstLevel.AppDestinations.Menu.route,
    ) {

        composable(route =  com.example.easykazakh.firstLevel.AppDestinations.Menu.route) {
            Menu(navController = navController)
        }
        //Level1
        composable(route = com.example.easykazakh.firstLevel.AppDestinations.FirstLevel.route) {
            FirstLevel(navController = navController)
        }
        composable(route = com.example.easykazakh.firstLevel.AppDestinations.FirstLevelScreenFirst.route) {
            FirstLevelScreenFirst(navController = navController)
        }
        composable(route = com.example.easykazakh.firstLevel.AppDestinations.FirstLevelScreenSecond.route) {
            FirstLevelScreenSecond(navController = navController)
        }
        composable(route = com.example.easykazakh.firstLevel.AppDestinations.FirstLevelScreenThird.route) {
            FirstLevelScreenThird(navController = navController)
        }
        composable(route = com.example.easykazakh.firstLevel.AppDestinations.FirstLevelScreenUFourth.route) {
            FirstLevelScreenUFourth(navController = navController)
        }
        composable(route = com.example.easykazakh.firstLevel.AppDestinations.FirstLevelScreenUFourthSecond.route) {
            FirstLevelScreenUFourthSecond(navController = navController)
        }



        //Level 2
        composable(route = com.example.easykazakh.secondLevel.AppDestinations.SecondLevel.route) {
            SecondLevel(navController = navController)
        }

        composable(route = com.example.easykazakh.secondLevel.AppDestinations.ScreenFirst.route) {
            SecondLevelScreenFirst(navController = navController)
        }
        composable(route = com.example.easykazakh.secondLevel.AppDestinations.ScreenSecond.route) {
            SecondLevelScreenSecond(navController = navController)
        }
        composable(route = com.example.easykazakh.secondLevel.AppDestinations.SecondLevelScreenThird.route) {
            SecondLevelScreenThird(navController = navController)
        }
        composable(route = com.example.easykazakh.secondLevel.AppDestinations.SecondLevelScreenUFourth.route) {
            SecondLevelScreenUFourth(navController = navController)
        }

        //Level 3
        composable(route = com.example.easykazakh.thirdLevel.AppDestinations.ThirdLevel.route) {
            ThirdLevel(navController = navController)
        }
        composable(route = com.example.easykazakh.thirdLevel.AppDestinations.ThirdLevelScreenFirst.route) {
            ThirdLevelScreenFirst(navController = navController)
        }
        composable(route = com.example.easykazakh.thirdLevel.AppDestinations.ThirdLevelScreenSecond.route) {
            ThirdLevelScreenSecond(navController = navController)
        }
        composable(route = com.example.easykazakh.thirdLevel.AppDestinations.ThirdLevelScreenThird.route) {
            ThirdLevelScreenThird(navController = navController)
        }
        composable(route = com.example.easykazakh.thirdLevel.AppDestinations.ThirdLevelScreenUFourth.route) {
            ThirdLevelScreenUFourth(navController = navController)
        }

        //Level 4
        composable(route = com.example.easykazakh.fourthLevel.AppDestinations.FourthLevelScreen.route) {
            FourthLevelScreen(navController = navController)
        }

        //Level 5
        composable(route = com.example.easykazakh.fifthLevel.AppDestinations.FifthLevel.route) {
            FifthLevel(navController = navController)
        }
        composable(route = com.example.easykazakh.fifthLevel.AppDestinations.FifthLevelFirstScreen.route) {
            FifthLevelFirstScreen(navController = navController)
        }
        composable(route = com.example.easykazakh.fifthLevel.AppDestinations.FifthLevelSecondScreen.route) {
            FifthLevelSecondScreen(navController = navController)
        }
        composable(route = com.example.easykazakh.fifthLevel.AppDestinations.FifthLevelThirdScreen.route) {
            FifthLevelThirdScreen(navController = navController)
        }
        composable(route = com.example.easykazakh.fifthLevel.AppDestinations.FifthLevelUFourthScreen.route) {
            FifthLevelUFourthScreen(navController = navController)
        }
    }
}
