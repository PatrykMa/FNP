package com.example.patryk.fnp.Presenters.PresentersInterfaces

import com.example.patryk.fnp.Views.ViewsInterfaces.IMainMenu

interface IMainMenuPresenter {
    var view:IMainMenu
    fun onLearn()
    fun onTranslate()
    fun onEdit()
}