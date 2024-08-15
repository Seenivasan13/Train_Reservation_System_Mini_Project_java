package Train_Reservation_system;
import java.util.*;
import java.util.ArrayList;
public class TrainMain {
    public static void main(String[] args) {   // this class Main method
        System.out.println(" TRAINS DETAILS ");
        ArrayList<Train> trains =new ArrayList<Train>();
        trains.add(new Train(1,true,50));   // capacity is your convenient
        trains.add(new Train(2,false,100));
        trains.add(new Train(3,true,150));
        ArrayList<Booking>bookings=new ArrayList<Booking>();

        int useroption=1;
        Scanner sc=new Scanner(System.in);
        for(Train t:trains)
        {
            t.DisplayTrainInfo();  //this method t object -> display
        }
        while(useroption==1)
        {
            System.out.println("Enter 1 to Book and 2 to Exit");
            useroption=sc.nextInt();
            if(useroption==1)
            {
               Booking booking=new Booking();
               if(booking.isAvailable(bookings,trains))
               {
                   bookings.add(booking);
                   System.out.println("YOUR BOOKING IS CONFIRM");
               }
               else
               {
                   System.out.println("SORRY TRAIN IS FULL.PLEASE TRY ANOTHER TRAIN OR DATE.");
               }
            }
        }

    }
}
