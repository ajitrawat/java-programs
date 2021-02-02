import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int passLength = 8;
    private String department;
    private String email;
    private String altEmail;
    private int mailBoxCapacity=500;// although the capacity is set but we can change it by creating setter for it
    private String alternatePassword;
    private String companySuffix = "abcCompany";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("email created for " + this.firstName + " " + this.lastName);
        department = setDepartment();
        System.out.println("the department is " + department);//this. is not necessary as there is no other department variable.
        password = randomPassword(this.passLength);
        System.out.println("the password is " + password);
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + " from " + department + "@" + companySuffix;
        System.out.println("your email is " + this.email);
    }

    //ask for department
    private String setDepartment() {
        System.out.println("enter the department \n 1 for sales\n 2 for development\n 3 for accounting \n 0 for none");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if (departmentChoice == 1) {
            return "sales";
        } else if (departmentChoice == 2) {
            return "development";
        } else if (departmentChoice == 3) {
            return "accounting";
        } else
            return "none";
    }

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789@*&^#!"; // WE set the char that are allowed to generate random password.
        char[] password = new char[length]; // it sees the above string a single char and give password =length.
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());//we want to find a random no.out of the above series each time the loop runs.
            password[i] = passwordSet.charAt(rand); // charAt is java build in.
        }
        return new String(password);// we can not just return "password" because it is a char so we modified it to string by doing new String().

    }
    //set mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity= capacity;        //so we can change capacity
    }
    // set alternative email
    public void setAlternateEmail(String altEmail){
        this.altEmail= altEmail;                    // so we can change email   setting is defining a property while creating getter is for retrieving it.
    }
    // change password
    public void changePassword(String Password){
        this.password=password;                 // so we can change password
    }

    public String getPassword() {
        return password;
    }

    public String getAltEmail() {
        return altEmail;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }
    public String showDetails(){
        return "name= "+firstName+" "+lastName+
                "\ncompany mail= "+email
                +"\nmail box capacity= "+mailBoxCapacity;
    }
}