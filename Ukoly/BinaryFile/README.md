## Lekce 17 - Úkol
- Počet bodů: 10
- Deadline: 24. Února 2025

## Binary file
- Včera večer poštou ranní, dorazilo vám binární psaní. Vypadá to na data ze starého systemu, pravděpodobně [IBM360](https://en.wikipedia.org/wiki/IBM_System/360). Takové systémy používají instituce které tu jsou s námi už několik století. Na vás je pomocí Javy přečíst datný soubor a uložit ho ve formátu UTF-8. Nicměně výsledný soubor nesmí být přiložen do repozitáře githubu. Je tajný. Program ho musí vždy vytvořit. Originální binarní dopis samozřejmě musí být přiložen.

- Dopis bude pravděpodobně v jednom z těchto kódování : 

    - IBM861
    - Cp869
    - Cp500
    - IBM870
    - IBM284

- Kontrolní součet dopis.bin : 
```bash
SHA256 FADA5D5E2C76DED0D873D1AD987339A4A9DE57C77EC0AB740A386CFB866507BA
```

- Ověření kontrolního součtu pomoci PowerShell : 
```bash
Get-FileHash -Path .\dopis.bin
```
- Ověření kontrolního součtu v MacOS terminal : 
```zsh
shasum -a 256 dopis.bin 
```