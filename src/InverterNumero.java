

public class InverterNumero { 
   
    public void inverterNumero(int a) {
        int inv = 0;
while (a > 0) {
     inv *= 10;
     inv += (a%10) ;
     a/=10;
    
}

       System.out.println(inv);
    }
}

