package online.store.service.demo;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService{

    private final ProductId productId;

    public OrderServiceImpl(ProductId productId) {
        this.productId = productId;
    }

    public List<Integer> addService(List<Integer> idList){
        return productId.addService(idList);
    }
    public List<Integer> getService(){
        return productId.getService();

    }
}
