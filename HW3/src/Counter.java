import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Counter
{
    private File inputFile;
    
    public Counter(File inputFile)
    {
        this.inputFile = inputFile;
    }

    public int countLines() 
    {
    	int lineCount = 0;
        try
        {
        	Scanner in = new Scanner(this.inputFile);
        	while(in.hasNextLine())
        	{
        		lineCount++;
        		in.nextLine();
        	}
        	in.close();
        }
        catch(FileNotFoundException e)
        {
        	System.out.println("Code not found");
        }
        return lineCount;
    }

    public int countWords() 
    {
        int wordCount = 0;
        try 
        {
        	Scanner in =  new Scanner(this.inputFile);
        	while(in.hasNext())
        	{
        		in.next();
        		wordCount++;
        	}
        	in.close();
        }
        catch(FileNotFoundException e)
        {
        	System.out.println("Code not found");
        }
        return wordCount;
    }

    public int countChars()
    {
        int charCount = 0;
        try
        {
        	Scanner in =  new Scanner(this.inputFile);
        	while(in.hasNextLine())
        	{
        		String line = in.nextLine();
        		charCount += line.length() + 1; 
        	}
        	in.close();
        }
        catch(FileNotFoundException e)
        {
        	System.out.println("Code not found");
        }
        return charCount;
    }
}