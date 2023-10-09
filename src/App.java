import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int numbers[] = new int[3];
        int i = 0;

        try (Scanner input = new Scanner(System.in)) {
            for(i = 0; i < numbers.length; i++){
                System.out.println("Enter a number");
                numbers[i] = input.nextInt();
            }
        }

        System.out.println(mathFunction(numbers));
    }

    public static String mathFunction(int[] nums) {
        
        String answer = "";

        if(nums[0] + nums[1] == nums[2]){
            answer += "+";
        }
        if(nums[0] - nums[1] == nums[2]){
            answer += "-"; 
        }
        if(nums[0] * nums[1] == nums[2]){
            answer += "*";
        }
        if(nums[0] / nums[1] == nums[2]){
            answer += "/";
        }
        else{
            if(answer.isEmpty()){
                answer = "None";
            }
        }
            return answer;   
    }
}
