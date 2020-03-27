public class Function {
    public static int[] solution(float[] arr, float target)
    {
        int[] res=new int[2];

        for(int i=0;i<arr.length;i++)
        {
            float second=target-arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                if(second==arr[j])
                {
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }

        }
        throw new IllegalArgumentException("BRAK");
    }

}
