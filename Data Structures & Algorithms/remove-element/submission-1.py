class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        count = 0  # This is our index pointer for where to place good numbers
        
        # Loop through every number in the array
        for num in nums:
            
            # If the current number is NOT the bad value...
            if num != val:
                
                 nums[count]=num
                 count+=1
                
            
        return count