package application;

import entities.Agents;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        List<Agents> list = new ArrayList<>();
        System.out.print("How many agents will be registered:");
        int n = sc.nextInt();
        for (int i=0;i<n;++i){
            System.out.println();
            System.out.println("Agent # "+ (i+1)  +":");

            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)){
                System.out.print("This ID already exist. Try again!");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Agency: ");
            String agency = sc.nextLine();

            System.out.print("Login: ");
            String login = sc.nextLine();
            while (hasLogin(list, login)){
                System.out.print("This login already exist. Trey again!");
                login = sc.nextLine();
            }
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            list.add(new Agents(id, name, agency, login, salary));
        }
        System.out.print("Enter the agent id that will have salary increase:");
        int id = sc.nextInt();
        Agents age = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (age == null){
            System.out.print("This agent does not exist!");
        }else{
            System.out.print("Enter with the percentage: ");
            double percent = sc.nextDouble();
            age.incrementSalary(percent);
        }
        System.out.print("List of the Agents:");
        System.out.println();
        for (Agents obj : list){
            System.out.print(obj);
        }
        sc.close();
    }
    public static boolean hasId(List<Agents> list, int id){
        Agents age = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return age !=null;
    }

    public static boolean hasLogin(List<Agents> list, String login){
        Agents age = list.stream().filter(x -> x.getLogin().equalsIgnoreCase(login)).findFirst().orElse(null);
        return age !=null;
    }
}
