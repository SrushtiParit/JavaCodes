
class ArrayDemo 
{
    public static void main(String Arg[])
    {
        //ways of creating single dimensional array 

        int Arr1[]={10, 20, 30, 40};

        //int Arr2[4] = {10, 20 ,30 , 40};     explicitly giving size is not allowed

        int Arr3[] = new int[4];   //this is creation of array with dynamiv memory allocation 
        Arr3[0] = 10;
        Arr3[1] = 20;
        Arr3[2] = 30;
        Arr3[4] = 40;

        int Arr4[] = new int[] {10,20,30,40};

        //int Arr4[] = new int[4]{10,20,30,40};  this is wrong int[4] giving size 4 is not allowed
    }
}