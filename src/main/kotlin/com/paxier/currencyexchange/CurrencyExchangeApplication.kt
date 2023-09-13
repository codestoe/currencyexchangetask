package com.paxier.currencyexchange

import com.paxier.currencyexchange.DataModel.CurrencyExchangeModel
import com.paxier.currencyexchange.repository.CurrencyExchangeRepository
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationListener
import org.springframework.context.annotation.Bean

@SpringBootApplication
class CurrencyExchangeApplication {
    @Bean
    fun myListener(repo: CurrencyExchangeRepository) = MyListener(repo)
}

fun main(args: Array<String>) {
	runApplication<CurrencyExchangeApplication>(*args)
}

class MyListener(val repo: CurrencyExchangeRepository) : ApplicationListener<ApplicationReadyEvent> {
    override fun onApplicationEvent(event: ApplicationReadyEvent) {
        val exchangeRates: List<CurrencyExchangeModel> = listOf(listOf("USD", "EUR",0.92F)).map {CurrencyExchangeModel(null,
            it[0] as String, it[1] as String, it[2] as Float
        ) }
        repo.saveAll(exchangeRates)
    }

}
