import java.util.Objects;

public class Actor extends Person {
    protected int height; // рост

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Актёр: " + super.toString() + " [" + height + " см.]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return height == actor.height;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name) * 11 + Objects.hashCode(surname) * 13 + Objects.hashCode(height) * 31;
    }
}
