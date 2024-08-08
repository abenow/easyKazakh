package com.example.easykazakh.fourthLevel

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
fun FourthLevelScreen(navController: NavHostController) {

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
            sixthButton[counter][0],sixthButton[counter][1],
            prepositionList[counter],2,
            prepositionSecond = listOf(),3,
            prepositionThird = listOf(),3,
            seventhButton[counter][0], seventhButton[counter][1],
            eightButton[counter][0],eightButton[counter][1],
            nineButton[counter][0],nineButton[counter][1],
            graduationList[counter],2,
            answerList[counter], "",
            onIncrement = {
                if (counter < 31) {
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

fun navigate(){
    CoroutineScope(Dispatchers.Main).launch {
        delay(500)
        globalText = ""
        count = 0
        counter = 0
        snackbar = null
    }
}


private val titleName = listOf(
    "Я пришла в Алматы",
    "Я пришла в Алматы на тальго",
    "Я пришла в Алматы вместе с Иваном на тальго",
    "Я пришла в Алматы из Астаны вместе с Иваном на тальго",
    "Я утром встал в семь часов",
    "Я потом помыл руку и лицо, чистил зубы",
    "Потом я переоделся",
    "Я потом я приготовила еду, заварила чай",
    "Потом я позавтракал",
    "На завтрак я ел хлеб и яйца, пил чай",
    "Я пила чай с молоком и мёдом",
    "Хлеб я ел с маслом",
    "Потом я оделся",
    "Я вышел из дома на работу в восемь часов",
    "Я в девять часов пришла на работу на автобусе вместе с Маратом",
    "Потом я открыла дверь",
    "Потом я села на стул",
    "Я потом включила компьютер",
    "Я потом пила кофе",
    "Кофе я пила с молоком и сахаром",
    "Я вечером в шесть часов вышла с работы",
    "Я по дороге зашла в магазин",
    "Потом я из магазина купила хлеб, сахар и овощи",
    "Я в семь часов приехала домой на такси",
    "Затем я вошел в дом, разделся, вымыл руки",
    "Затем я почистил картофель и лук, и нарезал мясо",
    "Потом я готовила еду",
    "Затем я поужинал",
    "Я после ужина вышла на прогулку",
    "Потом я посмотрел фильм",
    "Потом я заправила кровать",
    "Я лег спать в половине одиннадцатого"
)

//private val yesNo = listOf(
//    listOf("Иә", "Жоқ")
//)

private val pronounsList = listOf(
    listOf("Мен", "Сен", "Сіз", "Ол"),
)


private val firstButton = arrayOf(
    arrayOf("Алматы"," Алматы"),
    arrayOf("Алматы"," Алматы"),
    arrayOf("Алматы"," Алматы"),
    arrayOf("Алматы", " Алматы"),
    arrayOf("таңертең", " таңертең"),
    arrayOf("сосын", " сосын"),
    arrayOf("сосын", " сосын"),
    arrayOf("сосын", " сосын"),
    arrayOf("сосын", " сосын"),
    arrayOf("таңғы ас", " таңғы ас"),
    arrayOf("шәй", " шәй"),
    arrayOf("нан", " нан"),
    arrayOf("Сосын", "Сосын"),
    arrayOf("үй", " үй"),
    arrayOf("жұмыс", " жұмыс"),
    arrayOf("сосын", " сосын"),
    arrayOf("орындық", " орындық"),
    arrayOf("компьютер", " компьютер"),
    arrayOf("кофе", " кофе"),
    arrayOf("кофені", " кофені"),
    arrayOf("кешке", " кешке"),
    arrayOf("жол", " жол"),
    arrayOf("сосын", " сосын"),
    arrayOf("сағат", " сағат"),
    arrayOf("сосын", " сосын"),
    arrayOf("сосын", " сосын"),
    arrayOf("сосын", " сосын"),
    arrayOf("сосын", " сосын"),
    arrayOf("кешкі ас", " кешкі ас"),
    arrayOf("Сосын", "Сосын"),
    arrayOf("сосын", " сосын"),
    arrayOf("сағат", " сағат"),
)
private val secondButton = arrayOf(
    arrayOf("",""),
    arrayOf("тальго", " тальго"),
    arrayOf("тальго", " тальго"),
    arrayOf("Астана", " Астана"),
    arrayOf("сағат", " сағат"),
    arrayOf("беті - қолым", " беті - қолым"),
    arrayOf("киім", " киім"),
    arrayOf("тамақ", " тамақ"),
    arrayOf("таңғы ас"," таңғы ас"),
    arrayOf("шәй", " шәй"),
    arrayOf("сүт", " сүт"),
    arrayOf("сарымай", " сарымай"),
    arrayOf("киін"," киін"),
    arrayOf("жұмыс"," жұмыс"),
    arrayOf("сағат"," сағат"),
    arrayOf("есік"," есік"),
    arrayOf("сосын"," сосын"),
    arrayOf("сосын"," сосын"),
    arrayOf("сосын"," сосын"),
    arrayOf("қант"," қант"),
    arrayOf("сағат"," сағат"),
    arrayOf("дүкен"," дүкен"),
    arrayOf("дүкен"," дүкен"),
    arrayOf("жеті"," жеті"),
    arrayOf("үй"," үй"),
    arrayOf("картоп"," картоп"),
    arrayOf("тамақ"," тамақ"),
    arrayOf("кешкі ас"," кешкі ас"),
    arrayOf("кейін"," кейін"),
    arrayOf("кино"," кино"),
    arrayOf("төсек"," төсек"),
    arrayOf("он жарым"," он жарым"),
)
private val thirdButton = arrayOf(
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("Иван", " Иван"),
    arrayOf("тальго", " тальго"),
    arrayOf("жеті", " жеті"),
    arrayOf("тісім", " тісім"),
    arrayOf("",""),
    arrayOf("шәй", " шәй"),
    arrayOf("",""),
    arrayOf("жұмыртқа"," жұмыртқа"),
    arrayOf("және"," және"),
    arrayOf("",""),
    arrayOf("мен"," мен"),
    arrayOf("сағат"," сағат"),
    arrayOf("тоғыз"," тоғыз"),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("сүт"," сүт"),
    arrayOf("алты"," алты"),
    arrayOf("",""),
    arrayOf("нан"," нан,"),
    arrayOf("такси"," такси"),
    arrayOf("қолым"," қолым"),
    arrayOf("пияз"," пияз"),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("серуен"," серуен"),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
)
private val fourthButton = arrayOf(
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("бірге"," бірге"),
    arrayOf("Иван"," Иван"),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("нан"," нан"),
    arrayOf("бал"," бал"),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("сегіз"," сегіз"),
    arrayOf("автобус"," автобус"),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("және"," және"),
    arrayOf("жұмыс"," жұмыс"),
    arrayOf("",""),
    arrayOf("қант"," қант"),
    arrayOf("үй"," үй"),
    arrayOf("",""),
    arrayOf("ет"," ет"),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
)
private val fifthButton = arrayOf(
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("бірге"," бірге"),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("мен"," мен"),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("Марат"," Марат"),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("көкөністер"," көкөністер"),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
)
private val sixthButton = arrayOf(
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
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("бірге"," бірге"),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("және"," және"),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
)

private val prepositionFirst = listOf(
    "ға", "ге",
    "дан", "ден",
    "мен", "пен",
    "да", "де"
)
private val prepositionSecond = listOf(
    "қа", "қа",
    "дан", "ден",
    "мен", "пен",
    "да", "де"
)
private val prepositionThird = listOf(
    "да", "де",
    "дан", "ден",
    "мен", "пен",
    "ты", "ті"
)

private val prepositionFourth = listOf(
    "қа", "қа",
    "дан", "ден",
    "мен", "пен",
    "ды", "ді"
)

private val prepositionFifth = listOf(
    "қа", "қа",
    "тан", "тен",
    "мен", "пен",
    "да", "де"
)
private val prepositionSix = listOf(
    "ға", "ге",
    "нан", "нен",
    "мен", "пен",
    "да", "де"
)

private val prepositionList = listOf(
    prepositionFirst,
    prepositionFirst,
    prepositionFirst,
    prepositionFirst,
    prepositionSecond,
    prepositionSecond,
    prepositionSecond,
    prepositionSecond,
    prepositionSecond,
    prepositionSecond,
    prepositionFourth,
    prepositionFourth,
    listOf(),
    prepositionSecond,
    prepositionSecond,
    prepositionThird,
    prepositionSecond,
    prepositionFourth,
    prepositionSecond,
    prepositionSecond,
    prepositionFifth,
    prepositionFirst,
    prepositionSix,
    prepositionFirst,
    prepositionFirst,
    prepositionFirst,
    prepositionFirst,
    prepositionFirst,
    prepositionFirst,
    prepositionFirst,
    prepositionFirst,
    prepositionFirst,
)


private val seventhButton = arrayOf(
    arrayOf("кел", " кел"),
    arrayOf("кел", " кел"),
    arrayOf("кел", " кел"),
    arrayOf("кел", " кел"),
    arrayOf("тұр", " тұр"),
    arrayOf("жудым", " жудым,"),
    arrayOf("ауыстыр", " ауыстыр"),
    arrayOf("дайында", " дайында"),
    arrayOf("іш", " іш"),
    arrayOf("іш", " іш"),
    arrayOf("іш", " іш"),
    arrayOf("же", " же"),
    arrayOf("",""),
    arrayOf("шық", " шық"),
    arrayOf("кел", " кел"),
    arrayOf("аш", " аш"),
    arrayOf("отыр", " отыр"),
    arrayOf("қос", " қос"),
    arrayOf("іш", " іш"),
    arrayOf("іш", " іш"),
    arrayOf("шық", " шық"),
    arrayOf("кір", " кір"),
    arrayOf("ал", " ал"),
    arrayOf("кел", " кел"),
    arrayOf("кірдім", " кірдім,"),
    arrayOf("аршыдым", " аршыдым,"),
    arrayOf("пісір", " пісір"),
    arrayOf("іш", " іш"),
    arrayOf("шық", " шық"),
    arrayOf("көр", " көр"),
    arrayOf("сал", " сал"),
    arrayOf("ұйықта", " ұйықта"),
)
private val eightButton = arrayOf(
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("тазала", " тазала"),
    arrayOf("",""),
    arrayOf("қой", " қой"),
    arrayOf("",""),
    arrayOf("жедім", " жедім,"),
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
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("шешін", " шешін"),
    arrayOf("тура", " тура"),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
)
private val nineButton = arrayOf(
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
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("жу", " жу"),
    arrayOf("пен"," пен"),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
    arrayOf("",""),
)

private val favoriteCollectionsDataGraduation = listOf(
    "дым", "дім",
    "нан","нен",
    "дыңыз","діңіз",
    "ды","ді"
)
private val favoriteCollectionsDataGraduationSecond = listOf(
    "тым", "тім",
    "тан", "тін",
    "тыңыз", "тіңіз",
    "ты", "ті"
)
private val favoriteCollectionsDataGraduationThird = listOf(
    "дім", "тім",
    "тың", "тің",
    "тыңыз", "тіңіз",
    "ты", "ті"
)

private val favoriteCollectionsDataGraduationFourth = listOf(
    "тым", "тім",
    "тың", "тің",
    "тыңыз", "тіңіз",
    "ты", "ті"
)

private val favoriteCollectionsDataGraduationFifth = listOf(
    "дым", "дім",
    "дың","дің",
    "дыңыз","діңіз",
    "ды","ді"
)

private val graduationList = listOf(
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduationSecond,
    favoriteCollectionsDataGraduationThird,
    favoriteCollectionsDataGraduationSecond,
    favoriteCollectionsDataGraduationThird,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduationSecond,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduationSecond,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduationSecond,
    favoriteCollectionsDataGraduationSecond,
    favoriteCollectionsDataGraduationSecond,
    favoriteCollectionsDataGraduationFourth,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduationFifth,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduationSecond,
    favoriteCollectionsDataGraduationSecond,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduation,
    favoriteCollectionsDataGraduation
)


private val answerList = listOf(
    "Мен Алматыға келдім",
    "Мен Алматыға тальгомен келдім",
    "Мен Алматыға Иванмен бірге тальгомен келдім",
    "Мен Алматыға Астанадан Иванмен бірге тальгомен келдім",
    "Мен таңертең сағат жетіде тұрдым",
    "Мен сосын беті - қолымды жудым, тісімді тазаладым",
    "Мен сосын киім ауыстырдым",
    "Мен сосын тамақ дайындадым шәй қойдым",
    "Мен сосын таңғы ас іштім",
    "Мен таңғы асқа нан мен жұмыртқа жедім, шәй іштім",
    "Мен шәйді сүтпен және балмен іштім",
    "Мен нанды сарымаймен жедім",
    "Сосын мен киіндім",
    "Мен үйден жұмысқа сағат сегізде шықтым",
    "Мен сағат тоғызда жұмысқа автобуспен Маратпен бірге келдім",
    "Мен сосын есікті аштым",
    "Мен сосын орындыққа отырдым",
    "Мен сосын компьютерді қостым",
    "Мен сосын кофе іштім",
    "Мен кофені қантпен және сүтпен іштім",
    "Мен кешке сағат алтыда жұмыстан шықтым",
    "Мен жолда дүкенге кірдім",
//23
    "Мен сосын дүкеннен нан, қант және көкөністер алдым",
    "Мен сағат жетіде таксимен үйге келдім",
    "Мен сосын үйге кірдім, шешіндім қолымды жудым",
    "Мен сосын картоп пен пияз аршыдым, ет турадым",
    "Мен сосын тамақ пісірдім",
    "Мен сосын кешкі ас іштім",
    "Мен кешкі астан кейін серуенге шықтым",
    "Сосын кино көрдім",
    "Мен сосын төсек салдым",
    "Мен сағат он жарымда ұйықтадым"
)

private val amountCount = listOf(
    5,7,10,12,7,10,6,8,5,11,
    10,7,4,10,13,6,7,6,5,10,
    9,7,10,10,11,9,5,6,8,4,
    5,6
)
