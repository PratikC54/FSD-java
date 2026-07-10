package com.qualifierannotation;

import org.springframework.stereotype.Component;

@Component
public class DiselEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Disel engine starting");
    }
}
