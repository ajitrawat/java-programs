import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
    private static Scanner scanner=new Scanner(System.in);

    private ArrayList<String> groceryList = new ArrayList<String>();
    public void choice(){
        boolean exit=true;
        int choice ;
        options();
        while(exit){
            System.out.print("enter your choice ");
            choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:options();
                break;
                case 2: addGroceryList();
                break;
                case 3:printGroceryList();
                break;
                case 4:modifyGroceryList();
                break;
                case 5:removeItem();
                break;
                case 6:findItem();
                break;
                case 7: exit= false;

            }
        }
    }
    public void options(){
        System.out.println( "1 for options \n" +"2 for adding item \n" +"3 for print list \n"
                +"4 for modify list \n" +"5 for remove item  \n" +"6 for finding item \n" +"7 to exit \n");
    }

    public void addGroceryList(){
        System.out.println("enter the item");
       String item= scanner.nextLine();
        groceryList.add(item);
    }
    public void printGroceryList(){
        System.out.println("you have "+groceryList.size()+" items in list");
        for(int i=0;i<groceryList.size();i++){
            System.out.println((i+1)+" "+groceryList.get(i));
        }
    }
    public void modifyGroceryList(){
        System.out.println("enter the position to modify");
        int position=scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter the item");
        String newItem=scanner.nextLine();
        groceryList.set(position-1,newItem);
        System.out.println("grocery item at "+position+" has modified");
    }
    public void removeItem() {
        System.out.print("enter position to remove");
        int position = scanner.nextInt();
        if ((position - 1) <= groceryList.size()) {
            groceryList.remove(position - 1);
        } else
            System.out.println("WRONG ELEMENT chosen");
    }
    public void findItem(){
        System.out.print(" enter item to search ");
        String searchItem=scanner.nextLine();
        int position= groceryList.indexOf(searchItem);
        if(position>=0){
            System.out.println("item "+groceryList.get(position)+"found at "+(position-1)+" position");
        }else
            System.out.println("item not found");
    }
}
