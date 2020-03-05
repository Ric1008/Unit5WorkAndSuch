public class Theatre {
    private IntegerSet seatsRemaining;
private IntegerSet occupiedSeats;
private IntegerSet aisleSeats;
private int totalRows;

Theatre(int totalSeats, int[] firstRowAisleSeats, int rows){
    seatsRemaining=new IntegerSet();
    occupiedSeats= new IntegerSet();
    aisleSeats=new IntegerSet();
    for(int i=0; i<totalSeats;i++){
        seatsRemaining.insert(i+1);
    }
    for(Integer n: firstRowAisleSeats){
        aisleSeats.insert(n);
    }
    totalRows=rows;
}
//default
    Theatre(){
    seatsRemaining=new IntegerSet();
    occupiedSeats=new IntegerSet();
    aisleSeats=new IntegerSet();
    for(int i=0; i<120;i++){
        seatsRemaining.insert(i+1);
    }
    totalRows=10;
    }
    //Requires: integer, seat number
    //Modiies: this
    //Effects: if the seat is remaining remove seat from IntegerSet and add it to occupied
    //integerset. Else do nothing
    public void purchaseSeat (Integer seatNum){

    }
    //Effects: returns the remaining seats in the theatre
    public IntegerSet getSeatsRemaining(){
    return seatsRemaining;
    }
    //Requires: integer, seatNum
    //Effects: returns true if seat is on an aisle, else return false
    public boolean isAisle(Integer seatNum){
    return false;
    }
    //Requires: integer seatnumber
    //Effects: returns true if seat is purchased, else returns false
    public boolean isPurchased (Integer num)
    {
        return false;
    }
    //Effects: returns number of remaining seats
    public int getSize(){return 0;}

}
