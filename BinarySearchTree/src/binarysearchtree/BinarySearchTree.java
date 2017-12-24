package binarysearchtree;

import java.util.Scanner;

/**
 *
 * @author Rakesh
 */
public class BinarySearchTree {

    //insert data
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    //get the height of the tree
    public static int getHeight(Node root){
        if(root == null){
            return -1;
        }
        int leftnode = getHeight(root.left);
        int rightnode = getHeight(root.right);
        if(leftnode>rightnode)
            return leftnode+1;
        else 
            return rightnode+1;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}