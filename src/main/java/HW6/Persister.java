package HW6;

public class Persister implements Save {
    private User user;

    public Persister(User user){
        this.user = user;
    }

    public void save(){
        System.out.println("HW6_1.Save user: " + user.getName());
    }
}
