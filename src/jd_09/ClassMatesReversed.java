package jd_09;

public class ClassMatesReversed {

    public static void main(String[] args) {

        String[] classMates = {"Joe Rogan", "Elon Musk", "Joe Biden", "Ridwan AlKhafagi", "Owen Smith", "Chris Brown", "Matthew Torres", "Yousif AlKhafagi", "Amir Al Khafagi", "Arij Hussein" };
        for (int i = classMates.length-1; i >= 0; i--) {
            System.out.println(classMates[i]);
        }
    }
}
