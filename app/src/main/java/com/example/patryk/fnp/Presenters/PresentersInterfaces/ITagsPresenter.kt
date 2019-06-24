package com.example.patryk.fnp.Presenters.PresentersInterfaces

import com.example.patryk.fnp.CategoryInfo
import com.example.patryk.fnp.Views.ViewsInterfaces.ICategoryView

interface ITagsPresenter {

    var view:ICategoryView
    fun onChangeLanguage()
    fun onSelectTag(info:CategoryInfo)
    fun onAddTag()
    fun onAddLanguage()

    var tags:Array<CategoryInfo>
    var language:Array<String>


}