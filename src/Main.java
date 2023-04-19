public class Main {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println("Wert von i:"+i);
            if(i==3){
                System.out.println("Holdriho!");
            }
        }
        printSomeNumbers();
        printNumbers(10,20);
        System.out.println(sumUp(1,5));
        System.out.println(powerOfTwo(2));
        System.out.println(sumUpPowerOfTwo(3));
    }
    public static void printSomeNumbers(){
        for(int i=6;i<=23;i++){
            System.out.println("Ganze Nummern von 6-23: "+i);
        }
    }
    public static void printNumbers(int start, int end){
        for(int i=start;i<=end;i++){
            System.out.println("Nummern zwischen "+start+" und " +end+": "+i);
        }
    }
    public static int sumUp(int start, int end) {
        int sum=0;
        for (int i=start;i<end;i++){
            sum+=i;
        }
        return sum;
    }
    public static int powerOfTwo(int p){
        if (p < 0){
            throw new IllegalArgumentException("p muss größer als 0 sein");
        }
        int result=1;
        for (int i=0; i<p;i++){
            result*=2;
        }
        return result;
    }
    public static int sumUpPowerOfTwo(int n){
        if (n<0){
            throw new IllegalArgumentException("p muss größer als 0 sein");
        }
        int result1=1;
        for (int i=0;i<n;i++) {

            for (int e = 0; e < n; e++) {
                result1 *= 2;
            }
            return result1;
        }
        return result1;
    }
}