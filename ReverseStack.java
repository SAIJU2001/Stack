//reverse a stack using recursion

import java.util.*;

public class ReverseStack 
{
    public static void reversePush( Stack<Integer>st, int val )
    {
        if( st.isEmpty() )
        {
            //if stack is empty push the value to the stack
            st.push( val);
            return;
        }

        int top=st.pop();   //pop and store the top value
        reversePush( st, val );    //recursion call
        st.push( top);  //push th stop value after recursion
    }

    public static void main(String[] args) 
    {
        Scanner Sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();   
        
        int n=Sc.nextInt(); //how many value you can add to the stack
        while( n-->0 )
        {
            //value added to the stack
            int val=Sc.nextInt();
            reversePush( st,val );
        }

        while( !st.isEmpty() )
        {
            //check the peek value and remove the value from the stack 
            System.out.print( st.peek()+" ");
            st.pop();
        }
    }
}
