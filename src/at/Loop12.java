package at;

public class Loop12 {
    public static void main(String[] args) {
        int wert=0;

        for(int i=0; i<=100; i=i+2){
           wert=wert+i;
        }
        System.out.println(wert);

         {
            int wertu=1;

            for(int i=1; i<=100; i=i+2){
                wertu=wertu+i;
            }
            System.out.println(wertu);
        }
    }
}







