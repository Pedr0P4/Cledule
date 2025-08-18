package com.pprog.cledule.serializers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.pprog.cledule.entities.BaseEntity;

import java.io.IOException;

public class AbstractEntitySerializer extends StdSerializer<BaseEntity> {

    public AbstractEntitySerializer() {
        this(null);
    }

    public AbstractEntitySerializer(Class<BaseEntity> t) {
        super(t);
    }

    @Override
    public void serialize(BaseEntity baseEntity, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeObject(baseEntity.getId());
    }
}
