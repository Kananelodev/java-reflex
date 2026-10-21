// package drills.p02_two_pointers;

// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.Timeout;
// import java.util.*;
// import java.util.stream.*;
// import static org.junit.jupiter.api.Assertions.*;

// @Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
// class ThreeSumTest {

//     static List<List<Integer>> norm(List<List<Integer>> in) {
//         List<List<Integer>> out = new ArrayList<>();
//         for (List<Integer> t : in) { List<Integer> s = new ArrayList<>(t); Collections.sort(s); out.add(s); }
//         out.sort(Comparator.comparing((List<Integer> t) -> t.get(0)).thenComparing(t -> t.get(1)).thenComparing(t -> t.get(2)));
//         return out;
//     }
//     @Test void basic() {
//         assertEquals(List.of(List.of(-1, -1, 2), List.of(-1, 0, 1)), norm(ThreeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4})));
//     }
//     @Test void none() { assertEquals(List.of(), ThreeSum.threeSum(new int[]{0, 1, 1})); }
//     @Test void allZeros() { assertEquals(List.of(List.of(0, 0, 0)), norm(ThreeSum.threeSum(new int[]{0, 0, 0, 0}))); }
//     @Test void tooShort() { assertEquals(List.of(), ThreeSum.threeSum(new int[]{0, 0})); }
//     @Test void largeIsValidAndUnique() {
//         Random rnd = new Random(42);
//         int[] nums = rnd.ints(3000, -1000, 1001).toArray();
//         List<List<Integer>> res = norm(ThreeSum.threeSum(nums));
//         assertFalse(res.isEmpty());
//         assertEquals(res.size(), new HashSet<>(res).size(), "duplicate triplets");
//         for (List<Integer> t : res) assertEquals(0, t.get(0) + t.get(1) + t.get(2));
//     }
// }
