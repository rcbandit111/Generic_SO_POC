package org.merchant.database.service.sql;

import feign.Client;
import feign.httpclient.ApacheHttpClient;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.cloud.netflix.ribbon.SpringClientFactory;
import org.springframework.cloud.openfeign.ribbon.CachingSpringLoadBalancerFactory;
import org.springframework.cloud.openfeign.ribbon.LoadBalancerFeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadbalancerConfig {

  @Bean
  public Client client(
      HttpClientConnectionManager httpClientConnectionManager,
      CachingSpringLoadBalancerFactory lbClientFactory,
      SpringClientFactory clientFactory) {

    CloseableHttpClient closeableHttpClient = HttpClients.custom()
        .setConnectionManager(httpClientConnectionManager)
        .build();
    ApacheHttpClient client = new ApacheHttpClient(closeableHttpClient);
    return new LoadBalancerFeignClient(client, lbClientFactory, clientFactory);
  }
}
