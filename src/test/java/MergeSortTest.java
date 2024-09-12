import com.mufasa.MergeSort;
import org.junit.Test;

public class MergeSortTest {

    @Test
    public void testMergeSort1000Elements(){
        int[] array = SortTestUtil.generateRandomIntArray(1000);

        MergeSort.sort(array);

        SortTestUtil.verifyArrayIsInNondecreasingOrder(array);
    }


    @Test
    public void testMergeSort10000Elements(){
        int[] array = SortTestUtil.generateRandomIntArray(10000);

        MergeSort.sort(array);

        SortTestUtil.verifyArrayIsInNondecreasingOrder(array);
    }
}
