package com.example.kotlin.logic

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager

class ViewLayoutManager(
    lcontext:Context
) {


    var context = lcontext
    var position : Int = 0
    var llManager: LinearLayoutManager //列表布局管理器对象,Creates a vertical LinearLayoutManager创建一个垂直列表布局管理器
    init {
       llManager = LinearLayoutManager(context)
    }


/**
 *     获得布局管理器对象
 *     LayoutManager是一个抽象类，有3个子类：LinearLayoutManager 线性布局管理器GridLayoutManager 表格布局管理器StaggeredGridLayoutManager 瀑布流布局管理器
 *     learn:https://www.jianshu.com/p/8e578d8ebe5f
 *     @param viewStyle:Int 用作更换布局使用（设定常量标识判断）
 **/
    fun getLoyoutManager(viewStyle: Int):LinearLayoutManager{
        return llManager
    }

    /**
     * 获得数据位置
     */
    fun getDataPosition(): Int {
        return position
    }

}