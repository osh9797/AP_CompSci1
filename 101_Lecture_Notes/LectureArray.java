/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        // Your Code Goes here!
        int [] arr = {5,7,9,2,8,3,8,1};
        for(int i = 0; i<arr.length;i++) {
            System.out.println(arr[i]);
            
        }
        int dupecheck = 8;
        for(int i = 0; i<arr.length;i++){
            if(dupecheck==arr[i]){
                System.out.println(i);
            }
        }
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                
            }
        }
	}
}