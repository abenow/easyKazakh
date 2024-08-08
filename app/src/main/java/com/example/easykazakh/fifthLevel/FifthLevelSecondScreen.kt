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
fun FifthLevelSecondScreen(navController: NavHostController) {

    Column {
        Greeting(
            titleName[counter],
            yesNo = listOf(),
            pronounsList[0],
            firstButton[counter][0],firstButton[counter][1],
            secondButton[counter][0],secondButton[counter][1],
            thirdButton[counter][0],thirdButton[counter][1],
            fourthButton[counter][0],fourthButton[counter][1],
            fifthButton[counter][0],fifthButton[counter][1],
            "","",
            prepositionFirst,2,
            prepositionSecond = listOf(),3,
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
    "Ты пришла домой?",
    "Да, я пришла домой",
    "Нет, я не пришла домой",
    "Он пришел домой?",
    "Да, он пришел домой",
    "Нет, он не пришел домой"
)

private val pronounsList = listOf(
    listOf("Мен", "Сен", "Сіз", "Ол"),
)


private val firstButton = arrayOf(
    arrayOf("үй"," үй"),
    arrayOf("үй"," үй"),
    arrayOf("үй"," үй"),
    arrayOf("үй"," үй"),
    arrayOf("үй"," үй"),
    arrayOf("үй"," үй"),
)
private val secondButton = arrayOf(
    arrayOf("кел"," кел"),
    arrayOf("кел"," кел"),
    arrayOf("кел"," кел"),
    arrayOf("кел"," кел"),
    arrayOf("кел"," кел"),
    arrayOf("кел"," кел"),
)
private val thirdButton = arrayOf(
    arrayOf("",""),
    arrayOf("Иә ","Иә, "),
    arrayOf("Иә","Иә, "),
    arrayOf("",""),
    arrayOf("Иә","Иә, "),
    arrayOf("Иә","Иә, "),
)
private val fourthButton = arrayOf(
    arrayOf("",""),
    arrayOf("Жоқ","Жоқ, "),
    arrayOf("Жоқ","Жоқ, "),
    arrayOf("",""),
    arrayOf("Жоқ","Жоқ, "),
    arrayOf("Жоқ","Жоқ, "),
)

private val fifthButton = arrayOf(
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("ол","ол"),
    arrayOf("ол","ол"),
)

private val prepositionFirst = listOf(
    "да","де",
    "мен","пен",
    "дан","ден",
    "ға","ге"
)


private val prepositionThird = listOf(
    listOf("ба","бе"),
    listOf(),
    listOf("ма","ме"),
    listOf("ма","ме"),
    listOf(),
    listOf("ма","ме"),
)

private val graduation = listOf(
    "дым","дім",
    "дың","дің",
    "дыңыз","діңіз",
    "ды","ді"
)


private val answerList = listOf(
    "Сен үйге келдің бе?",
    "Иә, мен үйге келдім",
    "Жоқ, мен үйге келмедім",
    "Ол үйге келді ме?",
    "Иә, ол үйге келді",
    "Жоқ, ол үйге келмеді",
)

private val amountCount = listOf(
    6,6,7,6,6,7
)
