public class App {

    public static void testBinarySearch() {
        
        BinarySearch bs = new BinarySearch();

        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17};
        int[] emptyArray = {};
        int[] singleElement = {42};
        int[] duplicates = {1, 2, 2, 2, 3, 3, 4, 5};

        int test1 = bs.search(sortedArray, 7);
        System.out.println("Result of searching for 7: " + test1);

        int test2 = bs.search(emptyArray, 10);
        System.out.println("Result of searching for 10:" + test2);

        int test3 = bs.search(singleElement, 44);
        System.out.println("Result of searching for 44: " + test3);

        int test4 = bs.search(duplicates, 3);
        System.out.println("Result of searching 3: " + test4);
        
        


    }

    

    public static void main(String[] args) throws Exception {
        testBinarySearch();

    }

    
}
