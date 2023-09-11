# Task: Provide a Rest APIs that can be used to convert currencies.

APIs we need:
- The conversion factor from one currency to the other.
- The conversion from currency and to currency.

The data should be stored in a database (e.g. h2 in memory or your favourite database).

Example of a database entry:
```
{
  id: 1001,
  fromCurrency: "USD",
  toCurrency: "EUR",
  conversionMultiple: 0.92
}
```

Then we would like you to create two endpoints:
- Endpoint 1 returns the conversion factor between two currencies
- Endpoint 2 converts one currency into another currency
  - e.g.: USD -> EUR with value 10 results in 9.2 EUR
- If there is still time, you can write integration tests for the endpoints.
