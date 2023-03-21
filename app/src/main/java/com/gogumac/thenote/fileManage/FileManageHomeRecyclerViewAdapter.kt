package com.gogumac.thenote.fileManage

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.gogumac.thenote.R
import com.gogumac.thenote.classes.base.BaseRecyclerAdapter
import com.gogumac.thenote.databinding.ItemFileManageHomeBinding

class FileManageHomeRecyclerViewAdapter():BaseRecyclerAdapter<FileManageHomeRecyclerViewAdapter.FileManageHomeRecyclerViewHolder>() {

    private var list= listOf<Pair<String,List<Any>>>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FileManageHomeRecyclerViewHolder {
        val binding: ItemFileManageHomeBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_file_manage_home, parent, false)
        val viewHolder=FileManageHomeRecyclerViewHolder(binding)
        return viewHolder
    }

    override fun onBindViewHolder(holder: FileManageHomeRecyclerViewHolder, position: Int) {
        val title=list[position].first
        val contents=list[position].second
        holder.bind(title,contents)
    }

    override fun getItemCount(): Int = list.size

    fun setList(contents:List<Pair<String,List<Any>>>){
        this.list=contents
    }

    inner class FileManageHomeRecyclerViewHolder(val binding:ItemFileManageHomeBinding):ViewHolder(binding.root){

        fun bind(title:String, contents:List<*>){
            binding.fileManageHomeItemTitle.setText(title)

        }
    }
}