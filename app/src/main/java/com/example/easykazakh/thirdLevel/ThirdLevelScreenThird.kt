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
fun ThirdLevelScreenThird(navController: NavHostController) {

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
            prepositionFirst[counter],3,
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
    "Сен үйге келдің бе?(отвечайте отрицательно)",
    "Сіз жұмысқа бардыңыз ба?(отвечайте отрицательно)",
    "Ол таңғы ас ішті ме?(отвечайте отрицательно)",
    "Сендер сабақ оқыдыңдар ма?(отвечайте отрицательно)",
    "Сіздер кешкі ас іштіңіздер ме?(отвечайте отрицательно)",
    "Олар  жұмыстан келді ме?(отвечайте отрицательно)",
    "Сен түсте шәй іштің бе?(отвечайте отрицательно)",
    "Сіздер жұмыста болдыңыздар ма?(отвечайте отрицательно)"
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
    listOf("мен", "сен", "сіз", "ол"),
    listOf("біз", "сендер", "сіздер", "олар")
)


private val firstButton = arrayOf(
    arrayOf("үйге"," үйге"),
    arrayOf("жұмысқа"," жұмысқа"),
    arrayOf("таңғы ас"," таңғы ас"),
    arrayOf("сабақ", " сабақ"),
    arrayOf("кешкі ас", " кешкі ас"),
    arrayOf("жұмыстан", " жұмыстан"),
    arrayOf("түсте", " түсте"),
    arrayOf("жұмыста", " жұмыста")

)
private val secondButton = arrayOf(
    arrayOf("кел", " кел"),
    arrayOf("бар", " бар"),
    arrayOf("іш", " іш"),
    arrayOf("оқы", " оқы"),
    arrayOf("іш", " іш"),
    arrayOf("кел", " кел"),
    arrayOf("шәй іш", " шәй іш"),
    arrayOf("бол", " бол")
)

private val prepositionFirst = listOf(
    listOf("ма","ме"),
    listOf("ма","ме"),
    listOf("па","пе"),
    listOf("ма","ме"),
    listOf("па","пе"),
    listOf("ма","ме"),
    listOf("па","пе"),
    listOf("ма","ме"),
)


private val favoriteCollectionsDataGraduation = listOf(
    "дым", "дім",
    "дың", "дің",
    "дыңыз", "діңіз",
    "ды", "ді",
)
private val favoriteCollectionsDataGraduationSecond = listOf(
    "дық","дік",
    "дыңдар","діңдер",
    "дыңыздар","діңіздер",
    "ды","ді"

)

private val graduationList = listOf(
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduationSecond,
    favoriteCollectionsDataGraduationSecond,
    favoriteCollectionsDataGraduationSecond,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduationSecond
)


private val answerList = listOf(
    "Жоқ, мен үйге келмедім", "Жоқ, мен жұмысқа бармадым", "Жоқ, ол таңғы ас ішпеді", "Жоқ, біз сабақ оқымадық",
    "Жоқ, біз кешкі ас ішпедік", "Жоқ, олар жұмыстан келмеді", "Жоқ, мен түсте шәй ішпедім", "Жоқ, біз жұмыста болмадық"
)

private val amountCount = listOf(
    6,6,6,6,6,6,6,6
)
