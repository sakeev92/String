package Spring.Spring.controller;

import Spring.Spring.service.Cart;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final Cart cart;

    public OrderController(Cart cart) {
        this.cart = cart;
    }


    @GetMapping("/add")
    public Set<Integer> add(@RequestParam List<Integer> ids) {
        return cart.add(ids);
    }
    @GetMapping("/get")
    public Set<Integer> get() {
        return cart.get();
    }
}
