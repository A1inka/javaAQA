package homework5.task1_2;

import java.math.BigDecimal;

public class Employee {

    private String fullName;
    private String jobTitle;
    private String email;
    private String number;
    private BigDecimal salary;
    private int age;

    public Employee(String fullName, String jobTitle, String email, String number, BigDecimal salary, int age) {
        setFullName(fullName);
        setJobTitle(jobTitle);
        setEmail(email);
        setNumber(number);
        setSalary(salary);
        setAge(age);
    }

    public void printInfo() {
        System.out.println(String.format("""
                ФИО: %s
                Должность: %s
                Почта: %s
                Телефон: %s
                Зарплата: %s
                Возраст: %d
                """, fullName, jobTitle, email, number, salary.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString(), age));
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0 && age <= 120) {
            this.age = age;
        }
        else {
            throw new IllegalArgumentException("Некорректно введен возраст");

        }
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName; // довольно запарная проверка, учитывая, что могут быть двойные имена-фамилии или имена по типу Александр I
    }
    public String getEmail() {
        return email;
    }
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setEmail(String email) {
        if (email != null && email.matches("^[\\w-\\.]+@[\\w-]+(\\.[\\w-]+)*\\.[a-z]{2,}$")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Некорректно введен адрес электронной почты.");
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number; // проверку валидности номера телефона не добавляла, тк непонятна страна
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        if (salary.compareTo(BigDecimal.ZERO) > 0) {
            this.salary = salary;
        }
        else {
            throw new IllegalArgumentException("Некорректно введена зарплата");
        }
    }
}
