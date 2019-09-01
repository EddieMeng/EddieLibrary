package com.example.meng.architecture

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.example.meng.architecture.mvvm.MyViewModel
import com.example.meng.architecture.mvvm.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // update UI
        val model = ViewModelProvider.AndroidViewModelFactory.getInstance(this.application).create(MyViewModel::class.java)
        model.getUsers().observe(this, Observer<List<User>> {


        })
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)
    }


}
