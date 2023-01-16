# Aufgabe: Eine Rest-API bereitstellen, mit der man Währungen umrechnen kann.

Daten, die wir brauchen:
- Die Ausgangswährung und die Währung in die konvertiert werden soll.
- Den Konvertierungsfaktor von einer Währung in die andere.

Die Daten sollen in einer Datenbank (z.B. h2 in memory oder deine Lieblingsdatenbank) liegen

Beispiel eines Datenbankeintrages:
```
{
  id: 1001,
  fromCurrency: "USD",
  toCurrency: "EUR",
  conversionMultiple: 0.92
}
```

Dann möchten wir zwei Endpunkte anbieten:
- Endpunkt 1 gibt den Konvertierungsfaktor zwischen zwei Währungen zurück
- Endpunkt 2 konvertiert eine Währung in eine andere Währung
  - z.B.: USD -> EUR mit Wert 10 ergibt 9.2 EUR   
- Wenn noch Zeit bleibt, kannst Du noch Integration-Tests für die Endpunkte schreiben.
