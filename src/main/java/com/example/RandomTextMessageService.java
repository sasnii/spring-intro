package com.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component("randomMessageService")

public class RandomTextMessageService implements MessageService {

    List<String> lis1 = Arrays.asList( "Alex", "Brian", "Charles", "Jacob", "Suzie", "Melisa", "Matthew", "Michael", "Malyna", "Marisa ");
    Random rand = new Random();


    @Override
    public String getMessage() {
        return lis1.get(rand.nextInt(10));
    }
}
