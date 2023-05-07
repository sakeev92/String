package Spring.Spring.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
@SessionScope
public class Cart {
    private final Set<Integer> ids = new HashSet<>();

    public Set<Integer> add(List<Integer> ids) {
        this.ids.addAll(ids);
        return this.ids;
    }
    public Set<Integer> get() {
        return ids;
    }
}
