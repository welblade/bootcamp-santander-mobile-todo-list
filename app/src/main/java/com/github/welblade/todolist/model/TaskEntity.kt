package com.github.welblade.todolist.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "TaskTable")
data class TaskEntity(
    val title: String,
    val description: String,
    val date: String,
    val hour: String,
    @PrimaryKey val id: String
) {
    companion object {
        fun from(task: Task): TaskEntity {
            return TaskEntity(
                id = task.id,
                title = task.title,
                description = task.description,
                date = task.date,
                hour = task.hour
            )
        }
    }

    fun toTask(): Task {
        return Task(
            id = this.id,
            title = this.title,
            description = this.description,
            date = this.date,
            hour = this.hour)
    }
}