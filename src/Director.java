
public class Director extends Person {
    public int numberOfShows; // количество поставленных спектаклей

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Режиссёр: " + super.toString() + ", поставленных спектаклей: " + numberOfShows;
    }
}
