package com.paxier.currencyexchange.controller

import com.paxier.currencyexchange.repository.CurrencyExchangeRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class CurrencyExchangeRateContoller(val repo: CurrencyExchangeRepository) {
    @GetMapping("/conversionfactor")
    fun getConversionFactor(from: String, to: String): ResponseEntity<Float> {
        val rate = repo.findByFromCurrencyAndToCurrency(from, to).exchangeRate
        return ResponseEntity.ok().body(rate)
    }
}