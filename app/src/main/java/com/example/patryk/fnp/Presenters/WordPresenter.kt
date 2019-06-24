package com.example.patryk.fnp.Presenters

import com.example.patryk.fnp.CategoryInfo
import com.example.patryk.fnp.Presenters.PresentersInterfaces.IWordPresenter
import com.example.patryk.fnp.Views.ViewsInterfaces.IWordView
import com.example.patryk.fnp.Word

class WordPresenter(var view:IWordView):IWordPresenter {
    override var wordList: Array<Word> = arrayOf(
        Word("kot","Cat", arrayOf("tagi")),
        Word("pies","Dog", arrayOf("tagi")),
        Word("kot","Cat", arrayOf("tagi")),
        Word("kot","Cat", arrayOf("tagi"))

    )
    override fun onAddView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setCategory(category: CategoryInfo) {

    }
}