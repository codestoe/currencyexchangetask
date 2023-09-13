package com.paxier.currencyexchange.repository

import com.paxier.currencyexchange.DataModel.CurrencyExchangeModel
import org.springframework.data.repository.CrudRepository


interface CurrencyExchangeRepository: CrudRepository<CurrencyExchangeModel, Any> {

    fun findByFromCurrencyAndToCurrency(fromCurrency: String, toCurrency: String): CurrencyExchangeModel

//  id: 1001,
//  fromCurrency: "USD",
//  toCurrency: "EUR",
//  conversionMultiple: 0.92
}
