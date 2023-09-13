package com.paxier.currencyexchange.DataModel

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity(name = "CURRENCYEXCHANGE")
data class CurrencyExchangeModel(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,
    val fromCurrency: String = "",
    val toCurrency: String = "",
    val exchangeRate: Float = 0F
)