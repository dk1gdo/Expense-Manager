package ru.gariev.expensemanager.data.models

import android.provider.BaseColumns
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.gariev.expensemanager.data.COST_TYPES_TABLE

@Entity(tableName = COST_TYPES_TABLE)
data class CostType(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = BaseColumns._ID)
    val id: Int,
    val title: String
)