package com.example.DrawerRelease.Repository;

import com.example.DrawerRelease.Entity.CustomerReleaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerReleaseRepository extends JpaRepository<CustomerReleaseEntity,Long> {
}
