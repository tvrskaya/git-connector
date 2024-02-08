/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.vertexprize.git.connector.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

/**
 *
 * @author HP
 */
@Component
public class GitRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        restConfiguration().component("servlet").bindingMode(RestBindingMode.auto);
        rest().path("/")
               .post().to("bean:gitLabComponent?method=post");
        rest().path("/")
                .get().to("bean:gitLabComponent?method=get");
    }
}
