package java_practice;

public class find_repeting_using_xor {

	public static void main(String[] args){

        int[] arr = {1,5,8,6,5,1,6,2};

        int xor = arr[0];
        for(int i = 0; i<arr.length-1;i++){

            xor = xor^arr[i+1];
            System.out.println(arr[i] + "^" + arr[i+1] + " = " + xor);
        }
        System.out.println("final xor: "+ xor);

//        pairing xor values: (xor ^ every array element)
//        if other value present in pairs in given array,
//        then xor them with xor-var will create same values-pairs,
//        only two numbers remains which are not in pairs,
//        those are the unique numbers which we want.

        int pairs[] = new int[arr.length];

        for(int k=0;k<arr.length;k++){
            pairs[k] = xor^arr[k];
//            System.out.println("xor ^ val2: "+xor+" ^ "+ val2);

        }

//        modifiying pairs array: inserting 0(zero) in pair positions
        for(int l=0;l<pairs.length;l++){
            for(int m = l+1; m < pairs.length; m++){
                if(pairs[l]==pairs[m]){
                    pairs[l]=pairs[m]=0;
                }
            }
        }

//        print unique values in pairs array
        for(int n=0;n<pairs.length;n++){
            if(pairs[n] != 0){
                System.out.println("num: "+pairs[n]);
            }
        }
    }
}
