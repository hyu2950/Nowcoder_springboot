package com.nowcoder.community.community;


import com.nowcoder.community.community.entity.DiscussPost;

import com.nowcoder.community.community.service.DiscussPostService;
import com.nowcoder.community.community.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class ServiceTests {
    @Autowired
    private DiscussPostService discussPostService;
    @Autowired
    private UserService userService;

    @Test
    public void testDiscussPosts(){
        List<DiscussPost> list = discussPostService.findDiscussPosts(0,0,10);
        for (DiscussPost post:list){
            System.out.println(post);
        }

    }
}
