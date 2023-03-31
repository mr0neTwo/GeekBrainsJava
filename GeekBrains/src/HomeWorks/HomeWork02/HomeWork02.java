package HomeWorks.HomeWork02;

import java.io.IOException;

public class HomeWork02 {

    public static void main(String[] args) throws IOException {
        Task2_01 task01 = new Task2_01();
        // task01.start();

        Task2_02 taskO2 = new Task2_02();
        // taskO2.start();

        Task2_03 taskO3 = new Task2_03("src/HomeWorks/HomeWork02/StudentData.json");
        taskO3.start();
    }
}

