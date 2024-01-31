package com.example.SpringJPAKHibernate.repository;

import com.example.SpringJPAKHibernate.model.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeRepository extends JpaRepository<Office, Integer> {
}
