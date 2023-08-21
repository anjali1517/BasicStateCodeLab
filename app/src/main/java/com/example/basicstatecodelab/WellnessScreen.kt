package com.example.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun WellnessScreen(modifier: Modifier = Modifier, wellnesssTaskViewModel: WellnesssTaskViewModel = viewModel()){
    Column {
        StatefulCounter(modifier)

        WellnessTaskList(list = wellnesssTaskViewModel.tasks,
            onCheckedTask = {task, checked -> wellnesssTaskViewModel.changeCheckedState(task,checked)},
            onCloseTask = {task -> wellnesssTaskViewModel.remove(task)})
    }
}

private fun getWellnessList() = List(30){i -> Wellnesstask(i, "Task 3 $i")}