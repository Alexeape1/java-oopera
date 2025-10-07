public class Person {
    public String name;
    public String surname;
    protected Gender gender;

    Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }
}