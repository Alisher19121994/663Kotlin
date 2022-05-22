package com.example.a663kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a561kotlin.*
import com.example.a662kotlin.Books
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        data_1()
        data_2()
        data_3()
        data_4()
        data_5()
    }

    private fun data_1() {
        main_recyclerview_id.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val list = ArrayList<H_views>()
        list.add(H_views("Dreams", R.drawable.rasm))
        list.add(H_views("Dreams", R.drawable.rasm))
        list.add(H_views("Dreams", R.drawable.rasm))
        list.add(H_views("Dreams", R.drawable.rasm))
        list.add(H_views("Dreams", R.drawable.rasm))
        list.add(H_views("Dreams", R.drawable.rasm))
        list.add(H_views("Dreams", R.drawable.rasm))
        list.add(H_views("Dreams", R.drawable.rasm))
        list.add(H_views("Dreams", R.drawable.rasm))
        list.add(H_views("Dreams", R.drawable.rasm))
        list.add(H_views("Dreams", R.drawable.rasm))
        list.add(H_views("Dreams", R.drawable.rasm))
        list.add(H_views("Dreams", R.drawable.rasm))
        val adapterH = Adapter_H(this, list)
        main_recyclerview_id.adapter = adapterH
    }

    private fun data_2() {
        main_recyclerview_2_id.layoutManager = GridLayoutManager(this, 2)
        val list = ArrayList<grid_1>()
        list.add(grid_1(R.drawable.s1))
        list.add(grid_1(R.drawable.s1))
        list.add(grid_1(R.drawable.s2))
        list.add(grid_1(R.drawable.s2))
        list.add(grid_1(R.drawable.c_3))
        list.add(grid_1(R.drawable.c_3))
        list.add(grid_1(R.drawable.c_4))
        list.add(grid_1(R.drawable.c_4))
        val adapter = Adapter_grid_1(this, list)
        main_recyclerview_2_id.adapter = adapter
    }

    private fun data_3() {
        main_recyclerview_3_id.layoutManager = GridLayoutManager(this, 2)
        val list = ArrayList<grid_2>()
        list.add(grid_2(R.drawable.c4))
        list.add(grid_2(R.drawable.c4))
        list.add(grid_2(R.drawable.c2))
        list.add(grid_2(R.drawable.c2))
        list.add(grid_2(R.drawable.c3))
        list.add(grid_2(R.drawable.c3))
        val adapter = Adapter_grid_2(this, list)
        main_recyclerview_3_id.adapter = adapter
    }

    private fun data_4() {
        main_recyclerview_4_id.layoutManager = GridLayoutManager(this, 1)
        val list = ArrayList<Books>()
        list.add(Books(R.drawable.home_1, "The Very Hungry Caterpiller", "$5 06"))
        list.add(Books(R.drawable.home_6, "The Very Hungry Caterpiller", "$5 06"))
        list.add(Books(R.drawable.home_7, "The Very Hungry Caterpiller", "$5 06"))
        list.add(Books(R.drawable.home_8, "The Very Hungry Caterpiller", "$5 06"))
        list.add(Books(R.drawable.home_9, "The Very Hungry Caterpiller", "$5 06"))
        list.add(Books(R.drawable.home_7, "The Very Hungry Caterpiller", "$5 06"))
        list.add(Books(R.drawable.home_6, "The Very Hungry Caterpiller", "$5 06"))
        list.add(Books(R.drawable.home_1, "The Very Hungry Caterpiller", "$5 06"))

        val adapter = Adapter_Books(this, list)
        main_recyclerview_4_id.adapter = adapter
    }

    private fun data_5() {
        main_recyclerview_5_id.layoutManager = GridLayoutManager(this, 2)
        val list = ArrayList<Explores>()
        list.add(Explores(R.drawable.home_2, "Beauty"))
        list.add(Explores(R.drawable.home_2, "Beauty"))
        list.add(Explores(R.drawable.home_2, "Beauty"))
        list.add(Explores(R.drawable.home_2, "Beauty"))
        list.add(Explores(R.drawable.home_2, "Beauty"))
        list.add(Explores(R.drawable.home_2, "Beauty"))
        list.add(Explores(R.drawable.home_2, "Beauty"))
        list.add(Explores(R.drawable.home_2, "Beauty"))
        list.add(Explores(R.drawable.home_2, "Beauty"))
        list.add(Explores(R.drawable.home_2, "Beauty"))
        list.add(Explores(R.drawable.home_2, "Beauty"))
        list.add(Explores(R.drawable.home_2, "Beauty"))
        list.add(Explores(R.drawable.home_2, "Beauty"))
        list.add(Explores(R.drawable.home_2, "Beauty"))

        val adapter = Adapter_Explores(this, list)
        main_recyclerview_5_id.adapter = adapter
    }
}