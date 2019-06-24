package com.example.patryk.fnp.Views

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.patryk.fnp.CategoryInfo
import com.example.patryk.fnp.Presenters.PresentersInterfaces.ITagsPresenter
import com.example.patryk.fnp.R
import com.example.patryk.fnp.Views.ViewsInterfaces.ICategoryView
import androidx.recyclerview.widget.LinearLayoutManager




// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER



class TagsView :ICategoryView, Fragment() {

    override var presenter: ITagsPresenter? = null

    override var tags: Array<CategoryInfo>
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
        set(value) {
            val recycle = thisView.findViewById<RecyclerView>(R.id.recycleView_tags)
            val linearLayoutManager = GridLayoutManager(context,2)
            //linearLayoutManager.orientation = RecyclerView.VERTICAL
            recycle.layoutManager= linearLayoutManager

            val adapter = CategoryRecycleViewAdapter(value)
            adapter.onClick = {data: CategoryInfo -> presenter?.onSelectTag(data) }
            recycle?.adapter = adapter
        }
    override var language: Array<String>
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
        set(value) {
            val spinner = thisView.findViewById<Spinner>(R.id.spinner_language)
            val adapter = ArrayAdapter<String>(context, android.R.layout.simple_spinner_item,value)
            spinner?.adapter = adapter//(adapter); // this will set list of values to spinner
            //spinner?.setSelection(options.indexOf(<value you want to show selected>)));//set selected value in spinner

        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    lateinit var thisView:View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        thisView = inflater.inflate(R.layout.fragment_tags_view, container, false)
        return thisView
    }

    // TODO: Rename method, update argument and hook method into UI event
    fun onButtonPressed(uri: Uri) {

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

    }

    override fun onResume() {
        super.onResume()
        tags = presenter?.tags!!
        language = presenter?.language!!


    }

    override fun onDetach() {
        super.onDetach()

    }

}
