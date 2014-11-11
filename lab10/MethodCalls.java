public class MethodCalls {
    public static void main(String[] arg) {
        int a = 784, b = 22, c;
        c = addDigit(a, 3);
        System.out.println("Add 3 to " + a + " to get " + c);
        c = addDigit(addDigit(c, 4), 5);
        System.out.println("Add 3, 4, and 5 to " + a + " to get " + c);
        System.out.println("Add 3 to -98 to get: " + addDigit(-98, 3));
        c=join(a,b);
        System.out.println("Join " + a + " to " + b + " to get " + c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }

    public static int addDigit(int x, int y) {
       
        
        if (y > 9 || y < 0) {
            return x;
        }

        else {
            if (x >= 10000 && x <= 99999) {
                return (x + (100000 * y));
            }
            
            if (x >= 1000 && x <= 9999) {
                return (x + (10000 * y));
            }
            
            if (x >= 100 && x <= 999) {
                return (x + (1000 * y));
            }

            if (x >= 10 && x <= 99) {
                return (x + (100 * y));
            }
            
            if (x<0){
                return(x-(100*y));
            }
          
          return (x + (100 * y));
        
        
        }

    }
    
     public static int join(int z, int a){
         int i = addDigit(z,a);
         if(a>0&&a<=99){
             return i= (z*100)+a;
         }
         
         if(a>100&&a<=999){
             return i= (z*1000)+a;
         }
         
         if(a>1000&&a<=9999){
             return i= (z*10000)+a;
         }
         
         if(z<0&&a<0){
             a=a-(2*a);
             z=z-(2*z);
             
             return i=(z*100)+a;
             
         }
         return i;
     }
}
/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/
