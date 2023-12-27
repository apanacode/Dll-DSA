class Node {
    int data;
    Node next;
    Node back;

    Node(int data, Node next, Node back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }
}

class Double_LL {

    private static Node convertArr2Dll(int[] arr) {
        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, current);
            current.next = temp;
            current = temp;
        }
        return head;
    }

    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        int[] studentMarks = { 99, 98, 99, 90, 92 };
        Node h = convertArr2Dll(studentMarks);
        print(h);
    }

}
// class Node {
// int data;
// Node next;
// Node back;

// Node(int dataValue, Node nextValue, Node backValue) {
// this.data = dataValue;
// this.next = nextValue;
// this.back = backValue;
// }

// Node(int dataValue1) {
// this.data = dataValue1;
// this.next = null;
// this.back = null;
// }

// Node() {
// // this.data = null;
// this.next = null;
// this.back = null;
// }
// }

// class Lokesh {
// private static Node convertArr2Dll(int[] arr) {
// Node head = new Node(arr[0]);
// Node temp = head;
// for (int i = 1; i < arr.length; i++) {
// Node current = new Node(arr[i], null, temp);
// temp.next = current;
// temp = current;
// }
// return head;
// }

// private static void print(Node head) {
// while (head != null) {
// System.out.print(head.data + " ");
// head = head.next;
// }
// }

// public static void main(String args[]) {
// int[] studentMarks = { 22, 23, 20, 23, 25 };
// System.out.println("hlo this my world");
// Node h = convertArr2Dll(studentMarks);
// System.out.println(h.data);
// print(h);

// }
// }