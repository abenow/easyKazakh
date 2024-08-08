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
fun FifthLevelFirstScreen(navController: NavHostController) {

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
            prepositionFirst,2,
            prepositionSecond,3,
            graduation,2,
            "","",
            "","",
            "","",
            prepositionThird[counter],2,
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
    "Ты живёшь в Алматы?",
    "Да, я живу в Алматы",
    "Нет, я не живу в Алматы?",
    "Он живёт в Алматы?",
    "Он не живёт в Алматы?",
    "Он живёт в Астане"
)

private val pronounsList = listOf(
    listOf("Мен", "Сен", "Сіз", "Ол"),
)


private val firstButton = arrayOf(
    arrayOf("Алматы"," Алматы"),
    arrayOf("Алматы"," Алматы"),
    arrayOf("Алматы"," Алматы"),
    arrayOf("Алматы"," Алматы"),
    arrayOf("Алматы"," Алматы"),
    arrayOf("Астана"," Астана"),
)
private val secondButton = arrayOf(
    arrayOf("тұр"," тұр"),
    arrayOf("тұр"," тұр"),
    arrayOf("тұр"," тұр"),
    arrayOf("тұр"," тұр"),
    arrayOf("тұр"," тұр"),
    arrayOf("тұр"," тұр"),
)
private val thirdButton = arrayOf(
    arrayOf("",""),
    arrayOf("Иә ","Иә, "),
    arrayOf("Иә","Иә, "),
    arrayOf("",""),
    arrayOf("Иә","Иә, "),
    arrayOf("",""),
)
private val fourthButton = arrayOf(
    arrayOf("",""),
    arrayOf("Жоқ","Жоқ, "),
    arrayOf("Жоқ","Жоқ, "),
    arrayOf("",""),
    arrayOf("Жоқ","Жоқ, "),
    arrayOf("",""),
)

private val prepositionFirst = listOf(
    "да","де",
    "мен","пен",
    "дан","ден",
    "ға","ге"
)
private val prepositionSecond = listOf(
    "а","е","й"
)

private val prepositionThird = listOf(
    listOf("ба","бе"),
    listOf(),
    listOf("ма","ме"),
    listOf("ма","ме"),
    listOf("ма","ме"),
    listOf(),
)

private val graduation = listOf(
    "мын","мін",
    "сың","сің",
    "сыз","сіз",
    "ды","ді"
)


private val answerList = listOf(
    "Сен Алматыда тұрасың ба?",
    "Иә, мен Алматыда тұрамын",
    "Жоқ, мен Алматыда тұрмаймын",
    "Ол Алматыда тұра ма?",
    "Ол Алматыда тұрмайды",
    "Ол Астанада тұрады",
)

private val amountCount = listOf(
    7,7,8,6,7,6
)
