package com.example.patryk.fnp.Views

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.patryk.fnp.Presenters.PresentersInterfaces.IWordPresenter
import com.example.patryk.fnp.R
import com.example.patryk.fnp.Views.ViewsInterfaces.IWordView
import com.example.patryk.fnp.Word


class WordView : Fragment(),IWordView {
    // TODO: Rename and change types of parameters

    var presenter:IWordPresenter? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    var wordList:Array<Word> = arrayOf()
    set(value) {
        field= value
        val recycle = view?.findViewById<RecyclerView>(R.id.recycleView_word)
        val linearLayoutManager = LinearLayoutManager(context)
        linearLayoutManager.orientation = RecyclerView.VERTICAL
        recycle?.layoutManager= linearLayoutManager

        val adapter = WordRecycleViewAdapter(value)
        recycle?.adapter = adapter
    }
    get() {return field}

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_word_view, container, false)
    }

    // TODO: Rename method, update argument and hook method into UI event
    fun onButtonPressed(uri: Uri) {

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

    }

    override fun onResume() {
        super.onResume()
        wordList = presenter?.wordList!!
    }

    override fun onDetach() {
        super.onDetach()

    }

    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name

    }

}
