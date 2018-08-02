package com.critical.training.cache;

import com.critical.training.model.CalculateBase;
import com.critical.training.model.query;

import java.util.HashMap;
import java.util.Map;


public class cache {

    private static Map<Long, query> messageQuery = new HashMap<> ();

    public static Map<Long, query> getMessages(){
        return messageQuery;
    }
}
