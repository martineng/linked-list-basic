package linkedlistbasic;

import java.util.Random;

public class LinkedListBasic
{

    public static void main(String[] args)
    {
        example2();
       
    }
    
    protected static void example1()
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
    } // END example1
    
    protected static void example2()
    {
        LinkList theList = new LinkList();
        Random rand = new Random();
        int randInt, randPick, randToFind = 0;
        double randDouble;
        
        randPick = rand.nextInt(4);
        
        for (int count = 0; count <= 4; count++)
        {
            randInt = rand.nextInt(100);
            randDouble = rand.nextInt(100) + rand.nextDouble();
            System.out.println("Inserting: " + randInt + ", " + randDouble);
            theList.insertFirst(randInt, randDouble);
            
            if ( (randPick) - 1 == count)
            {
                randToFind = randInt; 
            }
        } // END FOR
        
        Link linkToFind = theList.find(randToFind);
        
        if (linkToFind != null)
        {
            System.out.println("Found!! " + randToFind);
        }
        else
        {
            System.out.println("Can't find link");
        }
        
        System.out.print("\n");
        
        Link deletedLink = theList.delete(randToFind);
        
        if (deletedLink != null)
        {
            System.out.println("Deleted " + deletedLink.getKey());
        }
        else
        {
            System.out.println("ERROR! CAN'T DELETE!");
        }
        
        
        Link printLink;
       
        while (!(theList.isEmpty()))
        {
            printLink = theList.getFirst();
            System.out.println(printLink.getKey() + "," + printLink.getNum());
            theList.deleteFirst();
        }
        
        
        
    } // END example2
    
}
