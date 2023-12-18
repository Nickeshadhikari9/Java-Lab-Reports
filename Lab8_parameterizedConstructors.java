public class Lab8_parameterizedConstructors {
    public static class student {
        private int rollNo;
        private String name;

        public student(int x, String y) {
            rollNo = x;
            name = y;
        }

        public void display() {
            System.out.println("Student RollNo: " + rollNo);
            System.out.println("Student Name: " + name);
        }
    }
    public static void main(String[] args) {
        System.out.println("Student 1:");
        student s1 = new student(1, "Nickesh Adhikari");
        s1.display();
        System.out.println("Student 2:");
        student s2 = new student(2, "Dua Lipa");
        s2.display();

    }
}
