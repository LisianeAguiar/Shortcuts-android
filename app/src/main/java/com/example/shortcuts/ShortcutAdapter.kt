package com.example.shortcuts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ShortcutAdapter(private val context: Context) : RecyclerView.Adapter<ShortcutAdapter.ShortcutViewHolder>() {

    private var shortcuts: List<Shortcut> = listOf()

    override fun onBindViewHolder(holder: ShortcutViewHolder, position: Int) {
        val shortcut = shortcuts[position]
        holder.bind(shortcut)    }

    fun setItems(shortcuts: List<Shortcut>) {
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShortcutViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.shortcut_view, parent, false)
        return ShortcutViewHolder(view)
    }

    override fun getItemCount(): Int {
        return shortcuts.size
    }


    inner class ShortcutViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(shortcut: Shortcut) {

        }
    }

    }

