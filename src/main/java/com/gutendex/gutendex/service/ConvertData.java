package com.gutendex.gutendex.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gutendex.gutendex.model.GeneralData;

public class ConvertData implements IConvertData {
    private ObjectMapper objectMapper = new ObjectMapper();


    @Override
    public <T> T getData(String json, Class<T> classToConvert) {
        try {
            return objectMapper.readValue(json, classToConvert);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
