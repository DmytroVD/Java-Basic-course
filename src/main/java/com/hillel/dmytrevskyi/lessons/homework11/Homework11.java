package com.hillel.dmytrevskyi.lessons.homework11;

public class Homework11 {
    public static void main(String[] args) {
      CoWorker coworker1 = new CoWorker("John Smith", "trainee", "john@gmail.com",
              "346784", "300$", 42);
      CoWorker coworker2 = new CoWorker("William Johnson", "recruiter", "john@gmail.com",
              "128432", "800$", 32);
      CoWorker coworker3 = new CoWorker("Matthew Williams", "software tester", "john@gmail.com",
              "432782", "600$", 38);
      CoWorker coworker4 = new CoWorker("Robert Brown", "junior", "john@gmail.com",
              "953421", "400$", 34);
      CoWorker coworker5 = new CoWorker("Charles Miller", "middle", "john@gmail.com",
              "865492", "1000$", 48);

      CoWorker[] coWorkers = new CoWorker[] {coworker1, coworker2, coworker3, coworker4, coworker5};
        for (int i = 0; i < coWorkers.length; i++) {
            if (coWorkers[i].age < 40) {
                coWorkers[i].printInfo();
            }
            }
        }



    }


