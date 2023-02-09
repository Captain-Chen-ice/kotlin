package com.example.kotlin.data

class ViewDataManager {
    var startIndex = 0 //分页起始位置
    val viewNum = 10 //每页数量

    //定义数据回调监听
    //参数：dataInfos 当前页数据集合， footType 分页状态文本
    //https://blog.csdn.net/qq_25749749/article/details/109001465
    //https://blog.csdn.net/m0_37261093/article/details/93782329#:~:text=%E7%AC%AC%E4%BA%8C%E7%A7%8Dkotlin%E8%87%AA%E5%B7%B1%E5%BE%97%E5%86%99%E6%B3%95%EF%BC%8C%E5%BD%93%E7%9B%91%E5%90%ACinterface%E7%9A%84%E6%96%B9%E6%B3%95%E4%B8%AD%E6%B2%A1%E6%9C%89%E5%8F%82%E6%95%B0%E5%8F%AF%E4%BB%A5%E4%BD%BF%E7%94%A8%E8%BF%99%E7%A7%8D%E8%B6%85%E7%AE%80%E5%8D%95%E5%86%99%E6%B3%95%EF%BC%8C%E5%A6%82%E6%9E%9C%E6%96%B9%E6%B3%95%E4%B8%AD%E6%9C%89%E5%8F%82%E6%95%B0%E4%BD%BF%E7%94%A8%E8%BF%99%E7%A7%8D%E7%BC%96%E8%BE%91%E5%99%A8%E4%BC%9A%E6%8A%A5%E9%94%99%E4%B8%8D%E8%83%BD%E9%80%9A%E8%BF%87%E7%BC%96%E8%AF%91%20adapter.setOnLoadMoreListener%20%28object%20%3ABaseQuickAdapter.RequestLoadMoreListener,%7B%20override%20fun%20onLoadMoreRequested%28%29%20%7B
    lateinit var listener: ((dataInfos: ArrayList<DataInfo>, footType: String) -> Unit)
    /**
     * 设置回调
     */
    fun setDataListener(pListener: ((dataInfos: ArrayList<DataInfo>, footType: String) -> Unit)) {
        this.listener = pListener
    }
}