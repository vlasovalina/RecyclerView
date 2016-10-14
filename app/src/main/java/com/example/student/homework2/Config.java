package com.example.student.homework2;

import java.util.ArrayList;

/**
 * Created by student on 03.10.2016.
 */
public class Config {

public final String [] NAMES ={"Asia", "Arsenia", "Asyuta", "Asyusha", "Aria"};

    public ArrayList getPersonData(){

        ArrayList listperson = new ArrayList();
        for(int i = 0; i < NAMES.length; i++)
        {
            listperson.add(new Person(NAMES[i]));
        }
        return listperson;
    }
}
