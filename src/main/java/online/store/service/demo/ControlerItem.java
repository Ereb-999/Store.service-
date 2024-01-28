package online.store.service.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/order")
public class ControlerItem {

    private final OrderService orderSrvice;

    public ControlerItem(OrderService orderSrvice){
        this.orderSrvice = orderSrvice;
    }


    @GetMapping("/add")
    public List<Integer> addService(@RequestParam List<Integer> id){
        return orderSrvice.addService(id);
    }

    @GetMapping("/get")
    public List<Integer> getService(){
        return orderSrvice.getService();
    }


















}

