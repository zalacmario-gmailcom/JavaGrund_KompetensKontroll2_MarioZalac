package Menu;

import Models.Kandidat;
import Models.KandidatFact;
import Models.KandidatRepo;

import java.util.Scanner;

public class AddKandidat implements Entry {
    private KandidatRepo kandidatRepo;
    private KandidatFact kandidatFact;

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

        System.out.println("Skriv namn: ");
        String name = scanner.nextLine();

        System.out.println("Skriv ålder: ");
        int yearsOld = Integer.parseInt(scanner.nextLine());

        System.out.println("Skriv yrke:");
        String branch = scanner.nextLine();

        System.out.println("Skriv antal år erfarenhet: ");
        int yearsExperience = Integer.parseInt(scanner.nextLine());

        Kandidat newKandidat = kandidatFact.kandidatFactory(name, yearsOld, branch, yearsExperience);
        kandidatRepo.addKandidat(newKandidat);
        System.out.println("Kandidat tillagd");
    }
}
