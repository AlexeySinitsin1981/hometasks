package ru.sinitsin.lesson25.task1;

import java.util.Map;

public class MapUtils {

    public static boolean isUnique(Map<String, String> map) {

        for (String st:map.values()) {
            int count = 0;
            for (String sr:map.values()) {
                if(st.equals(sr)){
                    count++;
                    if(count>1){
                        return false;
                    }
                }
            }

        }
        return true;

    }


}
