from TreeNode import TreeNode
class Solution(object):
    def kthSmallest(self, root, k):
        """
        :type root: TreeNode
        :type k: int
        :rtype: int
        """
        return self.inOrder(root,0,k)
    def inOrder(self,root,order,k):
        if(root.left != None):
            self.inOrder(root.left,order,k)
        order = order + 1
        if order == k:
            print root.val
            return root.val

        if root.right != None:
            self.inOrder(root.right,order,k)
            print 11111111
if __name__ == '__main__':
    a = TreeNode(1)
    b = TreeNode(2)
    a.left = None
    a.right = b
    c = Solution()
    print c.kthSmallest(a,2)
