package com.anushka.viewmodeldemo2
import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal : Int) : ViewModel() {
     private var total = MutableLiveData<Int>()
     val inputData = MutableLiveData<String>()
     val totalData : LiveData<Int>
     get() = total

     //val numberChange : LiveData<String>
    // get() = number


    init {
        total.value = startingTotal
        //number.value = num
    }

    fun setTotal(){
        val input = (inputData.value).toString().toInt()
        total.value =(total.value)?.plus(input)
    }
}