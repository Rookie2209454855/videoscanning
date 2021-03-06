package com.video.scanning;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public  void pull() throws IOException {
		//获取编辑推荐页
		Document document= Jsoup.connect("https://www.zhihu.com/explore/recommendations")
				//模拟火狐浏览器
				.userAgent("Mozilla/4.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0)")
				.get();
		Element main=document.getElementById("zh-recommend-list-full");
		Elements url=main.select("div").select("div:nth-child(2)")
				.select("h2").select("a[class=question_link]");
		for(Element question:url){
			//输出href后的值，即主页上每个关注问题的链接
			String URL=question.attr("abs:href");
			//下载问题链接指向的页面
			Document document2=Jsoup.connect(URL)
					.userAgent("Mozilla/4.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0)")
					.get();
			//问题
			Elements title=document2.select("#zh-question-title").select("h2").select("a");
			//问题描述
			Elements detail=document2.select("#zh-question-detail");
			//回答
			Elements answer=document2.select("#zh-question-answer-wrap")
					.select("div.zm-item-rich-text.expandable.js-collapse-body")
					.select("div.zm-editable-content.clearfix");
			System.out.println("\n"+"链接："+URL
					+"\n"+"标题："+title.text()
					+"\n"+"问题描述："+detail.text()
					+"\n"+"回答："+answer.text());
		}
	}


	/**
	 * @throws IOException
	 */
	@Test
	public  void dowloadImage() throws IOException {
		// TODO Auto-generated method stub
		String imageSrc = "https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png";
		Connection.Response response = Jsoup.connect(imageSrc).
				userAgent("Mozilla/4.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0)").
				ignoreContentType(true).execute();
		byte[] img = response.bodyAsBytes();
		System.out.println(img.length);
		savaImage(img, "D:\\360Downloads", "test.png");
	}

	public void savaImage(byte[] img,String filePath,String fileName) {
		BufferedOutputStream bos = null;
		FileOutputStream fos = null;
		File file = null;
		File dir = new File(filePath);
		try {
			//判断文件目录是否存在
			if(!dir.exists() && dir.isDirectory()){
				dir.mkdir();
			}
			file = new File(filePath+"\\"+fileName);
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			bos.write(img);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(bos!=null){
				try {
					bos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}



	}
}
