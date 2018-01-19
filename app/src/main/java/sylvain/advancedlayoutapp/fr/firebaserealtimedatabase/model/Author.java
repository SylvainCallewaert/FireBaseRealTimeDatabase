package sylvain.advancedlayoutapp.fr.firebaserealtimedatabase.model;

/**
 * Created by Formation on 19/01/2018.
 */

public class Author {
    private String name;
    private String firstname;
    private String nationality;

    public String getName() {
        return name;
    }

    public Author setName(String name) {
        this.name = name;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public Author setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getNationality() {
        return nationality;
    }

    public Author setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    public Author(String name, String firstname, String nationality) {

        this.name = name;
        this.firstname = firstname;
        this.nationality = nationality;
    }

    public Author() {

    }
}
