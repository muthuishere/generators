package graphql.tutorial.eshop.users;

public class User {



    public User() {

    }

    public User(String username, String password,String role) {
        super();
        this.password = password;
        this.username = username;
        this.role =role;

    }


    private String username;


    private String password;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    private String role;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
