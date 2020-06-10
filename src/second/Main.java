package second;

public class Main {
    public static void main(String[] args){
        Employee employee = new Employee();
        employee.getInfo((float) 2000.50,8);
        employee.addSal();
        employee.addWork();
        System.out.println("Final salary "+ employee.salary);

    }
}
