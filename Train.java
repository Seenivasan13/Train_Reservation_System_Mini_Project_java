package Train_Reservation_system;
import java.util.*;
public class Train {

    int TrainNo;    //creating  instance variable Train class
    private  boolean Ac;
    private int capacity;  //use get and set methods

    Train(int No,boolean ac,int cap)  //constructor call
    {
        this.TrainNo=No;
        this.Ac=ac;
        this.capacity=cap;

    }
  public int getTrainNo()
   {
       return TrainNo;
   }
   public void setTrainNo(int No)
   {
       this.TrainNo=No;
   }
    public int getCapacity() {  //accessor method
        return capacity;
    }

    public void setCapacity(int cap) { // mutator
        this.capacity = cap;
    }

    public boolean isAc() {   //accessor method
        return Ac;
    }

    public void setAc(boolean ac) {  // mutator
        Ac = ac;
    }
    void DisplayTrainInfo()
    {
        System.out.println("TRAIN No: "+TrainNo +" AC "+ Ac +" TOTAL CAPACITY "+capacity);
    }
}
