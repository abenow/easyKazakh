package com.example.easykazakh.fifthLevel

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.easykazakh.buttons.Greeting
import com.example.easykazakh.buttons.count
import com.example.easykazakh.buttons.counter
import com.example.easykazakh.buttons.globalText
import com.example.easykazakh.buttons.snackbar
import com.example.easykazakh.firstLevel.AppDestinations
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun FifthLevelThirdScreen(navController: NavHostController) {

    Column {
        Greeting(
            titleName[counter],
            yesNo = listOf(),
            pronounsList[0],
            firstButton[counter][0],firstButton[counter][1],
            secondButton[counter][0],secondButton[counter][1],
            thirdButton[counter][0],thirdButton[counter][1],
            fourthButton[counter][0],fourthButton[counter][1],
            "","",
            "","",
            prepositionFirst,3,
            prepositionSecond = listOf(),3,
            graduationList[counter],2,
            seventhButton[counter][0],seventhButton[counter][1],
            "","",
            "","",
            prepositionThird[counter],3,
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
        count = 0
        counter = 0
        snackbar = null
    }
}

private val titleName = listOf(
    "Ты сейчас спишь?",
    "Да, я сейчас сплю",
    "Нет, я сейчас не сплю",
    "Он сейчас спит?",
    "Да, он сейчас спит!",
    "Нет, он сейчас не спит"
)

private val pronounsList = listOf(
    listOf("Мен", "Сен", "Сіз", "Ол"),
)


private val firstButton = arrayOf(
    arrayOf("ұйықта"," ұйықта"),
    arrayOf("ұйықта"," ұйықта"),
    arrayOf("ұйықта"," ұйықта"),
    arrayOf("ұйықта"," ұйықта"),
    arrayOf("ұйықта"," ұйықта"),
    arrayOf("ұйықта"," ұйықта"),
)
private val secondButton = arrayOf(
    arrayOf("",""),
    arrayOf("Иә","Иә, "),
    arrayOf("Иә","Иә, "),
    arrayOf("",""),
    arrayOf("Иә","Иә, "),
    arrayOf("Иә","Иә, "),
)
private val thirdButton = arrayOf(
    arrayOf("",""),
    arrayOf("Жоқ","Жоқ, "),
    arrayOf("Жоқ","Жоқ, "),
    arrayOf("",""),
    arrayOf("Жоқ","Жоқ, "),
    arrayOf("Жоқ","Жоқ, "),
)

private val fourthButton = arrayOf(
    arrayOf("",""),
    arrayOf("мен","мен"),
    arrayOf("мен","мен"),
    arrayOf("",""),
    arrayOf("ол","ол"),
    arrayOf("ол","ол"),
)

private val prepositionFirst = listOf(
    "п","ып","іп"
)

private val seventhButton = arrayOf(
    arrayOf("жатыр"," жатыр"),
    arrayOf("жатыр"," жатыр"),
    arrayOf("жатқан жоқ"," жатқан жоқ"),
    arrayOf("жатыр"," жатыр"),
    arrayOf("жатыр"," жатыр"),
    arrayOf("жатқан жоқ"," жатқан жоқ"),
)

private val prepositionThird = listOf(
    listOf("ба","бе"),
    listOf(),
    listOf(),
    listOf("ма","ме"),
    listOf(),
    listOf(),
)


private val graduationFirst = listOf(
    "мын","мін",
    "сың","сің",
    "сыз","сіз"
)
private val graduationSecond = listOf(
    "пын","пін",
    "сың","сің",
    "сыз","сіз"
)

private val graduationList = listOf(
    graduationFirst,
    graduationFirst,
    graduationSecond,
    graduationFirst,
    graduationFirst,
    graduationSecond
)

private val answerList = listOf(
    "Сен ұйықтап жатырсың ба?",
    "Иә, мен ұйықтап жатырмын",
    "Жоқ, мен ұйықтап жатқан жоқпын",
    "Ол ұйықтап жатыр ма?",
    "Иә, ол ұйықтап жатыр",
    "Жоқ, ол ұйықтап жатқан жоқ",
)

private val amountCount = listOf(
    6,6,6,5,5,5
)
