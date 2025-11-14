import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bookingservice {
final List <train> trainlist=new ArrayList<train>();
final List <ticket> ticketlist=new ArrayList<>();

    public bookingservice() {
        trainlist.add(new train(101,"rajdhani express","delhi","nagpur",
                100));
        trainlist.add(new train(102,"sampark express","delhi","atarra",
                101));
        trainlist.add(new train(103,"vande bharat express","delhi","prayagraj",
                102));
        trainlist.add(new train(104,"kashmir express","shimla","kashmir",
                103));

    }
    public List <train> searchtrain(String source,String destination){
      List <train> res=new ArrayList<>();
     for(train train:trainlist){
         if(train.getSource().equalsIgnoreCase(source)&&
                 train.getDestination().equalsIgnoreCase(destination)){
             res.add(train);
         }
     }
     return res;

    }
    public ticket  bookticket( user user, int trainID,int noticket){
        for(train train: trainlist){
            if(train.getTrainID()==trainID){
                if(train.bookSheats(noticket)){
                    ticket ticket=new ticket(user,train,noticket);
                    ticketlist.add(ticket);
                    return ticket;
                }
                else{
                    System.out.println("not enough sheats");
                    return null;
                }
            }


            }
        System.out.println("train id not found");
          return null;
        }
        public List<ticket> ticketbyuser( user user){
        List<ticket> res=new ArrayList<>();
        for(ticket ticket:ticketlist){
            if(ticket.getUser().getUsername().equalsIgnoreCase(user.getUsername())){
                res.add(ticket);
            }
        }
        return res;
        }

        public boolean cancelsheats(user user, int  ticketID){
           Iterator<ticket> it=ticketlist.iterator();
           while(it.hasNext()){
               ticket ticket =it.next();
              if(ticket.getTicketID()==ticketID &&
              ticket.getUser().getUsername().equalsIgnoreCase(user.getUsername())){
                  train train =ticket.getTrain();
                  train.cancelSheats(ticket.getTicketID());
                  it.remove();
                  System.out.println("ticket"+ticketID+" cancelled successfully");
                  return true;
              }
           }
            System.out.println("ticket"+ticketID+" not found");
           return false;

        }
        public void listAlltrain(){
            System.out.println("ist of all trains");
            for(train train:trainlist){
                System.out.println(train);
            }
        }
    }


