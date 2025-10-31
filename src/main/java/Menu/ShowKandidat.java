package Menu;

import Models.KandidatRepo;

public class ShowKandidat implements Entry {
    private KandidatRepo kandidatRepo;

    public ShowKandidat(KandidatRepo kandidatRepo) {
        this.kandidatRepo = kandidatRepo;
    }

    @Override
    public String description() {
        return "Visa kandidates";
    }

    @Override
    public void execute() {
        kandidatRepo.showKandidat();
    }
}
