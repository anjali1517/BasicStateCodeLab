package com.example.basicstatecodelab

import androidx.compose.runtime.Composable
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel


class WellnesssTaskViewModel: ViewModel() {
    private var _task = getWellnessList().toMutableStateList()
     val tasks: List<Wellnesstask>
         get() = _task

    fun remove(item:Wellnesstask){
        _task.remove(item)
    }

    fun changeCheckedState(item: Wellnesstask,checked:Boolean){
        tasks.find { it.id == item.id }.let { task ->
            task?.checked = checked
        }
    }

}



private fun getWellnessList() = List(30){i -> Wellnesstask(i, "Task 3 $i")}