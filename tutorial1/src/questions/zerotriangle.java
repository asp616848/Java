package questions;

public class zerotriangle {
    
    public static void main(String[] args) {
        boolean x = true;
        for(int i=0 ; i<6 ; i= i+1){
            for(int k=0 ; k<i ; k= k+1){
                if(x)
                    {System.out.print(1);
                    x= false;
                }
                else{
                    System.out.print(0);
                    x=true;
                }
            
            }
            System.out.println();   
        }
    }
}
