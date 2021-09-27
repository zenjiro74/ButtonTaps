package com.example.zemjiro74.buttontaps.ui.main

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.zemjiro74.buttontaps.R

class MainViewModel : ViewModel() {
    private var _countA = MutableLiveData("0")
    private var _countB = MutableLiveData("0")
    private var _sum = MutableLiveData("0")
    val countA: LiveData<String> = _countA
    val countB: LiveData<String> = _countB
    val sum: LiveData<String> = _sum
    private var cntA = 0
    private var cntB = 0

    fun onClick(view: View) {
        if (view.id == R.id.btnA) {
            cntA++
            _countA.value = cntA.toString()
        } else {
            cntB++
            _countB.value = cntB.toString()
        }

        _sum.value = "" + (cntA + cntB)
    }

    fun onLongClick(view: View): Boolean {
        if (view.id == R.id.btnA) {
            cntA = 0
            _countA.value = cntA.toString()
        } else {
            cntB = 0
            _countB.value = cntB.toString()
        }

        _sum.value = "" + (cntA + cntB)
        return true
    }
}