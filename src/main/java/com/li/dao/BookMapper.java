package com.li.dao;


import com.li.pojo.Books;

import java.util.List;

public interface BookMapper {
    //增加一个book
    int addBook(Books book);
    //根据id删除一个Book
    int deleteBookById(int id);

    //更新Book
    int updateBook(Books books);

    //根据id查询,返回一个Book
    Books queryBookById(int id);

    //查询全部Book,返回list集合
    List<Books> queryAllBook();

    //按名字模糊查询
    List<Books> queryBookByName(String name);
}
