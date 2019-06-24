package com.example.patryk.fnp.Presenters.PresentersInterfaces

import com.example.patryk.fnp.CategoryInfo
import com.example.patryk.fnp.Word

interface IWordPresenter {
    var wordList:Array<Word>

    fun onAddView()

    fun setCategory(category:CategoryInfo)
}