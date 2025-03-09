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

## Creating JAR 
- If you want to share your App, compile the classes into Java *Jar* package.

#### Step 1: Create a JAR from the classes
1. Navigate to the src directory:
   ```bash
   cd src/com/cyrils/java/lekce4 
   ```
2. Compile the source files:
   ```bash
   javac -d ./outDir src/com/cyrils/java/lekce4/LYImproved.java
   ```
3. Create a JAR package:
   ```bash
   jar cvf LeapYear.jar -C ./outDir .
   ```
#### Step 2. Extract and compile the JAR in your new project
 1. Create directory in the /lib folder
   ```bash
   mkdir -p /Users/cyrils/Developer/Java/JavaDeveloper/Ukoly/Exceptions/lib
   ```
 2. copy the JAR into the directory
   ```bash
   cp package.jar /Users/cyrils/Developer/Java/JavaDeveloper/Ukoly/Exceptions/lib/
   ```
 3. Use the JAR in Your Exceptions Project
 - Compile and run CheckLeapYear.java with the JAR in the classpath:
   ```bash
   # Compile
   javac -d outDir -cp "lib/Package.jar" src/com/cyrils/java/lekce14/CheckLeapYear.java
   