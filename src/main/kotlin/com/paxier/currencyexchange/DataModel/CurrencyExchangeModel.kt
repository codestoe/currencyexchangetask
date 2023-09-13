package com.paxier.currencyexchange.DataModel

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity(name = "CURRENCYEXCHANGE")
data class CurrencyExchangeModel(
    @Id val id: Long? = 0L,
    val fromCurrency: String = "",
    val toCurrency: String = "",
    val exchangeRate: Float = 0F
)