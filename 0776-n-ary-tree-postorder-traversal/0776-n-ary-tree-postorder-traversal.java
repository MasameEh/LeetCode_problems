/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> res = new ArrayList<>();

    void postorderTrav(Node root, List<Node> children)
    {
        if(root == null) return;

        for(var child : root.children){
            postorderTrav(child, children);
            res.add(child.val);
        }
    }

    public List<Integer> postorder(Node root) {
        if(root == null) return res;
        postorderTrav(root, root.children);
        res.add(root.val);
        return res;
    }
}