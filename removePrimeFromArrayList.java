import java.util.ArrayList;
class removePrimeFromArrayList{

    public static boolean isPrime(int n){
        for(int i=2; i*i<=n; i++){
            if(n%i == 0){
                return false;
            }
        }

        return true;
    }

    public static ArrayList<Integer> removePrime(ArrayList<Integer> nums){
        for(int i=nums.size()-1; i>=0; i--){
            if(isPrime(nums.get(i)) == true){
                nums.remove(i);
            }
        }

        return nums;
    }

    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(7);
        nums.add(12);
        nums.add(13);
        nums.add(15);

        System.out.println(removePrime(nums));
    }
}