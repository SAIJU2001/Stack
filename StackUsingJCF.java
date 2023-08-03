//using java collection framework implement the stack

import java.util.*;

public class StackUsingJCF 
{
    public static void main(String[] args) 
    {
        Scanner Sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();    //collection framework
        
        int n=Sc.nextInt(); //how many value you can add to the stack
        while( n-->0 )
        {
            //value added to the stack
            st.push( Sc.nextInt() );
        }

        while( !st.isEmpty() )
        {
            //check the peek value and remove the value from the stack 
            System.out.print( st.peek()+" ");
            st.pop();
        }
    }
}

