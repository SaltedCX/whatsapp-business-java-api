package com.whatsapp.api.domain.media;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class FileTypeDeserializer extends JsonDeserializer<FileType> {

    @Override
    public FileType deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        String value = p.getText();
        for (FileType fileType : FileType.values()) {
            if (fileType.getType().equalsIgnoreCase(value)) {
                return fileType;
            }
        }
        return FileType.TEXT;
    }
}