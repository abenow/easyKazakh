package com.example.easykazakh.thirdLevel

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.easykazakh.buttons.Greeting
import com.example.easykazakh.buttons.count
import com.example.easykazakh.buttons.countList
import com.example.easykazakh.buttons.counter
import com.example.easykazakh.buttons.globalText
import com.example.easykazakh.buttons.snackbar
import com.example.easykazakh.firstLevel.AppDestinations
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun ThirdLevelScreenFirst(navController: NavHostController) {

    Column {
        Greeting(
            titleName[counter],
            yesNo[0],
            pronounsList[counter],
            firstButton[counter][0],firstButton[counter][1],
            secondButton[counter][0],secondButton[counter][1],
            "","",
            "","",
            "","",
            "","",
            prepositionFirst,2,
            prepositionSecond,3,
            prepositionThird = listOf(),3,
            "", "",
            "", "",
            "", "",
            graduationList[counter],2,
            answerList[counter], "",
            onIncrement = {
                if (counter < 5) {
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
            amountCount[counter]
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
    "Сен Алматыда тұрасың ба?(отвечайте отрицательно)",
    "Сіз заводта істейсіз бе?(отвечайте отрицательно)",
    "Ол мектепте оқи ма?(отвечайте отрицательно)",
    "Сендер мектепте оқисыңдар ма?(отвечайте отрицательно)",
    "Сіздер заводта істейсіздер ме?(отвечайте отрицательно)",
    "Олар Алматыда тұра ма?(отвечайте отрицательно)"
)

private val yesNo = listOf(
    listOf("Иә", "Жоқ")
)

private val pronounsList = listOf(
    listOf("мен", "сен", "сіз", "ол"),
    listOf("мен", "сен", "сіз", "ол"),
    listOf("мен", "сен", "сіз", "ол"),
    listOf("біз", "сендер", "сіздер", "олар"),
    listOf("біз", "сендер", "сіздер", "олар"),
    listOf("біз", "сендер", "сіздер", "олар")
)


private val firstButton = arrayOf(
    arrayOf("Алматыда"," Алматыда"),
    arrayOf("заводта"," заводта"),
    arrayOf("мектепте"," мектепте"),
    arrayOf("мектепте", " мектепте"),
    arrayOf("заводта", " заводта"),
    arrayOf("Алматыда", " Алматыда"),
)
private val secondButton = arrayOf(
    arrayOf("тұр", " тұр"),
    arrayOf("істе", " істе"),
    arrayOf("оқы", " оқы"),
    arrayOf("оқы", " оқы"),
    arrayOf("істе", " істе"),
    arrayOf("тұр", " тұр"),
)

private val prepositionFirst = listOf(
   "ма", "ме"
)

private val prepositionSecond = listOf(
    "а", "е", "й"
)

private val favoriteCollectionsDataGraduation = listOf(
    "мын", "мін",
    "сың", "сің",
    "сыз", "сіз",
    "ды", "ді"
)

private val favoriteCollectionsDataGraduationSecond = listOf(
    "мыз", "міз",
    "сыңдар", "сіңдер",
    "сыздар", "сіздер",
    "ды", "ді"
)

private val graduationList = listOf(
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduationSecond,
    favoriteCollectionsDataGraduationSecond,
    favoriteCollectionsDataGraduationSecond,
)


private val answerList = listOf(
    "Жоқ, мен Алматыда тұрмаймын", "Жоқ, мен заводта істемеймін", "Жоқ, ол мектепте оқымайды", "Жоқ, біз мектепте оқымаймыз",
    "Жоқ, біз заводта істемейміз", "Жоқ, олар Алматыда тұрмайды"
)

private val amountCount = listOf(
    7,7,7,7,7,7
)
