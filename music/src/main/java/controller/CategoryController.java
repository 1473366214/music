package controller;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;

import pojo.Category;
import pojo.UserLogin;
import service.CategoryService;
import util.Page;

// 告诉spring mvc这是一个控制器类
@Controller
public class CategoryController {
	@Autowired
	CategoryService categoryService;

	@RequestMapping("listCategory")
	public ModelAndView listCategory(Page page){
		ModelAndView mav = new ModelAndView();
		PageHelper.offsetPage(page.getStart(),5);
//		List<Category> cs= categoryService.list();
//		int total = (int) new PageInfo<>(cs).getTotal();
//		
//		page.caculateLast(total);
//		
//		// 放入转发参数
//		mav.addObject("cs", cs);
		// 放入jsp路径
		mav.setViewName("listCategory");
		return mav;
	}
	
	@ResponseBody //返回的是ajax返回值
	@RequestMapping("testJson")
	public List<Category> testJson() {
		Category c1 = new Category(1,"a");
		Category c2 = new Category(2,"b");
		Category c3 = new Category(3,"c");
		List<Category> list = new ArrayList<Category>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		return list;
	}

	@RequestMapping("testUpload")
	public String testUpload(@RequestParam("desc") String desc,@RequestParam("file") MultipartFile file) throws IOException {
		InputStream input = file.getInputStream();
		OutputStream output = new FileOutputStream("D:\\"+file.getOriginalFilename());
		byte[] bs = new byte[1024];
		int len = -1;
		while((len = input.read(bs))!=-1) {
			output.write(bs,0,len);
		}
		System.out.println(desc);
		return "index";
	}
	@ResponseBody
	@RequestMapping("testAjax")
	public String testAjax(UserLogin user) {
		System.out.println(user.getId()+" "+user.getPwd());
		return user.getId();
	}
}
