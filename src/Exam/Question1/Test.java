package Exam.Question1;

/**
 * @author Xiangnan Liu
 * @date 2023-07-27 15:08
 */
public class Test {
    public static void main(String[] args) {
        Appointment appointment1 = new Appointment("X101", "Enda Stafford", "087 1230001", "Gum tenderness", "Root canal procedure");
        Appointment appointment2 = new Appointment("X102", "Michael Jordan", "087 1230002", "Leg pain", "Bone spur");
        Appointment appointment3 = new Appointment("X103", "Whitney Houston", "087 1230003", "Fever", "Covid 19");
        Appointment appointment4 = new Appointment("X104", "Anna karenina", "087 1230004", "Insomnia", "Neurasthenia");
        Appointment appointment5 = new Appointment("X105", "Albert Einstein", "087 1230005", "Dizziness", "hypertension");

        LinkedList list = new LinkedList();

        // call isEmpty method
        boolean isEmpty = list.isEmpty();
        System.out.println("If the list is empty: " + isEmpty);

        // call add method
        list.add(appointment1);
        list.add(appointment2);
        list.add(appointment3);
        list.add(appointment4);
        list.add(appointment5);
        System.out.println("If the list is empty: " + list.isEmpty());

        // call getAppointment method
        String str = list.getAppointment(2);
        System.out.println("The appointment information is: " + str);

        // call remove method;
        int result1 = list.remove("X101");
        System.out.println(result1 + " appointment has been removed");

        int result2 = list.remove("X000");
        System.out.println(result2 + " appointment has been removed");

        // remove all the nodes
        list.remove("X102");
        list.remove("X103");
        list.remove("X104");
        list.remove("X105");
        System.out.println("If the list is empty: " + list.isEmpty());
    }
}
