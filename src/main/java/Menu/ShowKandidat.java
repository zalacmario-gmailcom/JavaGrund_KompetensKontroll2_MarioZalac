package Menu;

import Models.KandidatRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShowKandidat implements Entry {
    private KandidatRepo kandidatRepo;
    private Logger logger = LoggerFactory.getLogger(ShowKandidat.class);


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
        if(kandidatRepo.kandidatList.isEmpty()){
            logger.info("Inga kandidater att visa");
        }
    }
}
