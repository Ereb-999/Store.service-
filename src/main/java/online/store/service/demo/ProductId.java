package online.store.service.demo;



import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class ProductId{
    public final List<Integer> items;
    public ProductId(){
        this.items = new ArrayList<>();
    }
    public List<Integer> addService(List<Integer> idList){
        items.addAll(idList);
        return idList;
    }
    public List<Integer> getService(){
        return Collections.unmodifiableList(items);
    }

}


