package Menu;

import Models.Kandidat;
import Models.KandidatFact;
import Models.KandidatRepo;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class MenuTest {

    @Test
    public void testAddKandidat_WhenValidInput_ThenAddKandidat() {
        // Arrange
        KandidatRepo kandidatRepo = new KandidatRepo();

        // Act
        Kandidat kandidat = new Kandidat("Mario", 22, "Programmerare", 2);
        kandidatRepo.addKandidat(kandidat);

        // Assert
        assertEquals("Mario", kandidatRepo.kandidatList.get("Mario").getName());
    }

    @Test
    public void testShowKandidat_WhenValidInput_ThenShowKandidat() {
        // Arrange
        KandidatRepo kandidatRepo = new KandidatRepo();

        // Act
        Kandidat kandidat = new Kandidat("Mario", 22, "Programmerare", 2);
        kandidatRepo.addKandidat(kandidat);

        // Assert
        assertEquals("Mario", kandidatRepo.kandidatList.get("Mario").getName());
    }
}