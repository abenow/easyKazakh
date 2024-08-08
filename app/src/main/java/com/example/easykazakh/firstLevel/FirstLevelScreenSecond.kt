package com.example.easykazakh.firstLevel


import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.easykazakh.buttons.snackbar
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@Composable
fun FirstLevelScreenSecond(navController: NavHostController) {
    Column {
        Greeting(
            titleName[counter],
            yesNo = listOf(),
            pronounsList[countList],
            engineer[0],engineer[0],
            engineer[1],engineer[1],
            graduationList[countList],
            prepositions = listOf(),
            answerList[counter],"",
            onIncrement = {
                if (counter < 7) {
                    counter++
                    globalText = ""
                    count = 0
                    snackbar = null
                    if (counter > 3) {
                        countList = 1
                    }
                } else {
                    navController.navigate(AppDestinations.Menu.route)
                    navigate()
                }
            },
            navController = navController,
            4
        )
    }
}
private fun navigate(){
    CoroutineScope(Dispatchers.Main).launch {
        delay(500)
        counter = 0
        countList = 0
        globalText = ""
        count = 0
        snackbar = null
    }
}

private val titleName = listOf(
    "Я не инженер",
    "Ты не инженер",
    "Вы не инженер",
    "Он не инженер",
    "Мы не инженеры",
    "Вы(сендер) не инженеры",
    "Вы(сіздер) не инженеры",
    "Они не инженеры"
)


private val favoriteCollectionsDataPronouns = listOf(
    "Мен", "Сен", "Сіз", "Ол"
)

private val favoriteCollectionsDataPronounsSecond = listOf(
    "Біз", "Сендер", "Сіздер", "Олар"
)

private val pronounsList = listOf(
    favoriteCollectionsDataPronouns, favoriteCollectionsDataPronounsSecond
)


private val engineer = listOf(
    " инженер",
    " емес"
)

private val favoriteCollectionsDataGraduation = listOf(
    "мын", "мін", "бын", "бін", "пын", "пін",
    "сың", "сің",
    "сыз", "сіз"
)

private val favoriteCollectionsDataGraduationSecond = listOf(
    "мыз", "міз", "быз", "біз", "пыз", "піз",
    "сыңдар", "сіңдер",
    "сыздар", "сіздер"

)

private val graduationList = listOf(
    favoriteCollectionsDataGraduation, favoriteCollectionsDataGraduationSecond
)

private val answerList = listOf(
    "Мен инженер емеспін", "Сен инженер емессің", "Сіз инженер емессіз", "Ол инженер емес",
    "Біз инженер емеспіз", "Сендер инженер емессіңдер", "Сіздер инженер емессіздер", "Олар инженер емес"
)
