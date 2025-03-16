package com.cyrils.projects.maven;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
//https://www.baeldung.com/jackson-object-mapper-tutorial
public class MessageSerialization {
    //singleton 
    private static final ObjectMapper mapper = new ObjectMapper();
    
    // Serialize a message object to JSON string
    public static String serialize(Message message) throws JsonProcessingException {
        return mapper.writeValueAsString(message);
    }
    
    // Deserialize JSON string to a message object
    public static Message deserialize(String json) throws IOException {
        return mapper.readValue(json, Message.class);
    }
}
