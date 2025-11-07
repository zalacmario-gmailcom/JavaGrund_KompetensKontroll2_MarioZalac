package Menu;

import Models.Kandidat;
import Models.KandidatFact;
import Models.KandidatRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class AddKandidat implements Entry {
    private KandidatRepo kandidatRepo;
    private KandidatFact kandidatFact;
    private Logger logger = LoggerFactory.getLogger(AddKandidat.class);

    public AddKandidat(KandidatRepo kandidatRepo, KandidatFact kandidatFact) {
        this.kandidatRepo = kandidatRepo;
        this.kandidatFact = kandidatFact;
    }

    @Override
    public String description() {
        return "Lägg till kandidat";
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Skriv namn: ");
            String name = scanner.nextLine();

            System.out.println("Skriv ålder: ");
            int yearsOld = Integer.parseInt(scanner.nextLine());
            if (yearsOld < 0) {
                throw new IllegalArgumentException();
            }

            System.out.println("Skriv yrke:");
            String branch = scanner.nextLine();

            System.out.println("Skriv antal år erfarenhet: ");
            int yearsExperience = Integer.parseInt(scanner.nextLine());
            if (yearsExperience < 0) {
                throw new IllegalArgumentException();
            }

            if (name.isEmpty() || yearsOld < 0 || branch.isEmpty() || yearsExperience < 0) {
                throw new IllegalArgumentException();
            }
            Kandidat newKandidat = kandidatFact.kandidatFactory(name, yearsOld, branch, yearsExperience);
            kandidatRepo.addKandidat(newKandidat);
            System.out.println("Kandidat tillagd");

        } catch (NumberFormatException e) {
            logger.error("Ålder och erfarenhet måste vara ett nummer");
        } catch (IllegalArgumentException e) {
            logger.warn("Va vänlig och fyll i alla värde");
        }
    }
}
