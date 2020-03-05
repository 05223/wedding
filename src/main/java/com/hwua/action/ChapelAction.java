package com.hwua.action;

import com.hwua.domain.Chapel;
import com.hwua.domain.ChapelOV;
import com.hwua.service.ChapelService;
import com.hwua.service.MyChapelOVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ChapelAction {
    @Autowired
    private ChapelService chapelService;

    @RequestMapping(value = "getAllChapel",method = RequestMethod.GET)
    @ResponseBody
    public List<Chapel> getAllChapel(){
        List<Chapel> allChapel = chapelService.getAllChapel();
        System.out.println(allChapel);
        return allChapel;
    }

    @Autowired
    private MyChapelOVService myChapelOVService;

    @RequestMapping(value = "getChapelOV/{id}",method = RequestMethod.GET)
    @ResponseBody
    public ChapelOV getChapelOVByPrimaryKey(@PathVariable int id){
        ChapelOV chapelOV = myChapelOVService.getChapelOVByPrimaryKey(id);
        return chapelOV;
    }
}
