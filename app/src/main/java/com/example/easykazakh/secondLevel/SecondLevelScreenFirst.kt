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
fun SecondLevelScreenFirst(navController: NavHostController) {

    Column {
        Greeting(
            titleName[counter],
            yesNo[countList],
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
    "Я играю", "Я сейчас играю", "Я играл", "Я завтра буду играть",
    "Сен Алматыда тұрасың ба?(положительно ответьте)",
    "Сіз заводта істейсіз бе? (положительно ответьте)",
    "Сендер мектепте оқисыңдар ма? (положительно ответьте)",
    "Олар Алматыда тұра ма? (положительно ответьте)"
)

private val yesNo = listOf(
    listOf(),
    listOf("Иә", "Жоқ")
)

private val pronounsList = listOf(
    listOf("Мен", "Сен", "Сіз", "Ол"),
    listOf("Мен", "Сен", "Сіз", "Ол"),
    listOf("Мен", "Сен", "Сіз", "Ол"),
    listOf("Мен", "Сен", "Сіз", "Ол"),
    listOf("мен", "сен", "сіз", "ол"),
    listOf("мен", "сен", "сіз", "ол"),
    listOf("біз", "сендер", "сіздер", "олар"),
    listOf("біз", "сендер", "сіздер", "олар")
)


private val firstButton = arrayOf(
    arrayOf("ойна"," ойна"),
    arrayOf("ойна"," ойна"),
    arrayOf("ойна"," ойна"),
    arrayOf("ертең", " ертең"),
    arrayOf("Алматыда", " Алматыда"),
    arrayOf("завотда", " завотда"),
    arrayOf("мектепте", " мектепте"),
    arrayOf("Алматыда", " Алматыда")

)
private val secondButton = arrayOf(
    arrayOf("", ""),
    arrayOf("", ""),
    arrayOf("", ""),
    arrayOf("ойна"," ойна"),
    arrayOf("тұр", " тұр"),
    arrayOf("істе", " істе"),
    arrayOf("оқы", " оқы"),
    arrayOf("тұр", " тұр")
)
private val thirdButton = arrayOf(
    arrayOf("", "",),
    arrayOf("жатыр"," жатыр"),
    arrayOf("", "",),
    arrayOf("", "",),
    arrayOf("", "",),
    arrayOf("", "",),
    arrayOf("", "",),
    arrayOf("", "",)
)


private val preposition = listOf(
    listOf("а", "е", "й"),
    listOf("п", "ып", "іп"),
    listOf(),
    listOf("а", "е", "й"),
    listOf("а", "е", "й"),
    listOf("а", "е", "й"),
    listOf("а", "е", "й"),
    listOf("а", "е", "й")
)




private val favoriteCollectionsDataGraduation = listOf(
    "мын", "мін",
    "сың", "сің",
    "сыз", "сіз",
    "ды", "ді",
)

private val favoriteCollectionsDataGraduationSecond = listOf(
    "мыз", "міз",
    "сыңдар", "сіңдер",
    "сыздар", "сіздер",
    "ды", "ді",
)

private val favoriteCollectionsDataGraduationThird = listOf(
    "дым", "дім",
    "дың", "дің",
    "дыңыз", "діңіз",
    "ды", "ді",
)

private val graduationList = listOf(
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduationThird,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduationSecond,
    favoriteCollectionsDataGraduationSecond
)


private val answerList = listOf(
    "Мен ойнаймын", "Мен ойнап жатырмын", "Мен ойнадым", "Мен ертең ойнаймын",
    "Иә, мен Алматыда тұрамын", "Иә, мен завотда істеймін", "Иә, біз мектепте оқыймыз", "Иә, олар Алматыда тұрады"
)

private val amountCount = listOf<Int>(
    4,5,3,5,6,6,6,6
)

