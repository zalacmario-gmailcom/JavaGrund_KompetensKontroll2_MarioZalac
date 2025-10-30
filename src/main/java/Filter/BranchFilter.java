package Filter;

import Models.Kandidat;
import Models.KandidatRepo;
import java.util.List;
import java.util.stream.Collectors;

public class BranchFilter implements Filter <String>{
    private final KandidatRepo kandidatRepo;

    public BranchFilter(KandidatRepo kandidatRepo) {
        this.kandidatRepo = kandidatRepo;
    }

    @Override
    public List<Kandidat> filter(String branch) {
        return kandidatRepo.getAllKandidater()
                .stream()
                .filter(k -> k.getBranch().equalsIgnoreCase(branch))
                .toList();
    }
}
