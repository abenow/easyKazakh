package com.example.easykazakh.buttons

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.easykazakh.ui.theme.HeadingStyle
import com.example.easykazakh.ui.theme.SmallHeadingStyle

@Composable
fun Button(onIncrement:() -> Unit, text: String){
    androidx.compose.material3.Button(
        onClick = onIncrement,
    ) {
        Text(
            text = text,
            style = SmallHeadingStyle
        )
    }
}
@Composable
fun Engineer(text: String,text2:String){
    Box(
        modifier = Modifier
            .height(48.dp)
            .border(border = BorderStroke(1.dp,color = Color.Black), shape = RoundedCornerShape(10.dp))
            .background(color = Color.Transparent, shape = RoundedCornerShape(10.dp))
            .padding(horizontal = 12.dp)
            .clickable {
                if (count < amountCount) {
                    count++
                    globalText += if (amountCount == count)text2 + answerSign else text2
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
                    .border(border = BorderStroke(1.dp,color = Color.Black), shape = RoundedCornerShape(10.dp))
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
