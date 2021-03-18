package strategy;

public class Person {
    //a person is identified by his name and role
    private String name;
    private Role role;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Role getRole(){
        return role;
    }

    public void setRole(Role role){
        this.role = role;
    }
    //check whether a person is satisfied by a given role and a given offer
    public boolean satisfied(Product product, double offer){
        return role.isSatisfied(product, offer);
    }
}
