package ru.geekbrains.core.homework3;

public class Worker extends BaseWorker{
    private int salary;

    public Worker(String firstName, String surname, int age, int salary) {
        super(firstName, surname, age);
        this.salary = salary;
    }

    @Override
    public double calcOfAverageMonthlySalary() {
        return salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "firstName: " + getFirstName() + " " +
                "surname: " + getSurname() + " " +
                "age: " + getAge() + " " +
                "slary: " + getSalary();
    }
}
