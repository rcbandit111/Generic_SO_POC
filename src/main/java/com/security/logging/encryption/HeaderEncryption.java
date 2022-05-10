package com.security.logging.encryption;

import java.util.List;
import java.util.Map;

class HeaderEncryption {

  private final EncryptionProperties encryptionProperties;

  public HeaderEncryption(EncryptionProperties encryptionProperties) {
    this.encryptionProperties = encryptionProperties;
  }

  public Map<String, List<String>> enc(Map<String, List<String>> headers) {

    return null;
  }

}
