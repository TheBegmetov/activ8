package com.company;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class activ8_second {
    public static void main(String[] args) throws IOException {
        try (
                DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("C:\\Users\\User\\IdeaProjects\\wind\\Exercise17_02.data", true)));
        ) {
            for (int i = 0; i < 100; i++) {
                int san = (int)(Math.random() * 100);
                output.writeInt(san);
            }
        }
    }
}


