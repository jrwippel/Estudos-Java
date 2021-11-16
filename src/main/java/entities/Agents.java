package entities;

public class Agents {
    private int id;
    private String name;
    private String agency;
    private String login;
    private double salary;

    public String toString(){
        return id
                + ", "
                + name
                + ", "
                + agency
                + ", "
                + login
                + ", "
                + String.format("%.2f%n", salary);
    }

    public double incrementSalary (double percent){
        return salary += salary * percent /100;
    }

    public Agents(int id, String name, String agency, String login, double salary) {
        this.id = id;
        this.name = name;
        this.agency = agency;
        this.login = login;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
