package com.salesianos.dam.primerjemplo.service;


import com.salesianos.dam.primerjemplo.model.Category;
import com.salesianos.dam.primerjemplo.repo.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public List<Category> getAllCategories(){
        List<Category> lista = categoryRepository.findAll();
        if(lista.isEmpty()){
            return null;
        }
        return lista;

    }


    public Category getCategoryById(Long id){
        return categoryRepository.findById(id).orElse(null);

    }

    public void addCategory(Category c){

        categoryRepository.save(c);
    }
}
