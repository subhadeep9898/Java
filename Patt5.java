/*
1 2 3 4
2 3 4 1
3 4 1 2
4 1 2 3
*/
public class Patt5{
    public static void main(String[]args){
        int i,j,k;
        for(i=1;i<=4;i++){
            for(j=1;j<=4;j++){
                k=(i+j-1);
                if(k>4){
                System.out.print(k-4);
                }else{
                    System.out.print(k);
                }
            }
        System.out.println();
        }
    }
}