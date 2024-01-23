public class matrix {
    public static void main(String[] args) 
    {

        // int num[][] = new int[3][4];   normal array
        int num[][] = new int[3][];  // jagged array(number of colums are not specified)

        num[0] = new int[3];
        num[1] = new int[5];
        num[2] = new int[4];

        System.out.print("First matrix:");
        System.out.println();

        for(int i=0;i<num.length;i++)
        {
            System.out.print("             ");
            for(int j=0;j<num[i].length;j++)
            {
                num[i][j] = (int)(Math.random() * 10);
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Second matrix:");
        System.out.println();

        // enhanced for loop
        for(int n[] : num)
        {
            System.out.print("             ");
            for(int m : n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
    
}
