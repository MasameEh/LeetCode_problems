/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */

class Solution {
public:
    TreeNode* wanted;

    void inOrder(TreeNode* cloned, int val){
        if(!cloned){
            return;
        }
        if(cloned->val == val){
            wanted = cloned;
        }
        inOrder(cloned->left, val);
        inOrder(cloned->right, val);
    }
    TreeNode* getTargetCopy(TreeNode* original, TreeNode* cloned, TreeNode* target) {
        inOrder(cloned, target->val);
        return wanted;
    }
};