package ClassWork0313_17;

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

    //for-each loop

    for (int num : nums ){
        System.out.println(nums[num]);
    }

    //Mulidimensoinal Array
    //Its an Array of Arrays 

    int[][] nums2 = {{5, 4, 6, 1}, {8, 7, 9}};
    //5 4 6 1
    //8 7 9
    System.out.println(nums2[0][2]);

    nums2[0][2] = 300;
    
    System.out.println(nums2[0][2]);

    System.out.println(nums2.length);
    System.out.println(nums2[0].length);
    

    /* 
    for (int ){
        for()
    }
    */






    }

  
    
}
