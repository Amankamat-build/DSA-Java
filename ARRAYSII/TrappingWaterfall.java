package ARRAYSII;

public class TrappingWaterfall{

    public static int TrappedWater(int height[]){
        //left max boundry-
        int n=height.length;

        int leftMax[]=new int[n];
        leftMax[0]=height[0];

        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }

        //right max boundry
        int rightMax[]=new int [n];
        rightMax[n-1]= height[n-1]; // forr getting the ending of array
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        //we have to min among the both..->hright of boundry.
        int MinBar=0;
        int trappedWater=0;
        for(int i=0;i<n;i++){
            MinBar= Math.min(leftMax[i],rightMax[i]);
             //later on we trapped water add minHeight-height //.
            trappedWater+=MinBar - height[i];
        }
        return trappedWater;
    }

    public static void main(String[]args){
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Amount of water trapped:"+TrappedWater(height));
    }
    }
  
