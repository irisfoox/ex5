
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=35;
        if(num/10==5||num%10==5) {
        	System.out.println("PAM");
        }
        if (num/10==7||num%10==7) {
        	System.out.println("BOOM");
        }
        if ((num/10==5||num%10==5)&&(num/10==7||num%10==7) ) {
        	System.out.println("BOOM_PAM");
        }
        if (((num/10+num%10)==5)||((num/10+num%10)==7)) {
        	System.out.println("GOOD");
        }
        if ((num/10!=5 && num%10!=5)&&(num/10!=7 && num%10!=7)) {
        	System.out.println("BAD FORMAT");
        }
        
	}

}
