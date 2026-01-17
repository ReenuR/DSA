class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    HashSet<Integer> set1 = new HashSet<>();
    HashSet<Integer> set2 = new HashSet<>();

    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    for(int x: nums1){set1.add(x);}
    for(int x: nums2) set2.add(x);

    for(int i : set1){
        if(!set2.contains(i))
            list1.add(i);
    }
    for(int x: set2){
        if(!set1.contains(x))
            list2.add(x);
    }
    return Arrays.asList(list1, list2);
    }
}

/** I can create 2 hashMaps and store all the values of nums1 in it and another map map2 ehich contains all the value of nums2. and then loop over values of num1 over map2 and val of num2 in map1. if map1 doesnt contain values add it to list[1] and if nums1 value is not in map2, add them into list[0] */