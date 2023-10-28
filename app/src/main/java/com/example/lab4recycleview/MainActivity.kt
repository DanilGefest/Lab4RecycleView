package com.example.lab4recycleview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
interface CellClickListener{
    fun onCellClickListener (data: ColorData)
}

class MainActivity : AppCompatActivity(), CellClickListener {
    private lateinit var myRecyclerViev : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myRecyclerViev = findViewById(R.id.rView)
        //менеджер компановки
        myRecyclerViev.layoutManager = LinearLayoutManager(this)
        myRecyclerViev.adapter = Adapter (this , fetchList(), this)
    }
    fun fetchList(): ArrayList<ColorData>{
        val list = arrayListOf<ColorData>()
        list.add(ColorData("Blue" , Color.BLUE))
        list.add(ColorData("White" , Color.WHITE))
        list.add(ColorData("Yellow" , Color.YELLOW))
        list.add(ColorData("Black" , Color.BLACK))
        list.add(ColorData("Cyan" , Color.CYAN))
        list.add(ColorData("Green" , Color.GREEN))
        list.add(ColorData("Magenta" , Color.MAGENTA))
        list.add(ColorData("Red" , Color.RED))
        list.add(ColorData("DkGray" , Color.DKGRAY))
        list.add(ColorData("Blue" , Color.BLUE))
        list.add(ColorData("White" , Color.WHITE))
        list.add(ColorData("Yellow" , Color.YELLOW))
        list.add(ColorData("Black" , Color.BLACK))
        list.add(ColorData("Cyan" , Color.CYAN))
        list.add(ColorData("Green" , Color.GREEN))
        list.add(ColorData("Magenta" , Color.MAGENTA))
        list.add(ColorData("Red" , Color.RED))
        list.add(ColorData("DkGray" , Color.DKGRAY))
        list.add(ColorData("Blue" , Color.BLUE))
        list.add(ColorData("White" , Color.WHITE))
        list.add(ColorData("Yellow" , Color.YELLOW))
        list.add(ColorData("Black" , Color.BLACK))
        list.add(ColorData("Cyan" , Color.CYAN))
        list.add(ColorData("Green" , Color.GREEN))
        list.add(ColorData("Magenta" , Color.MAGENTA))
        list.add(ColorData("Red" , Color.RED))
        list.add(ColorData("DkGray" , Color.DKGRAY))
    return list
    }

    override fun onCellClickListener(data: ColorData) {
        Toast.makeText(this, data.colorName, Toast.LENGTH_LONG).show()
    }
}


//Класс с шаблоном данных
data class ColorData(
    val colorName: String,
    val colorHex: Int
)