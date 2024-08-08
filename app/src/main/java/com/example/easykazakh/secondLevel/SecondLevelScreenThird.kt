package com.example.easykazakh.secondLevel

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
fun SecondLevelScreenThird(navController: NavHostController) {

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
    "Сен келдің бе?(положительно ответьте)",
    "Сіз бардыңыз ба?(положительно ответьте)",
    "Ол таңғы ас ішті ме?(положительно ответьте)",
    "Сендер сабақ оқыдыңдар ма?(положительно ответьте)",
    "Сіздер кешкі ас іштіңіздер ме?(положительно ответьте)",
    "Олар айтты ма?(положительно ответьте)",
    "Сен түсте шәй іштің бе?(положительно ответьте)",
    "Сіздер жұмыста болдыңыздар ма?(положительно ответьте)"
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
    arrayOf("кел"," кел"),
    arrayOf("бар"," бар"),
    arrayOf("таңғы ас"," таңғы ас"),
    arrayOf("сабақ", " сабақ"),
    arrayOf("кешкі ас", " кешкі ас"),
    arrayOf("айт", " айт"),
    arrayOf("түсте", " түсте"),
    arrayOf("жұмыста", " жұмыста")

)
private val secondButton = arrayOf(
    arrayOf("", ""),
    arrayOf("", ""),
    arrayOf("іш", " іш"),
    arrayOf("оқы"," оқы"),
    arrayOf("іш", " іш"),
    arrayOf("", ""),
    arrayOf("шәй іш", " шәй іш"),
    arrayOf("бол", " бол")
)

//private val preposition = listOf(
//    listOf("п", "ып", "іп"),
//    listOf("п", "ып", "іп"),
//    listOf("п", "ып", "іп"),
//    listOf("п", "ып", "іп"),
//    listOf("п", "ып", "іп"),
//    listOf("п", "ып", "іп"),
//    listOf("п", "ып", "іп"),
//    listOf("п", "ып", "іп")
//)

//private val thirdButton = arrayOf(
//    arrayOf("жатыр", " жатыр",),
//    arrayOf("жатыр"," жатыр"),
//    arrayOf("жатыр"," жатыр"),
//    arrayOf("жатыр"," жатыр"),
//    arrayOf("жатыр"," жатыр"),
//    arrayOf("жатыр"," жатыр"),
//    arrayOf("жатыр"," жатыр"),
//    arrayOf("жатыр"," жатыр")
//)

private val favoriteCollectionsDataGraduation = listOf(
    "дым","дім",
    "дың","дің",
    "дыңыз","діңіз",
    "ды","ді"
)

private val favoriteCollectionsDataGraduationSecond = listOf(
    "тым","тім",
    "тың","тің",
    "тыңыз","тіңіз",
    "ты","ті"
)

private val favoriteCollectionsDataGraduationThird = listOf(
    "тық","тік",
    "тыңдар","тіңдер",
    "тыңыздар","тіңіздер",
    "ты","ті"

)
private val favoriteCollectionsDataGraduationFourth = listOf(
    "дық","дік",
    "дыңдар","діңдер",
    "дыңыздар","діңіздер",
    "ды","ді"

)

private val graduationList = listOf(
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduationSecond,
    favoriteCollectionsDataGraduationFourth,
    favoriteCollectionsDataGraduationThird,
    favoriteCollectionsDataGraduationThird,
    favoriteCollectionsDataGraduationSecond,
    favoriteCollectionsDataGraduationFourth
)


private val answerList = listOf(
    "Иә, мен келдім", "Иә, мен бардым", "Иә, ол таңғы ас ішті", "Иә, біз сабақ оқыдық",
    "Иә, біз кешкі ас іштік", "Иә, олар айтты", "Иә, мен түсте шәй іштім", "Иә, біз жұмыста болдық"
)

private val amountCount = listOf<Int>(
    4,4,5,5,5,4,5,5
)
