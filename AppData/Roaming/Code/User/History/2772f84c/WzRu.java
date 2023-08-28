package ClassWork3;

public class ClassWork03132023 {

    public static void main(String[] args){

    //Java Arrays
    //Arrays are used to store multipe values in a 
    //single variable, instead of declaring separate variables

    String[] names = {"Batman", "Robin" , "Bruce Wayne", "Alfred"}; //declared an array variable
    
    System.out.println(names[1]);

    int[] nums = {5, 3, 2, 7, 9, 8, 23};
    System.out.println(nums[2]);

    nums[1] = 500;

    System.out.println(nums.length);

    //Loop through an Array

    for (int i = 0; i < nums.length; i++){
        System.out.println(nums[i]);

    }



    }

  
    
}
