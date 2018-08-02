package com.critical.training.service;

import com.critical.training.cache.cache;
import com.critical.training.engine.Adder;
import com.critical.training.engine.Averager;
import com.critical.training.engine.Divider;
import com.critical.training.engine.DynamicCalculate;
import com.critical.training.engine.InvalidStatementException;
import com.critical.training.engine.MathProcessing;
import com.critical.training.engine.Multiplier;

import com.critical.training.model.query;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CalculateService  {

    private Map<Long, query> messageQuery = cache.getMessages();

    public CalculateService(){
        messageQuery.put(1L, new query("add",1.0,2.0));
        messageQuery.put(2L, new query("avg",1.0,2.0));
    }

    public List<query> getAllMessages() {

        return new ArrayList<>(messageQuery.values());
    }


    public query getExecuteQuery(String statQuery)throws InvalidStatementException{
        System.out.println(statQuery);
        String[] query={statQuery};

        DynamicCalculate dinamicCalculate =new DynamicCalculate(new MathProcessing[]{
                new Adder(),
                new Averager(),
                new Divider(),
                new Multiplier()
        });

        for (String queries : query) {
            try {

                String output=dinamicCalculate.process(queries);
                System.out.println(output);

            } catch (InvalidStatementException e) {
                System.out.println(e.getMessage());
                if (e.getCause() != null)
                    System.out.println("Original exception: " + e.getCause().getMessage());
            }
        }


        return messageQuery.get(statQuery);

    }





}
