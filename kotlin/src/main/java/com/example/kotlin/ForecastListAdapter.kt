package com.example.kotlin

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

class ForecastListAdapter(var items: List<String>) :RecyclerView.Adapter<ForecastListAdapter.ViewHolder>(){

   override fun getItemCount(): Int {
       return items.size;
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(TextView(p0.context));
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.textView.text = items[p1]
    }

    class ViewHolder(var textView: TextView) : RecyclerView.ViewHolder(textView)

}
