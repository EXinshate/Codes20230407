public class App9_4 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        try {
            System.out.print("数组名元素和为: " + sumArray(a));
        }
         catch(Exception e){
            System.out.println("异常类名称是： " + e);
            e.printStackTrace();
            System.out.println("异常对象的信息： " + e.getMessage());
            System.out.println(e.toString());
            StackTraceElement[] te = e.getStackTrace();
            for (int i = 0; i < te.length; i++) {
                System.out.print("被调用的方式： " + te[i].getMethodName());
                System.out.print(";被属类： " + te[i].getClassName());
                System.out.println(";所在行号： " + te[i].getLineNumber());
            }
        }
    }

    private static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i <= array.length; i++)
            sum += array[i];
        return sum;
    }
}
