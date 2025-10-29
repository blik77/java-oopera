import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Show {
    private String title; // название
    private int duration; // длительность в минутах
    private Director director; // режиссёр
    private ArrayList<Actor> listOfActors; // список актёров

    static Scanner scanner;

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
        ArrayList<Actor> removeList = new ArrayList<>();
        for(Actor actor : listOfActors) {
            if (actor.getSurname().equals(surname)) {
                removeList.add(actor);
            }
        }
        if(removeList.isEmpty()) {
            System.out.println("Актер с фамилией '" + surname + "' отсутствует в составе спектакля.");
        } else if(removeList.size() == 1) {
            listOfActors.remove(removeList.getFirst());
            listOfActors.add(replacement);
        } else {
            scanner = new Scanner(System.in);
            System.out.println("Актеров с фамилией '" + surname + "' в спектакле " + removeList.size() + " человек.");
            while(true) {
                printMenuMultipleReplaceActor();
                String command = scanner.nextLine().trim();

                switch (command) {
                    case "1":
                        for(Actor removeActor : removeList) {
                            listOfActors.remove(removeActor);
                        }
                        listOfActors.add(replacement);
                        return;
                    case "2":
                        for(int i = 0; i < removeList.size(); i ++) {
                            System.out.println((i + 1) + " - " + removeList.get(i));
                        }
                        System.out.println("Введите разделяя пробелами номера актеров, которых требуется заменить");
                        // TODO !!!проверку на правильность введенных данных не делаю сознательно!!!
                        String manualRemove = scanner.nextLine().trim();
                        ArrayList<String> manualRemoveArray = new ArrayList<>(
                                Arrays.asList(manualRemove.split(" ")));
                        for(String number : manualRemoveArray) {
                            listOfActors.remove(removeList.get(Integer.parseInt(number) - 1));
                        }
                        listOfActors.add(replacement);
                        return;
                    case "3":
                        return;
                    default:
                        System.out.println("Такой команды нет.");
                }
            }
        }
    }

    private void printMenuMultipleReplaceActor() {
        System.out.println("Выберите команду:");
        System.out.println("1 - замена всех актеров");
        System.out.println("2 - выбрать актеров для замены");
        System.out.println("3 - отменить замену");
    }
}
