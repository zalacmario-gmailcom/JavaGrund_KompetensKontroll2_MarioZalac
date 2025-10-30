package Filter;

import Models.Kandidat;
import Models.KandidatRepo;
import org.junit.jupiter.api.Test;

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
}

