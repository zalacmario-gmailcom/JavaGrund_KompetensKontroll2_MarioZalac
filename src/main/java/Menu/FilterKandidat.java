package Menu;

import Filter.BranchFilter;
import Models.Kandidat;
import Models.KandidatRepo;

import java.util.List;
import java.util.Scanner;

public class FilterKandidat implements Entry {
    private final KandidatRepo kandidatRepo;
    private final BranchFilter branchFilter;

    public FilterKandidat(KandidatRepo kandidatRepo, BranchFilter branchFilter) {
        this.kandidatRepo = kandidatRepo;
        this.branchFilter = branchFilter;
    }

    @Override
    public String description() {
        return "Filter candidates";
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv yrke:");
        String branch = scanner.nextLine();

        List<Kandidat> filtered = branchFilter.filter(branch);
        if(filtered.isEmpty()){
            System.out.println("Inga kandidater hittades inom " + branch);
        }else{
            System.out.println("Kandidater inom " + branch + ":");
            filtered.forEach(System.out::println);
        }
    }
}
