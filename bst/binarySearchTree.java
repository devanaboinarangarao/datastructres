import java.util.*;

public class binarySearchTree {
    static class Node {
        int data;
        Node left, right;

        Node(int el) {
            this.data = el;
            this.left = null;
            this.right = null;
        }
    }

    static Node root;
    static Node temp = root;

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int ch = 0;

        do {
            System.out.println("\n1.Insert\n2.Delete\n3.Search\n4.Height\n5.Print\n6.Exit\n7.Random Insertion\n");
            System.out.println("Enter Your Choice in Above Options");
            ch = s.nextInt();

            switch (ch) {
            case 1: {
                System.out.println("Enter the element");
                int el = s.nextInt();

                Node node = new Node(el);
                System.out.println(temp +" "+node);
                insert(node, temp);
                break;
            }
            case 5: {
                int ch2 = 0;
                System.out.println("\n1.PreOrder\n2.InOrder\n3.PostOrder\n4.LevelOrder\nType Your choice\n");
                ch2 = s.nextInt();

                switch (ch2) {
                case 1: {
                    preOrderStack(root);
                    break;
                }
                case 2: {
                    inOrderStack(root);
                    break;
                }
                case 3: {
                    postOrder(root);
                    break;
                }
                case 4: {
                    levelOrder(root);
                    break;
                }
                default: {
                    System.out.println("Invalid Option is Given");
                }
                }
                break;
            }
            case 6: {
                System.out.println("ThankYou!! Hope to See you Again!!");
                ch = 6;
                break;
            }
            case 7: {
                randomInsertion();
                break;
            }
            default: {
                System.out.println("Invalid Option is Given");
            }
            }
        } while (ch != 6);
    }

    static void randomInsertion() {
        System.out.println("root1 " + root);

        if (root == null) {
            root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.right.right = new Node(5);
        }
    }

    static void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
        return;
    }
    static void preOrderStack(Node root) {
        Stack<Node> stack = new Stack<Node>();
        while(true) {
            while(root != null) {
                System.out.print(root.data +" ");
                stack.push(root);
                root = root.left;
            }
            if(stack.isEmpty()) {
                stack.clear();
                return;
            }
            Node node = stack.pop();
            root = node.right;

        }
    }

    static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
        return;
    }
    static void inOrderStack(Node root) {
        Stack<Node> stack = new Stack<Node>();
        while(true) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            } 
            if(stack.isEmpty()) {
                stack.clear();
                return;
            }
            root = stack.pop();
            System.out.print(root.data+" ");
            root = root.right;
        }
    }

    static void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
        return;
    }

    static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()) {
            Node node = q.poll();
            System.out.print(node.data +" ");
            if(node.left != null) {
                q.add(node.left);
            } 
            if(node.right != null) {
                q.add(node.right);
            }
        }
        return;
    }

    static void insert(Node node, Node temp) {
        if(temp == null) {
            root = node;
            return;
        }
        if(node.data >= temp.data ){
            if( temp.right == null) {
               temp.right = node; 
               return;
            }  else {
                insert(node, temp.right);
            }
        } 
        if(node.data < temp.data) {
            if(temp.left == null) {
                temp.left = node;
                return;
            } else {
                insert(node, temp.left);
            }
        }
    }
}