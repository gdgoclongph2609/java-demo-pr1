package tut7;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee em = new Employee("Harry Jones",50000);
        em.raiseSalary(10);
        System.out.println(em.getName()+" is paid $ " + em.getSalary()+ "/month");
    }
}
