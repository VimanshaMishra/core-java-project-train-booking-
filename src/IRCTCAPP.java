import java.util.List;
import java.util.Scanner;

public class IRCTCAPP {
    private final Scanner sc = new Scanner(System.in);
    private final userservice userservice=new userservice();
    private final bookingservice bookingservice=new bookingservice();
    public static void main(String[] args) {
        new IRCTCAPP().start();
    }
    public void start(){
while(true){
    System.out.println("welcome to IRCTCAPP");
    if(!userservice.isLoggedIn()){
        System.out.println("1.register");
        System.out.println("2.login");
        System.out.println("3.logout");
        System.out.println("Enter your choice");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
            case 1 -> register();
            case 2 -> login();
            case 3 -> logout();
            default -> System.out.println("invalid choice");
        }}
    else{
        showusermenu();
    }
}}
    public void register(){
        System.out.println("Enter your username");
        String username=sc.next();
        System.out.println("Enter your password");
        String password=sc.next();
        System.out.println("Enter your fullname");
        sc.nextLine();
        String fullname=sc.nextLine();
        System.out.println("Enter your contact");
        String contact=sc.next();
        userservice.register(username,password,fullname,contact);
    }
    public void login(){
        System.out.println("Enter your username");
        String username=sc.next();
        System.out.println("Enter your password");
        String password=sc.next();
        userservice.login(username,password);
    }

    private void logout(){
        System.out.println("Thank you for using IRCTC APP");
        System.exit(0);
    }
    private void showusermenu(){
      while(userservice.isLoggedIn()) {
          System.out.println("\n-----userMenu-----");
          System.out.println("1.serach train");
          System.out.println("2.book ticket");
          System.out.println("3.view my ticket");
          System.out.println("4.cancel tickets");
          System.out.println("5.view all tickets");
          System.out.println("6.logout");
          System.out.println("Enter your choice");
          int choice =sc.nextInt();
          switch(choice){
              case 1 -> searchtrain();
              case 2 -> bookticket();
              case 3 -> viewmyticket();
              case 4 -> cancelticket();
              case 5 -> bookingservice.listAlltrain();
              case 6 -> userservice.logout();
             default -> System.out.println("invalid choice");

          }
      }
    }
    private void searchtrain(){
        System.out.println("Enter source");
        String source=sc.next();
        System.out.println("Enter destination");
        String destination=sc.next();
        List<train> trains= bookingservice.searchtrain(source,destination);
        if(trains.isEmpty()){
            System.out.println("Train not found");
            return;
        }
        System.out.println("Train found");
        for(train train:trains){
            System.out.println(train);
        }
        System.out.println("do you want to book ticket?(yes/no):");
        String choice =sc.next();
        if(choice.equalsIgnoreCase("yes")){
            System.out.println("Enter train ID");
            int trainID=sc.nextInt();
            System.out.println("Enter no. of sheats");
            int sheats=sc.nextInt();
            ticket ticket= bookingservice.bookticket( userservice.getUser(), trainID,sheats);
            if(ticket!=null){
                System.out.println("booking successful");
                System.out.println(ticket);
            }

        }
        else{
            System.out.println("returning to menu ");
        }
    }
    private void bookticket(){
        System.out.println("Enter source");
        String source=sc.next();
        System.out.println("Enter destination");
        String destination=sc.next();
        List<train> trains= bookingservice.searchtrain(source,destination);
        if(trains.isEmpty()){
            System.out.println("Train not available");
            return;
        }
        System.out.println("Train available");
        for(train train:trains){
            System.out.println(train);
        }
        System.out.println("Enter train ID");
        int trainID=sc.nextInt();
        System.out.println("Enter no. of sheats");
        int sheats=sc.nextInt();
        ticket ticket= bookingservice.bookticket( userservice.getUser(), trainID,sheats);
        if(ticket!=null){
            System.out.println("booking successful");
            System.out.println(ticket);
        }

    }
    private void viewmyticket(){
        List <ticket> ticketbyuser= bookingservice.ticketbyuser(userservice.getUser());
        if(ticketbyuser.isEmpty()){
            System.out.println("no tickets are booked yet");
            return;
        }
        else{
            System.out.println("your tickets");
            for(ticket ticket:ticketbyuser){
                System.out.println(ticket);
            }
        }
    }
    private void cancelticket(){
        System.out.println("Enter ticketID");
        int ticketID = sc.nextInt();
        bookingservice.cancelsheats( userservice.getUser(),ticketID );



}
}
