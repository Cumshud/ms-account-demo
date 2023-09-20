package az.mybank.ms.account.client;

import az.mybank.ms.account.client.config.FeignConfiguration;
import az.mybank.ms.account.client.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "${customer.name}", url = "${customer.domain-url}", configuration = FeignConfiguration.class)
public interface CustomerClient {

    @GetMapping(path = "/customer/{id}")
    Customer getCustomerWithId(@PathVariable("id") Long id);

}
