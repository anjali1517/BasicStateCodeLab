package com.example.basicstatecodelab

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

class Wellnesstask(val id:Int, val value: String,
                   initialChecked: Boolean = false) {
                   var checked: MutableState<Boolean> = mutableStateOf(initialChecked)}