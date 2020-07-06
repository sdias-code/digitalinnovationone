package com.sdias.springwebdemo.controller;

import com.sdias.springwebdemo.datasource.model.Post;
import com.sdias.springwebdemo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class PostController {

    @Autowired
    private PostRepository repository;

    @GetMapping("/post")
    public ModelAndView post(){
        final ModelAndView mv = new ModelAndView();
        mv.setViewName("post");
        mv.addObject("allPost", repository.buscarContados());
        return mv;
    }

    @GetMapping("/new-post")
    public ModelAndView novoPost(){

        final ModelAndView mv = new ModelAndView();
        mv.setViewName("new-post");
        mv.addObject("post", new Post());
        return mv;
    }

    @PostMapping("/post")
    public String criarContatos(
            @Valid
            @ModelAttribute Post post,
            BindingResult result,
            RedirectAttributes redirectAttributes){

        if (result.hasErrors()) {

            return "new-post";
        }
        repository.add(post);

        redirectAttributes.addFlashAttribute("message","Cadastro realizado com sucesso!");
        return "redirect:post";
    }



}
