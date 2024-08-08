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
fun ThirdLevelScreenSecond(navController: NavHostController) {

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
            prepositionSecond = listOf(),3,
            prepositionThird = listOf(),3,
            thirdButton[0][0], thirdButton[0][1],
            "","",
            "","",
            graduationList[counter],2,
            answerList[counter], "",
            onIncrement = {
                if (counter < 5) {
                    counter++
                    globalText = ""
                    count = 0
                    snackbar = null
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
    "Сен ойнап жатырсың ба?(отвечайте отрицательно)",
    "Сіз кітап оқып жатырсыз ба?(отвечайте отрицательно)",
    "Ол жұмыс істеп жатыр ма?(отвечайте отрицательно)",
    "Сендер сабақ оқып жатырсыңдар ма?(отвечайте отрицательно)",
    "Сіздер кино көріп жатырсыздар ма?(отвечайте отрицательно)",
    "Олар Алматыда тұра ма?(отвечайте положительно)"
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
    arrayOf("ойна"," ойна"),
    arrayOf("кітап"," кітап"),
    arrayOf("жұмыс"," жұмыс"),
    arrayOf("сабақ", " сабақ"),
    arrayOf("кино", " кино"),
    arrayOf("ұйықта", " ұйықта"),
)
private val secondButton = arrayOf(
    arrayOf("", ""),
    arrayOf("оқы", " оқы"),
    arrayOf("істе", " істе"),
    arrayOf("оқы", " оқы"),
    arrayOf("көр", " көр"),
    arrayOf("", ""),
)

private val prepositionFirst = listOf(
    "п", "ып", "іп"
)

private val thirdButton = arrayOf(
    arrayOf("жатқан жоқ", " жатқан жоқ"),
    arrayOf("жатқан жоқ", " жатқан жоқ"),
    arrayOf("жатқан жоқ", " жатқан жоқ"),
    arrayOf("жатқан жоқ", " жатқан жоқ"),
    arrayOf("жатқан жоқ", " жатқан жоқ"),
    arrayOf("жатқан жоқ", " жатқан жоқ"),
)


private val favoriteCollectionsDataGraduation = listOf(
    "пын","пін",
    "сың","сің",
    "сыз","сіз"
)

private val favoriteCollectionsDataGraduationSecond = listOf(
    "пыз","",
    "сыңдар","",
    "сыздар",""
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
    "Жоқ, мен ойнап жатқан жоқпын",
    "Жоқ, мен кітап оқып жатқан жоқпын",
    "Жоқ, ол жұмыс істеп жатқан жоқ",
    "Жоқ, біз сабақ оқып жатқан жоқпыз",
    "Жоқ, біз кино көріп жатқан жоқпыз",
    "Иә, олар ұйықтап жатқан жоқ"
)

private val amountCount = listOf(
    6,7,6,7,7,5
)
