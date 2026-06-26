package com.leiconverter.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Room entity for storing exchange rates.
 * Maps to BNM XML <Record> elements.
 */
@Entity(tableName = "exchange_rates")
data class RateEntity(
    @PrimaryKey
    val date: String,           // DD.MM.YYYY
    val currencyCode: String,   // e.g., "EUR", "USD"
    val nominal: Int,
    val value: Double,          // rate relative to MDL
    val timestamp: Long         // epoch ms for freshness
)
