package ru.geekbrains.core.homework3;

public abstract class BaseWorker implements Comparable<BaseWorker>{
    private String firstName;
    private String surname;
    int age;

    public BaseWorker(String firstName, String surname, int age) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
    }

    public abstract double calcOfAverageMonthlySalary();

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int compareTo(BaseWorker worker){
        return Integer.compare(getAge(), worker.getAge());
    }
}
