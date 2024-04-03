package com.example.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.model.Main;
import com.example.main.service.MainService;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class MainController {
    @Autowired
    MainService ms;

    @PostMapping("/api/post")
    public ResponseEntity<Main> add(@RequestBody Main m) {
        Main pro = ms.create(m);
        return new ResponseEntity<>(pro, HttpStatus.CREATED);
    }

    @GetMapping("/api/get")
    public ResponseEntity<List<Main>> showdetails() {
        return new ResponseEntity<>(ms.getalldetail(), HttpStatus.OK);
    }
    @PutMapping("/putdata/{id}")
        public ResponseEntity<Main>putMethodName(@PathVariable("id")int id,@RequestBody Main m)
        {
            if(ms.update(id,m) == true)
            {
                return new ResponseEntity<>(m,HttpStatus.OK);
            }
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        @DeleteMapping("/delete/{id}")
        public ResponseEntity<Boolean>delete(@PathVariable("id")int id)
        {
            if(ms.delete(id) == true)
            {
                return new ResponseEntity<>(true,HttpStatus.OK);
            }
            return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
        }
    }
