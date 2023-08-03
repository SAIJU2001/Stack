//max Area in histogram
/*
*  input : heights[]={2,1,5,6,2,3}
* output : 10
*/

import java.util.*;

public class MaxAreaInHistogram 
{
    public static int maxAreaCalculate( int arr[] )
    {
        int n=arr.length;   //length of the array
        
        //step 1 : find next smaller right
        Stack<Integer>st=new Stack<>(); //stack
        int nsr[]=new int[n];   //next smaller right array

        for( int i=n-1 ; i>=0 ; i-- )
        {
            //traverse from the end of the array
            while( !st.isEmpty() && arr[st.peek()]>=arr[i] )
            {
                st.pop();
            }

            if( st.isEmpty() )
            {
                nsr[i]=n;
            }
            else
            {
                nsr[i]=st.peek();
            }
            st.push(i);
        }

        //step 2 : find next smaller left
        st=new Stack<>();
        int nsl[]=new int[n];

        for( int i=0 ; i<n ; i++ )
        {
            //traverse from the end of the array
            while( !st.isEmpty() && arr[st.peek()]>=arr[i] )
            {
                st.pop();
            }

            if( st.isEmpty() )
            {
                nsl[i]=-1;
            }
            else
            {
                nsl[i]=st.peek();
            }
            st.push(i);
        }

        int maxArea=Integer.MIN_VALUE;
        for( int i=0 ; i<n ; i++ )
        {
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int area=width*height;
            maxArea=Math.max( area, maxArea );
        }
        return maxArea;
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
        int result=maxAreaCalculate( arr );
        System.out.print( result); 
    }
}

