
public class Person {
    final String name; // имя
    final String surname; // фамилия
    final Gender gender; // пол

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + " " + surname + ", " + gender;
    }
}
