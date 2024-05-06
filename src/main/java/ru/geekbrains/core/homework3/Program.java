package ru.geekbrains.core.homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<BaseWorker> workers = new ArrayList<>();
        workers.add(new Worker("Anton", "Petrov", 20, 20000));
        workers.add(new Worker("Vova", "Ivanov", 25, 200000));
        workers.add(new Freelancer("Artem", "Shtyagin", 30, 1200));
        workers.add(new Freelancer("Sofia", "Kalach", 28, 1000));

        Collections.sort(workers);
        Print print = new Print();
        print.printWorker(workers);
    }
}
