package ru.gariev.expensemanager.data.models

import android.provider.BaseColumns
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.gariev.expensemanager.data.CURRENCY_TABLE

@Entity(tableName = CURRENCY_TABLE)
data class Currency(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = BaseColumns._ID)
    val id: Int,
    val title: String,
    val currencySymbol: Char
)