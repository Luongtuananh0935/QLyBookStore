package hutech.LuongTuanAnh.demo.repository;

import hutech.LuongTuanAnh.demo.enity.book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;

@Repository
public interface IBookRepository extends JpaRepository<book, Long> {
}
