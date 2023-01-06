public class Data {
    News head1, curn1;
    Node head, curn;

    void addwebpage(String name) {
        curn = head;
        Node obj = new Node(name);
        if (head == null) {
            head = obj;
        } else {
            while (curn.next != null) {
                curn = curn.next;
            }
            curn.next = obj;
            //obj.prev=curn;
            curn = obj;
        }
    }

    void addnews(String headline, String fullnews) {
        curn1 = head1;
        News obj = new News(headline, fullnews);
        if (head1 == null) {
            head1 = obj;
        } else {
            while (curn1.next != null) {
                curn1 = curn1.next;
            }
            curn1.next = obj;
            //obj.prev=curn;
            curn1 = obj;
        }
    }

    void print() {
        curn = head;
        while (curn.next != head) {
            System.out.println(curn.data + " ");
            if (curn.next == null) {
                return;
            }
            curn = curn.next;

        }
        //System.out.println(curn.Data);
    }
}
