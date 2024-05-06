package ru.geekbrains.core.homework3;

public class Freelancer extends BaseWorker{
    private int hourlyRate;

    public Freelancer(String firstName, String surname, int age, int hourlyRate) {
        super(firstName, surname, age);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calcOfAverageMonthlySalary() {
        return 20.8 * 8 * hourlyRate;
    }

    @Override
    public String toString() {
        return "firstName: " + getFirstName() + " " +
                "surname: " + getSurname() + " " +
                "age: " + getAge() + " " +
                "slary: " + calcOfAverageMonthlySalary();
    }
}
