/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reversing.a.linked.list.first.pkgtry;
    import java.util.LinkedList;
    import java.util.Random;
/**
 *
 * @author pierr
 */
public class ReversingALinkedListFirstTry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LinkedList<String> num = new LinkedList<String>();
	
        //MAKING AND PRINTING LINKED LIST OF RANDOM LENGTH (1-20)
        
        Random rand = new Random();
        int numNums = rand.nextInt(20);
	
	for (int x = 1; x < numNums; x++)
	{
            num.add(Integer.toString(x));
            System.out.print(x + " ");
	}
		
	System.out.println();
        
        //REVERSING LINKED LIST
        
	double midPoint = (((double)num.size() - 1) / 2);
	
        String temp;
        double change;
	
	for (int x = 0; x < num.size(); x++)
	{
            if (x >= midPoint)
                break;
            else
            {
                change = (midPoint - x) * 2;
		temp = num.get(x);
		num.set(x, num.get(x + (int)change));
		num.set(num.size() - 1 - x, temp);
            }
	}
        
        //PRINTING REVERSED LINKED LIST
        
	for (String x : num)
            System.out.print(x + " ");
        
        System.out.println();
    }
    
}
