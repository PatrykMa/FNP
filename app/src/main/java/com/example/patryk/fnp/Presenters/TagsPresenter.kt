package com.example.patryk.fnp.Presenters

import android.graphics.Color
import android.os.Bundle
import com.example.patryk.fnp.CategoryInfo
import com.example.patryk.fnp.Presenters.PresentersInterfaces.ITagsPresenter
import com.example.patryk.fnp.Views.MainActivity
import com.example.patryk.fnp.Views.ViewsInterfaces.ICategoryView

class TagsPresenter(override var view: ICategoryView):ITagsPresenter {

    override var language: Array<String> = arrayOf("Angielski", "Niemieki")

    override var tags: Array<CategoryInfo> = arrayOf(CategoryInfo("nazwa",5,10, Color.RED),
        CategoryInfo("nazwa1",5,10, Color.BLUE),
        CategoryInfo("nazwa2",4,11, Color.RED))

    override fun onChangeLanguage() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onSelectTag(info: CategoryInfo) {
        MainActivity.istance?.changeView(MainActivity.tagWordView, Bundle())
    }

    override fun onAddTag() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onAddLanguage() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}