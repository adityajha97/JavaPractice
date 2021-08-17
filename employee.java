public class employee {
    String name;
    int emp_id;
    employee(String name, int emp_id) {
        this.name = name;
        this.emp_id = emp_id;
    }
    public static void main(String[] args) {
        employee e1 = new employee("aditya", 101);
        employee e2 = new employee("krishna", 100);
        System.out.println("Employee 1: " + e1.name + " " + e1.emp_id);
        System.out.println("Employee 2: " + e2.name + " " + e2.emp_id);


    }
}
