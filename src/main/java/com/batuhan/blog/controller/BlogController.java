package com.batuhan.blog.controller;

import com.batuhan.blog.dto.CreateBlogRequest;
import com.batuhan.blog.dto.CreateBlogResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/v1/hello")
public class BlogController {

    //Create Read Update Delete CRUD
    @GetMapping()
    public ResponseEntity<String> getFolksdev(){
        return ResponseEntity.ok("Hello Folksie");
    }

    @GetMapping(value = "/batuhan/{id}")
    public ResponseEntity<String> getFolksdevWithId(@PathVariable String id){

        return ResponseEntity.ok("Hello Folksie from " + id);
    }

    @PostMapping
    public ResponseEntity<CreateBlogResponse> createFolksdev(@Valid @RequestBody CreateBlogRequest createBlogRequest){
        int birthYear = 2021 - createBlogRequest.getAge();
        CreateBlogResponse createBlogResponse = new CreateBlogResponse(createBlogRequest.getName(),birthYear);
        return new ResponseEntity<>(createBlogResponse, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<String> updateFolksdev(@RequestBody String id){

        return ResponseEntity.ok("Hello" + id + "is updated");
    }

    @DeleteMapping
    public ResponseEntity<String> deleteFolksdev(@RequestBody String id){

        return ResponseEntity.ok("Hello " + id + " is deleted");
    }




}
