package ru.gariev.expensemanager.data.models

import android.provider.BaseColumns
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.gariev.expensemanager.data.COST_TABLE
import java.util.Date

@Entity(tableName = COST_TABLE)
data class Cost(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = BaseColumns._ID)
    val id: Int,
    val date: Date,
    val description: String,
    @ColumnInfo(index = true)
    val costTypeId: Int,
    @ColumnInfo(index = true)
    val accountId: Int,
    val confirmed: Boolean = true
)