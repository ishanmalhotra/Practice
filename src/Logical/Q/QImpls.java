package Logical.Q;

/**
 * Created by ishanmalhotra on 25/5/16.
 */
public class QImpls {

    public static void main(String... a){
        QIntModel Q=new QIntModel(5);
        try {
            Q.enqueue(1);
        } catch (Exception e) {
            e.printStackTrace();
        }try {
            Q.enqueue(2);
        } catch (Exception e) {
            e.printStackTrace();
        }try {
            Q.enqueue(3);
        } catch (Exception e) {
            e.printStackTrace();
        }try {
            Q.enqueue(4);
        } catch (Exception e) {
            e.printStackTrace();
        }try {
            Q.enqueue(5);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Q.dequeue();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Q.enqueue(6);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Q.dislay();
    }
}
