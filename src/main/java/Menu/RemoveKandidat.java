package Menu;

import Models.KandidatRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class RemoveKandidat implements Entry {
    private final KandidatRepo kandidatRepo;
    Logger logger = LoggerFactory.getLogger(RemoveKandidat.class);

    public RemoveKandidat(KandidatRepo kandidatRepo) {
        this.kandidatRepo = kandidatRepo;
    }

    @Override
    public String description() {
        return "Ta bort kandidat";
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv namn:");
        String name = scanner.nextLine();

        if (!kandidatRepo.kandidatList.containsKey(name)) {
            logger.info("Kandidat finns inte");
        } else {
            kandidatRepo.removeKandidat(name);
            System.out.println("Kandidat borttagen");
        }
    }
}
