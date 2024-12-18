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

    void preOrder(TreeNode* cloned, int val){
        if(!cloned){
            return;
        }
        if(cloned->val == val){
            wanted = cloned;
        }
        preOrder(cloned->left, val);
        preOrder(cloned->right, val);
    }
    TreeNode* getTargetCopy(TreeNode* original, TreeNode* cloned, TreeNode* target) {
        preOrder(cloned, target->val);
        return wanted;
    }
};