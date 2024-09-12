import com.mufasa.InsertionSort;

import org.junit.Test;

public class InsertionSortTest {


    @Test
    public void testInsertionSort1000Elements(){
        int[] array = SortTestUtil.generateRandomIntArray(1000);

        InsertionSort.sort(array);

        SortTestUtil.verifyArrayIsInNondecreasingOrder(array);
    }


    @Test
    public void testInsertionSort10000Elements(){
        int[] array = SortTestUtil.generateRandomIntArray(10000);

        InsertionSort.sort(array);

        SortTestUtil.verifyArrayIsInNondecreasingOrder(array);
    }

}
