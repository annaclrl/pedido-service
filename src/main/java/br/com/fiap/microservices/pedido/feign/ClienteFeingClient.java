package br.com.fiap.microservices.pedido.feign;

import br.com.fiap.microservices.pedido.dto.ProdutoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "cliente-service",
        url = "${app.cliente-service.url}"
)
public interface ClienteFeingClient {
    @GetMapping("/api/cliente/produtos/{id}")
    ProdutoDTO buscarProdutoPorId(@PathVariable Long id);
}
