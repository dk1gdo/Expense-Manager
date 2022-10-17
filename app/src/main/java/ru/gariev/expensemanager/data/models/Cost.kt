package ru.gariev.expensemanager.data.models

import java.util.Date

data class Cost(
    val id: Int,
    val date: Date,
    val description: String,
    val costTypeId: Int,
    val accountId: Int
)