/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.vertexprize.git.connector.components;

import jakarta.servlet.http.HttpServletRequest;
import static java.time.LocalDate.now;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author HP
 */
@Component
@Slf4j
public class GitLabComponent {
    
    public void get() {
        log.info("Get function begins...");
//        return ResponseEntity.ok(now());
    }
    
    public void post() {
        log.info("Response function begins...");
        //return ResponseEntity.ok(now());
    }
}
