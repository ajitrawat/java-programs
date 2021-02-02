public class EmailApp {
    public static void main(String[] args) {
      Email em1=new Email("john","smith"); // with this single constructor we can access the program.this is power of constructor to do so many things.
    em1.setMailBoxCapacity(800);// you need get method to access this. // we change the capacity here
    em1.changePassword("ajitrawat025");
        System.out.println(em1.showDetails());
    }
}
