
package com.Tienda.controller;

import com.Tienda.dao.ClienteDao;
import com.Tienda.domain.Cliente;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author derek
 */
@Slf4j
@Controller
public class IndexController {
    
    @Autowired
    ClienteDao clienteDao;
    
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora utilizando MVC");
        /*String mensaje="Estamos en semana 4!";
        model.addAttribute("Mensaje", mensaje);
        
        Cliente cliente = new Cliente("Derek", "Castillo","dcastillo70903@ufide.ac.cr", "85324288");
        Cliente cliente2 = new Cliente("Joel", "Quiros","jquiros70903@ufide.ac.cr", "85324288");
        //model.addAttribute("cliente", cliente);
        
        List<Cliente> clientes = Arrays.asList(cliente, cliente2);
        model.addAttribute("clientes", clientes);*/
        var clientes=clienteDao.findAll();
        model.addAttribute("clientes", clientes);

        return "index";
    }
    
}
