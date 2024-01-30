// this keyword
// static keyword and its uses
public class Lecture10 {
    int rollno;
    String name;
    static int count = 0;

    Lecture10(int rollno, String namString) {
        this.rollno = rollno;
        this.name = name;
        count++;
    }

    static void show() {
        System.out.println(count);
    }

    public static void main(String[] args) {
        Lecture10 a = new Lecture10(1, "Aatif");
        System.out.println(count);
        Lecture10 b = new Lecture10(1, "Aatif");
        System.out.println(count);
        Lecture10 c = new Lecture10(1, "Aatif");
        System.out.println(Lecture10.count);
        Lecture10.show();
    }
}
