package com.pprog.cledule.serializers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.pprog.cledule.entities.BaseEntity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AbstractEntitiesSerializer extends StdSerializer<List<BaseEntity>> {

    public AbstractEntitiesSerializer() {
        this(null);
    }
    
    public AbstractEntitiesSerializer(Class<List<BaseEntity>> t) {
        super(t);
    }

    @Override
    public void serialize(List<BaseEntity> baseEntities, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        List<Long> entities_id = new ArrayList<>();
        for (BaseEntity baseEntity : baseEntities) {
            entities_id.add(baseEntity.getId());
        }
        jsonGenerator.writeObject(entities_id);
    }
}
