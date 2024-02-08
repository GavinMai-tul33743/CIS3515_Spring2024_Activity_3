package edu.temple.inclassuiacvitivity

import android.content.Context
import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.BaseAdapter
import android.widget.TextView
import kotlin.math.log

class TextSizeAdapter(_context: Context, _spinner: Int, _textSizes:Array<Int>) : BaseAdapter() {

    private val context = _context
    private val spinner = _spinner
    private val textSizes = _textSizes
    override fun getCount(): Int {
        return textSizes.size
    }

    override fun getItem(position: Int): Any {
        return textSizes[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView:TextView
        if(convertView != null){
            textView = convertView as TextView
        }
        else{
            textView = TextView(context)
        }

        textView.text = textSizes[position].toString()
        textView.textSize = textSizes[position].toFloat()
        textView.setTextColor(Color.parseColor("Red"))
        textView.setPadding(10, 5, 0, 5)
        return textView
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        return super.getDropDownView(position, convertView, parent).apply {
            println("Here")
            setBackgroundColor(Color.parseColor("Black"))
        }


    }

}