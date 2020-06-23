package info.company.Lec11;

public class RecursionArray {

    public static void main(String[] args) {

        int[] ar= {1,2,3,4};
        System.out.println(sortedornot(ar,0));
    }

    public static boolean sortedornot(int[] ar, int index){

        if(index==ar.length-1){
            return true;
        }

        if(ar[index]>ar[index+1]){
            return false;
        }

        return sortedornot(ar,index+1);
    }

    public static int findelement(int[] ar, int index, int ele){

        if(index == ar.length){
            return -1;
        }

        if(ar[index]== ele){
            return index;
        }

        return findelement(ar, index+1, ele);
    }

    public static int sum(int n){

        if(n==1){
            return 1;       //Nth triangle
        }

        return n + sum(n-1);
    }


}
