public class count_Nodes{
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

    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=countNodes(root.left);
        int rightHeight=countNodes(root.right);
        return leftHeight+rightHeight+1;
    }
    public static void main(String args[]){
        Node newNode=new Node(1);
        newNode.left=new Node(2);
        newNode.right=new Node(3);
        newNode.left.left=new Node(4);
        newNode.left.right=new Node(5);
        newNode.right.left=new Node(6);
        newNode.right.right=new Node(7);
        System.out.println(countNodes(newNode));
    }
}