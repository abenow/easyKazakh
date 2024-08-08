package com.example.easykazakh.firstLevel


import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Snackbar
import androidx.compose.material.SnackbarDuration
import androidx.compose.material.SnackbarHost
import androidx.compose.material.SnackbarHostState
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.easykazakh.ui.theme.HeadingStyle
import com.example.easykazakh.ui.theme.SmallHeadingStyle
import com.example.easykazakh.ui.theme.TitleBarStyle
import androidx.compose.material3.Divider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavHostController
import com.example.easykazakh.R
import com.example.easykazakh.buttons.snackAnswerList
import com.example.easykazakh.buttons.snackbar
import com.example.easykazakh.ui.theme.SomeColor
import kotlinx.coroutines.launch
import kotlin.random.Random


var count = 0
private var amountCount: Int = 0
var globalText by mutableStateOf("")
var counter by mutableIntStateOf(0)
var countList by mutableIntStateOf(0)

var answerSign:String = ""

@Composable
fun Greeting(
    titleText: String,
    yesNo:List<String> = emptyList(),
    pronounsList: List<String>,
    firstButton: String = "",checkFirstButton:String = "",
    secondButton: String = "",checkSecondButton:String = "",
    graduationList: List<String>,
    prepositions: List<String> = emptyList(),
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
            com.example.easykazakh.firstLevel.Divider(
                Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp)
                    .height(0.5.dp)
            )
            if (yesNo.isNotEmpty()) {
                YesNo(yesNo)

                com.example.easykazakh.firstLevel.Divider(
                    Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                        .height(0.5.dp)
                )
            }
            Pronouns(pronounsList)
            com.example.easykazakh.firstLevel.Divider(
                Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp, top = 8.dp)
                    .height(0.5.dp)
            )
            Row {
                Engineer(firstButton,checkFirstButton)
                if (secondButton.isNotEmpty()) {
                    Engineer(secondButton,checkSecondButton)
                }
            }

            com.example.easykazakh.firstLevel.Divider(
                Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp, top = 8.dp)
                    .height(0.5.dp)
            )
            Box{
                Column {
            Graduation(
                graduationList
            )
                }
                if (snackbar == true)
                    snackBar(snackAnswerList[Random.nextInt(0, 5)])
                else if(snackbar == false)
                    snackBar("Дұрыс емес!")
            }

            Spacer(modifier = Modifier.height(8.dp))

            com.example.easykazakh.firstLevel.Divider(
                Modifier
                    .fillMaxWidth()
                    .height(0.5.dp)
            )

            if (prepositions.isNotEmpty()) {
                Spacer(modifier = Modifier.height(8.dp))
                Graduation(prepositions)
                Spacer(modifier = Modifier.height(8.dp))

                com.example.easykazakh.firstLevel.Divider(
                    Modifier
                        .fillMaxWidth()
                        .height(0.5.dp)
                )

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
fun Button(onIncrement:() -> Unit, text: String){
    Button(
        onClick = onIncrement,
    ) {
        Text(
            text = text,
            style = SmallHeadingStyle
        )
    }
}


@Composable
fun TitleText(text: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(bottom = 8.dp, top = 16.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = text,
            style = TitleBarStyle
        )
    }
}


@Composable
fun Divider(modifier: Modifier = Modifier){
    Divider(
        modifier = modifier,
        color = Color.Black,
        thickness = 0.5.dp
    )
}

fun checkValue(text:String, answer: String): Boolean {
    if (text == answer){
        return true
    }
    return false
}


@Composable
fun AnswersField(answerText: String){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
        ,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            modifier = Modifier
                .fillMaxHeight()
                .padding(vertical = 8.dp)
                .weight(1f),
            textAlign = TextAlign.Center,
            text = globalText,
            style = HeadingStyle
        )
        if (checkValue(globalText,answerText)
        ) {
            Image(
                modifier = Modifier
                    .size(30.dp)
                    .weight(0.2f),
                painter = painterResource(id = R.drawable.check_mark),
                contentDescription = "image"
            )
            snackbar = true
        } else if (!checkValue(
                globalText,
                answerText
            ) && count == amountCount
        ) {
            Image(
                modifier = Modifier
                    .size(30.dp)
                    .weight(0.2f),
                painter = painterResource(id = R.drawable.crosscirclehd),
                contentDescription = "image"
            )
            snackbar = false
        }
    }
}

@Composable
fun YesNo(text:List<String>){
    LazyRow{
        items (text){
            Box(
                modifier = Modifier
                    .height(40.dp)
                    .background(
                        color = Color.Transparent
                    )
                    .border(
                        border = BorderStroke(1.dp, color = Color.Black),
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(horizontal = 12.dp)
                    .clickable {
                        if (count < amountCount) {
                            globalText += "$it, "
                            count++
                        }
                    },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = it,
                    style = HeadingStyle
                )
            }
        }
    }
}

@Composable
fun Engineer(text: String,text2:String){
    Box(
        modifier = Modifier
            .height(48.dp)
            .background(
                color = Color.Transparent
            )
            .border(
                border = BorderStroke(1.dp, color = Color.Black),
                shape = RoundedCornerShape(10.dp)
            )
            .padding(horizontal = 12.dp)
            .clickable {
                if (count < amountCount) {
                    globalText += text2
                    count++
                }
            },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            style = HeadingStyle
        )
    }
}

data class ItemRowModel(
    val title: String
)


@Composable
fun ButtonPronouns(
    item: ItemRowModel
) {
    Box(
        modifier = Modifier
            .height(40.dp)
            .border(
                border = BorderStroke(1.dp, color = Color.Black),
                shape = RoundedCornerShape(10.dp)
            )
            .fillMaxWidth()
            .background(
                color = Color.Transparent
            )
            .padding(vertical = 4.dp)
            .clickable {
                if (count < amountCount) {
                    globalText += item.title
                    count++
                }
            }
        ,
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = item.title,
            style = TitleBarStyle
        )
    }
}

@Composable
fun ButtonGraduation(
    item: ItemRowModel
) {
    Box(
        modifier = Modifier
            .height(40.dp)
            .border(
                border = BorderStroke(1.dp, color = Color.Black),
                shape = RoundedCornerShape(10.dp)
            )
            .fillMaxWidth()
            .background(
                color = Color.Transparent
            )
            .padding(horizontal = 8.dp)

            .clickable {
                if (count < amountCount) {
                    count++
                    globalText += if (item.title.length > 2) item.title + answerSign
                    else " " + item.title + "?"
                }
            }
        ,
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "- " + item.title,
            style = SmallHeadingStyle
        )
    }
}

@Composable
fun Pronouns(favoriteCollections: List<String>){

    LazyColumn(
        modifier = Modifier
            .width(width = 150.dp)
            .height(186.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ){
        items(favoriteCollections){
            ButtonPronouns(item = ItemRowModel(it))
        }
    }
}

//@Composable
//fun Graduation(favoriteCollections: List<String>) {
//    LazyColumn(
//        modifier = Modifier.fillMaxHeight(),
//        verticalArrangement = Arrangement.spacedBy(8.dp)
//    ) {
//        for (i in favoriteCollections.indices step 3) {
//            item {
//                Row(
//                    modifier = Modifier.fillMaxWidth(),
//                    horizontalArrangement = Arrangement.spacedBy(8.dp)
//                ) {
//                    val endIndex = minOf(i + 3, favoriteCollections.size)
//                    for (j in i until endIndex) {
//                        ButtonGraduation(
//                            item = ItemRowModel(favoriteCollections[j])
//                        )
//                    }
//                }
//            }
//        }
//    }
//}

@Composable
fun Graduation(favoriteCollections: List<String>){
    if (favoriteCollections.size < 10) {
        val rows = favoriteCollections.chunked(2)

        Column() {
            rows.forEachIndexed { rowIndex, rowItems ->
                LazyRow(
                    modifier = Modifier.wrapContentHeight(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    items(rowItems) {
                        ButtonGraduation(
                            item = ItemRowModel(it)
                        )
                    }
                }
                if (rowIndex < rows.size - 1) {
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }
        }
    }else {
        Column() {
            LazyRow(
                modifier = Modifier.wrapContentHeight(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                items(favoriteCollections.subList(0, 3)) {
                    ButtonGraduation(
                        item = ItemRowModel(it)
                    )
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            LazyRow(
                modifier = Modifier.wrapContentHeight(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                items(favoriteCollections.subList(3, 6)) {
                    ButtonGraduation(
                        item = ItemRowModel(it)
                    )
                }
            }
            if (favoriteCollections.size > 6) {
                Spacer(modifier = Modifier.height(8.dp))
                LazyRow(
                    modifier = Modifier.wrapContentHeight(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    items(favoriteCollections.subList(6, 8)) {
                        ButtonGraduation(
                            item = ItemRowModel(it)
                        )
                    }
                }
                if (favoriteCollections[8].isNotEmpty()) {
                    Spacer(modifier = Modifier.height(8.dp))
                    LazyRow(
                        modifier = Modifier.wrapContentHeight(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                    ) {
                        items(favoriteCollections.subList(8, 10)) {
                            ButtonGraduation(
                                item = ItemRowModel(it)
                            )
                        }
                    }
                }
            }
        }
    }
}


@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun snackBar(text: String){
    val scope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }
    scope.launch {
        snackbarHostState.showSnackbar(text,duration = SnackbarDuration.Short)
    }

    SnackbarHost(
        hostState = snackbarHostState,
    ) { data ->
        Snackbar(
            snackbarData = data,
        )
    }
}
