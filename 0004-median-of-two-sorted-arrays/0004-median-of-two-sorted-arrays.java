class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] arr = new int[m + n];

        int i = 0, j = 0, k = 0;

        // merge  both arrays
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                arr[k++] = nums1[i++];
            } else {
                arr[k++] = nums2[j++];
            }
        }

        // bachhee elements of nums1
        while (i < m) {
            arr[k++] = nums1[i++];
        }

        // bachhee elements of nums2
        while (j < n) {
            arr[k++] = nums2[j++];
        }

        int total = m + n;

        // Odd hoga toh
        if (total % 2 == 1) {
            return arr[total / 2];
        }

        // Even hoga toh
        return (arr[total / 2 - 1] + arr[total / 2]) / 2.0;
    }
}