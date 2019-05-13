package com.bos.merchantonboarding;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bos.merchantonboarding.model.Merchant;
import com.bos.merchantonboarding.service.MerchantService;

@RestController
public class MerchantController {

    @Autowired
    private MerchantService merchantService;

    // Select, Insert, Delete, Update Operations for an Merchant

    @RequestMapping(value = "/merchant", method = RequestMethod.GET)
    Merchant getMerchant(@RequestParam Integer id){
        return  merchantService.findOne(id);
    }

    @RequestMapping(value = "/merchant", method = RequestMethod.POST)
    String addMerchant(@RequestBody Merchant merchant){
        Merchant savedMerchant = merchantService.save(merchant);
        return "SUCCESS";
    }

    @RequestMapping(value = "/merchant", method = RequestMethod.PUT)
    Merchant updateMerchant(@RequestBody Merchant merchant){
        Merchant updatedMerchant = merchantService.save(merchant);
        return updatedMerchant;
    }

    @RequestMapping(value = "/merchant", method = RequestMethod.DELETE)
    Map deleteMerchant(@RequestParam Integer id){
        merchantService.delete(id);

        Map<String, String> status = new HashMap<>();
        status.put("Status", "Success");
        return status;
    }

    // Select, Insert, Delete for List of Merchants

    @RequestMapping(value = "/merchants", method = RequestMethod.GET)
    List<Merchant> getAllMerchant(){
        return merchantService.findAll();
    }

    @RequestMapping(value = "/merchants", method = RequestMethod.POST)
    String addAllMerchants(@RequestBody List<Merchant> merchantList){
        merchantService.save(merchantList);
        return "SUCCESS";
    }

    @RequestMapping(value = "/merchants", method = RequestMethod.DELETE)
    String addAllMerchants(){
        merchantService.deleteAll();
        return "SUCCESS";
    }
    
    
   
}
