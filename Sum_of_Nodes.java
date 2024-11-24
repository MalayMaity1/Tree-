public class Sum_of_Nodes{
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
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=sum(root.left);
        int rightsum=sum(root.right);
        return leftsum+rightsum+root.data;
    }

    public static void main(String args[]){
        Node newNode=new Node(1);
        newNode.left=new Node(2);
        newNode.right=new Node(3);
        newNode.left.left=new Node(4);
        newNode.left.right=new Node(5);
        newNode.right.left=new Node(6);
        newNode.right.right=new Node(7);
        System.out.println(sum(newNode));
    }
}