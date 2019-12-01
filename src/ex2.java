
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mod
        int x=7;
        int y=5;
        int i=x;
       /* while (i>=y) {
        	i=i-y;
                }	*/
        i=Math.floorMod(x, y);
        System.out.println(i);
	    
        //multipication
       /* int z=0;
        for (i=0;i<x;i++) {
           z=z+y;
	   System.out.println(z);
        }*/
        i=Math.multiplyExact(x, y);
        System.out.println(i);
	    
        //divition
        x=35;
        i=Math.floorDiv(x, y);
        System.out.println(i);
}
}
