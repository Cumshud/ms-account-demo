package az.mybank.ms.account.mapper;

import az.mybank.ms.account.dto.AccountDto;
import az.mybank.ms.account.model.Account;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AccountMapper {

    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    AccountDto toAccountDto(Account account);

    List<AccountDto> toAccountDtos(List<Account> accountDto);

}