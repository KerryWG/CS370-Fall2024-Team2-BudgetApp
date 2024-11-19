package com.example.budgetapp.util;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

@Component
public class Navigation {

    /**
     * Redirects to a specific URL.
     *
     * @param url The URL to redirect to.
     * @return A string formatted for redirection.
     */
    public String redirect(String url) {
        return "redirect:" + url;
    }

    /**
     * Renders a view with model data.
     *
     * @param viewName The name of the Thymeleaf template to render.
     * @param model    The data to be passed to the view.
     * @return A ModelAndView object.
     */
    public ModelAndView renderView(String viewName, Model model) {
        ModelAndView modelAndView = new ModelAndView(viewName);
        model.asMap().forEach(modelAndView::addObject);
        return modelAndView;
    }
}
