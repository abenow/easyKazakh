package com.example.easykazakh.firstLevel


import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.easykazakh.buttons.snackbar


@Composable
fun FirstLevelScreenUFourth(navController: NavHostController) {
        Column {
            Greeting(
                titleName[counter],
                yesNo = listOf(),
                favoriteCollectionsDataPronouns,
                firstButton[counter][0],firstButton[counter][1],
                secondButton[counter][0],secondButton[counter][1],
                favoriteCollectionsDataGraduation,
                questions,
                answerList[counter],"",
                onIncrement = {
                    if (counter < 2) {
                        counter++
                        globalText = ""
                        count = 0
                        snackbar = null
                    } else {
                        navController.navigate(AppDestinations.FirstLevelScreenUFourthSecond.route)
                    }
                },
                navController = navController,
                amountCount[counter]
            )
        }

}

private val titleName = listOf(
    "Я инженер",
    "Ты инженер?",
    "Он не инженер",
)
private val favoriteCollectionsDataPronouns = listOf(
    "Мен", "Сен", "Сіз", "Ол"
)

private val firstButton = arrayOf(
    arrayOf("инженер"," инженер"),
    arrayOf("инженер"," инженер"),
    arrayOf("инженер"," инженер"),
)
private val secondButton = arrayOf(
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("емес", " емес"),
)

private val favoriteCollectionsDataGraduation = listOf(
    "мын", "мін", "бын", "бін", "пын", "пін",
    "сың", "сің",
    "сыз", "сіз"
)

private val questions = listOf(
    "ба", "бе"
)

private val answerList = listOf(
    "Мен инженермін",
    "Сен инженерсің бе?",
    "Ол инженер емес",
)

private val amountCount = listOf(
    3,4,3
)