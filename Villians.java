public class Villians {
    int age;
    String name;
    String Profession;
    String Origins;

    // Constructor method
    public Villians(int age, String name, String Profession, String Origins) {
        this.age = age;
        this.name = name;
        this.Profession = Profession;
        this.Origins = Origins;
    }

//Object-Oriented Programming Practice

    public static void main(String[] args) {
        Villians Dirty_Dan = new Villians(31, "Dirty Dan", "Janitor", "He used to be a clean man until one day he fell into the toilet...");
        Villians LarrytheLiar = new Villians(32, "Larry the Liar", "Lawyer", "He was the world's most successful lawyer...");
    }
}
