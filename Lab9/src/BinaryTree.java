/**
 * Created by TOSHIBA on 19/03/22.
 */
public class BinaryTree<E> {
  private    Node<E>root=null;
    private  int size=0;

    public boolean isEmpty()
    {
        return size==0;
    }

    public  int size()
    {
        return size;
    }



    protected Node<E>createNode(E e,Node<E>p,Node<E>l,Node<E>r)

    {
        return new Node<E>(e,p,l,r);
    }

    protected Node<E>validateNode(Position<E>p){
        if(!(p instanceof Node))
            throw new IllegalStateException("p is not a vaild position");
        Node<E>n=(Node<E>)p;
        if(n.getParent()==n)
            throw new IllegalStateException("p is not exist anymore");
        return n;
    }


    public Position<E>root(){
        return root;
    }

    public Position<E>parent(Position<E>p){
        Node<E>N=validateNode(p);
        return n.getparent();
    }

    public Position<E>left(Position<E>){
        Node<E>N=validateNode(p);
        return n.getleft();
    }
    public Position<E>right(Position<E>){
        Node<E>N=validateNode(p);
        return n.getright();
    }
    public int numofchildern(Position<E>p){
       int count=0;
        if(left(p)!=null)
            count++;
        if(right(p)!=null)
            count++;
        return count;
    }



    private static class Node<E>implements Position<E>
    {
E element;
        Node<E>parent;
        Node<E>left;
        Node<E>right;

        public Node(E element, Node<E> parent, Node<E> left, Node<E> right) {
            this.element = element;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getParent() {
            return parent;
        }

        public void setParent(Node<E> parent) {
            this.parent = parent;
        }

        public Node<E> getLeft() {
            return left;
        }

        public void setLeft(Node<E> left) {
            this.left = left;
        }

        public Node<E> getRight() {
            return right;
        }

        public void setRight(Node<E> right) {
            this.right = right;
        }

        @Override
        public E getElment() {
            return element;
        }
    }
}
