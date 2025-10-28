import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 172);
        Actor actor2 = new Actor("Петр", "Петров", Gender.MALE, 169);
        Actor actor3 = new Actor("Ирина", "Сидорова", Gender.FEMALE, 165);
        Actor actor4 = new Actor("Тимур", "Иванов", Gender.FEMALE, 188);
        Actor actor5 = new Actor("Геннадий", "Иванов", Gender.FEMALE, 155);

        Director director1 = new Director("Николай", "Николаев", Gender.MALE, 21);
        Director director2 = new Director("Наталья", "Савинова", Gender.FEMALE, 17);

        Person choreographer1 = new Person("Татьяна", "Круглова", Gender.FEMALE);

        MusicalShow normal1 = new MusicalShow(
                "Новогодняя ёлка",
                120,
                director1,
                new ArrayList<Actor>(),
                "Леонид Карлович Бекман",
                "Либретто обычного спектакля"
        );
        normal1.addActor(actor1);
        normal1.addActor(actor2);
        normal1.addActor(actor4);
        normal1.addActor(actor5);

        Opera opera1 = new Opera("Карамазовы",
                90,
                director2,
                new ArrayList<Actor>(),
                "Юрий Николаевич Клинских",
                "Либретто оперы",
                12);
        opera1.addActor(actor1);
        opera1.addActor(actor2);
        opera1.addActor(actor3);

        Ballet ballet1 = new Ballet("Щелкунчик",
                130,
                director2,
                new ArrayList<Actor>(),
                "Игорь Фёдорович Летов",
                "Либретто балета",
                choreographer1);
        ballet1.addActor(actor2);
        ballet1.addActor(actor3);

        normal1.printActorsInfo();
        opera1.printActorsInfo();
        ballet1.printActorsInfo();

        normal1.replaceActor(actor3, "Иванов");
        normal1.printActorsInfo();

        ballet1.replaceActor(actor1, "Хоттабыч");

        opera1.printLibretto();
        ballet1.printLibretto();
    }
}
