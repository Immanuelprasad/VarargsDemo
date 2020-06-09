class Calc
{
    public int add(int ...n)          //Variable Length Arguments
    {
        int sum = 0;
        for(int i :n)
        {
            sum = sum+i;
        }
        return sum;
    }

}
public class VarargsDemo
{
    public static void main(String[] args)
    {
        Calc obj = new Calc();
        System.out.println(obj.add(5,78,9,23,6,4));
    }
}
