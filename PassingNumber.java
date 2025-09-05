public class PassingNumber {
    public static void main(String[] args) {
      concept(5);
    }

    static void concept(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        //n-- = this will pass the value first and then subtract it
        //--n = this will subtract first and then pass
        concept(--n);
    }
}
