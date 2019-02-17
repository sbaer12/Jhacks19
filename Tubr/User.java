import java.util.*;

abstract class User {

    private String name;
    private String email;
    private String phone;
    private ArrayList<String> classes;
    private float rating;

    /*
    sets all fields as blank until pulled from the sql database or added by user
     */
    public User() {
        name = "";
        email = "";
        phone = "";
        classes = new ArrayList<String>();
        rating = 0;
    }

    /*
    loads user name for the session
     */
    public void addName(String nameIn) {
        name = nameIn;
    }

    /*
    loads user email for the session
     */
    public void addEmail (String emailIn) {
        email = emailIn;
    }

    /*
    loads user phone number for the session
     */
    public void addPhone(String phoneIn) {
       phone = phoneIn;
    }

    /*
    load the classes for the session
     */
    public void addClass(String classIn) {
        classes.add(classIn);
    }

    /*
    load the users hidden rating for the session
     */
    public void addRating (Float ratingIn) { rating = ratingIn; }

    //getters

    /*
    get the name
     */
    public String getName() {
        return this.name;
    }

    /*
    get the email
     */
    public String getEmail() {
        return this.email;
    }

    /*
    get the phone number
     */
    public String getNumber() {
        return this.phone;
    }

    /*
    get the classes tutoring
     */
    public ArrayList<String> getClasses() {
        return this.classes;
    }

    /*
    get the rating of that user
     */
    public Float getRating() {
        return this.rating;
    }

}
