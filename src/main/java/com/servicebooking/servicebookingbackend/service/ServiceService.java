package com.servicebooking.servicebookingbackend.service;

import com.servicebooking.servicebookingbackend.model.Service;
import com.servicebooking.servicebookingbackend.repository.ServiceRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServiceService {

    private final ServiceRepository serviceRepository;

    public ServiceService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    public Service create(Service service) {
        return serviceRepository.save(service);
    }

    public List<Service> getAll() {
        return serviceRepository.findAll();
    }

    public List<Service> getByVendor(String vendorId) {
        return serviceRepository.findByVendorId(vendorId);
    }
}
