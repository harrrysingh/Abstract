package helloworld;

public class LargestAndSmallest {


			 public static void main(String[] args) {

				   int[] value   = {5,10,3,30};

				    int diff = 0;
				    int highest = 0;

				   for (int i = 0; i<value.length; i++)
				   {
				       for(int y = 0;y<value.length;y++)
				       {            
				           diff = value[i] - value[y];

				           if(diff > highest){
				               highest = diff;

				               System.out.println("the difference of the lowest and the highest is "+ diff);
				           }    
				       }  
				   } 
			 }
}
