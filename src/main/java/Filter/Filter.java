package Filter;

import Models.Kandidat;
import java.util.List;

/*AI hjälp*/
public interface Filter <T>{
    List<Kandidat> filter(T parameter);

    List<Kandidat> filter(int yearsExperience);
}
