package hutech.LuongTuanAnh.demo.repository;

import hutech.LuongTuanAnh.demo.enity.Category;
import hutech.LuongTuanAnh.demo.enity.book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository  extends JpaRepository<Category, Long> {
}
