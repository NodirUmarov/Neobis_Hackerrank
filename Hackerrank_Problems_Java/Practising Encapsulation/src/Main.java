import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);

        Person person = new Person();
        System.out.print("Full name: ");
	    person.setFullName(scan.nextLine());
	    person.getFullName();
        System.out.print("Age: ");
        person.setAge(scan.nextInt());
        person.getAge();
        scan.nextLine();
        System.out.print("Gender: ");
        person.setGender(scan.nextLine());
        person.getGender();
        System.out.print("Citizenship: ");
        person.setCitizenship(scan.nextLine());
        person.getCitizenship();
    }
}

class Person{
    private String fullName;
    private int age;
    private String gender;
    private String citizenship;

    public void setFullName(String fullName) {
        if(fullName.isEmpty()) {
            System.err.println("Please write your name");
        } else {
            fullName = this.fullName;
        }
    }
    public String getFullName(){
        return fullName;
    }

    public void setAge(int age){
        if(age <= 0){
            System.err.println("Incorrect age");
        }
        else{
            age = this.age;
        }
    }
    public int getAge(){
        return age;
    }
    public void setGender(String gender){
        if(gender.isEmpty()){
            System.err.println("Please fill the field \"Gender\"");
        }
        else{
            gender = this.gender;
        }
    }
    public String getGender(){
        return gender;
    }

    public void setCitizenship(String citizenship){
        if(citizenship.isEmpty()){
            System.err.println("Please fill the field \"Citizenship\"");
        }
        else{
            citizenship = this.citizenship;
        }
    }
    public String getCitizenship(){
        return citizenship;
    }
}
