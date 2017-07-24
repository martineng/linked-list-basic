package linkedlistbasic;

import java.util.Random;

public class LinkedListBasic
{

    public static void main(String[] args)
    {
        LinkList theList = new LinkList();
        Random rand = new Random();
        int randInt;
        double randDouble;
        
       for (int count = 0; count <= 4; count++)
       {
           randInt = rand.nextInt(100);
           randDouble = rand.nextInt(100) + rand.nextDouble();
           System.out.println("Inserting: " + randInt + ", " + randDouble);
           theList.insertFirst(randInt, randDouble);
       }
       
       System.out.print("\n");
       
       while (!(theList.isEmpty()))
       {
           Link tempLink = theList.deleteFirst();
           System.out.println("Deleting: " + tempLink.getKey() + ", " + tempLink.getNum());
       } 
       
    }
    
}
