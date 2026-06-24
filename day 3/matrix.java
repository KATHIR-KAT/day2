import java.util.*;

public class matrix{
   public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 int[][] arr1 = new int[3][3];
int[][] arr2 = new int[3][3];
int[][] sum = new int[3][3];

 System.out.println("Enter the elements");
 for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
              arr1[i][j]=sc.nextInt();
      }
    
   }

  for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
              arr2[i][j]=sc.nextInt();
      }
    
   }

   for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
              sum[i][j]=arr1[i][j]+arr2[i][j];
      }
    
   }

  System.out.println("Added");

   for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
              System.out.print(sum[i][j] + " ");
      }
      System.out.println();
   }

}
}
















