public class Actor extends Person {
    public int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Actor " + "name = " + name + ", surname = " + surname + ", height = (" + height + ") см";
    }
}