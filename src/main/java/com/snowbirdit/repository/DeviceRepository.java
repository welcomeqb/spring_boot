package com.snowbirdit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.snowbirdit.entity.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device,Integer>{

}
