    package com.playstore.playstore.config;

    import com.playstore.playstore.entities.Category;
    import com.playstore.playstore.entities.Pedido;
    import com.playstore.playstore.entities.Products;
    import com.playstore.playstore.entities.User;
    import com.playstore.playstore.repositories.CategoryRepositories;
    import com.playstore.playstore.repositories.PedidoRepository;
    import com.playstore.playstore.repositories.ProductsRepository;
    import com.playstore.playstore.repositories.UserRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.boot.CommandLineRunner;
    import org.springframework.context.annotation.Configuration;
    import org.springframework.context.annotation.Profile;

    import java.time.LocalDate;
    import java.util.Arrays;

    @Configuration
    @Profile("test")
    public class TestConfig implements CommandLineRunner {
        @Override
        public void run(String... args) throws Exception {
            User u1 = new User( null, "Mateus Avila","mateus@gmail.com","043999283568","123456");
            User u2 = new User( null, "Maria Clara","maria@gmail.com","043999283588","123456");

            userRepository.saveAll(Arrays.asList(u1,u2));

            Products p1 = new Products(null,"carregador","carregador sansung",15.99,"123456");
            Products p2 = new Products(null,"fone","fone sansung",17.99,"123478");

            productsRepository.saveAll(Arrays.asList(p1,p2));

            Pedido o1 = new Pedido(null, LocalDate.of(2020,05,10),"efetivado");
            Pedido o2 = new Pedido(null, LocalDate.of(2025, 10, 5),"pendente");

            pedidoRepository.saveAll(Arrays.asList(o1,o2));

            Category c1 = new Category(null,"eletronicos");
            Category c2 = new Category(null, "domesticos");

            categoryRepositories.saveAll(Arrays.asList(c1,c2));

        }
        @Autowired
        private UserRepository userRepository;
        @Autowired
        private ProductsRepository productsRepository;
        @Autowired
        private PedidoRepository pedidoRepository;
        @Autowired
        private CategoryRepositories categoryRepositories;


    }
