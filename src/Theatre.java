public class Theatre {
    public static void main(String[] args) {
        Actor actor = new Actor("Алексей", "Шибко", Gender.MALE, 194);
        Actor actorTwo = new Actor("Дарья", "Казакова", Gender.FEMALE, 169);
        Actor actorThree = new Actor("Артур", "Пилипенко", Gender.MALE, 171);
        Director directorOne = new Director("Денис", "Белоусов", Gender.MALE, 4);
        Director directorTwo = new Director("Валентина", "Кардаш", Gender.FEMALE, 3);

        Person composer = new Person("Говард", "Шор", Gender.MALE);
        Person choreographer = new Person("Джастин", "Тимберлейк", Gender.MALE);
        MusicalShow show = new MusicalShow("Ромео и Джульетта", 145, directorOne,
                composer, "Либретто спектакль");
        Opera operaShow = new Opera("Опера", 120, directorOne, composer,
                "Текст либретто балета", 20);
        Ballet balletShow = new Ballet("Гарри Поттер", 150, directorTwo, composer,
                "Текст либретто оперы", choreographer);

        operaShow.addNewActor(actor);
        operaShow.addNewActor(actorTwo);
        balletShow.addNewActor(actorThree);
        balletShow.addNewActor(actor);
        show.addNewActor(actorTwo);
        show.addNewActor(actorThree);

        System.out.println("Актёры спектакля:");

        show.printListActors();

        System.out.println("\nАктёры оперы:");

        operaShow.printListActors();

        System.out.println("\nАктёры балета:");

        balletShow.printListActors();

        System.out.println("\nМеняем актера одного из спектаклей на актера из другого спектакля");
        operaShow.changeActor(actorThree, "Шибко");

        System.out.println("\nАктёры оперы после замены:");
        operaShow.printListActors();
        System.out.println("\nПробуем заменить на несуществующего актера - Гершман");

        balletShow.changeActor(actor, "Гершман");

        System.out.println("\nВыводим текст Либретто: ");
        operaShow.printLibrettoText();
        balletShow.printLibrettoText();
    }
}