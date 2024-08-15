package Train_Reservation_system;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;   //Date format package
public class Booking {
    String PassengerName;  // creating for Booking class  instance variable
    int TrainNO;
    Date date;


    Booking()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE PASSENGER NAME: ");
        PassengerName =sc.nextLine();
        System.out.println("ENTER TRAIN NO ");
        TrainNO=sc.nextInt();
        System.out.println("ENTER DATE dd-mm-yyyy");
        String dataInput=sc.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");//date format object created
        try {
            date=dateFormat.parse(dataInput);   //unhandled exception cleared
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
    public boolean isAvailable(ArrayList<Booking>bookings,ArrayList<Train>trains) //reference passing
    {
        int capacity=0;
        for(Train t:trains)
        {
            if(t.getTrainNo()==TrainNO)
                capacity=t.getCapacity();
        }
        int booked=0;
        for(Booking b:bookings)
        {
            if(b.TrainNO==TrainNO && b.date.equals(date))
            {
                booked++;
            }
        }
        return booked < capacity?true:false;

    }


}
