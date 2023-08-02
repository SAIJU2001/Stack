//check the give parenthesis are balanced or not

import java.util.*;

public class ValidParenthesis 
{
    public static boolean checkParenthesis( String str )
    {
        Stack<Character>st=new Stack<>();   //stack to perform checker   

        for( int i=0 ; i<str.length() ; i++ )
        {
            char ch=str.charAt(i);  //extract every character from string using index
            
            if( ch=='(' || ch=='{' || ch=='[' )
            {
                //check if the char is opening brace then add to the stack
                st.push( ch );
            }
            else if( !st.isEmpty() && ( (ch==')' && st.peek()=='(') || (ch=='}' && st.peek()=='{') || (ch==']' && st.peek()=='[') ) )
            {
                //check if the char is closing brace then check the top of the stack
                //if both are same then remove the top of the stack
                st.pop();
            }
            else
            {
                return false;
            }
        }

        if( !st.isEmpty() )
        {
            //after completing the all push and pop operation check stack is empty or not
            //if not empty then return false
            return false;
        }

        return true;   
    }

    public static void main( String args[])
    {
        Scanner Sc=new Scanner(System.in);
        String str=Sc.next();   //input a string from user
        boolean check=checkParenthesis( str); //method call and store the return value
        System.out.print(check);    //print the ouput
    }
}

