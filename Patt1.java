/*
1
01
101
0101
10101
 */
public class Patt1{
    public static void main(String[]args){
        int i,j;
        for(i=0;i<5;i++){
            for(j=0;j<i;j++){
                if((i+j)%2!=0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
        System.out.println();
        }
    }
}
    
        