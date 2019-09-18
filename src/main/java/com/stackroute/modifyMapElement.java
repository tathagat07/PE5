package com.stackroute;

import java.util.Map;

public class modifyMapElement {

    public String switchValue(Map<String, String> map){
        if (map == null) {
            return null;
        }
        String val1 = map.get("val1");
        map.replace("val2", val1);
        map.replace("val1", " ");
        return map.toString();
    }
}
