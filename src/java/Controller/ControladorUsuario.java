/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Config.Conexion;
import Entidad.UsuarioVo;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author blanclabs
 */
@RestController
@Controller
public class ControladorUsuario {

    Conexion con = new Conexion();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(con.Conectar());
    ModelAndView mav = new ModelAndView();
    List datos;
    int Id;

    @RequestMapping("ListarUsu.htm")
    public ModelAndView Listar() {

        String sql = "Select * from usuario";
        datos = this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista", datos);
        mav.setViewName("ListarUsu");
        return mav;
    }

    @RequestMapping(value = "registrar.htm", method = RequestMethod.GET)
    public ModelAndView Registrar() {
        mav.addAllObjects((Map<String, ?>) new UsuarioVo());
        mav.setViewName("registrar");
        return mav;
    }

    @RequestMapping(value = "registrar.htm", method = RequestMethod.POST)
    public ModelAndView Registrar(UsuarioVo u) {
        String sql = "inset into usuario(Nombre,Clave)values(?,?)";
        this.jdbcTemplate.update(sql, u.getNombre(), u.getClave());
        return new ModelAndView("redierct:/index.htm");

    }

    @RequestMapping(value = "Editar.htm", method = RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request) {
        Id = Integer.parseInt(request.getParameter("Id"));
        String sql = "select * from usuario where Id=" + Id;
        mav.addObject("lista", datos);
        datos = this.jdbcTemplate.queryForList(sql);
        mav.setViewName("Editar");
        return mav;
    }

    @RequestMapping(value = "Editar.htm", method = RequestMethod.POST)
    public ModelAndView Editar(UsuarioVo u) {
        String sql = "Update usuario set Nombre=?,Clave=? where Id="+Id;
        this.jdbcTemplate.update(sql, u.getNombre(), u.getClave());

return new ModelAndView("redierct:/index.htm");
//        mav.setViewName("Listar");
  //      return mav;

    }

    @RequestMapping("Eliminar.htm")
    public ModelAndView Eliminar(HttpServletRequest request) {
        Id = Integer.parseInt(request.getParameter("Id"));
        String sql = "delete from usuario where Id=" + Id;
        this.jdbcTemplate.update(sql);
        return new ModelAndView("redierct:/index.htm");
    }
}
