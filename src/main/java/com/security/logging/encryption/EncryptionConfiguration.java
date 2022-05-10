package com.security.logging.encryption;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.util.List;

@EnableConfigurationProperties(EncryptionProperties.class)
public class EncryptionConfiguration {

  @Bean
  HeaderEncryption headerEncryption(EncryptionProperties encryptionProperties) {
    return new HeaderEncryption(encryptionProperties);
  }

  @Bean
  Encryption intEncryption(List<ContentEncryption> enc, HeaderEncryption headerEncryption) {
    return new EncryptionImpl(enc, headerEncryption);
  }

}
