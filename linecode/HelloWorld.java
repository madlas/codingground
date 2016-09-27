public class HelloWorld{

    /**
     * @param nums1 an integer array
     * @param nums2 an integer array
     * @return an integer array
     */
     
    public static int[] intersection(int[] nums1, int[] nums2) {
        // Write your code here
        int maxlen;
        int maxnums[], minnums[];
        
        if (nums1.length > nums2.length) {
            maxlen = nums1.length;
            maxnums = nums1;
            minnums = nums2;
        }else {
            maxlen = nums2.length;
            maxnums = nums2;
            minnums = nums1;
        }
        
    
        
        int []rtn = new int[minnums.length];
        
        //for (int i1 = 0; i1 < maxnums; i1++) {
        for (int i:integers)
            /*
            for (int i2 = 0; i2 < minnums; i2++) {
                //if (nums1[i1 + i2] ==  )
                ;
            }*/
        }
        
        System.out.println("kkkkk");
        return rtn;
    }
    
   
    public static void main(String []args){
        System.out.println("Hello World");
        
        int a[]={1,2,2,1};
        int b[] = {2,2};
        intersection(a, b);
     }
}
