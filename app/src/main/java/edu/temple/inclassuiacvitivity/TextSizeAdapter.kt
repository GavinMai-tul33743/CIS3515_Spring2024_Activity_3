package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(_context: Context, _spinner: View, _textSizes:Array<Int>) : BaseAdapter() {

    private val context = _context
    private val spinner = _spinner
    private val textSizes = _textSizes
    override fun getCount(): Int {
        TODO("Not yet implemented")
        return textSizes.size
    }

    override fun getItem(position: Int): Any {
        TODO("Not yet implemented")
        return textSizes[position]
    }

    override fun getItemId(position: Int): Long {
        TODO("Not yet implemented")
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("Not yet implemented")
        val textView = TextView(context)
        textView.text = textSizes[position].toString()
        textView.textSize = textSizes[position].toFloat()
        return textView
    }

}