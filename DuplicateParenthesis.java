//find any duplicate parenthesis return true
/*
 *  input: (((a)+b)+(c+d))  output: true
 *  input: ((a+b)+(c+d))    output: false
 */
import java.util.*;

public class DuplicateParenthesis 
{
    public static boolean findDuplicate( String str )
    {
        Stack<Character>st=new Stack<>();   //stack to perform checker 
        for( int i=0 ; i<str.length() ; i++ )
        {
            char ch=str.charAt(i);  //extract every character from string using index
            
            if( ch==')' )
            {
                int count=0;
                while( !st.isEmpty() && st.peek()!='(' )
                {
                    st.pop();
                    count++;
                }

                if( count<1 )
                {
                    return true;
                }
                else
                {
                    st.pop();
                }
            }
            else
            {
                st.push( ch );
            }
        }

        return false; 
    }

    public static void main( String args[])
    {
        Scanner Sc=new Scanner(System.in);
        String str=Sc.next();
        boolean check=findDuplicate( str );
        System.out.print(check );
    }
}
