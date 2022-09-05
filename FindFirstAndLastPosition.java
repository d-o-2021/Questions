//Using Binary Search>>>>
import java.util.*;
class first_last {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(1);
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(5);
        al.add(5);
        al.add(5);
        al.add(5);
        int arr[]=firstAndLastPosition(al, al.size(), 3);
        for(int i:arr)System.out.print(i+" ");
        // System.out.println(al.get(0));
    }

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int start=0;
        int end=n-1;
        int mid=start+(end-start)/2;
        while(start<=end)
        {
            if(arr.get(mid)==k)
            {
                int i=mid;int j=mid;
                while(i>0&&arr.get(i-1)==k)
                {
                    i--;
                }
                while(j<n-1&&arr.get(j+1)==k)
                {
                    j++;
                }
                return new int[]{i,j};
            }
            else if(arr.get(mid)<k)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
            mid=start+(end-start)/2;
        }
        return new int[]{-1,-1};
    }
};
