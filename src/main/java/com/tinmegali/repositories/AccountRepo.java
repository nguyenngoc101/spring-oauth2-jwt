package com.tinmegali.repositories;


import com.tinmegali.models.Account;
import java.util.Collection;
import java.util.Optional;
import org.springframework.data.repository.Repository;

public interface AccountRepo extends Repository<Account, Long> {

  Collection<Account> findAll();

  Optional<Account> findByUsername(String username);

  Optional<Account> findById(Long id);

  Integer countByUsername(String username);

  Account save(Account account);

  void deleteAccountById(Long id);


}
