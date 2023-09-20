package az.mybank.ms.account.client.config;

import az.mybank.ms.account.client.CustomerClient;
import feign.Logger;
import feign.RequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;

@Configuration
@EnableFeignClients(clients = {CustomerClient.class})
public class FeignConfiguration {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    BasicAuthenticationInterceptor basicAuthenticationInterceptor(@Value("${customer.username}") String username,
                                                                  @Value("${customer.password}") String password) {

        return new BasicAuthenticationInterceptor(username, password);
    }

    RequestInterceptor requestInterceptor(@Value("${customer.username}") String username,
                                          @Value("${customer.password}") String password) {
        return requestTemplate -> {
            requestTemplate.header("user", username);
            requestTemplate.header("password", password);
        };
    }

}