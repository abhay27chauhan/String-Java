class permutationsOfAString{

    public static int factorial(int n){
        if(n == 1){
            return 1;
        }

        int fnm1 = factorial(n-1);
        int fn = n*fnm1;

        return fn;
    }

    public static void main(String[] args){
        String str = "abc";

        int n = str.length();
        int f = factorial(n);

        for(int i=0; i<f; i++){
            StringBuilder sb = new StringBuilder(str);
            int temp = i;
            for(int j=n; j>=1; j--){
                int idx = temp%j;
                temp = temp/j;

                System.out.print(sb.deleteCharAt(idx));
            }
            System.out.println();
        }
    }
}