package com.example.patryk.fnp.Views.ViewsInterfaces

import com.example.patryk.fnp.CategoryInfo
import com.example.patryk.fnp.Presenters.PresentersInterfaces.ITagsPresenter

interface ICategoryView {
    var tags:Array<CategoryInfo>
    var language:Array<String>
    var presenter:ITagsPresenter?
}