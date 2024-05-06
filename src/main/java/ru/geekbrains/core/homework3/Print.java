package ru.geekbrains.core.homework3;

import java.util.List;

public class Print {
    public void printWorker(List<BaseWorker> workers) {
        for(BaseWorker worker: workers){
            System.out.println(worker);
        }
    }
}
