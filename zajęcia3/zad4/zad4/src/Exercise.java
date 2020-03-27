public class Exercise {
    public static void start()
    {
        Function ex=new Function();
        float[] arr= {2, 7, 11, 15};
        float target = 9;
        int[] res=ex.solution(arr,target);
        System.out.println(res[0]+" "+res[1]);

    }
}
