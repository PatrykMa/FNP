package com.example.patryk.fnp.Views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import com.example.patryk.fnp.Presenters.MainiMenuPresenter
import com.example.patryk.fnp.R
import androidx.fragment.app.Fragment
import com.example.patryk.fnp.Presenters.TagsPresenter
import com.example.patryk.fnp.Presenters.WordPresenter
import com.example.patryk.fnp.Views.ViewsInterfaces.ICategoryView


class MainActivity : AppCompatActivity() {

    companion object {
        var istance:MainActivity? = null
        val tagMainMenu = "menu"
        val tagTagsView = "tags"
        val tagWordView = "view"
        val tagTranslate = "translate"
    }



    private var mainMenuFragment: MainView? = null
    private var tagsView:TagsView? = null
    private var wordFragment:WordView? = null
    private var translateFragment:TranslateFragment? = null

    var appBarTitle:String = "Fiszki"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        istance = this
        supportActionBar?.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar?.setCustomView(R.layout.appbar_center_text)
        supportActionBar?.customView?.findViewById<TextView>(R.id.action_bar_title)?.text = appBarTitle
        if (savedInstanceState == null) {
            //val mFragment = MainView()
            //mFragment.presenter = MainiMenuPresenter(mFragment,this)
            //setFragment(mFragment)
        }
        if (mainMenuFragment == null)
        {
            mainMenuFragment = MainView()
            mainMenuFragment!!.presenter = MainiMenuPresenter(mainMenuFragment!!)
            setFragment(mainMenuFragment!!)
        }





    }

    private fun setFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.main, fragment).addToBackStack("toDo")
        fragmentTransaction.commit()
    }

    fun changeView(name:String, data:Bundle)
    {
        if(name == tagMainMenu)
        {
            if (mainMenuFragment == null) {
                mainMenuFragment = MainView()
                mainMenuFragment!!.presenter = MainiMenuPresenter(mainMenuFragment!!)
            }
            setFragment(mainMenuFragment!!)
        }

        if(name == tagTagsView){
            if(tagsView == null)
            {
                tagsView = TagsView()
                val presenter = TagsPresenter(tagsView!!)
                tagsView!!.presenter = presenter
            }
            setFragment(tagsView!!)
        }

        if(name == tagWordView){
            if(wordFragment == null)
            {
                wordFragment = WordView()
                val presenter = WordPresenter(wordFragment!!)
                wordFragment!!.presenter = presenter
            }
            setFragment(wordFragment!!)
        }

        if(name == tagTranslate){
            if(translateFragment == null)
            {
                translateFragment = TranslateFragment()

            }
            setFragment(translateFragment!!)
        }
    }



}
