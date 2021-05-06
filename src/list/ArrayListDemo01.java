package list;

import java.util.ArrayList;

/**
 * @qvthor liuwenzheng
 * @date 2021/5/6 17:12
 */
public class ArrayListDemo01 {
    public static void main(String[] args) {
        String[] array01 = new String[10];
        array01[0] = "zhangsan";
        array01[1] = "lisi";
        array01[2] = "wangwu";
        ArrayList<Object>list01 = new ArrayList<>(); //数组列表
        list01.add("zhangsan");
        list01.add("lisi");
        list01.add("wangwu");
        System.out.println(list01);
        // 2 删除
        list01.remove(1);
        System.out.println(list01);
        // 3 修改
        list01.set(1,"xaiowu");
        System.out.println(list01);
        // 4  查询
        for (Object l : list01){
            System.out.println(l + "\t");
        }
        // 5 求长度
        System.out.println(list01.size());
        // 6 清空
        list01.clear();
        System.out.println(list01.size());
        System.out.println(list01.isEmpty());
        // 7 addAll()
        ArrayList<Object>list02 = new ArrayList<>();
        list02.add(111);
        list02.add(222);
        list01.addAll(1,list02);
        System.out.println(list01

        );
    }
}
