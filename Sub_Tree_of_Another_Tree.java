public class Sub_Tree_of_Another_Tree{
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static boolean isIdentical(Node node,Node subroot){
        if(node==null && subroot==null){
            return true;
        }
        else if(node==null || subroot==null || node.data!=subroot.data){
            return false;
        }
        if(!isIdentical(node.left, subroot.left)){
            return false;
        }
        if(isIdentical(node.right, subroot.right)){
            return false;
        }
        return true;
    }

    public static boolean isSubtree(Node root,Node subroot){
        if(root==null){
            return false;
        }
        if(root.data==subroot.data){
            if(isIdentical(root, subroot)){
                return true;
            }
        }
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }

    public static void main(String args[]){
        Node newNode=new Node(1);
        newNode.left=new Node(2);
        newNode.right=new Node(3);
        newNode.left.left=new Node(4);
        newNode.left.right=new Node(5);
        newNode.right.left=new Node(6);
        newNode.right.right=new Node(7);

        Node subNode=new Node(1);
        subNode.left=new Node(2);
        subNode.right=new Node(3);

        System.out.println(isSubtree(newNode, subNode));
    }
}