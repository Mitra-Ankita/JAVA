public class Day7AlphabetPattern{
    public static void main(String[] args) {
        for(int row=0;row<7;row++)
        {
            for(int col=0;col<5;col++)
            {
                if((row==0 || row==3)&&(col==1||col==2||col==3))
                {
                    System.out.print("* ");
                }
                else if((row==1|| row==2|| row==3|| row==4|| row==5|| row==6)&&(col==0||col==4))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
/*public class Day7AlphabetPattern{
    public static void main(String[] args) {
        for(int row=0;row<7;row++)
        {
            for(int col=0;col<5;col++)
            {
                if((row==0 || row==1 )&&(col==0||col==4))
                {
                    System.out.print(". ");
                }
                else if((row==0 || row==2)&&(col==1||col==3))
                {
                    System.out.print(". ");
                }
                else if((row==1 || row==3)&&(col==2))
                {
                    System.out.print(". ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}*/
