package bookstore.bookstore.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BookStoreController {

    @GetMapping("/authors")
    public String getAuthor(ModelMap map){
        return "";
    }
    @GetMapping("/books")
    public String getBooks(ModelMap map){

        return "";
    }
    @GetMapping("/searchBooks")
    public String searchBooks(ModelMap map){
        return "";
    }





}
