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
fun ThirdLevelScreenUFourth(navController: NavHostController) {

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
    "Сен үйдесің бе?(отвечайте отрицательно)",
    "Сен үйіңдесің бе?(отвечайте отрицательно)",
    "Сіз Қазақстаннансыз ба?(отвечайте отрицательно)",
    "Ол Астанадан ба?(отвечайте отрицательно)",
    "Сендер біріншісіңдер ме?(отвечайте отрицательно)",
    "Олар екінші ме?(отвечайте отрицательно)",
    "Сен қырықтасың ба?(отвечайте отрицательно)",
    "Сіз қырық екі жастасыз ба?(отвечайте отрицательно)"
)

private val yesNo = listOf(
    listOf("Иә", "Жоқ")
)

private val pronounsList = listOf(
    listOf("мен", "сен", "сіз", "ол"),
    listOf("мен", "сен", "сіз", "ол"),
    listOf("мен", "сен", "сіз", "ол"),
    listOf("мен", "сен", "сіз", "ол"),
    listOf("біз", "сендер", "сіздер", "олар"),
    listOf("біз", "сендер", "сіздер", "олар"),
    listOf("мен", "сен", "сіз", "ол"),
    listOf("мен", "сен", "сіз", "ол")
)


private val firstButton = arrayOf(
    arrayOf("үйде"," үйде"),
    arrayOf("үйімде"," үйімде"),
    arrayOf("Қазақстаннан"," Қазақстаннан"),
    arrayOf("Астанадан", " Астанадан"),
    arrayOf("бірінші", " бірінші"),
    arrayOf("екінші", " екінші"),
    arrayOf("қырықта", " қырықта"),
    arrayOf("қырық екі жаста", " қырық екі жаста")

)
private val secondButton = arrayOf(
    arrayOf("емес", " емес"),
    arrayOf("емес", " емес"),
    arrayOf("емес", " емес"),
    arrayOf("емес", " емес"),
    arrayOf("емес", " емес"),
    arrayOf("емес", " емес"),
    arrayOf("емес", " емес"),
    arrayOf("емес", " емес"),
)




private val favoriteCollectionsDataGraduation = listOf(
    "пын", "пін",
    "сың","сің",
    "сыз","сіз"
)

private val favoriteCollectionsDataGraduationSecond = listOf(
    "пыз", "піз",
    "сыңдар", "сіңдер",
    "сыздар", "сіздер"
)
private val favoriteCollectionsDataGraduationThird = listOf(
    "пыз", "піз",
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
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduation
)


private val answerList = listOf(
    "Жоқ, мен үйде емеспін", "Жоқ, мен үйімде емеспін", "Жоқ, мен Қазақстаннан емеспін", "Жоқ, ол Астанадан емес",
    "Жоқ, біз бірінші емеспіз", "Жоқ, олар екінші емес", "Жоқ, мен қырықта емеспін", "Жоқ, мен қырық екі жаста емеспін"
)

private val amountCount = listOf(
    5,5,5,4,5,4,5,5
)
