
package javaexample60stringoperationpart11;


public class JavaExample60StringOperationPart11 {

    
    // transform method: transforms object to another type or same type.
    // The original object is not changed.
    
    public static void main(String[] args) {
        
        StringBuilder sb =new StringBuilder("        Tom goes to the school everyday.      ");
        
        // transform to another type (String)
        String s = sb.toString();
        
        // transform to another type (char array)
        char[] chars = s.toCharArray();
        
        // transform to same type
        String s1= s.trim(); // trims the white spaces at the start and end of this string
        String s2= s.toLowerCase();
        String s3= s.toUpperCase();
        
        System.out.println("Your original string ("+sb+")");
        System.out.println("Convert StringBuilder to String ("+s+")");
        System.out.println("Convert to char array ("+CharArray2String(chars)+")");
        System.out.println("Trimmed string ("+s1+")");
        System.out.println("LowerCase string is ("+s2+")");
        System.out.println("UpperCase string is ("+s3+")");
    }
    
    private static String CharArray2String(char[] array)
    {
        if(array == null || array.length == 0)
            return null;
        StringBuilder sb=new StringBuilder(Character.toString(array[0]));
        for (int i = 1; i < array.length; i++) {
            sb.append(" "+Character.toString(array[i]));
        }
        return sb.toString();
    }
    
}
