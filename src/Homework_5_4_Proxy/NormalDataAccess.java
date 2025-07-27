package Homework_5_4_Proxy;

public class NormalDataAccess implements DataAccess {
        private String data;

        @Override
        public void readData() {
            System.out.println("Следующие данные прочитаны: " + data);
        }

        @Override
        public void writeData(String data) {
            this.data = data;
            System.out.println("Данные записаны");
        }
}