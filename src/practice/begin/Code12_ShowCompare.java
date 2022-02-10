package practice.begin;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @User: layman
 * @Date: 2022/1/5 14:48
 * @Description:
 */
public class Code12_ShowCompare {
    public static class Student {
        private Integer id;
        private String name;
        private Integer age;

        public Student(Integer id, String name, Integer age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }
    }

    public static class IdComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.id - o2.id;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 9, 4, 2, 4, 8, 2, 1};
        printArray(arr);
        Arrays.sort(arr);
        printArray(arr);
        Student s1 = new Student(1, "zhangsan1", 18);
        Student s2 = new Student(3, "zhangsan2", 20);
        Student s3 = new Student(2, "zhangsan3", 19);
        Student s4 = new Student(4, "zhangsan4", 18);
        Student[] students = {s1, s2, s3, s4};
        printStudent(students);
        Arrays.sort(students, new IdComparator());
        printStudent(students);
        PriorityQueue<Student> heap = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.age - s2.age;
            }
        });
        heap.add(s1);
        heap.add(s2);
        heap.add(s3);
        heap.add(s4);

        while (!heap.isEmpty()) {
            Student student = heap.poll();
            System.out.print(student.id + "," + student.name + "," + student.age + ";");
        }

    }

    private static void printStudent(Student[] students) {
        for (Student student : students) {
            System.out.print(student.id + "," + student.name + "," + student.age + ";");
        }
        System.out.println();
    }

    private static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
