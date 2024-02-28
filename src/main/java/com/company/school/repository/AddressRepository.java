package com.company.school.repository;

import com.company.school.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {
    Optional<Address> findByAddressIdAndDeletedAtIsNull(Integer addressId);

}
