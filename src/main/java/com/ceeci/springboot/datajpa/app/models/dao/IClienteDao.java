package com.ceeci.springboot.datajpa.app.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ceeci.springboot.datajpa.app.models.entity.Cliente;

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long>{

}
