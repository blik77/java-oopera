import java.util.ArrayList;

public class Show {
    public String title; // название
    public int duration; // длительность в минутах
    public Director director; // режиссёр
    public ArrayList<Actor> listOfActors; // список актёров

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printDirectorInfo() {
        System.out.println(director);
    }

    public void printActorsInfo() {
        System.out.println(title + " (" + duration + "мин.)");
        for(Actor actor : listOfActors) {
            System.out.println(actor);
        }
        System.out.println("\n");
    }

    public void addActor(Actor actor) {
        int index = listOfActors.indexOf(actor);
        if(index == -1) {
            listOfActors.add(actor);
        } else {
            System.out.println(actor + " уже есть в составе спектакля.");
        }
    }

    public void replaceActor(Actor replacement, String surname) {
        Actor replaceable = null;
        int index = -1;
        for(int i=0; i<listOfActors.size(); i++) {
            if(listOfActors.get(i).surname.equals(surname)) {
                replaceable = listOfActors.get(i);
                index = i;
            }
        }
        if(index == -1) {
            System.out.println("Актер с фамилией '" + surname + "' отсутствует в составе спектакля.");
        } else {
            listOfActors.set(index, replacement);
        }
    }
}
