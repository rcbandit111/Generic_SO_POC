package com.security.logging.encryption;

import java.util.List;
import java.util.Map;

public interface Encryption {

  String encryptionContent(String contentType, String content);

  Map<String, List<String>> encryptionHeaders(Map<String, List<String>> headers);

}
