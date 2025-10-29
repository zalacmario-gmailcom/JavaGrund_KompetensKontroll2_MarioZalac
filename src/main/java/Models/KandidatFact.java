package Models;

public class KandidatFact {
    public Kandidat kandidatFactory(String name, int yearsOld, String branch, int yearsExperience){
        return new Kandidat(name, yearsOld, branch, yearsExperience);
    }
}
