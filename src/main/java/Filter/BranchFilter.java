package Filter;

import Models.Kandidat;
import Models.KandidatRepo;
import Exception.FilteredKandidatNotFound;

import java.util.List;

public class BranchFilter implements Filter<String> {
    private final KandidatRepo kandidatRepo;

    public BranchFilter(KandidatRepo kandidatRepo) {
        this.kandidatRepo = kandidatRepo;
    }

    @Override
    public List<Kandidat> filter(int yearsExperience) {
        return List.of();
    }

    @Override
    public List<Kandidat> filter(String branch) {
        List<Kandidat> filtered = kandidatRepo.getAllKandidater()
                .stream()
                .filter(k -> k.getBranch().equalsIgnoreCase(branch))
                .toList();

        if (filtered.isEmpty()) {
            throw new FilteredKandidatNotFound("Inmatade yrke hittas inte");
        }
        return filtered;
    }
}
