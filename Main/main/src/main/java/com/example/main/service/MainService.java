package com.example.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.model.Main;
import com.example.main.repository.MainRepo;

@Service
public class MainService {
    @Autowired
    MainRepo mr;

    public Main create(Main m) {
        return mr.save(m);
    }

    public List<Main> getalldetail() {
        return mr.findAll();
    }

    public Main getProdById(int id) {
        return mr.findById(id).orElse(null);
    }

    public boolean update(int id, Main m) {
        if (this.getProdById(id) == null) {
            return false;
        }
        try {
            mr.save(m);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean delete(int id) {
        if (this.getProdById(id) == null) {
            return false;
        }
        mr.deleteById(id);
        return true;
    }
}
