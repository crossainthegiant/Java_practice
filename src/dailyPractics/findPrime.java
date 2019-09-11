package dailyPractics;

/*
 * @Author: qph
 * @Date: 2019/9/11 16:23
 * @description: 输出100到200范围内所有的素数
 */
public class findPrime {
    public static void main(String[] args) {
        int n=0;
        int[] array1 = new int[201];
        int[] array2 = new  int[201];
        for (int i=0;i<201;i++){
            array1[i] = i;
            array2[i] = 1;
        }
        for (int j=2;j<=100;j++){
            for (int k = j+1;k<201;k++){
                if (k%j==0){
                    array2[k]=0;
                }
            }
        }
        for (int l=101;l<201;l++){
            if (array2[l]==1){
                System.out.println(array1[l]);
                n++;
            }
        }
        System.out.println("100到200之间有"+n+"个素数！");
    }
}
