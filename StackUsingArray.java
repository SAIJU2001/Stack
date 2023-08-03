//using array implementing stack

import java.util.*;

public class StackUsingArray
{
    static int arr[];
    static int rear;

    static class Stack
    {
        public Stack()
        {
            //constructor
            arr=new int[10];    //here array size is 10 
            rear=-1;    //rear pointer for pointing the top value
        }

        public void push( int val )
        {
            if( isFull() )
            {
                //it checks array is full or not
                //if full print this statement and return
                System.out.print( "stack is full");
                return;
            }

            rear++; //rear value increase
            arr[rear]=val;  //add the value to the rear index
        }

        public int peek()
        {
            if( isEmpty() )
            {
                //it checks array is empty or not
                //if full print this statement and return -1
                System.out.print( "stack is empty");
                return -1;
            }
            return arr[rear];   //return rear index value
        }
        public int pop()
        {
            if( isEmpty() )
            {
                //it checks array is empty or not
                //if full print this statement and return -1
                System.out.print( "stack is empty");
                return -1;
            }

            int top=arr[rear];  //store rear index value
            rear--;             //rear index decrease
            return top;         //return the stored value
        }

        public boolean isEmpty()
        {
            //it checks array is empty or not if empty return true
            return rear==-1;
        }

        public boolean isFull()
        {
            //it checks array is full or not if full return true
            return rear==arr.length;
        }
    }
    public static void main(String[] args) 
    {
        Scanner Sc=new Scanner(System.in);
        Stack st=new Stack();   //call
        
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