package Menu;

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
    private final ShowKandidat showKandidat;

    public Menu() {
        this.kandidatRepo = new KandidatRepo();
        this.kandidatFact = new KandidatFact();
        this.addKandidat = new AddKandidat(kandidatRepo, kandidatFact);
        this.showKandidat = new ShowKandidat(kandidatRepo);

        menuDescription.put("1", new AddKandidat(kandidatRepo, kandidatFact));
        menuDescription.put("2", new ShowKandidat(kandidatRepo));
    }

    public void showMenu() {
        while (true){

            menuDescription.forEach((key, value) ->
                    System.out.println(key + ": " + value.description()));

            Scanner scanner = new Scanner(System.in);
            String chooise = scanner.nextLine();

            switch (chooise){
                case "1" -> addKandidat.execute();
                case "2" -> showKandidat.execute();
                case "0" -> scanner.close();
                default -> System.out.println("Ogiltigt val. Försök igen.");
            }
        }
    }
}
