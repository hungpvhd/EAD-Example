package t1708e.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import t1708e.example.entity.BookDetails;
import t1708e.example.repository.BookDeatilsRepository;
import t1708e.example.service.BookService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = {"/book" , "/"})
public class BookController {
    @Autowired
    BookService bookService;

    @Autowired
    BookDeatilsRepository bookDeatilsRepository;
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(Model model){
        List<BookDetails> bookDetails = new ArrayList<>();
        model.addAttribute("bookDetails", bookDetails);
        return "index";
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String searchBook(Model model, @RequestParam("keyword") String keyword){
        if (keyword.isEmpty()){
            List<BookDetails> books = new ArrayList<>();
            model.addAttribute("books",books);
            return "index";
        }
        List<BookDetails> bookDetails = bookDeatilsRepository.searchBookByName(keyword);
        model.addAttribute("bookDetails", bookDetails);
        return "index";
    }

}
