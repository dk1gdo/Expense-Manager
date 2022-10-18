package ru.gariev.expensemanager.data.models

import android.provider.BaseColumns
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.gariev.expensemanager.data.ACCOUNT_TABLE

@Entity(tableName = ACCOUNT_TABLE)
class Account (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = BaseColumns._ID)
    val id: Int,
    val title: String,
    @ColumnInfo(index = true)
    val currencyId: Int,
    @ColumnInfo(index = true)
    val accountTypeId: Int,
    val balance: Float
)