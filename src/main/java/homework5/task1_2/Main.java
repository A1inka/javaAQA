package homework5.task1_2;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Тестов Тест Тестович", "Тестировщик", "tester@mail.com",
                "89023544752", new BigDecimal(75000), 20);
        employee.printInfo();
        Employee[] employees = new Employee[5];
        employees[0] = employee;
        employees[1] = new Employee("Ivanov Ivan", "Engineer",
                "ivivan@mailbox.com", "892312312", new BigDecimal(30000), 30);
        employees[2] = new Employee("Petrova Anna", "Manager", "anna.petrova@yandex.ru", "89012345678", new BigDecimal(45000), 28);
        employees[3] = new Employee("Sidorov Petr", "Developer", "petr.sidorov@gmail.com", "89087654321", new BigDecimal(60000), 35);
        employees[4] = new Employee("Kuznetsov Alexey", "Designer", "alexey.kuznetsov@icloud.com", "89091234567", new BigDecimal(50000), 25);
    }
}