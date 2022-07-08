import java.util.*;
public class BinaryConversion extends ConsoleProgram
{
    public void run()
    {
        System.out.println(binaryToText("010011100110100101100011011001010010000001001010011011110110001000100001"));
    }
    
    public String binaryToText(String binary)
    {
        String result = "";
        for(int i = 0; i < binary.length(); i+=8) result += (char) binaryToDecimal(binary.substring(i,i+8));
        return result;
    }
    
    public static int binaryToDecimal(String binaryString)
    {
        int result = 0;
        for(int i = binaryString.length()-1; i >= 0; i--) result += Character.getNumericValue(binaryString.charAt(i))*Math.pow(2,binaryString.length()-i-1);
        return result;
    }
}
