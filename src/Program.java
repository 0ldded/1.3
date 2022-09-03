public class Program
{
    public static void main(String args[])
    {
        int[] MyArray = new int[] {1,2,3,4,5,6,7,8,9,10};

        int num_for = 0;
        int i = 0;
        //==FOR==
        for (; i < MyArray.length; i++)
        {
            num_for += MyArray[i];
        }
        System.out.println(num_for);

        //==while==
        int num_while = 0;
        i = 0;
        while(i < MyArray.length)
        {
            num_while += MyArray[i];
            i++;
        }
        System.out.println(num_while);

        //==do while==
        int num_do_while = 0;
        i = 0;
        do
            {
                num_do_while += MyArray[i];
                i++;
            }while (i + 1<= MyArray.length);
        System.out.println(num_do_while);
    }
}
