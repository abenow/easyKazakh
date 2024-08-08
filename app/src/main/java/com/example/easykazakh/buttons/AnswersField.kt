package com.example.easykazakh.buttons

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.easykazakh.R
import com.example.easykazakh.ui.theme.HeadingStyle
import androidx.compose.material3.*
import androidx.compose.material.*
import androidx.compose.material.Snackbar
import androidx.compose.material.SnackbarHostState
import androidx.compose.material.SnackbarHost

import androidx.compose.material.icons.filled.*
import androidx.compose.material.SnackbarDuration
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import com.example.easykazakh.firstLevel.checkValue
import kotlinx.coroutines.launch


@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun AnswersField(answerText: String){
    Box{
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
                    contentDescription = "image",
                )
                snackbar = true

            } else if (!checkValue(globalText, answerText) && count == amountCount
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
}



fun checkValue(text:String, answer: String): Boolean {
    if (text == answer){
        return true
    }
    return false
}

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun snackBar(text: String){
    val scope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState()}
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