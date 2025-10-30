package Menu;

import Models.KandidatRepo;

import java.util.Scanner;

public class RemoveKandidat implements Entry {
    private final KandidatRepo kandidatRepo;

    public RemoveKandidat(KandidatRepo kandidatRepo) {
        this.kandidatRepo = kandidatRepo;
    }

    @Override
    public String description() {
        return "Remove a candidate";
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv namn:");
        String name = scanner.nextLine();

        kandidatRepo.removeKandidat(name);
        System.out.println("Kandidat borttagen");
    }
}
