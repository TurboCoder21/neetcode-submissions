class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        i=0
        
        while i<len(arr)-1:
            index=i+1
            max=arr[index]
            while index<len(arr):
                if(arr[index]>max):
                    max=arr[index]
                index+=1
            arr[i]=max
            i+=1

        arr[-1]=-1
        return arr