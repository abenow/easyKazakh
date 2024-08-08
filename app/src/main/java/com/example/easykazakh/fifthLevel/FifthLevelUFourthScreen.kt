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
fun FifthLevelUFourthScreen(navController: NavHostController) {

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
            prepositionSecond,4,
            prepositionThird,4,
            "","",
            "","",
            "","",
            graduationList[counter],2,
            answerList[counter], "",
            onIncrement = {
                if (counter < 13) {
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
    "Меня зовут Марат",
    "Моя фамилия Иванов",
    "Тебя зовут Женис",
    "Тебя зовут Женис?",
    "Тебя зовут не Женис",
    "Его зовут Марат",
    "Его зовут Марат?",
    "Его зовут не Марат",
    "Это моя книга",
    "Это твоя книга?",
    "Это не его книга?",
    "У меня есть книга",
    "У тебя есть книга?",
    "У него нет книги",
)

private val pronounsList = listOf(
    listOf("Менің", "Сенің", "Сіздің", "Оның"),
)


private val firstButton = arrayOf(
    arrayOf("ат"," ат"),
    arrayOf("фамилия"," фамилия"),
    arrayOf("ат"," ат"),
    arrayOf("ат"," ат"),
    arrayOf("ат"," ат"),
    arrayOf("ат"," ат"),
    arrayOf("ат"," ат"),
    arrayOf("ат"," ат"),
    arrayOf("кітап"," кітаб"),
    arrayOf("кітап"," кітаб"),
    arrayOf("кітап"," кітаб"),
    arrayOf("кітап"," кітаб"),
    arrayOf("кітап"," кітаб"),
    arrayOf("кітап"," кітаб"),
)
private val secondButton = arrayOf(
    arrayOf("Марат"," Марат"),
    arrayOf("Иванов"," Иванов"),
    arrayOf("Жеңіс"," Жеңіс"),
    arrayOf("Жеңіс"," Жеңіс"),
    arrayOf("Жеңіс"," Жеңіс"),
    arrayOf("Марат"," Марат"),
    arrayOf("Марат"," Марат"),
    arrayOf("Марат"," Марат"),
    arrayOf("Бұл","Бұл"),
    arrayOf("Бұл","Бұл"),
    arrayOf("Бұл","Бұл"),
    arrayOf("бар"," бар"),
    arrayOf("бар"," бар"),
    arrayOf("жоқ"," жоқ"),
)
private val thirdButton = arrayOf(
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("емес"," емес"),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("емес"," емес"),
    arrayOf("менің"," менің"),
    arrayOf("сенің"," сенің"),
    arrayOf("емес"," емес"),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
)

private val fourthButton = arrayOf(
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("оның"," оның"),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
)

private val prepositionFirst = listOf(
    "ым","ім","м",
    "ың","ің","ң"
)

private val prepositionSecond = listOf(
    "ыңыз","іңіз","ңыз","ңіз"
)
private val prepositionThird = listOf(
    "ы","і","сы","сі"
)

private val graduationList = listOf(
    listOf(),
    listOf(),
    listOf(),
    listOf("па","пе"),
    listOf(),
    listOf(),
    listOf("па","пе"),
    listOf(),
    listOf(),
    listOf("ба","бе"),
    listOf(),
    listOf(),
    listOf("ма","ме"),
    listOf(),
)


private val answerList = listOf(
    "Менің атым Марат",
    "Менің фамилиям Иванов",
    "Сенің атың Жеңіс",
    "Сенің атың Жеңіс пе?",
    "Сенің атың Жеңіс емес",
    "Оның аты Марат",
    "Оның аты Марат па?",
    "Оның аты Марат емес",
    "Бұл менің кітабым",
    "Бұл сенің кітабың ба?",
    "Бұл оның кітабы емес",
    "Менің кітабым бар",
    "Сенің кітабың бар ма?",
    "Оның кітабы жоқ",
)

private val amountCount = listOf(
    4,4,4,5,5,4,5,5,4,5,5,4,5,4
)
