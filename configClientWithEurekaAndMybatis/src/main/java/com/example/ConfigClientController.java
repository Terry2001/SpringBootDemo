package com.example;

import com.example.dao.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lenovopc on 2017/1/30.
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Autowired
    private MemberDao memberDao;

    @Value("${url}")
    private String url;

    @GetMapping("/hello")
    public List<String> hello() {
        return memberDao.getAll();
    }
}
