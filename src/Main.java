public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee();
        employeeBook.deleteEmployee(3);
        employeeBook.addEmployee();
        employeeBook.fullList();
        employeeBook.employeeId(4);
    }
}