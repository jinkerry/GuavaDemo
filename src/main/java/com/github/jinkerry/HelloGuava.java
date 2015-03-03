package com.github.jinkerry;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import java.util.List;
import java.util.Map;

/**
 * Created by apple
 *  on 15/2/10.
 */
public class HelloGuava {

    public static void main(String[] args) {
        List<String> list = ImmutableList.of("1", "2", "3");
        for (String s : list) {
            System.out.println(s);
        }


        Map<String, String> map = ImmutableMap.of("key1", "value1", "key2", "value2");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


    }

}
