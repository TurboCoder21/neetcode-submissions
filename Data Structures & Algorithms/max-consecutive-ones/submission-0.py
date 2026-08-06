class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        count=0
        temp=count
        i=0
        while i<len(nums):
            if nums[i] == 1:
                count+=1
            else: 
                count=0
            if count>temp:
                    temp=count
            i+=1

        return temp

        