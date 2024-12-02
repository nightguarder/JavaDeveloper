## Lekce 2 - GIT
- [Lekce 2 - GIT](#lekce-2---git)
- [Lesson](#lesson)
- [Úkol](#úkol)
- [Git příkazy](#git-příkazy)
- [Gitignore](#gitignore)
- [Dependency Management](#dependency-management)

## Lesson
- Správa SW projektů
- Verzování
- Proč GIT?
- Git není GitHub ale spolupracují
- Nastavení GITu (viz. konfigurace git.md)
- Základní příkazy

## Úkol
1. Nainstalovat JDK
2. Nainstalovat vyvojové prostředí
3. Nainstalovat GIT
4. Vyzkoušet hello world z první lekce.
5. Udělat z HelloWorld git repozitář a nahrát na GitHub.
6. Poslat lektorovi odkaz na github repozitář

Bonus: Nastudovat si z dokumentace .gitignore a nastavit gitignore pro Java projekt.

## Git příkazy
- gitk
- git rebase origin/<branch>
- 
## Gitignore

```
# Java
### Java ###
# Compiled class file
*.class

# Ignore VSCode
.vscode/
.env

# Ignore log files
*.log

# Ignore OS-specific files
.DS_Store
```
## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
