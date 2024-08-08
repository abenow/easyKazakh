package com.example.easykazakh.buttons

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.easykazakh.firstLevel.AppDestinations


import com.example.easykazakh.ui.theme.SomeColor
import kotlin.random.Random

var count = 0
var amountCount: Int = 0
var globalText by mutableStateOf("")
var counter by mutableIntStateOf(0)
var countList by mutableIntStateOf(0)

var answerSign:String = ""


var snackbar: Boolean? by mutableStateOf(null)
var snackAnswerList = listOf(
    "Өте жақсы!",
    "Тамаша!",
    "Суперсіз!",
    "Керемет екенсіз!",
    "Керемет!",
    "Дұрыс!"
)



@SuppressLint("SuspiciousIndentation")
@Composable
fun Greeting(
    titleText: String,
    yesNo:List<String> = emptyList(),
    pronounsList: List<String> = emptyList(),
    firstButton: String = "", checkFirstButton:String = "",
    secondButton: String = "", checkSecondButton:String = "",
    thirdButton: String = "", checkThirdButton:String = "",
    fourthButton: String = "", checkFourthButton:String = "",
    fifthButton: String = "", checkFifthButton:String = "",
    sixthButton: String = "", checkSixthButton:String = "",
    prepositionFirst: List<String> = emptyList(), itemsPerRow1:Int,
    prepositionSecond: List<String> = emptyList(), itemsPerRow2:Int,
    prepositionThird: List<String> = emptyList(), itemsPerRow3:Int,
    sevenButton: String = "", checkSevenButton: String = "",
    eightButton: String = "", checkEightButton: String = "",
    nineButton: String = "", checkNineButton: String = "",
    graduationList: List<String> = emptyList(), itemsPerRow4:Int,
    answerText: String, answerSignP: String = "",
    onIncrement:() -> Unit,
    navController: NavHostController,
    amountCountP: Int
) {
    amountCount = amountCountP
    answerSign = answerSignP
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .background(color = SomeColor)
        .padding(horizontal = 6.dp)
        .verticalScroll(rememberScrollState())
    ) {

        Column(modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .background(color = Color.Transparent, shape = RoundedCornerShape(10.dp))
            .shadow(8.dp, shape = RoundedCornerShape(10.dp))
            .padding(horizontal = 16.dp)
        ) {
            TitleText(titleText, Modifier.align(Alignment.CenterHorizontally))
            Divider(
                Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp)
                    .height(0.5.dp)
            )
            if (yesNo.isNotEmpty()) {
                YesNo(yesNo)

                Divider(
                    Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                        .height(0.5.dp)
                )
            }
            if (pronounsList.isNotEmpty())
            Pronouns(pronounsList)

            Divider(
                Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp, top = 8.dp)
                    .height(0.5.dp)
            )
            Row (
                modifier = Modifier
                    .fillMaxSize()
                    .horizontalScroll(rememberScrollState())
            ){
                Engineer(firstButton,checkFirstButton)
                if (secondButton.isNotEmpty()) {
                    Engineer(secondButton,checkSecondButton)
                    if (thirdButton.isNotEmpty()){
                        Engineer(thirdButton,checkThirdButton)
                        if (fourthButton.isNotEmpty()){
                            Engineer(fourthButton,checkFourthButton)
                            if (fifthButton.isNotEmpty()){
                                Engineer(fifthButton,checkFifthButton)
                                if (sixthButton.isNotEmpty()){
                                    Engineer(sixthButton,checkSixthButton)
                                }
                            }
                        }
                    }
                }
            }

            Divider(
                Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp, top = 8.dp)
                    .height(0.5.dp)
            )

            if (prepositionFirst.isNotEmpty()){
                Graduation(prepositionFirst,itemsPerRow1)
                Spacer(modifier = Modifier.height(8.dp))

                Divider(
                    Modifier
                        .fillMaxWidth()
                        .height(0.5.dp)
                )
            }

            if (prepositionSecond.isNotEmpty()){
                Spacer(modifier = Modifier.height(8.dp))
                Graduation(prepositionSecond,itemsPerRow2)
                Spacer(modifier = Modifier.height(8.dp))

                Divider(
                    Modifier
                        .fillMaxWidth()
                        .height(0.5.dp)
                )
            }

            if (prepositionThird.isNotEmpty()){
                Spacer(modifier = Modifier.height(8.dp))
                Graduation(prepositionThird,itemsPerRow3)
                Spacer(modifier = Modifier.height(8.dp))

                Divider(
                    Modifier
                        .fillMaxWidth()
                        .height(0.5.dp)
                )
            }
           Box{
               Column {



                   if (sevenButton.isNotEmpty()) {
                       Spacer(modifier = Modifier.height(8.dp))
                       Row(
                           modifier = Modifier
                               .fillMaxSize()
                               .horizontalScroll(rememberScrollState())
                       ) {
                           Engineer(sevenButton, checkSevenButton)
                           if (eightButton.isNotEmpty()) {
                               Engineer(eightButton, checkEightButton)
                               if (nineButton.isNotEmpty()) {
                                   Engineer(nineButton, checkNineButton)
                               }
                           }
                       }
                       Spacer(modifier = Modifier.height(8.dp))
                       Divider(
                           Modifier
                               .fillMaxWidth()
                               .height(0.5.dp)
                       )
                   }

                   if (graduationList.isNotEmpty()) {
                       Spacer(modifier = Modifier.height(8.dp))
                       Graduation(graduationList, itemsPerRow4)
                       Spacer(modifier = Modifier.height(8.dp))

                       Divider(
                           Modifier
                               .fillMaxWidth()
                               .height(0.5.dp)
                       )
                   }
               }
                if (snackbar == true)
                    snackBar(snackAnswerList[Random.nextInt(0, 5)])
                else if(snackbar == false)
                    snackBar("Дұрыс емес!")
            }
            AnswersField(answerText)
        }
        Spacer(modifier = Modifier.weight(1f))
        Row (
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onIncrement = {
                count = 0
                globalText = ""
                counter = 0
                countList = 0
                snackbar = null
                navController.navigate(AppDestinations.Menu.route)
            }, "Меню")
            Spacer(modifier = Modifier.weight(1f))
            Button(onIncrement = {
                globalText = ""
                count = 0
                snackbar = null
            }, "Повтор")

            Spacer(modifier = Modifier.weight(1f))
            Button(onIncrement = onIncrement, "Далее")
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}
@Composable
fun Divider(modifier: Modifier = Modifier){
    androidx.compose.material3.Divider(
        modifier = modifier,
        color = Color.Black,
        thickness = 0.5.dp
    )
}



