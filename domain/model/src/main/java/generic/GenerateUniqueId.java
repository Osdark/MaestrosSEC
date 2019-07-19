package co.com.sura.salud.sec.generic;

import java.util.UUID;

public interface GenerateUniqueId {
    default String generateObjectId() {
        return UUID.randomUUID().toString();
    }
}
