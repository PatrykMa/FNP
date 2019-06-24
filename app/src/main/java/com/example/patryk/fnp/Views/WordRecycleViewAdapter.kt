package com.example.patryk.fnp.Views

import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.patryk.fnp.R
import com.example.patryk.fnp.Word

class WordRecycleViewAdapter (private val myDataset: Array<Word>): RecyclerView.Adapter<WordRecycleViewAdapter.MyViewHolder>()  {

    var onClick:(data:Word)->Unit = {}

    inner class MyViewHolder(val view: View) : RecyclerView.ViewHolder(view), View.OnClickListener
    {
        override fun onClick(view: View) {
            onClick(myDataset[position])
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MyViewHolder {
        // create a new view
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycle_word_layout, parent, false)
        // set the view's size, margins, paddings and layout parameters

        return MyViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.view.findViewById<TextView>(R.id.textView_first).text = myDataset[position].first
        holder.view.findViewById<TextView>(R.id.textView_second).text = myDataset[position].second
    }


    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = myDataset.size
}