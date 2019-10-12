package t1708e.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import t1708e.example.entity.BookDetails;
import t1708e.example.service.BookService;

import java.util.List;

@Controller
@RequestMapping(value = "/book")
public class BookController {
    @Autowired
    BookService bookService;
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        List<BookDetails> bookDetails = bookService.bookDetails();
        model.addAttribute("bookDetails", bookDetails);
        return "index";
    }
}
