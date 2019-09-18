package com.stackroute;

import java.util.List;

class TransformStringLambdaStreamDemo {

    public String getString(List<Integer> numbers) {

        String str = numbers.stream().map(i->i%2==0?"e"+i:"o"+i).reduce(" ",(s,e)->s+=e+",");
        String word=" ";
        for(int i=0;i<str.length()-1;i++)
        {
            word= word + str.toCharArray()[i];
        }
        return word.trim();
    }


}
