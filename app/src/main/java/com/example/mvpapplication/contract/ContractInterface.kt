package com.example.mvpapplication.contract

interface ContractInterface {


    //  interface for view class
    interface View {
        fun initView()                                  //  This method will create initial view
        fun updateViewData()                            /*  This method will be called when the model updates
                                                            and the view needs to be update*/
    }

    //  interface for presenter class
    interface Presenter {
        fun incrementValue()                            //  Called when the model needs to be updated
        fun getCounter(): String                        //  The view needs to access the data from model
    }

    //  interface for Model class
    interface Model {
        fun getCounter(): Int                           //  Return value stored in the model
        fun incrementCounter()                          //  increment the value in the model
    }
}