package dailyPractics;

/*
 * @Author: qph
 * @Date: 2019/9/14 19:02
 * @description: 题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 */
public class make_3numbers {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        int[] nums = new int[100];

        int count = 0;
        for (int i=0;i<4;i++){
            for (int j = 0;j<4;j++){
                if (i==j){
                    continue;
                }
                for (int k=0;k<4;k++){
                    if (k==i||k==j){
                        continue;
                    }
                    nums[count] = array[i]*100+array[j]*10+array[k];
                    count++;
                }
            }
        }
        System.out.println("共能组成"+count+"个数，分别是：");
        for (int i=0;i<count;i++){
            System.out.println(nums[i]);
        }


    }
}
