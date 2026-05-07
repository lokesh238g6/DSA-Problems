class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        merge=nums1+nums2
        merge.sort()
        t=len(merge)
        if t%2==1:
            return (merge[t//2])
        else:
            c=merge[t//2-1]
            k=merge[t//2]
            return((c)/2+(k)/2)   