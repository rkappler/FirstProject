package com.example.demo;




import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class DemoApplication {

    public class BitCounting {

        public static int countBits(int n){
            String bit = Integer.toBinaryString(n);
            List<String> list = new ArrayList<>();
            for(int i=0; i < bit.length(); i++) {
                list.add(bit.charAt(i).toString());
            }
            List<String> filteredList = list.stream().filter(c -> c.equals("1")))
               .collect(Collectors.toList());

            int count = filteredList.size();
            return count;
        }

    }

    public static void main(String[] args) {









    }

}
