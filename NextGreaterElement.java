//next greater element problem
/*
 *  input : arr[]={6,8,0,1,3}
 * output : 8 -1 1 3 -1
 */

import java.util.*;

public class NextGreaterElement 
{
    public static int[] nextGreater( int arr[] )
    {
        Stack<Integer>st=new Stack<>(); //stack
        int result[]=new int[arr.length];   //result store in this array

        for( int i=arr.length-1 ; i>=0 ; i-- )
        {
            //traverse from the end of the array
            while( !st.isEmpty() && arr[st.peek()]<=arr[i] )
            {
                st.pop();
            }
            if( st.isEmpty() )
            {
                result[i]=-1;
            }
            else
            {
                result[i]=arr[st.peek()];
            }
            st.push(i);
        }
        return result;
    }
    public static void main( String args[] )
    {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int arr[]=new int[n];
        for( int i=0 ; i<n ; i++ )
        {
            arr[i]=Sc.nextInt();
        } 
        int result[]=nextGreater( arr );
        for( int i=0 ; i<result.length ; i++ )
        {
            System.out.print( result[i]+" ");
        }  
    }
}
