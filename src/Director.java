public class Director extends Person {

    public int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.numberOfShows = numberOfShows;
    }

    public void printDirectorInfo() {
        System.out.println(name + " " + surname);
    }
}