public class Main {
    public static void main(String[] args) {
      int[] arr = {3,9,6,7,9};
      int[] arr2 = {3,9,6,7,7,9,7,7};
      
      System.out.print(isSorted(arr,0));

      ArrayList<Integer> list = index(arr2,0,7,new ArrayList<>());
      
      for(int num: list){
        System.out.print(num);
      }
  }
  
  static boolean isSorted(int[] arr,int index){
    if(index == arr.length-1) return true; 
    return arr[index] < arr[index+1] && isSorted(arr, index+1);
  }

  static ArrayList<Integer> index(int[] arr, int index, int target ,ArrayList<Integer> list){
     if(index == arr.length) return list;
     if(arr[index] == target) list.add(index);
     
     return index(arr,index+1,target,list);
  }
}
