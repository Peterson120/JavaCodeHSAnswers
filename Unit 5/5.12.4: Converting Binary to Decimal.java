/* Convert a given binary string
 * into the equivalent decimal value.
 * returns an int representing the decimal value
 * of the binary string
 *
 * Ex: "1101"
 * 
 * Bits:        1    1    0    1
 *
 * Place:       2^3  2^2  2^1  2^0
 * 
 * Place value: 8    4    2    1
 * 
 * Compute decimal value: 1*(8) + 1*(4) + 0*(2) + 1*(1) = 13
 */
public static int binaryToDecimal(String binaryString)
{
    int result = 0;
    for(int i = binaryString.length()-1; i >= 0; i--) result += Character.getNumericValue(binaryString.charAt(i))*Math.pow(2,binaryString.length()-i-1);
    return result;
}

