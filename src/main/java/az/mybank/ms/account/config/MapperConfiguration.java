package az.mybank.ms.account.config;

import az.mybank.ms.account.mapper.AccountMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class MapperConfiguration {

    @Bean
    public AccountMapper accountMapper() {
        return AccountMapper.INSTANCE;
    }

}
