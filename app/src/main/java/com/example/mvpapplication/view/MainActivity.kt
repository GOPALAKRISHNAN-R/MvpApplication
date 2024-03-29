package com.example.mvpapplication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvpapplication.R
import com.example.mvpapplication.contract.ContractInterface
import com.example.mvpapplication.presenter.MainActivityPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),ContractInterface.View {

    private var presenter:MainActivityPresenter?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainActivityPresenter(this)
    }

    override fun initView() {
        counterTextView.text = presenter?.getCounter()
        clickButton.setOnClickListener { presenter?.incrementValue() }
    }

    override fun updateViewData() {
        counterTextView.text = presenter?.getCounter()
    }

}
