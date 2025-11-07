package Filter;

import Models.Kandidat;
import Models.KandidatRepo;
import Exception.FilteredKandidatNotFound;

import java.util.List;

public class ExperienceFilter implements Filter<Integer> {
    private final KandidatRepo kandidatRepo;

    public ExperienceFilter(KandidatRepo kandidatRepo) {
        this.kandidatRepo = kandidatRepo;
    }

    @Override
    public List<Kandidat> filter(Integer parameter) {
        return List.of();
    }

    @Override
    public List<Kandidat> filter(int yearsExperience) {
        List<Kandidat> filtered = kandidatRepo.getAllKandidater()
                .stream()
                .filter(k -> k.getYearsExperience() == yearsExperience)
                .toList();

        if (filtered.isEmpty()) {
            throw new FilteredKandidatNotFound("Inmatade år av erfaranhet hittas inte");
        }
        return filtered;
    }
}
