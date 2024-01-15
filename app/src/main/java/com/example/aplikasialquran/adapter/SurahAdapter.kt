package com.example.aplikasialquran.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.aplikasialquran.R
import com.example.aplikasialquran.activity.ListSurahActivity
import com.example.aplikasialquran.model.ModelSurah

class SurahAdapter(
    private val items: List<ModelSurah>,
    private val onSelectData: OnSelectedData
) : RecyclerView.Adapter<SurahAdapter.ViewHolder>(){
    interface OnSelectedData {
        fun onSelected(modelSurah: ModelSurah?)
    }
      override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item_surah, parent, false)
        return ViewHolder(v)
    }