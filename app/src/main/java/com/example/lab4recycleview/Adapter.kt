package com.example.lab4recycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val context : Context, private val colorList : ArrayList<ColorData>, private val cellClickListener: CellClickListener): RecyclerView.Adapter<Adapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val myColor : View = itemView.findViewById(R.id.view_color)
        val textView : TextView = itemView.findViewById(R.id.TextView)
    }
//новый элемент списка
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.rviev_item,parent,false)
    return ViewHolder(view)
    }
//Кол=во элементов
    override fun getItemCount(): Int {
       return colorList.size
    }
// связь данных с представлением View
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = colorList[position]
    holder.myColor.setBackgroundColor(data.colorHex)
    holder.textView.text = data.colorName

    holder.itemView.setOnClickListener{
        cellClickListener.onCellClickListener(data)
    }
    }
}