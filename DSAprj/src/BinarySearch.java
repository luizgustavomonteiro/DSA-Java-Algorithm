
//This is the class declaration
// The public means it can accessed from other classes
public class BinarySearch {
    
    //Method declaration and documentation
    //Method named search
    /*two parameters:
    array - to search the value
    key - to find the value
    Return int - the index where target is found
    */

    public int search(int[] arr, int key)
    {
        /*
         * Input validation 
         * If array is null 
         * If array is empty
         * Return -1 either codition is true
         */
        if(arr == null || arr.length == 0)
        {
            return -1;
        }
        /*
         * Initialize the points
         * left: points to start search range
         * right: points to end of search range
         * arr.length - 1: last index of array(because array indices start at 0)
         * So, if I have a range of 5 elements, for this array, the indices go from 0 to 4 (not 5).
         */
        int left = 0;
        int right = arr.length - 1;

        /*Binary search loop
         * Continues searching while there are elements to check
         * <= is crucial : ensures we check single-element ranges
         */
        while(left <= right)
        {
            int mid = left + (right - left) / 2;
            /*
             * Find middle point
             * Check middle element
             */

            if(arr[mid] == key){
                return mid;
                //mid found at first change - Best case senario: 0(1)
                
            }else if (arr[mid] < key){
                left = mid + 1;
                /*
                 * If middle element is too small
                 * Search right half of array
                 * mid + 1 because we already checked mid
                 */
            }else{
                right = mid - 1;
                /*
                 * 
                 */
            }
        }
        return -1;
        //Element not found
    }

}
