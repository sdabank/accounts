package pl.rsfot.accounts.rest.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.rsfot.accounts.dto.AccountDto;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class GetCustomerAccountsResponse {

    private List<AccountDto> accounts;
}
