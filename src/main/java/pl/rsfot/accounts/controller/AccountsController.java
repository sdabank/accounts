package pl.rsfot.accounts.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.rsfot.accounts.dto.AccountDto;
import pl.rsfot.accounts.rest.response.GetCustomerAccountsResponse;
import pl.rsfot.accounts.service.AccountService;

import java.util.List;
import java.util.UUID;


@RequestMapping(path = "/v1/accounts", produces = {MediaType.APPLICATION_JSON_VALUE})
@RequiredArgsConstructor
@RestController
@RefreshScope
public class AccountsController {

    private final AccountService accountService;

    @GetMapping("/{id}")
    public GetCustomerAccountsResponse getCustomerAccounts(@PathVariable("id") Long customerId) {

        List<AccountDto> accounts = accountService.getCustomerAccounts(customerId);

        return GetCustomerAccountsResponse.of(accounts);
    }
}
