public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.deleteEmployee(3);
        employeeBook.addEmployee("Иванов","Иван","Иванович",3,80000);
        employeeBook.fullList();
        employeeBook.employeeId(4);
        employeeBook.departmentCode(2);
    }
}