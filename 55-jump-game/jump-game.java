class Solution {
    public boolean canJump(int[] nums) {
         int n = nums.length;
        int endpos = n-1;
        int maxLen = 0;
        if (n == 1)
        return true;
        if (nums[0] == 0)
        return false;
        // for (int i = 0 ;i < n -1 ;i ++){
        //     if (i + nums[i] >= endpos)
        //         return true;
        //     maxLen = nums[i];
        //     for (int j = i + 1 ;j <= nums[i] ; j++){
        //         if ( j + nums[j] >= endpos)
        //             return true;
        //         if (maxLen + nums[j] == j)
        //             return false;
        //     }
        // }
        int farpos = 0;
        for (int i = 0; i < n ;i ++){
                if (i > farpos) 
                return false;
            farpos = Math.max(farpos,nums[i] + i);
        }
        return true;
    }
}

// i + nums[i] <- farPos
// farpos + index == endpos;
// far = 0;
// for i = 0 to n -1 ;
//     if (i > farpos)
//      return false;

//     farpos = max(farpos, nums[i] + i);
// }