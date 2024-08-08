package com.example.easykazakh.buttons

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.easykazakh.ui.theme.TitleBarStyle


@Composable
fun ButtonPronouns(
    item: ItemRowModel
) {
    Box(
        modifier = Modifier
            .height(40.dp)
            .border(border = BorderStroke(1.dp,color = Color.Black), shape = RoundedCornerShape(10.dp))
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
