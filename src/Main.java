public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            System.out.println("Wert von i:"  + i);
            if(i == 3){
                System.out.println("Holdriho!");
            }
        }
        printSomeNumbers();
        printNumbers(10,20);
        System.out.println(sumUp(1,5));




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
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

}