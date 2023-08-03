//reverse a string using stack

import java.util.*;

public class ReverseStringUsingStack 
{
    public static String reverse( String str )
    {
        Stack<Character>st=new Stack<>();   //stack to perform reverse
        StringBuilder sb=new StringBuilder();   

        for( int i=0 ; i<str.length() ; i++ )
        {
            //every character from the string push to the stack 
            st.push( str.charAt(i) );
        }

        while( !st.isEmpty() )
        {
            //from the stack characters are added to the stingbuilder
            //using stringbuilder is very efficient for memory usage 
            sb.append( st.pop() );
        }
        return sb.toString();   //convert to string and return
    }

    public static void main( String args[])
    {
        Scanner Sc=new Scanner(System.in);
        String str=Sc.next();   //input a string from user
        String s=reverse( str); //method call and store the return value
        System.out.print(s);    //print the ouput
    }
}
