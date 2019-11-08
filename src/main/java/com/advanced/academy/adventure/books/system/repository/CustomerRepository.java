package com.advanced.academy.adventure.books.system.repository;

import com.advanced.academy.adventure.books.system.model.Customer;
import com.advanced.academy.adventure.books.system.model.enums.UserType;
import org.hibernate.sql.Update;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer , Integer> {

    @Query(value = "SELECT c.* FROM customers c where c.user_type=:userType", nativeQuery = true)        //Query native - direktno kym bazata danni
    public List<Customer> findByUserType(@Param("userType")UserType userType);

    @Query("SELECT c FROM Customer c where userType=:userType")
    public List<Customer> getByUserTypeNativeQuery(@Param("userType")UserType userType);           //Query s Hibernate

    @Query("Update Customer SET isDeleted = true WHERE id = :id")
    void deactivateCustomer(@Param("id") Integer id);





}
