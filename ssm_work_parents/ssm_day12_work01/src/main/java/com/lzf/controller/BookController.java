package com.lzf.controller;

import com.lzf.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Saber污妖王
 * TODO: Book 实体的 Controller
 * @UpdateUser: luanz
 * @Project: ssm_work_parents
 * @Date: 2020/3/26
 * @Package: com.qst.controller
 * @Version: 0.0.1
 */
@Controller
public class BookController {
    @RequestMapping("/show")
    public ModelAndView showBook() {
        List<Book> bookList = getBooks();

        ModelAndView mv = new ModelAndView("book_list");
        mv.addObject("bookList", bookList);
        return mv;
    }

    @RequestMapping("/showJson")
    //告诉SpringMVC可以把集合转换成json格式的字符串
    @ResponseBody
    public List<Book> show() {
        return getBooks();
    }

    private List<Book> getBooks() {
        List<Book> bookList = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            Book book = new Book();
            book.setId(i);
            book.setName("《平凡的世界" + i + "》");
            book.setPrice(9.9 + i);
            bookList.add(book);
        }
        return bookList;
    }
}
