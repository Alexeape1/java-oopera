 import java.util.Objects;
class Actor extends Person {
    private final int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.gender = gender;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Actor " + "name = " + getName() + ", surname = " + getSurname() + " (" + height + ")";
    }
     @Override
     public boolean equals(Object obj) {
         if (this == obj) {
             return true;
         }
         if (obj == null || getClass() != obj.getClass()) {
             return false;
         }
         Actor actor = (Actor) obj;
         return Objects.equals(getName(), actor.getName()) && Objects.equals(getSurname(), actor.getSurname());
     }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname());
    }
}