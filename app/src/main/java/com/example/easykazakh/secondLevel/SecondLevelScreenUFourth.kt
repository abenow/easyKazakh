package com.example.easykazakh.secondLevel

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
fun SecondLevelScreenUFourth(navController: NavHostController) {

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
            prepositionFirst = listOf(),3,
            prepositionSecond = listOf(),3,
            prepositionThird = listOf(),3,
            "", "",
            "", "",
            "", "",
            graduationList[counter],2,
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
    "Сен үйдесің бе?(отвечайте положительно)",
    "Сіз жұмыстасыз ба?(отвечайте положительно)",
    "Ол ауылда ма?(отвечайте положительно)",
    "Сендер жұмыстасыңдар ма?(положительно ответьте)",
    "Сіздер дүкендесіздер ме?(положительно ответьте)",
    "Балалар балабақшада ма?(положительно ответьте)",
    "Сен қырықтасың ба?(отвечайте положительно)",
    "Сіз қырық екі жастасыз ба?(отвечайте положительно)"
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
    listOf(),
    listOf("мен", "сен", "сіз", "ол"),
    listOf("мен", "сен", "сіз", "ол")
)


private val firstButton = arrayOf(
    arrayOf("үйде"," үйде"),
    arrayOf("жұмыста"," жұмыста"),
    arrayOf("ауылда"," ауылда"),
    arrayOf("жұмыста", " жұмыста"),
    arrayOf("дүкенде", " дүкенде"),
    arrayOf("балалар", "балалар"),
    arrayOf("қырықта", " қырықта"),
    arrayOf("қырық екі", " қырық екі")

)
private val secondButton = arrayOf(
    arrayOf("", ""),
    arrayOf("", ""),
    arrayOf("", ""),
    arrayOf("", ""),
    arrayOf("", ""),
    arrayOf("балабақшада", " балабақшада"),
    arrayOf("", ""),
    arrayOf("жаста", " жаста")
)


private val favoriteCollectionsDataGraduation = listOf(
    "мын", "мін",
    "сың", "сің",
    "сыз", "сіз",
)

private val favoriteCollectionsDataGraduationSecond = listOf(
    "мыз", "міз",
    "сыңдар", "сіңдер",
    "сыздар", "сіздер",
)

private val graduationList = listOf(
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduationSecond,
    favoriteCollectionsDataGraduationSecond,
    favoriteCollectionsDataGraduationSecond,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduation
)


private val answerList = listOf(
    "Иә, мен үйдемін", "Иә, мен жұмыстамын", "Иә, ол ауылда", "Иә, біз жұмыстамыз",
    "Иә, біз дүкендеміз", "Иә, балалар балабақшада", "Иә, мен қырықтамын", "Иә, мен қырық екі жастамын"
)

private val amountCount = listOf(
    4,4,3,4,4,3,4,5
)
