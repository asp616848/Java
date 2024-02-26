package advancedpatterns;

public class hollowButterfly {
    public static void main(String[] args) {
        for (int i=0; i<=4;i++){
            //left upper quadrant
            System.out.print("*");
            for (int j=0;j <= i-2; j++){
                System.out.print(" ");
            }
            if (i>0)
                {System.out.print("*");
            }

            for(int k=0; k<=8-2*i;k++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j=0;j <= i-2; j++){
                System.out.print(" ");
            }
            if (i>0)
                {System.out.print("*");
            }
            System.out.println();
        }
        for (int i=4; i>=0;i--){
            //left upper quadrant
            System.out.print("*");
            for (int j=0;j <= i-2; j++){
                System.out.print(" ");
            }
            if (i>0)
                {System.out.print("*");
            }

            for(int k=0; k<=8-2*i;k++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j=0;j <= i-2; j++){
                System.out.print(" ");
            }
            if (i>0)
                {System.out.print("*");
            }
            System.out.println();
        }
    }
}
