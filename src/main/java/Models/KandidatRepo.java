package Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KandidatRepo {
    List<Kandidat> kandidats = new ArrayList<>();
    Map<String, Kandidat> kandidatList = new HashMap<>();

    public void addKandidat(Kandidat kandidat){
        kandidats.add(kandidat);
        kandidatList.put(kandidat.getName(), kandidat);
    }

    public List<Kandidat> showKandidat(){
        for (Kandidat kandidat : kandidats){
            System.out.println(kandidat);
        }
        return kandidats;
    }

    public void removeKandidat(String name){
        kandidats.remove(kandidatList.get(name));
        kandidatList.remove(name);
    }

    public List<Kandidat> getAllKandidater(){
        return kandidats;
    }

    public KandidatRepo(){
        addKandidat(new Kandidat("Anna Andersson", 28, "IT", 5));
        addKandidat(new Kandidat("Erik Berg", 32, "Ekonomi", 8));
        addKandidat(new Kandidat("Maria Carlsson", 25, "IT", 3));
        addKandidat(new Kandidat("Johan Dahl", 35, "HR", 10));
        addKandidat(new Kandidat("Lisa Eriksson", 29, "Marknadsföring", 6));
        addKandidat(new Kandidat("Anders Fredriksson", 31, "IT", 7));
        addKandidat(new Kandidat("Sofia Gran", 27, "Ekonomi", 4));
        addKandidat(new Kandidat("Mikael Holm", 33, "HR", 9));
        addKandidat(new Kandidat("Emma Johansson", 26, "Marknadsföring", 3));
        addKandidat(new Kandidat("Peter Karlsson", 30, "IT", 6));
    }
}
