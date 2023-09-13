package com.paxier.currencyexchange.controller

import com.paxier.currencyexchange.repository.CurrencyExchangeRepository
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class CurrencyExchangeRateContoller(val repo: CurrencyExchangeRepository) {


    @GetMapping("/conversionfactor")
    fun getConversionFactor(from: String, to: String): Float =
        repo.findByFromCurrencyAndToCurrency(from, to).exchangeRate



}