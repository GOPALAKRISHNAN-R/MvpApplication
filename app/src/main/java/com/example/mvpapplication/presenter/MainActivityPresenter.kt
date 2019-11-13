package com.example.mvpapplication.presenter

import com.example.mvpapplication.contract.ContractInterface
import com.example.mvpapplication.model.MainActivityModel

    //  Presenter Class is bridge between View and Model
class MainActivityPresenter(_view:ContractInterface.View):ContractInterface.Presenter {

    private var view:ContractInterface.View=_view

    private var model:ContractInterface.Model=MainActivityModel()

    init {
        view.initView()
    }

    override fun incrementValue() {
        model.incrementCounter()                                    //  Model method
        view.updateViewData()                                       //  view method
    }

    override fun getCounter(): String {
        return model.getCounter().toString()                        //  Model method
    }

}