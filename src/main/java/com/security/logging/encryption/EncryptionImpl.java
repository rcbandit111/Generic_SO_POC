package com.security.logging.encryption;

import java.util.List;
import java.util.Map;

class EncryptionImpl implements Encryption {

  private final List<ContentEncryption> enc;

  private final HeaderEncryption headerEncryption;

  EncryptionImpl(List<ContentEncryption> enc, HeaderEncryption headerEncryption) {
    this.enc = enc;
    this.headerEncryption = headerEncryption;
  }

  public String encryptionContent(String contentType, String content) {
    //.............
    return null;
  }

  @Override
  public Map<String, List<String>> encryptionHeaders(Map<String, List<String>> headers) {
    return headerEncryption.enc(headers);
  }

}
