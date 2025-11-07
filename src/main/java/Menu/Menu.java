package Menu;

import Filter.AlphabeticFilter;
import Filter.BranchFilter;
import Filter.ExperienceFilter;
import Models.KandidatFact;
import Models.KandidatRepo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    private final Map<String, Entry> menuDescription = new HashMap<>();
    private final KandidatRepo kandidatRepo;
    private final KandidatFact kandidatFact;
    private final AddKandidat addKandidat;
    private final RemoveKandidat removeKandidat;
    private final ShowKandidat showKandidat;
    private final FilterKandidat filterKandidat;
    private final BranchFilter branchFilter;
    private final ExperienceFilter experienceFilter;
    private final AlphabeticFilter alphabeticFilter;
    private final ExitMenu exitMenu;

    public Menu() {
        this.kandidatRepo = new KandidatRepo();
        this.kandidatFact = new KandidatFact();
        this.addKandidat = new AddKandidat(kandidatRepo, kandidatFact);
        this.removeKandidat = new RemoveKandidat(kandidatRepo);
        this.showKandidat = new ShowKandidat(kandidatRepo);
        this.branchFilter = new BranchFilter(kandidatRepo);
        this.experienceFilter = new ExperienceFilter(kandidatRepo);
        this.alphabeticFilter = new AlphabeticFilter(kandidatRepo);
        this.filterKandidat = new FilterKandidat(branchFilter, experienceFilter, alphabeticFilter);
        this.exitMenu = new ExitMenu();

        menuDescription.put("1", addKandidat);
        menuDescription.put("2", removeKandidat);
        menuDescription.put("3", showKandidat);
        menuDescription.put("4", filterKandidat);
        menuDescription.put("0", exitMenu);
    }

    public void showMenu() {
        while (true) {
            menuDescription.forEach((key, value) ->
                    System.out.println(key + ": " + value.description()));

            Scanner scanner = new Scanner(System.in);
            String chooise = scanner.nextLine();

            switch (chooise) {
                case "1" -> addKandidat.execute();
                case "2" -> removeKandidat.execute();
                case "3" -> showKandidat.execute();
                case "4" -> filterKandidat.execute();
                case "0" -> exitMenu.execute();
                default -> System.out.println("Ogiltigt val. Försök igen.");
            }
        }
    }
}
