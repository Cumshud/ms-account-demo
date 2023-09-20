package az.mybank.ms.account.repository;

import az.mybank.ms.account.model.Account;
import az.mybank.ms.account.repository.query.Queries;
import az.mybank.ms.account.repository.query.QueryHolder;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class AccountRepository {

    private final QueryHolder queryHolder;
    private final NamedParameterJdbcTemplate namedJdbcTemplate;

    public Optional<Account> findAccountWithId(Long id) {
        var results = namedJdbcTemplate.query(
                queryHolder.get(Queries.FIND_ACCOUNT_BY_ID),
                Map.of("id", id),
                new BeanPropertyRowMapper<>(Account.class));

        return results.stream().findFirst();
    }

}
