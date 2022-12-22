package hw_employees;

public class Manager extends employees{


    public Manager(String name, int id, String title, String DOB, String address, double salary) {
        super(name, id, Consts.MANAGER_TYPE, DOB, address, Consts.MANAGER_DEFAULT_SALARY);
    }

 public void hireEmployees(){
 System.out.println(String.format("Manager %s will hire employees.", getName()));
 }

 public void fireEmployees(){
       System.out.println(String.format("Manager %s will fire employees", getName()));}



}
