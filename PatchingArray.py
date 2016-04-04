class Solution(object):
    def minPatches(self, nums, n):
        """
        :type nums: List[int]
        :type n: int
        :rtype: int
        """
        miss = 1
        i = 0
        res = 0
        while miss <= n:
            if i < len(nums) and miss >= nums[i]:
                miss = miss + nums[i]
                i = i+1
            else:
                miss = miss + miss
                res = res + 1
        return res
