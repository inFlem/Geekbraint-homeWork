package lesson5;

public class employee {

    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int pay;
    private int age;

    public employee(String fullName, String position, String email, String
                     phone, int pay, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }

    public void print(){
        System.out.println("fullName - " + fullName + ", position - " + position + ", email - " + email
                + ", phone - " + phone + ", pay - " + pay + ", age - " + age);
    }

    public int getAge() {
        return age;
    }
}
