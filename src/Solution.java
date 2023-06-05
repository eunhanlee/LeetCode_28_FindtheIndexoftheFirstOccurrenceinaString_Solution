
class Solution {

    /**
     * Finds the index of the first occurrence of the specified substring (needle)
     * within the given string (haystack).
     *
     * @param haystack the string to search within
     * @param needle   the substring to search for
     * @return the index of the first character of the substring if found,
     *         -1 if the substring is not found
     */
    public int strStr(String haystack, String needle) {
        // The indexOf() method searches for the first occurrence of the specified substring (needle)
        // within the given string (haystack). If found, it returns the index of the first character
        // of the substring; otherwise, it returns -1.
        return haystack.indexOf(needle);

        //if indexOf is forbidden..
        //========================================================================================
//        int end = needle.length();  // Ending index for the substring comparison
//        int start = 0;              // Starting index for the substring comparison
//
//        while (end <= haystack.length()) {
//            if (haystack.substring(start, end).equals(needle)) {
//                // If the substring from start to end is equal to the needle,
//                // return the start index as the first occurrence of the needle
//                return start;
//            }
//
//            start++;  // Move the start index to the right
//            end++;    // Move the end index to the right
//        }
//
//        // If the needle is not found, return -1
//        return -1;
        //========================================================================================
    }
}

