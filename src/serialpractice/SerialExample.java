package serialpractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialExample {

    public void SerializeIt(Student s1) {

        try {
            FileOutputStream fos = new FileOutputStream(
                    "C:/Users/t_sus_000/Desktop/EclipseFiles/abc.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.flush();

            oos.close();
            fos.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Student DeSerializeIt() {

        Student s1 = null;
        try {

            FileInputStream fis = new FileInputStream(
                    "C:/Users/t_sus_000/Desktop/EclipseFiles/abc.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            s1 = (Student) ois.readObject();

            ois.close();
            fis.close();
        } catch (Exception e) {
            System.out.println("Couldn't find file");
        }
        return s1;
    }

    public static void main(String[] args) {

        // Student s1 = new Student("Jake", 1001);
        SerialExample se = new SerialExample();
        // se.SerializeIt(s1);
        Student s = se.DeSerializeIt();
        System.out.println(s.name + " " + s.num);

    }

}
