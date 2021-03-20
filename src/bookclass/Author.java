package bookclass;

public class Author {
    private String name;
    private String email = "no";
    private char gender;

    public Author(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
