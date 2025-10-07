public class Theatre {
    public static void main(String[] args) {
        Actor actor = new Actor("Алексей", "Шибко", Gender.MALE, 194);
        Actor actorTwo = new Actor("Дарья", "Казакова", Gender.FEMALE, 169);
        Actor actorThree = new Actor("Артур", "Пилипенко", Gender.MALE, 171);
        Director director = new Director("Денис", "Белоусов", Gender.MALE, 4);
        Director directorTwo = new Director("Валентина", "Кардаш", Gender.FEMALE, 3);
        MusicalShow show = new MusicalShow("Ромео и Джульетта", 145, director,
                "Говард Шор", "Либретто спектакль");
        MusicalShow operaShow = new Ballet("Опера", 120, director, "Скорсезе",
                "Текст либретто балета", "Тимберлейк");
        MusicalShow balletShow = new Opera("Гарри Поттер", 150, directorTwo, "Ханс Циммер",
                "Текст либретто оперы", 15);

        operaShow.addNewActor(actor);
        operaShow.addNewActor(actorTwo);
        balletShow.addNewActor(actorThree);
        balletShow.addNewActor(actor);
        show.addNewActor(actorTwo);
        show.addNewActor(actorThree);

        System.out.println("Актёры спектакля:");
        for (Actor actors : show.listOfActors) {
            System.out.println(actors);
        }

        System.out.println("\nАктёры оперы:");
        for (Actor actors : operaShow.listOfActors) {
            System.out.println(actors);
        }

        System.out.println("\nАктёры балета:");
        for (Actor actors : balletShow.listOfActors) {
            System.out.println(actors);
        }

        System.out.println("Меняем актера одного из спектаклей на актера из другого спектакля");

        operaShow.changeActor(actorThree, "Шибко");

        System.out.println("\nАктёры оперы после замены:");
        operaShow.printListActors();
        System.out.println("Пробуем заменить на несуществующего актера - Гершман");

        balletShow.changeActor(actor, "Гершман");

        System.out.println("Выводим текст Либретто: ");
        operaShow.printLibrettoText();
        balletShow.printLibrettoText();
    }
}