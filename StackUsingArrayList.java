//using aarra list implemet the stack

import java.util.*;

public class StackUsingArrayList 
{
    static ArrayList<Integer>arr;   //arrayist

    static class Stack
    {
        public Stack()
        {
            //constructor
            arr=new ArrayList<>();
        }

        public void push( int val )
        {
            //push the value to the list
            arr.add( val);
        }

        public int peek()
        {
            if( isEmpty() )
            {
                //if empty print the statement and return
                System.out.print( "stack is empty");
                return -1;
            }

            return arr.get( arr.size()-1 ); //return the last index value
        }

        public int pop()
        {
            if( isEmpty() )
            {
                //if empty print the statement and return
                System.out.print( "stack is full");
                return -1;
            }

            int top=arr.get( arr.size()-1 );    //colllecting the data of last index
            arr.remove( arr.size()-1 ); //remove last index value
            return top;     //return the collecting value
        }

        public boolean isEmpty()
        {
            //if the list size is zero it returns true
            return arr.size()==0;
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

