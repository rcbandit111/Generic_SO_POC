package com.security.logging.encryption;

interface ContentEncryption {

  Boolean supports(String type);

  String mask(String content);

}
