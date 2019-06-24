package com.example.patryk.fnp.Views

import android.content.Context
import android.graphics.ColorFilter
import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import com.example.patryk.fnp.R


class TranslateFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_translate, container, false)
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)

    }

    override fun onResume() {
        super.onResume()
        view?.findViewById<ImageButton>(R.id.imageButton_keyboard)?.setOnClickListener {
            onKeyboardButtClick()
        }
        view?.findViewById<ImageButton>(R.id.imageButton_mic)?.setOnClickListener {
            onMicButtClick()
        }
        view?.findViewById<ImageButton>(R.id.imageButton_camera)?.setOnClickListener {
            onCameraButtClick()
        }
    }

    override fun onDetach() {
        super.onDetach()

    }

    private fun onMicButtClick()
    {
        val mic = view?.findViewById<ImageButton>(R.id.imageButton_mic)
        val cam = view?.findViewById<ImageButton>(R.id.imageButton_camera)
        val key = view?.findViewById<ImageButton>(R.id.imageButton_keyboard)

        mic?.background = context?.getDrawable(R.drawable.rounded_white)
        mic?.setColorFilter(context?.getColor(R.color.colorPrimaryDark)!!)

        cam?.background = context?.getDrawable(R.drawable.rounded_black_button)
        cam?.setColorFilter(context?.getColor(R.color.white)!!)

        key?.background = context?.getDrawable(R.drawable.rounded_black_button)
        key?.setColorFilter(context?.getColor(R.color.white)!!)

    }
    private fun onCameraButtClick()
    {
        val mic = view?.findViewById<ImageButton>(R.id.imageButton_mic)
        val cam = view?.findViewById<ImageButton>(R.id.imageButton_camera)
        val key = view?.findViewById<ImageButton>(R.id.imageButton_keyboard)

        cam?.background = context?.getDrawable(R.drawable.rounded_white)
        cam?.setColorFilter(context?.getColor(R.color.colorPrimaryDark)!!)

        mic?.background = context?.getDrawable(R.drawable.rounded_black_button)
        mic?.setColorFilter(context?.getColor(R.color.white)!!)

        key?.background = context?.getDrawable(R.drawable.rounded_black_button)
        key?.setColorFilter(context?.getColor(R.color.white)!!)

    }
    private fun onKeyboardButtClick()
    {
        val mic = view?.findViewById<ImageButton>(R.id.imageButton_mic)
        val cam = view?.findViewById<ImageButton>(R.id.imageButton_camera)
        val key = view?.findViewById<ImageButton>(R.id.imageButton_keyboard)

        key?.background = context?.getDrawable(R.drawable.rounded_white)
        key?.setColorFilter(context?.getColor(R.color.colorPrimaryDark)!!)

        cam?.background = context?.getDrawable(R.drawable.rounded_black_button)
        cam?.setColorFilter(context?.getColor(R.color.white)!!)

        mic?.background = context?.getDrawable(R.drawable.rounded_black_button)
        mic?.setColorFilter(context?.getColor(R.color.white)!!)

    }

}
