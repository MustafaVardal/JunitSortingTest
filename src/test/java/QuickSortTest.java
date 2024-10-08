import com.mufasa.QuickSort;
import org.junit.Test;


public class QuickSortTest {

    @Test
    public void testQuickSort1000Elements(){
        int[] array = SortTestUtil.generateRandomIntArray(1000);

        QuickSort.sort(array);

        SortTestUtil.verifyArrayIsInNondecreasingOrder(array);
    }


    @Test
    public void testQuickSort10000Elements(){
        int[] array = SortTestUtil.generateRandomIntArray(10000);

        QuickSort.sort(array);

        SortTestUtil.verifyArrayIsInNondecreasingOrder(array);
    }
}