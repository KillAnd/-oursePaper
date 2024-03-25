public class Main {

    public static void fullList() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }


    public static Employee[] employee = new Employee[10];

    public static void main(String[] args) {
        employee[0] = new Employee("Логинов", "Виталий", "Юрьевич", 2, 267000);
        employee[1] = new Employee("Маркова", "Антонина", "Витальевна", 2, 246000);
        employee[2] = new Employee("Пономарев", "Илья", "Игоревич", 2, 250000);
        employee[3] = new Employee("Иванов", "Константин", "Валерьевич", 2, 270000);
        employee[4] = new Employee("Петров", "Иван", "Сергеевич", 3, 220000);
        employee[5] = new Employee("Сидоров", "Андрей", "Ильич", 3, 258000);
        employee[6] = new Employee("Гавриков", "Никита", "Андреевич", 4, 213000);
        employee[7] = new Employee("Мамонтов", "Анатолий", "Георгиевич", 4, 289000);
        employee[8] = new Employee("Селезнева", "Анна", "Григорьевна", 5, 245000);
        employee[9] = new Employee("Юрченко", "Александр", "Потапович", 5, 265000);
        fullList();
        salaryMonth();
        salaryMinMax();
        fullNameEmployee();
    }
    public static void salaryMonth() {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum += employee[i].getSalary();
        }
        System.out.println("Зарплата всех сотрудников составляет - " + sum);

        double medium = (double)sum / 10;
        System.out.println("Средняя зарплата среди сотрудников составляет -" + medium);
    }

    public static void salaryMinMax() {
        int max = 0;
        for (int i = 0; i < employee.length; i++) {
            if (max < employee[i].getSalary()) {
                max=employee[i].getSalary();
            }
        }
        int min = max;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < min) {
                min = employee[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата составляет - " + max + "\n"
                + "Минимальная зарплата составляет - " + min);
    }

    public static void fullNameEmployee() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getName() + " " + employee[i].getSurname() + " " + employee[i].getLastName());
        }
    }
}