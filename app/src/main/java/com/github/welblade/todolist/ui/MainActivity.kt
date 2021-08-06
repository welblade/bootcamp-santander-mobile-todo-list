package com.github.welblade.todolist.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.welblade.todolist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val adapter: TaskListAdapter by lazy { TaskListAdapter() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initTaskList()
        insertListeners()
    }

    private fun initTaskList(){
        binding.rvTaskList.adapter = adapter
    }

    private fun insertListeners() {
        binding.btCreateTask.setOnClickListener {
            val createTaskIntent = Intent(this, FormTaskActivity::class.java)
            startActivity(createTaskIntent)
        }
    }
}