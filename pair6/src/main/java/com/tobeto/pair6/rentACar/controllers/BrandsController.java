package com.tobeto.pair6.rentACar.controllers;

import com.tobeto.pair6.rentACar.entities.Brand;
import com.tobeto.pair6.rentACar.repositories.BrandRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/brands")

public class BrandsController {

    private final BrandRepository brandRepository;

    public BrandsController(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @GetMapping
    public List<Brand> getAll(){
        List<Brand> brands = brandRepository.findAll();
        return brands;
    }

    @GetMapping("{id}")
    public Brand getById(@PathVariable int id){
        return brandRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody Brand brand){
        brandRepository.save(brand);
    }

    @DeleteMapping
    public void delete(@PathVariable int id){
        Brand brandToDelete = brandRepository.findById(id).orElseThrow();
        brandRepository.delete(brandToDelete);
    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable int id, @RequestBody Brand brand){
        Brand brandToUpdate = brandRepository.findById(id).orElseThrow();
        brandToUpdate.setId(brand.getId());
        brandToUpdate.setName(brand.getName());

    }



}
