# Java Developer
- This course is mentored by a Senior SW Developer [Radek Hübner](https://github.com/rhubner), who has 19 years of experience in software engineering lead and java development at company HM Revenue & Customs or working at various projects for The National Archives UK.

---
—> [Robot Dreams course info](https://robotdreams.cz/course/103-java-developer)

![Course Image](/javadeveloper.png)

- [Java Developer](#java-developer)
  - [1. Lekce: Úvod a instalace Javy](#1-lekce-úvod-a-instalace-javy)
  - [2. Lekce: Základy Gitu](#2-lekce-základy-gitu)
  - [3. Lekce: Primitivní datové typy](#3-lekce-primitivní-datové-typy)
  - [4. Lekce: Operátory a podmínky](#4-lekce-operátory-a-podmínky)
  - [5. Lekce: Metody a organizace kódu](#5-lekce-metody-a-organizace-kódu)
  - [6. Lekce: Řízení toku programu](#6-lekce-řízení-toku-programu)
  - [7. Lekce: Úvod do polí (Arrays)](#7-lekce-úvod-do-polí-arrays)
  - [8. Lekce: OOP – objekty a struktura](#8-lekce-oop--objekty-a-struktura)
  - [9. Lekce: OOP – dědičnost](#9-lekce-oop--dědičnost)
  - [10. Lekce: Polymorfismus a zapouzdření v OOP](#10-lekce-polymorfismus-a-zapouzdření-v-oop)
  - [11. Lekce: Kolekce v Javě – List, Map, Set](#11-lekce-kolekce-v-javě--list-map-set)
  - [12. Lekce: Co jsou generika](#12-lekce-co-jsou-generika)
  - [13. Lekce: Live Coding – opakování a QA session](#13-lekce-live-coding--opakování-a-qa-session)
  - [14. Lekce: Výjimky](#14-lekce-výjimky)
  - [15. Lekce: Stream API a kolekce v Javě](#15-lekce-stream-api-a-kolekce-v-javě)
  - [16. Lekce: Funkcionální rozhraní v Javě](#16-lekce-funkcionální-rozhraní-v-javě)
  - [17. Lekce: Vstupně výstupní operace v Javě](#17-lekce-vstupně-výstupní-operace-v-javě)
  - [18. Lekce: Concurrency – Vlákna a multivláknové programování](#18-lekce-concurrency--vlákna-a-multivláknové-programování)
  - [19. Lekce: Unitní psaní testů v Javě](#19-lekce-unitní-psaní-testů-v-javě)
  - [20. Lekce: Návrhové vzory](#20-lekce-návrhové-vzory)
  - [21. Lekce: Q\&A a diskuze o potenciálu Javy a pracovním trhu](#21-lekce-qa-a-diskuze-o-potenciálu-javy-a-pracovním-trhu)


## 1. Lekce: Úvod a instalace Javy

**Cíle:**
- Nainstalovat JDK (Java Development Kit) a IntelliJ IDEA.
- Seznámit se se základy Javy a prostředím pro vývoj.

**Výstupy:**
- Budeš umět nainstalovat JDK a IntelliJ IDEA na svůj systém, spustit program "Hello World" a popsat základní principy Javy.
- [Lekce 1 Hello World](/Lekce/Lekce1/HelloWorld/README.md)
---

## 2. Lekce: Základy Gitu

**Témata:**
- Základní příkazy Gitu.
- Práce s GitHubem a Maven.

**Výstupy:**
- Znalost základů Gitu a jeho příkazů.
- Přístup na GitHub a schopnost s ním pracovat.
- Commits are now signed
- Základní porozumění Apache Maven.
- [Lekce 2 Repository](/Lekce/Lekce2/HelloGit/README.md)
**Notes:**
- [GIT konfigurace](./Notes/Git.md)
- [Generate gitignore](https://www.toptal.com/developers/gitignore)

**Úkoly**
- Udělat z HelloWorld git repozitář a nahrát na GitHub.
- *Bonus:* Nastudovat si z dokumentace .gitignore a nastavit gitignore pro Java projekt.
---

## 3. Lekce: Primitivní datové typy

**Témata:**
- Datové typy v Javě.
- Práce s celočíselnými a desetinnými datovými typy, `char` a `String`.

**Výstupy:**
- Budeš rozumět primitivním datovým typům v Javě a umět je používat v různých situacích.
- [Lekce 3 Repository](/Lekce/Lekce3/Operands/README.md)
---

## 4. Lekce: Operátory a podmínky

**Témata:**
- Logické operátory, podmínky (`if-else`).
- Bitové operátory a zkrácené vyhodnocování.

**Výstupy:**
- Umíš použít logické operátory, rozeznáš rozdíl mezi porovnáváním a přiřazením, a ovládáš bitové operace.
- [Lekce 4 Repository](/Lekce/Lekce4/BMICalculator/README.md)

**Úkoly:**
- Naprogramujte BMI kalkulačku.
- Jelikož zatím neumíme načítat hodnoty zadávané uživatelem, nadefinujte v programu proměnné pro váhu a výšku a otestujte s různými hodnotami.
- Proveďte výpočet BMI podle vzorce z [wikipedie](https://cs.wikipedia.org/wiki/Index_t%C4%9Blesn%C3%A9_hmotnosti)

---

## 5. Lekce: Metody a organizace kódu

**Témata:**
- Rozdělení kódu do metod.
- Princip DRY (Don't Repeat Yourself).
- Praktické cvičení: Implementace Fibonacciho posloupnosti.

**Výstupy:**
- Umíš efektivně organizovat kód do metod a řešit problém krok za krokem. Naučíš se také hledat duplicity a přesouvat je do metod.
- [Lekce 5 Repository](/Lekce/Lekce5/Methods/README.md)

**Úkoly:**
- Naprogramujte metody na vypočet obsahu a obvodu
- S pomoci rekurzivní metody naprogramujte metodu na výpočet Fibonacciho posloupnosti.
- *Bonus:* S pomocí dokumentace Java API a Google si najděte jak použít konstantu PI ktera se nachazi ve standartní kniovně v Javě. Hledejte třídu Math. https://docs.oracle.com/en/java/javase/17/docs/api/

---

## 6. Lekce: Řízení toku programu

**Témata:**
- Smyčky: `for`, `for-each`, `while`, `do-while`.
- Switch-case (bonusový materiál).

**Výstupy:**
- Umíš používat různé smyčky a máš přehled o jejich aplikacích.

---

## 7. Lekce: Úvod do polí (Arrays)

**Témata:**
- Teorie polí: co to je pole, jak se používá.
- Deklarace, inicializace a práce s poli.
  
**Výstupy:**
- Umíš deklarovat pole a pracovat s ním, znáš různé způsoby inicializace.

**Praktické cvičení:** 
- Najdi nejmenší a největší prvek v poli, spočítej průměr a medián, implementuj binární hledání.

---

## 8. Lekce: OOP – objekty a struktura

**Témata:**
- Vytváření tříd, objekty.
- Konstruktor, getter, setter.

**Výstupy:**
- Umíš vytvářet objekty, pracovat s konstruktorami a metodami, a chápeš základní principy objektově orientovaného programování.

---

## 9. Lekce: OOP – dědičnost

**Témata:**
- Přístupové modifikátory, dědičnost, přetížení a přepsání metod.

**Výstupy:**
- Umíš používat dědičnost v Javě, rozpoznat a aplikovat přetížení a přepsání metod.

---

## 10. Lekce: Polymorfismus a zapouzdření v OOP

**Témata:**
- Rozhraní (interface), abstraktní třídy, zapouzdření.
- Dědění vs. kompozice.

**Výstupy:**
- Umíš používat rozhraní a abstraktní třídy, rozumíš zapouzdření a víš, kdy použít dědičnost a kdy kompozici.

---

## 11. Lekce: Kolekce v Javě – List, Map, Set

**Témata:**
- Základní kolekce v Javě: `List`, `Set`, `Map`.
- Použití `ArrayList`, `HashSet`, `HashMap`.

**Výstupy:**
- Umíš pracovat se základními kolekcemi a víš, jak je použít v různých scénářích.

---

## 12. Lekce: Co jsou generika

**Témata:**
- Definování a používání generik v Javě.

**Výstupy:**
- Rozumíš generikám v Javě, umíš je použít v kolekcích a vytvořit vlastní generické třídy.

---

## 13. Lekce: Live Coding – opakování a QA session

**Témata:**
- Opakování: pole, kolekce, třídy.
- Live coding, řešení algoritmických úloh.

**Výstupy:**
- Procvičování kódování v reálném čase a ladění chyb, testování a QA.

---

## 14. Lekce: Výjimky

**Témata:**
- Výjimky: teorie, stack trace, `try-catch` bloky, vytváření vlastních výjimek.

**Výstupy:**
- Rozumíš výjimkám a umíš je efektivně zachytávat a spravovat v kódu.

---

## 15. Lekce: Stream API a kolekce v Javě

**Témata:**
- Stream API: filtrování, mapování, sbírání.

**Výstupy:**
- Umíš používat Stream API pro efektivní práci s kolekcemi.

---

## 16. Lekce: Funkcionální rozhraní v Javě

**Témata:**
- Lambda výrazy a funkcionální rozhraní: `Consumer`, `Predicate`, `Supplier`.

**Výstupy:**
- Umíš psát lambda výrazy a používat funkcionální rozhraní pro elegantní řešení problémů.

---

## 17. Lekce: Vstupně výstupní operace v Javě

**Témata:**
- Práce se soubory: `Stream`, `Reader`, `Writer`, roury (pipe).

**Výstupy:**
- Umíš číst a zapisovat do souborů a zpracovávat výjimky při IO operacích.

---

## 18. Lekce: Concurrency – Vlákna a multivláknové programování

**Témata:**
- Vlákna (`Thread`), synchronizace, problémy s vlákny.

**Výstupy:**
- Rozumíš multivláknovému programování a umíš řešit problémy spojené s vlákny.

---

## 19. Lekce: Unitní psaní testů v Javě

**Témata:**
- Testování v Javě: JUnit, Mockito, AssertJ.

**Výstupy:**
- Umíš psát unit testy a používat testovací frameworky pro testování kódu.

---

## 20. Lekce: Návrhové vzory

**Témata:**
- Základní návrhové vzory: Singleton, Builder, Strategy, Observer.

**Výstupy:**
- Znáš běžně používané návrhové vzory a umíš je implementovat.

---

## 21. Lekce: Q&A a diskuze o potenciálu Javy a pracovním trhu

**Témata:**
- Otázky a odpovědi, diskuze o kariérních příležitostech pro Java vývojáře.

**Výstupy:**
- Máš jasnou představu o pracovních příležitostech a o tom, jak uplatnit dovednosti, které jsi v kurzu získal.

---

Tento kurz je skvělý způsob, jak se naučit programovat v Javě a připravit se na pracovní trh jako Java vývojář!
