# 📲 SMS to Email App

Webová aplikácia postavená na Spring Boot, ktorá slúži ako most medzi GSM zariadením a e-mailom. Umožňuje prijímať SMS správy, odosielať ich na e-mail a spätne spracovávať odpovede z e-mailu do SMS.

---

## 📝 Popis projektu

- GSM zariadenie posiela SMS správu na REST API tejto aplikácie.
- Aplikácia prijatú SMS správu odošle na definovanú e-mailovú adresu.
- Aplikácia pravidelne kontroluje doručené správy na e-mailovej schránke.
- Ak príde odpoveď, aplikácia obsah správy odosiela späť cez GSM zariadenie ako SMS na pôvodné číslo odosielateľa.
- Celý proces prebieha automaticky bez zásahu používateľa.
- Aplikácia obsahuje databázu, v ktorej si používatelia môžu uložiť telefónne čísla spolu s menom kontaktu.
- Pri príchode SMS z konkrétneho čísla aplikácia zobrazí aj meno kontaktu, ktoré si používateľ uložil, čo umožňuje lepšiu identifikáciu odosielateľa.

---

## 🛠️ Použité technológie

- **Backend:** Spring Boot (Java)
- **Databáza:** MySQL 
