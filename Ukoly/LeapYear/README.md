## Lekce 4 - Úkol
### Výpočet přestupného roku
- [x] Done
- Naprogramujte jednoduchý program, který na konzoli vypíše zdali je rok přestupný.
- Můžete zanedbat iregularitu jako rok 2000

- *Bonus:* zkuste upravit program tak aby vypsal správne informace i pro roky 2000, 1900, 1800. Pro přesnější výpočet použijte definici z [Wikipedie](https://cs.wikipedia.org/wiki/Přestupný_rok) pro výpočet..

- Bonusová část nemá na finalní hodnocení vliv. Je pouze pro vás, aby Vám protáhla vaše mozkové závity.A nebojte, nebude o taženém štrůdlu.

### Version 1
- [První pokus](../LeapYear/src/LeapYear.java)
### Version 2
- [Lepší verze](../LeapYear/src/LYImproved.java)
### Pseudocode
- The pseudocode of this algorithm sould be like this:
```Java
procedure leap_year(year)
   
   IF year%4 = 0 AND year%100 != 0 OR year%400 = 0
      PRINT year is leap
   ELSE
      PRINT year is not leap
   END IF

end procedure
```