package com.company.school.repository;

import com.company.school.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {

    int a = 0;

    Optional<Address> findByAddressIdAndDeletedAtIsNull(Integer addressId);

}
