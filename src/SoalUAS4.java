public class SoalUAS4 {
    public static void main(String[] args) {
        int n = 5;
        int i,j;
        for(i=1; i<=n; i++)
        {
            for(j=1; j<=n-i+1; j++)
            {
                System.out.print(" ");
            } 
            int num = 0;
            for(j=1; j<=i; j++)
            {
                System.out.print(num);
                num++;
            } 
            System.out.println();
        }
    }
}