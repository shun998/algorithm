package practice.begin;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * @User: layman
 * @Date: 2021/12/31 16:13
 * @Description: hashMap的crud都是常数级复杂度, 但是常数比较大
 * hashMap全部都按值传递!!!!!
 * 非基础类型按照引用传递
 */
public class Code11_HashMapTreeMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("zhang", "我是张三");
        System.out.println(hashMap.containsKey("zhang"));
        System.out.println(hashMap.get("zhang"));
        int a = 13242;
        int b = 13242;
        System.out.println(a == b);
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "我是1");
        treeMap.put(6, "我是6");
        treeMap.put(2, "我是2");
        treeMap.put(8, "我是8");
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());
        System.out.println(treeMap.ceilingKey(7));
        System.out.println(treeMap.floorKey(7));

    }
}
