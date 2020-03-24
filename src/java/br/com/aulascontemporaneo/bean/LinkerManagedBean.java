/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aulascontemporaneo.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "linker")
@RequestScoped
public class LinkerManagedBean {

    private String content = "/contents/home.xhtml";

    public LinkerManagedBean() {
    }

    public void route() {
        content = "/frame/content/newjsf.xhtml";
    }

    public String getContent() {
        System.out.println("page:" + content);
        return content;
    }

    public String setContent(String link) {
        content = link;
        return link;
    }
}
