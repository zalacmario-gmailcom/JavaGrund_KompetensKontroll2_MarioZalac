package Filter;

import Models.Kandidat;
import Models.KandidatRepo;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterTest {
    @Test
    public void testBranchFilter_WhenITFiltered_ReturnsITKandidat() {
        // Arrange
        KandidatRepo kandidatRepo = new KandidatRepo();
        BranchFilter branchFilter = new BranchFilter(kandidatRepo);

        // Act
        branchFilter.filter("IT");

        // Assert
        assertEquals(4, branchFilter.filter("IT").size());
    }

    @Test
    public void testExperienceFilter_WhenExperienceFiltered_ReturnsExperienceKandidat() {
        // Arrange
        KandidatRepo kandidatRepo = new KandidatRepo();
        ExperienceFilter experienceFilter = new ExperienceFilter(kandidatRepo);

        // Act
        kandidatRepo.addKandidat(new Kandidat("Mario", 22, "Programmerare", 2));
        experienceFilter.filter(2);

        // Assert
        assertEquals(1, experienceFilter.filter(2).size());
    }

    @Test
    public void testAlphabeticFilter_WhenFiltered_ReturnsAlphabeticallySortedList() {
        // Arrange
        KandidatRepo kandidatRepo = new KandidatRepo();
        AlphabeticFilter alphabeticFilter = new AlphabeticFilter(kandidatRepo);

        // Act
        List<Kandidat> sortedKandidater = alphabeticFilter.filter("");

        // Assert
        assertEquals("Anders", sortedKandidater.get(0).getName());
    }
}

