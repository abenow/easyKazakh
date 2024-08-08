package com.example.easykazakh.buttons

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
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
import com.example.easykazakh.ui.theme.SmallHeadingStyle


@Composable
fun ButtonGraduation(
    item: ItemRowModel
) {
    if(item.title.isNotEmpty()) {
        Box(
            modifier = Modifier
                .height(40.dp)
                .border(border = BorderStroke(1.dp,color = Color.Black), shape = RoundedCornerShape(10.dp))
                .fillMaxWidth()
                .background(
                    color = Color.Transparent
                )
                .padding(horizontal = 8.dp)

                .clickable {
                    if (count < amountCount) {
                        count++
                        globalText += if (amountCount == count && item.title == "ма" || amountCount == count && item.title == "ба" || amountCount == count && item.title == "ме" || amountCount == count && item.title == "бе" || amountCount == count && item.title == "пе" || amountCount == count && item.title == "па"){
                            " " + item.title + "?"
                        }else{
                            item.title + answerSign
                        }
                    }
                },
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "- " + item.title,
                style = SmallHeadingStyle
            )
        }
    }
}

@Composable
fun Graduation(favoriteCollections: List<String>, itemsPerRow:Int) {
    if (favoriteCollections.size < 10) {
        val rows = favoriteCollections.chunked(itemsPerRow)

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
    }else{
    val rows1 = favoriteCollections.take(3)
    val rows2 = favoriteCollections.drop(3).take(3)
    val rows3 = favoriteCollections.drop(6).take(2)
    val rows4 = favoriteCollections.drop(8).take(2)
    Column() {
        LazyRow(
            modifier = Modifier.wrapContentHeight(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            items(rows1) {
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
            items(rows2) {
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
            items(rows3) {
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
            items(rows4) {
                ButtonGraduation(
                    item = ItemRowModel(it)
                )
            }
        }
    }
    }
}

//@Composable
//fun Graduation(favoriteCollections: List<String>) {
//    val itemsPerRow1 = 3
//    val itemsPerRow2 = 2
//
//    val rows1 = favoriteCollections.take(3)
//    val rows2 = favoriteCollections.take(3)
//    val rows3 = favoriteCollections.drop(itemsPerRow1).take(itemsPerRow2)
//    val rows4 = favoriteCollections.take(itemsPerRow2)
//    Column() {
//        LazyRow(
//            modifier = Modifier.wrapContentHeight(),
//            horizontalArrangement = Arrangement.spacedBy(8.dp),
//        ) {
//            items(rows1) {
//                ButtonGraduation(
//                    item = ItemRowModel(it)
//                )
//            }
//        }
//
//        Spacer(modifier = Modifier.height(8.dp))
//
//        LazyRow(
//            modifier = Modifier.wrapContentHeight(),
//            horizontalArrangement = Arrangement.spacedBy(8.dp),
//        ) {
//            items(rows2) {
//                ButtonGraduation(
//                    item = ItemRowModel(it)
//                )
//            }
//        }
//        Spacer(modifier = Modifier.height(8.dp))
//
//        LazyRow(
//            modifier = Modifier.wrapContentHeight(),
//            horizontalArrangement = Arrangement.spacedBy(8.dp),
//        ) {
//            items(rows3) {
//                ButtonGraduation(
//                    item = ItemRowModel(it)
//                )
//            }
//        }
//        Spacer(modifier = Modifier.height(8.dp))
//
//        LazyRow(
//            modifier = Modifier.wrapContentHeight(),
//            horizontalArrangement = Arrangement.spacedBy(8.dp),
//        ) {
//            items(rows4) {
//                ButtonGraduation(
//                    item = ItemRowModel(it)
//                )
//            }
//        }
//    }
//}
