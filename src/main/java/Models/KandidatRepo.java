package Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KandidatRepo {
    List<Kandidat> kandidats = new ArrayList<>();
    Map<Integer, Kandidat> kandidatList = new HashMap<>();

    public void addKandidat(Kandidat kandidat){
        kandidats.add(kandidat);
        kandidatList.put(kandidat.getYearsOld(), kandidat);
    }

    public Kandidat getByID(int id){
        return kandidatList.get(id);
    }

    public List<Kandidat> showKandidat(){
        for (Kandidat kandidat : kandidats){
            System.out.println(kandidat);
        }
        return kandidats;
    }

    public void removeKandidat(int id){
        kandidats.remove(kandidatList.get(id));
        kandidatList.remove(id);
    }
}
