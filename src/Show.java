import java.util.ArrayList;

public class Show {
    public String title;
    public int duration;
    public Director director;
    public ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        listOfActors = new ArrayList<>();
    }

    public void printListActors() {

        for (int i = 0; i < listOfActors.size(); i++) {
            System.out.println(listOfActors.get(i));
        }

    }

    public void addNewActor(Actor actor) {
        if (!listOfActors.contains(actor)) {
            listOfActors.add(actor);
        } else {
            System.out.println("Данный актер уже есть спектакле");
        }
    }

    public void changeActor(Actor newActor, String surNameToChange) {
        boolean actorFound = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);
            if (currentActor.surname.equals(surNameToChange)) {
                listOfActors.set(i, newActor);
                actorFound = true;
                break;
            }
        }
        if (!actorFound) {
            System.out.println("Актёр с такой фамилией не найден.");
        }
    }
}