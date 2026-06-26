package com.leiconverter.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Represents a currency with its code, name, and nominal value.
 * BNM XML format: <Record>...<CharCode>EUR</CharCode><Nominal>1</Nominal><Name>Euro</Name>...
 */
@Entity(tableName = "current_rates")
data class Currency(
    @PrimaryKey val code: String,
    val name: String,
    val nominal: Int = 1,
    val value: Double = 0.0, // in MDL
    val date: String = "",
    val timestamp: Long = System.currentTimeMillis()
)