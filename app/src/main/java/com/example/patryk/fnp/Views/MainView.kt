package com.example.patryk.fnp.Views

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.patryk.fnp.Presenters.PresentersInterfaces.IMainMenuPresenter
import com.example.patryk.fnp.R
import com.example.patryk.fnp.Views.ViewsInterfaces.IMainMenu


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [MainView.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [MainView.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class MainView() : Fragment(),IMainMenu {
    override var viewContext: Context
        get() = context!!
        set(value) {}
    // TODO: Rename and change types of parameters
    var presenter:IMainMenuPresenter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_main_view, container, false)
        initButtonsOnClick(view)
        return view
    }

    private fun initButtonsOnClick(view: View){
        var x = view?.findViewById<Button>(R.id.button_edit)?.setOnClickListener {
            presenter?.onEdit()
        }
        val z1= view?.findViewById<Button>(R.id.button_learn)?.setOnClickListener {
            presenter?.onLearn()
        }
        val z= view?.findViewById<Button>(R.id.button_translate)?.setOnClickListener {
            presenter?.onTranslate()
        }
        val x5 =3

    }


    override fun onAttach(context: Context) {
        super.onAttach(context)

    }

    override fun onDetach() {
        super.onDetach()

    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments]
     * (http://developer.android.com/training/basics/fragments/communicating.html)
     * for more information.
     */



}
