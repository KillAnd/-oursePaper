public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee();
        employeeBook.deleteEmployee(6);
        employeeBook.fullList();
        employeeBook.addEmployee();
        employeeBook.employeeId(8);
    }
}