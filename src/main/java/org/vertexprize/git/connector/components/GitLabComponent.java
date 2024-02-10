/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.vertexprize.git.connector.components;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 *
 * @author Kirll_Romanovich
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
