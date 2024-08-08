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
fun FirstLevelScreenFirst(navController: NavHostController) {

    Column {
        Greeting(
            titleName[counter],
            yesNo = listOf(),
            pronounsList[countList],
            " инженер"," инженер",
            "","",
            graduationList[countList],
            prepositions = listOf(),
            answerList[counter], "",
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
            3
        )
    }
}

private fun navigate(){
    CoroutineScope(Dispatchers.Main).launch {
        delay(500)
        globalText = ""
        countList = 0
        count = 0
        counter = 0
        snackbar = null
    }
}

private val titleName = listOf(
    "Я инженер", "Ты инженер", "Вы инженер", "Он инженер",
    "Мы инженеры", "Вы(сендер) инженеры", "Вы(сіздер) инженеры", "Они инженеры"
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
    "инженер"
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
    "Мен инженермін", "Сен инженерсің", "Сіз инженерсіз", "Ол инженер",
    "Біз инженерміз", "Сендер инженерсіңдер", "Сіздер инженерсіздер", "Олар инженер"
)

