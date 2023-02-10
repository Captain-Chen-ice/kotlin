package com.example.kotlin.logic

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin.R
import com.example.kotlin.data.DataInfo

class Adapter (
    vcontext:Context,
    vDataInfos:ArrayList<DataInfo>
):RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    var context = vcontext//上下文
    var datas = vDataInfos//data数据类集合

    /**
     * 设定对应资源，可改进优化
     */
    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var mon = itemView.findViewById<TextView>(R.id.mon)
        var num = itemView.findViewById<TextView>(R.id.num)
        var image = itemView.findViewById<TextView>(R.id.image)
        var up = itemView.findViewById<TextView>(R.id.up)
        var down = itemView.findViewById<TextView>(R.id.down)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var layouId = R.layout.face_main
        var view = LayoutInflater.from(context).inflate(layouId,parent,false)
        return ItemViewHolder(view)
    }

    /**
     * 重写获得项数量的函数
     */
    override fun getItemCount(): Int {
        return datas.size
    }

    /**
     * 重写绑定ViewHolder的函数
     */
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        //判断左边对象是否为右边类的实例
        if (holder is ItemViewHolder) {
            //获取arraylist中索引值为position的元素
            var data = this.datas.get(position)
            //like in java 'findviewid.setText'
            holder.mon.text = data.mon
            holder.num.text = data.num
            holder.image.text = data.image
            holder.up.text = data.up
            holder.down.text = data.down
        }
    }


}