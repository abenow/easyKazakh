package com.example.easykazakh.secondLevel

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.easykazakh.firstLevel.AppDestinations
import com.example.easykazakh.buttons.Greeting
import com.example.easykazakh.buttons.count
import com.example.easykazakh.buttons.countList
import com.example.easykazakh.buttons.counter
import com.example.easykazakh.buttons.globalText
import com.example.easykazakh.buttons.snackbar
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun SecondLevelScreenSecond(navController: NavHostController) {

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
            preposition[counter],3,
            prepositionSecond = listOf(),3,
            prepositionThird = listOf(),3,
            thirdButton[counter][0],thirdButton[counter][1],
            "","",
            "","",
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
    "Сен ойнап жатырсың ба?(положительно ответьте)",
    "Сіз кітап оқып жатырсыз ба?(положительно ответьте)",
    "Ол жұмыс істеп жатыр ма?(положительно ответьте)",
    "Сендер сабақ оқып жатырсыңдар ма?(положительно ответьте)",
    "Сіздер кино көріп жатырсыздар ма?(положительно ответьте)",
    "Балалар ұйықтап жатыр ма?(положительно ответьте)",
    "Сіздер кешкі ас ішіп жатырсыздар ма?(положительно ответьте)",
    "Сіздер шәй ішіп жатырсыздар ма?(положительно ответьте)"
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
    arrayOf("кешкі ас", " кешкі ас"),
    arrayOf("шәй", " шәй")

)
private val secondButton = arrayOf(
    arrayOf("", ""),
    arrayOf("оқы", " оқы"),
    arrayOf("істе", " істе"),
    arrayOf("оқы"," оқы"),
    arrayOf("көр", " көр"),
    arrayOf("", ""),
    arrayOf("іш", " іш"),
    arrayOf("іш", " іш")
)

private val preposition = listOf(
    listOf("п", "ып", "іп"),
    listOf("п", "ып", "іп"),
    listOf("п", "ып", "іп"),
    listOf("п", "ып", "іп"),
    listOf("п", "ып", "іп"),
    listOf("п", "ып", "іп"),
    listOf("п", "ып", "іп"),
    listOf("п", "ып", "іп")
)

private val thirdButton = arrayOf(
    arrayOf("жатыр", " жатыр",),
    arrayOf("жатыр"," жатыр"),
    arrayOf("жатыр"," жатыр"),
    arrayOf("жатыр"," жатыр"),
    arrayOf("жатыр"," жатыр"),
    arrayOf("жатыр"," жатыр"),
    arrayOf("жатыр"," жатыр"),
    arrayOf("жатыр"," жатыр")
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
    favoriteCollectionsDataGraduationSecond,
    favoriteCollectionsDataGraduationSecond
)


private val answerList = listOf(
    "Иә, мен ойнап жатырмын", "Иә, мен кітап оқып жатырмын", "Иә, ол жұмыс істеп жатыр", "Иә, біз сабақ оқып жатырмыз",
    "Иә, біз кино көріп жатырмыз", "Иә, олар ұйықтап жатыр", "Иә, біз кешкі ас ішіп жатырмыз", "Иә, біз шәй ішіп жатырмыз"
)

private val amountCount = listOf<Int>(
    6,7,6,7,7,5,7,7
)

