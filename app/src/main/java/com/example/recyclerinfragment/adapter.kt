package com.example.recyclerinfragment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapter(val context: Context?, val list: ArrayList<DataModel>):
RecyclerView.Adapter<adapter.ViewHolder>(){

    private val inflater:LayoutInflater=
        context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater

    class ViewHolder (view: View):RecyclerView.ViewHolder(view) {
        val textView:TextView=view.findViewById(R.id.layoutlist)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val rowView=inflater.inflate(R.layout.list1,parent,false)
        return ViewHolder(rowView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text=list.get(position).ststock
    }

    override fun getItemCount(): Int {
        return list.size
    }

}