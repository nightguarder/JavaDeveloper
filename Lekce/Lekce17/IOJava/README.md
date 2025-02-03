## Lekce 17 - Input Output Stream
- Neplést s java.util.Stream *viz Lekce 15 Stream API*
- Abstrakce nad IO operacemi
- Můžeme si to představit jako řeku bajtů, znaků, objektů, …
- IO Stream ovítáme, nejčastěji pomocí konstruktoru daného streamu.
- IO Stream je NUTNÉ vždy zavřít.

## Rozdělení
**Bytové - Soubory atd.**
- Základní jednotka je byte, případně byte[]
- Pozor na Kódování u obou metod! read() a write()
1. [Reader](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Reader.html)
    - Pro čtení souboru
    - Nejcasteji *FileInputStream*
    - int read(byte[] b) // vrací -1 pokud je konec souboru
    - FileReader - čtení ze souboru
    - CharArrayReader  - čtení z pole
        - Vhodné na automatizované testování

2. [Writer](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Writer.html)
    - Pro zapisování do souboru
    - Nejcasteji *FileOutputStream*
        - void write(byte[] b)
        - void write(int b)
    - FileWriter - zápis do souboru
    - CharArrayWriter  - čtení z pole
        - Vhodné na automatizované testování
- byte[] MAX_BUFFER_SIZE = new byte[1024];
    - pojmenovávat VELKÝMI_PÍSMENY dle java code standard
**Znakové - Console atd.**
- Základní jednotka je byte, případně byte[]
1. InputStream
2. OutputStream

## Základy Kódování
### ASCII
- První z takzvaných tabulek která přiřazuje určité hodnotě byte daný znak.
    - Pouze prvních 127 znaků. 0x00 - 0x7F
- ![Původní ASCII tabulka](/src/ASCII_code_chart.png)
- Později rozšířena o další znaky, ale primárně nahrazena UTF-8

### UTF-8
- Často ukládaná pomocí kódování UTF-8 s variabilní délkou pro každý znak.
- **Backwards compatibility:** A UTF-8 file that contains only ASCII characters is identical to an ASCII file.
- There is a simple rule of thumb on what Unicode Transformation Form (UTF) to use: - utf-8 for storage and comunication - utf-16 for data processing - you might go with utf-32 if most of the platform API you use is utf-32 (common in the UNIX world). - [Answer](https://softwareengineering.stackexchange.com/questions/102205/should-utf-16-be-considered-harmful?noredirect=1&lq=1#answer-102213)

## IO Filters
- Retězení streamu

- **BufferReader/BufferedInputStream**
    - Přidává buffer a tak zvyšuje rychlost čtení.
- **InpuStreamReader**
    - kombinuje Reader a BufferedInputStream
    - Z InputStream dokáže udělat Reader
    - zároveň umožňuje použit vlastní (správné) kódování
- **BufferedReader**
    - Přidává buffer pro rychlejší čtení
    - *.readLine* - Umožňuje číst po řádcích. (výhoda pro textové soubory)

## Try-with-resources - praxe
- Java ovladač pro RocksDB.
Java slouží pouze jako wrapper nad C++ objekty s manuálně alokovanou pamětí.
- try (InputStream in = new FileInputStream("data.txt")) {}

## Java.IO - nio
- New IO, Non-blockin IO
Rozšíření Java 1.4 plus s každou novou verzí Javy přidáno něco navíc.
Zavádí nové pojmy jako Channel, Buffer, Selector do Javy
