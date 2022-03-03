public class FunWith2DArrays {

    public static int totalElements(int[][] lists)
    {
        return lists.length*lists[0].length;
    }

    public static void fourCorners(String[][] lists)
    {
        System.out.println(lists[0][0]);
        System.out.println(lists[0][lists[0].length-1]);
        System.out.println(lists[lists.length-1][0]);
        System.out.println(lists[lists.length-1][lists[lists.length-1].length-1]);
    }

    public static double average(int [][] ints){
        int rows = ints[0].length;
        int columns = ints.length;
        int total = 0;
        int amount = 0;
        for(int i = 0; i < rows; i ++)
        {
            for(int z = 0; z < columns; z++)
            {
                total += ints[z][i];
                amount ++;
            }
        }
        return (total * 1.0)/(amount);
    }
    public static int[] indexFound(String [][] str, String target){
        int rows = str[0].length;
        int columns = str.length;
        int returnRows = -1;
        int returnColumns = -1;

        for(int i = 0; i < rows; i ++)
        {
            for(int z = 0; z < columns; z++)
            {
                if(str[z][i] == target)
                {
                    returnRows = z;
                    returnColumns = i;
                }
            }
        }
        int[] falseReturn = {returnRows, returnColumns};
        return falseReturn;
    }
}
