package com.example.kotlin.view

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin.data.DataInfo
import com.example.kotlin.logic.Adapter
import com.example.kotlin.logic.ViewDataManager
import com.example.kotlin.logic.ViewLayoutManager

class ViewManager(vcontext:Context,vrecyclerView: RecyclerView) {

    private var context = vcontext
    private var recyclerView = vrecyclerView
    private var adapter: Adapter? = null
    private var viewlayoutmanager = ViewLayoutManager(context)
    private var viewdatamanager = ViewDataManager()
    private var datas = ArrayList<DataInfo>()


    fun setViewStyle(): ViewManager {

        var layoutmanager = viewlayoutmanager.getLayoutManager()
        var position = viewlayoutmanager.getDataPosition()

        adapter = Adapter(context,datas)
        //列表控件设置适配器
        recyclerView.adapter = adapter
        //列表控件设置布局管理器
        recyclerView.layoutManager = layoutmanager
        //列表控件滑动到指定位置
        recyclerView.scrollToPosition(position)
        return this
    }






}