package com.example.patryk.fnp.Views

import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.patryk.fnp.CategoryInfo
import com.example.patryk.fnp.R

class CategoryRecycleViewAdapter(private val myDataset: Array<CategoryInfo>): RecyclerView.Adapter<CategoryRecycleViewAdapter.MyViewHolder>()  {

    var onClick:(data:CategoryInfo)->Unit = {}

    inner class MyViewHolder(val view: View) : RecyclerView.ViewHolder(view), View.OnClickListener
    {
        init {
            view.setOnClickListener(this)
        }
        override fun onClick(view: View) {
            onClick(myDataset[position])
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): CategoryRecycleViewAdapter.MyViewHolder {
        // create a new view
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycle_category_edit_layout, parent, false)
        // set the view's size, margins, paddings and layout parameters

        return MyViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.view.findViewById<TextView>(R.id.textView_name).text = myDataset[position].name
        holder.view.findViewById<TextView>(R.id.textView_stat). text = "${myDataset[position].total}/${myDataset[position].learned}"
        holder.view.background = ColorDrawable(myDataset[position].color)
    }


    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = myDataset.size
}