public class Landline implements Phone{
   private String myPhoneNo ;
    private boolean isRinging ;
    private static  boolean isPowerOn ;
    // constructor
     public Landline(String myPhoneNo ){
             this.myPhoneNo = myPhoneNo ;
             isRinging = false ;
             isPowerOn =true ;
     }
     public  String getMyPhoneNo()
     {
      return myPhoneNo ;
     }
     public void setPhoneNo(String myPhoneNo){
         this.myPhoneNo = myPhoneNo ;
     }
     public void setMyPhoneNo(boolean ringing){
        this.isRinging = ringing ;
     }
     public boolean isPowerOn(){
      return isPowerOn ;
     }
     public void setPowerOn(boolean powerOn) {
         isPowerOn = powerOn ;
     }


    @Override
    public void powerOn() {
        this.isPowerOn = true ;
    }

    @Override
    public void callNumber(String phoneNo) {
       if(isPowerOn){
        System.out.println("You are dialing the number"+phoneNo);
       }else {
        System.out.println("Your landline is off ");
       }
       return ;
    }

    @Override
     public void receiveCall(String phoneNo){
        if(isPowerOn && myPhoneNo.equals(phoneNo))
        {
            this.isRinging = true ;
         System.out.println("hey"+myPhoneNo+"You are receiving a call");
        }else {
         System.out.println("Call not received");
        }

    }

    @Override
    public boolean isRinging() {
//        if(isRinging)
//        {
//         return true ;
//        }
//        else return false ;
       return isRinging ;
    }

 @Override
 public boolean answerCall() {
   if(isRinging)
   {
    System.out.println("Call Answered");
    this.isRinging = false ;
   }
   return true ;
 }
}
