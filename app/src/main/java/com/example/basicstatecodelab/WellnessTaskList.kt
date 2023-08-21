package com.example.basicstatecodelab

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

private fun getWellnessList() = List(30){i -> Wellnesstask(i, "Task 3 $i")}

@Composable
fun WellnessTaskList(
    modifier: Modifier = Modifier,
    list: List<Wellnesstask>,
    onCheckedTask: (Wellnesstask, Boolean) -> Unit,
    onCloseTask: (Wellnesstask)->Unit
){

    LazyColumn(modifier = modifier){
        items( items = list , key = {task -> task.id}){ task->
            WellnessTaskItem(taskName = task.value,
                checked = task.checked,
                onCheckedChange = {checked -> onCheckedTask(task, checked)},
                onClose = { onCloseTask(task) })
        }
    }
}
