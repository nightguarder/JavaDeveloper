# LEkce 18 - Úkol
- Počet bodů: 15
- Deadline: 26. 2. 2025

## Multithreading
- Vytvořte program který bude mít 2 vlákna a z jednoho vlákna bude posílat zpravy do druhého vlákna pomocí PipedReader/PipedWriter.
- **Implementační detaily:**
- Komunikujte pomocí řádkově orientovaného protokolu
- Pro čtení celých řadků můžete použít BufferedReaader.
- Čtecí vlákno musí po obdržení zprávy “konec” ukončit svůj běh
- Ostatní zprávy čtecí vlákno vypíše na konzoli.
- Při posílání zpráv nezapoměňte odeslat nový řádek. “\n”
- Počkejte až obě vlákna skončí.
- Nezapomeňte uzavřít veškeré vstupy a výstupy.
