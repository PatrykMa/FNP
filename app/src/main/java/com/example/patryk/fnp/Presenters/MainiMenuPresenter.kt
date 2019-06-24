package com.example.patryk.fnp.Presenters

import android.os.Bundle
import com.example.patryk.fnp.Presenters.PresentersInterfaces.IMainMenuPresenter
import com.example.patryk.fnp.Views.MainActivity
import com.example.patryk.fnp.Views.ViewsInterfaces.IMainMenu

class MainiMenuPresenter(view:IMainMenu):IMainMenuPresenter {
    override var view: IMainMenu = view


    override fun onLearn() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onTranslate() {
       MainActivity.istance?.changeView(MainActivity.tagTranslate,Bundle())
    }

    override fun onEdit() {
       MainActivity.istance?.changeView(MainActivity.tagTagsView, Bundle())
    }
}