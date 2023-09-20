package com.br.javawars.kyu_7;

public class Quicksum {

    public int quicksum(String packet){
        int quicksum = 0;

        for (int i = 0; i < packet.length(); i++) {
            char c = packet.charAt(i);
            if (c == ' ') {
                quicksum += 0;
            } else if (Character.isUpperCase(c)) {
                int position = i + 1;
                quicksum += (c - 'A' + 1) * position;
            } else {
                return 0;
            }
        }

        return quicksum;
    }
}
