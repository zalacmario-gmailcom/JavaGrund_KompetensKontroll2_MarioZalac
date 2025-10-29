package Models;

public class Kandidat {
    String name;
    int yearsOld;
    String branch;
    int yearsExperience;

    public Kandidat(String name, int yearsOld, String branch, int yearsExperience) {
        this.name = name;
        this.yearsOld = yearsOld;
        this.branch = branch;
        this.yearsExperience = yearsExperience;
    }

    public String getName() {
        return name;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public String getBranch() {
        return branch;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    @Override
    public String toString() {
        return "Kandidat: "
                + "[name: "
                + name + ", years old: "
                + yearsOld
                + ", branch: "
                + branch
                + ", years of experience: "
                + yearsExperience
                + "]";
    }
}
