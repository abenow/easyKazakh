package com.example.easykazakh.buttons



import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val scope = rememberCoroutineScope()
            val scaffoldState = rememberScaffoldState()
            val count = remember{ mutableStateOf(0) }
            Scaffold(
                scaffoldState = scaffoldState,
                floatingActionButton = {
                    FloatingActionButton(
                        content = {Icon(Icons.Filled.Add, contentDescription = "Добавить")},
                        onClick = {
                            scope.launch {
                                scaffoldState.snackbarHostState.showSnackbar("Count: ${++count.value}")
                            }
                        }
                    )
                }
            ){
                Text("Count", fontSize = 28.sp)
            }
        }
    }
}
