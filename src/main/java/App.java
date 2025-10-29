/*
    Din beställare är ett rekryteringsföretag. De specialiserar i att matcha ihop företag med
privatpersoner som passar deras profil. Just nu har rekryteringsföretaget bett dig att skapa
en applikation för att hantera dessa kandidater. De vill kunna lagra dessa kandidater på ett
effektivt sätt och enkelt kunna hitta kandidater som matchar vissa filtreringar.
    Rekryterare vill ha en meny som kan: lägga till nya kandidater, ta bort kandidater, visa upp
kandidater och kunna filtrera och exempelvis endast hitta kandidater som har x-antal år
erfarenhet. Kandidaterna ska ha information så som: namn, ålder, bransch, antal år
yrkeserfarenhet.
    Utöver funktionalitet så vill beställaren att projektet ska ha tester och ha möjlighet att
expandera i framtiden.

För Godkänt (G) ska studenten:
    • Visa att Stream API och lambdauttryck används för sortering, filtrering och transformation.
    • Visa förståelse för och implementera SOLID-principerna i sin kod (grundläggande nivå, endast krav på Single
    Responsibility och Open/Closed Principle).
    • Implementera loggning med SLF4J.
    • Visa på grundläggande användning av prompt-engineering genom att dokumentera en prompt och dess resultat.
    • Skapa fungerande JUnit-tester med mock-objekt som testar centrala delar av programmet.
*/

import Menu.Menu;

public class App {
    public static void main(String[] args) {
       Menu menu = new Menu();
       menu.showMenu();
    }
}