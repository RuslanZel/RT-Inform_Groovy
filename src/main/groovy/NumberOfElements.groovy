
class NumberOfElements {

    static Map findNumberElements(int[] arr) {

        Map countMap = new HashMap<>()

        if (arr == null || arr.length == 0) {
            throw new NoSuchElementException("Array is empty")
        }

        for (int num in arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1)
        }
        return countMap
    }
}
