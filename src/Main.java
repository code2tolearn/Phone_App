public class Main {
    public static void main(String[] args) {
        Landline l1  = new Landline("123") ;
        Landline l2 = new Landline("123") ;
         //
         l1.callNumber("456");
         l2.receiveCall("456"); // phoneNP should be same to caller
        System.out.println(l2.answerCall());
    }
}