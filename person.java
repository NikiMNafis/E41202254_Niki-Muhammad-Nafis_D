public class person {
    public static void main(String[] args) {
        class Person {
            String fName;
            String lName;
            int stuId;
            String stuStatus;
        }
        Person data = new Person();
        data.lName = "Lisa Palombo";
        data.stuId = 123456789;
        data.stuStatus = "Active";

        System.out.println("Student Name : " + data.lName);
        System.out.println("Student ID : " + data.stuId);
        System.out.println("Student Status : " + data.stuStatus);
    }
}
