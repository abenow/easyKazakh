package com.example.easykazakh.firstLevel


import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.easykazakh.buttons.Greeting
import com.example.easykazakh.buttons.count
import com.example.easykazakh.buttons.counter
import com.example.easykazakh.buttons.globalText
import com.example.easykazakh.buttons.snackbar
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun FirstLevelScreenUFourthSecond(navController: NavHostController) {


    Column {
        Greeting(
            titleName[counter],
            YesNo,
            pronounsList[counter],
            firstButton[counter][0],firstButton[counter][1],
            secondButton[counter][0],secondButton[counter][1],
            "","",
            "","",
            "","",
            "","",
            listOf(),3,
            listOf(),4,
            listOf(),4,
            "","",
            "","",
            "","",
            graduationList[counter],3,
            answerList[counter], "!",
            onIncrement = {
                if (counter < 7) {
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
        count = 0
        counter = 0
        snackbar = null
    }
}



private val titleName = listOf(
    "Сен директорсың ба?(положительно ответьте)",
    "Сен директорсың ба?(отрицательно ответьте)",
    "Ол жақсы ма?(положительно ответьте)",
    "Ол жақсы ма?(отрицательно ответьте)",
    "Сіздер мұғалімсіздер ме?(положительно ответьте)",
    "Сіздер мұғалімсіздер ме?(отрицательно ответьте)",
    "Олар әдемі ме?(положительно ответьте)",
    "Олар әдемі ме?(отрицательно ответьте)",
)
private val YesNo = listOf(
    "Иә", "Жоқ"
)

private val favoriteCollectionsDataPronounsSmall = listOf(
    "мен", "сен", "сіз", "ол"
)
private val favoriteCollectionsDataPronounsSecondSmall = listOf(
    "біз", "сендер", "сіздер", "олар"
)
private val pronounsList = listOf(
    favoriteCollectionsDataPronounsSmall,
    favoriteCollectionsDataPronounsSmall,
    favoriteCollectionsDataPronounsSmall,
    favoriteCollectionsDataPronounsSmall,
    favoriteCollectionsDataPronounsSecondSmall,
    favoriteCollectionsDataPronounsSecondSmall,
    favoriteCollectionsDataPronounsSecondSmall,
    favoriteCollectionsDataPronounsSecondSmall,
)


private val firstButton = arrayOf(
    arrayOf("директор"," директор"),
    arrayOf("директор"," директор"),
    arrayOf("жақсы"," жақсы"),
    arrayOf("жақсы"," жақсы"),
    arrayOf("мұғалім"," мұғалім"),
    arrayOf("мұғалім"," мұғалім"),
    arrayOf("әдемі"," әдемі"),
    arrayOf("әдемі"," әдемі"),
)
private val secondButton = arrayOf(
    arrayOf("",""),
    arrayOf(" емес"," емес"),
    arrayOf("",""),
    arrayOf(" емес"," емес"),
    arrayOf("",""),
    arrayOf("емес"," емес"),
    arrayOf("",""),
    arrayOf("емес"," емес"),
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
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduationSecond,
    favoriteCollectionsDataGraduationSecond,
    favoriteCollectionsDataGraduationSecond,
    favoriteCollectionsDataGraduationSecond
)


private val answerList = listOf(
    "Иә, мен директормын!",
    "Жоқ, мен директор емеспін!",
    "Иә, ол жақсы!",
    "Жоқ, ол жақсы емес!",
    "Иә, біз мұғалімбіз!",
    "Жоқ, біз мұғалім емеспіз!",
    "Иә, олар әдемі!",
    "Жоқ, олар әдемі емес!",
)

private val amountCount = listOf(
    4,5,3,4,4,5,3,4
)
