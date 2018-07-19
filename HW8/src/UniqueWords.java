import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class UniqueWords
{
    private static final String FILE_NAME = "GettysburgAddress.txt";
    private static final int WORDS_PER_LINE = 8;
    
    public static void main(String args[])
    {
        Scanner in = null;
        
        try 
        {	
        	in = new Scanner(new File(FILE_NAME));
        	Set<String> collection = new TreeSet<String>();
        	while(in.hasNext())
        	{
        		String word = in.next().ignoreCase
        		collection.add(in.next());
        	}
        	while(!collection.isEmpty())
        	{
        		for(int i = 0; i < 8; i++)
        		{
        			Iterator iter = collection.iterator();
        			System.out.print(iter.next() + " ");
        		}
        		System.out.println("");
        	}
        			
           
        }
        catch (FileNotFoundException ex) {
            System.out.println("*** File not found: " + FILE_NAME);
        }
        finally {
            if (in != null) in.close();
        }
    }
}