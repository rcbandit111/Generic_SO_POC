package org.merchant.database.service.sql;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.cloud.netflix.ribbon.SpringClientFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadbalancerConfig extends RibbonLoadBalancerClient  {

  public LoadbalancerConfig(SpringClientFactory clientFactory) {
    super(clientFactory);
  }

}
