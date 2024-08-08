package com.example.easykazakh.menu

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.easykazakh.firstLevel.AppDestinations
import com.example.easykazakh.ui.theme.EasyKazakhStyle
import com.example.easykazakh.ui.theme.HeadingStyle
import com.example.easykazakh.ui.theme.SmallHeadingStyle


@Composable
fun Menu(navController: NavHostController){
    var text by remember { mutableStateOf("Easy Kazakh") }

    val destinationLevel = listOf(
        AppDestinations.FirstLevel.route,
        com.example.easykazakh.secondLevel.AppDestinations.SecondLevel.route,
        com.example.easykazakh.thirdLevel.AppDestinations.ThirdLevel.route,
        com.example.easykazakh.fourthLevel.AppDestinations.FourthLevelScreen.route,
        com.example.easykazakh.fifthLevel.AppDestinations.FifthLevel.route,
    )

    Column (modifier = Modifier.background(color = Color(0xffeef3f7))){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(color = Color(0xffffdfd7)),

        ) {

            BasicTextField(
                value = text,
                onValueChange = { newText ->
                    text = newText
                },

                textStyle = EasyKazakhStyle.copy(textAlign = TextAlign.Center).copy(color = Color(0xff4c7dbf)),
                modifier = Modifier
                    .weight(1f)
                    .align(Alignment.CenterVertically),
                )
        }
        Text(text = "Женис Алиев\n" +
                "@easy_kazakh_",
            modifier = Modifier.padding(start = 16.dp,top = 12.dp))
    LazyColumn(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .background(color = Color(0xffeef3f7))
        .padding(8.dp)
    ) {

        items(destinationLevel) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .padding(4.dp)
                    .clickable {
                        navController.navigate(it)
                    }
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color(0xff3e80ce))
                        .padding(16.dp),
                    contentAlignment = Alignment.TopStart
                ) {
                    Column {
                        Text(
                            text = "Уровень ${destinationLevel.indexOf(it) + 1}",
                            color = Color.White,
                            style = HeadingStyle
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                    }

                }
            }
        }
    }
    }
}

//@Composable
//fun BackButton(onClick: () -> Unit) {
//    IconButton(onClick = onClick) {
//        Icon(
//            imageVector = Icons.Default.ArrowBack,
//            contentDescription = "Назад"
//        )
//    }
//}
@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun BackButtonWithText(navController: NavController, level:String) {
    var text by remember { mutableStateOf(level) }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color(0xffffdfd7))
    ) {
        IconButton(
            onClick = { navController.popBackStack() }
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Уровень"
            )
        }
        Spacer(modifier = Modifier.width(16.dp))

        BasicTextField(
            value = text,
            onValueChange = { newText ->
                text = newText
            },

            textStyle = SmallHeadingStyle.copy(color = Color(0xff4c7dbf)),
            modifier = Modifier
                .weight(1f)
                .align(Alignment.CenterVertically),

        )
    }
}


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun FirstLevel(navController: NavHostController){
    val destinationSection = listOf(
        AppDestinations.FirstLevelScreenFirst.route,
        AppDestinations.FirstLevelScreenSecond.route,
        AppDestinations.FirstLevelScreenThird.route,
        AppDestinations.FirstLevelScreenUFourth.route,
    )
    val lessonName = listOf(
        "Я инженер / Мен инженермін",
        "Я не инженер / Мен инженер емеспін",
        "Я инженер? / Мен инженермін бе?",
        "Сен директорсың ба? / Иә, мен директормын!"

    )
    Column (modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(),
        ){
        BackButtonWithText(navController,"Уровень 1")
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(color = Color(0xffeef3f7))
                .padding(8.dp)
        ) {

            items(destinationSection){
                Card (
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .padding(4.dp)
                        .clickable {
                            navController.navigate(it)
                        }
                ){
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(color = Color(0xff3e80ce))
                            .padding(16.dp),
                        contentAlignment = Alignment.TopStart
                    ) {
                        Column {
                            Text(
                                text = "Урок ${destinationSection.indexOf(it) + 1}",
                                color = Color.White,
                                style = HeadingStyle
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                text = lessonName[destinationSection.indexOf(it)],
                                color = Color(0xffc6d6f0),
                            )
                        }

                    }
                }
            }

        }
    }

}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun SecondLevel(navController: NavHostController){
    val secondLevelDestinationSection = listOf(
        com.example.easykazakh.secondLevel.AppDestinations.ScreenFirst.route,
        com.example.easykazakh.secondLevel.AppDestinations.ScreenSecond.route,
        com.example.easykazakh.secondLevel.AppDestinations.SecondLevelScreenThird.route,
        com.example.easykazakh.secondLevel.AppDestinations.SecondLevelScreenUFourth.route,
    )

    val lessonName = listOf(
        "Я играю / Мен ойнаймын",
        "Сен ойнап жатырсың ба? / Иә, мен ойнап жатырмын",
        "Сен келдің бе? / Иә, мен келдім",
        "Сен үйдесің бе? / Иә, мен үйдемін"

    )
    Column {
        BackButtonWithText(navController, "Уровень 2")
    LazyColumn(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .background(color = Color(0xffeef3f7))
        .padding(8.dp)
    ) {
        items(secondLevelDestinationSection){
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .padding(4.dp)
                    .clickable {
                        navController.navigate(it)
                    }
            ){
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color(0xff3e80ce))
                        .padding(16.dp),
                    contentAlignment = Alignment.TopStart
                ) {
                    Column {
                        Text(
                            text = "Урок ${secondLevelDestinationSection.indexOf(it) + 1}",
                            color = Color.White,
                            style = HeadingStyle
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = lessonName[secondLevelDestinationSection.indexOf(it)],
                            color = Color(0xffc6d6f0),
                        )
                    }

                }
            }
        }

    }
    }
}
@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun ThirdLevel(navController: NavHostController){
    val thirdLevelDestinationSection = listOf(
        com.example.easykazakh.thirdLevel.AppDestinations.ThirdLevelScreenFirst.route,
        com.example.easykazakh.thirdLevel.AppDestinations.ThirdLevelScreenSecond.route,
        com.example.easykazakh.thirdLevel.AppDestinations.ThirdLevelScreenThird.route,
        com.example.easykazakh.thirdLevel.AppDestinations.ThirdLevelScreenUFourth.route,
    )
    val lessonName = listOf(
        "Сен Алматыда тұрасың ба? / Жоқ, мен Алматыда тұрмаймын",
        "Сен ойнап жатырсың ба? / Жоқ, мен ойнап жатқан жоқпын",
        "Сен үйге келдің бе? / Жоқ, мен үйге келмедім",
        "Сен үйдесің бе? / Жоқ, мен үйде емеспін"

    )
    Column {
        BackButtonWithText(navController, "Уровень 3")
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(color = Color(0xffeef3f7))
                .padding(8.dp)
        ) {
            items(thirdLevelDestinationSection){
                Card (
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .padding(4.dp)
                        .clickable {
                            navController.navigate(it)
                        }
                ){
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(color = Color(0xff3e80ce))
                            .padding(16.dp),
                        contentAlignment = Alignment.TopStart
                    ) {
                        Column {
                            Text(
                                text = "Урок ${thirdLevelDestinationSection.indexOf(it) + 1}",
                                color = Color.White,
                                style = HeadingStyle
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                text = lessonName[thirdLevelDestinationSection.indexOf(it)],
                                color = Color(0xffc6d6f0),
                            )
                        }

                    }
                }
            }

        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun FifthLevel(navController: NavHostController){
    val fifthLevelDestinationSection = listOf(
        com.example.easykazakh.fifthLevel.AppDestinations.FifthLevelFirstScreen.route,
        com.example.easykazakh.fifthLevel.AppDestinations.FifthLevelSecondScreen.route,
        com.example.easykazakh.fifthLevel.AppDestinations.FifthLevelThirdScreen.route,
        com.example.easykazakh.fifthLevel.AppDestinations.FifthLevelUFourthScreen.route,
    )
    val lessonName = listOf(
        "Ты живёшь в Алматы? / Сен Алматыда тұрасың ба?",
        "Ты пришла домой? / Сен үйге келдің бе?",
        "Ты сейчас спишь? / Сен ұйықтап жатырсың ба?",
        "Меня зовут Марат / Менің атым Марат"
    )
    Column {
        BackButtonWithText(navController, "Уровень 5")
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(color = Color(0xffeef3f7))
                .padding(8.dp)
        ) {
            items(fifthLevelDestinationSection){
                Card (
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .padding(4.dp)
                        .clickable {
                            navController.navigate(it)
                        }
                ){
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(color = Color(0xff3e80ce))
                            .padding(16.dp),
                        contentAlignment = Alignment.TopStart
                    ) {
                        Column {
                            Text(
                                text = "Урок ${fifthLevelDestinationSection.indexOf(it) + 1}",
                                color = Color.White,
                                style = HeadingStyle
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                text = lessonName[fifthLevelDestinationSection.indexOf(it)],
                                color = Color(0xffc6d6f0),
                            )
                        }

                    }
                }
            }

        }
    }
}
