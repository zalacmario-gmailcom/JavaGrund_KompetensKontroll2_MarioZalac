package Menu;

import Filter.AlphabeticFilter;
import Filter.BranchFilter;
import Filter.ExperienceFilter;
import Models.Kandidat;

import java.util.Scanner;

public class FilterKandidat implements Entry {
    private final BranchFilter branchFilter;
    private final ExperienceFilter experienceFilter;
    private final AlphabeticFilter alphabeticFilter;

    public FilterKandidat(BranchFilter branchFilter, ExperienceFilter experienceFilter, AlphabeticFilter alphabeticFilter) {
        this.branchFilter = branchFilter;
        this.experienceFilter = experienceFilter;
        this.alphabeticFilter = alphabeticFilter;
    }

    @Override
    public String description() {
        return "Filter kandidater";
    }

    @Override
    public void execute() {
        while (true){
        System.out.println("Filtrera efter:");
        System.out.println("1: Branch");
        System.out.println("2: År av erfarenhet");
        System.out.println("3: Alfabetiskt");
        System.out.println("0: Exit");

        Scanner scanner = new Scanner(System.in);
        String chooise = scanner.nextLine();

            switch (chooise){
                case "1":
                    System.out.println("Skriv yrke:");
                    String branch = scanner.nextLine();
                    branchFilter.filter(branch);
                    for (Kandidat kandidat : branchFilter.filter(branch)){
                        System.out.println(kandidat);
                    }
                    break;
                case "2":
                    System.out.println("Skriv antal år erfarenhet:");
                    int yearsExperience = Integer.parseInt(scanner.nextLine());
                    experienceFilter.filter(yearsExperience);
                    for (Kandidat kandidat : experienceFilter.filter(yearsExperience)){
                        System.out.println(kandidat);
                    }
                    break;
                case "3":
                    for (Kandidat kandidat : alphabeticFilter.filter("")){
                        System.out.println(kandidat);
                    }
                    break;
                case "0":
                    return;
                default :
                    System.out.println("Ogiltigt val. Försök igen.");
                    break;
            }
        }
    }
}
