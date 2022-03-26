package com.spring.basic.controller;

import java.util.List;

import javax.validation.Valid;

import com.spring.basic.exception.ResourceNotFoundException;
import com.spring.basic.model.BasicDto;
import com.spring.basic.repository.BasicRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class JpaController {
    
    @Autowired
    private BasicRepository basicRepository;

    @GetMapping("/basic")
    public List<BasicDto> getAllBasic() {
        List<BasicDto> BasicList = basicRepository.findAll();
        System.out.println(BasicList.size());
        return BasicList;
    }

    // @GetMapping("/basic/{id}")
    // public Optional<BasicDto> getFindBasic(@PathVariable(value = "id") Long id) {
    //     return basicRepository.findById(id);
    // }

    @GetMapping("/basic/{id}")
    public ResponseEntity<BasicDto> getEmployeeById(@PathVariable(value = "id") Long employeeId)
        throws ResourceNotFoundException {
            BasicDto employee = basicRepository.findById(employeeId)
          .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
        return ResponseEntity.ok().body(employee);
    }

    @PostMapping("/insertbasic")
    public BasicDto createEmployee(@Valid @RequestBody BasicDto basicDto) {
        return basicRepository.save(basicDto);
    }

}
