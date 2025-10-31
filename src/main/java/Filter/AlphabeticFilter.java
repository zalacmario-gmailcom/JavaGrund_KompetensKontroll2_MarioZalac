package Filter;

import Models.Kandidat;
import Models.KandidatRepo;

import java.util.List;

public class AlphabeticFilter implements Filter <String> {
    private final KandidatRepo kandidatRepo;

    public AlphabeticFilter(KandidatRepo kandidatRepo) {
        this.kandidatRepo = kandidatRepo;
    }

    @Override
    public List<Kandidat> filter(int yearsExperience) {
        return List.of();
    }

    @Override
    public List<Kandidat> filter(String name) {
        return kandidatRepo.getAllKandidater()
                .stream()
                .sorted((k1,k2) -> k1.getName().compareTo(k2.getName()))
                .toList();
    }
}
