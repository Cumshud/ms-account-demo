package az.mybank.ms.account.repository.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Configuration
@ConfigurationProperties(prefix = "account")
@PropertySource(value = "classpath:/queries/account.xml")
public class QueryHolder {

    private Map<String, String> query;

    public String get(Queries key) {
        return query.get(key.key());
    }

}