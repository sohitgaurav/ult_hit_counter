package com.geekster.url_hit_counter.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController

public class UrlController {
    static HashMap<String,Integer>map = new HashMap<>();

    @GetMapping("count/{username}")
    public String HitCount(@PathVariable String username) {
        if(username != null){
            map.put(username,map.getOrDefault(username,0)+1);
        }
        return "username: "+username+",Hitcounter: "  + map.get(username);
    }
}
