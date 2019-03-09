<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>西南政法大学 SWUPL</title>
		<link href="${pageContext.request.contextPath}/static/css/web/news/news_home.css" type="text/css" rel="stylesheet" />
		<!--<script src="js/测试1.js"></script>-->
		<!--<script src="js/测试2.js"></script>-->
	</head>
	<body>
		<header><!--这是包括全屏轮播的背景大框，包括3个部分，一个是top的黑色透明部分，第二是轮播图片的插入，第三个是轮播图片左下角的3个小导航，-->
			<div class="head"><!--这是透明黑色的top头部全屏背景大框,主要是为了背景设此盒子-->
				<div class="head_top"><!--这是透明黑色的头部里的1120px宽的内容盒子，以下分成三个box:分别是LOGO，右上角链接link，导航NAV-->
					<div class="head_top_logo">
						<img src="img/logo01.png"/>
					</div>
					
					<!--头部top右上角链接内容开始-->
					<div class="head_top_link">
						<ul>
							<li><a href="#">学生</a></li>
							<li><a href="#">教职工</a></li>
							<li><a href="#">校友</a></li>
							<li><a href="#">访客</a></li>
							<li><a href="#">智慧校园</a></li>
							<li><a href="#">English</a></li>
							<li><a href="#"><img src="img/ser.jpg" ></a>
						 		<form action=" #" method="post" class=" head_top_link_search">
						 			<input type="search" placeholder="  请输入搜索的内容、关键词、标题……" >
						 			<img src="img/search2.jpg" />
						 		</form>
							</li>
						</ul>
					</div>
					<!--头部top右上角链接结束-->
					<!--导航开始-->
					
					<div class="head_top_nav">
						
						<ul class="head_top_nav_ul" >
							
							<li class="head_top_nav_ul_li"><a class="head_top_nav_ul_a" href="">学校简介<img src="img/nav01.png" /></a>
								<div class="head_top_nav_ul_intro_content">
									<div class="head_top_nav_ul_intro_content_list">
										<a href="#">西政概览</a>
										<a href="#">标识文化</a>
										<a href="#">办学特色</a>
										<a href="#">交通指南</a>
										<a href="#">历任领导</a>
										<a href="#">现任领导</a>
									</div>	
									<div class="head_top_nav_ul_intro_content_text">
										<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;西南政法大学位于中国长江上游地区的中央直辖市重庆，
											是新中国最早建立的高等政法学府，改革开放后全国首批重点大学，全国首批卓越法律人才教育培养基地，
											教育部与重庆市人民政府共建高校，来华留学生中国政府奖...</p>
										<a class="head_top_nav_ul_more" href="#">更多>></a>
									</div>
								</div>
							</li>
							<li class="head_top_nav_ul_li"><a class="head_top_nav_ul_a" href="">新闻资讯<img src="img/nav01.png" /></a>
								<div class="head_top_nav_ul_news_content">
									<div class="head_top_nav_ul_news_content_list">
										<a href="news_list.html" target="_blank">宣传在线</a>
										<a href="#">新闻网</a>
										<a href="#">西政报</a>
										<a href="#">广电台</a>
										<a href="#">新浪微博</a>
										<a href="#">腾讯微博</a>
										<a href="#">微信频道</a>
										<a href="#">图说西政</a>
										<a href="#">橱窗画册</a>
										<a href="#">展览馆</a>
										<a href="#">各类专题</a>
										<a href="#">校园刊物</a>
										<a href="#">讲座论坛</a>
										<a href="#">通知公告</a>
									</div>	
									<div class="head_top_nav_ul_news_content_text">
										<div>
											<a href="#">2018级本科学生军训汇报表演在校举行</a>
											<br />
											<p >9月21日上午，西南政法大学2018级本科学生军训汇报表演暨总结表彰大会在北园田径运动场上如期举行。
												全体在家校...</p>
										</div>
										<div >
											<a href="#">广东省人民政府参事调研组来校调研法学教育</a>
											<br />
											<p >9月20日上午，广东省人民政府参事、省委政法委原巡视员索健元一行来到我校交流调研，
												听取我校专家对发展法学教育的...</p>
										</div>
										<a class="head_top_nav_ul_more" href="#">进入新闻网>></a>
									</div>
								</div>
							</li>
							<li class="head_top_nav_ul_li" ><a class="head_top_nav_ul_a" href="">学院机构<img src="img/nav01.png" /></a>
								<div class="head_top_nav_ul_college_content">
									<ul >
										<li ><a href="#">民商法学院</a> </li>
										<li ><a href="#">经济法学院</a> </li>
										<li ><a href="#">法学院</a> </li>
										<li ><a href="#">行政法学院</a> </li>
										<li ><a href="#">国际法学院</a> </li>
										<li ><a href="#">刑事侦查学院</a> </li>
										<li ><a href="#">商学院</a> </li>
										<li ><a href="#">经济学院</a> </li>
										<li ><a href="#">外语学院</a> </li>
										<li ><a href="#">新闻传播学院</a> </li>
										<li ><a href="#">政治与公共管理学院</a> </li>
										<li ><a href="#">马克思主义学院</a> </li>
										<li ><a href="#">人工智能法学院</a> </li>
										<li ><a href="#">国际教育学院</a> </li>
										<li ><a href="#">继续教育学院</a> </li>
										<li ><a href="#">体育部</a> </li>
									</ul>
									
									<ul>
										<li><a href="#">党政办公室</a></li>
										<li><a href="#">党委组织部</a></li>
										<li><a href="#">党委宣传部</a></li>
										<li><a href="#">党委统战部</a></li>
										<li><a href="#">纪委办公室、监察处</a></li>
										<li><a href="#">党委学生工作部</a></li>
										<li><a href="#">党委保卫部</a></li>
										<li><a href="#">工会</a></li>
										<li><a href="#">团委</a></li>
										<li><a href="#">关心下一代工作委员会</a></li>
										<li><a href="#">国内合作办公室</a></li>
										<li><a href="#">发展规划办公室</a></li>
										<li><a href="#">人事处</a></li>
										<li><a href="#">国际合作与交流处</a></li>
										<li><a href="#">科研处</a></li>
										<li><a href="#">教务处</a></li>
										<li><a href="#">研究生院</a></li>
										<li><a href="#">计划财务处</a></li>
										<li><a href="#">审计处</a></li>
										<li><a href="#">国有资产管理处</a></li>
										<li><a href="#">基建后勤管理处</a></li>
										<li><a href="#">离退休工作处</a></li>
										<li><a href="#">网络安全和信息化领导小组办公室</a></li>
										<li><a href="#">图书馆</a></li>
										<li><a href="#">期刊社</a></li>
										<li><a href="#">人权研究院</a></li>
										<li><a href="#">高等研究院</a></li>
										<li><a href="#">司法鉴定与证据科学研究院</a></li>
										<li><a href="#">教师工作部</a></li>
										<li><a href="#">医院</a></li>
										<li><a href="#">招标采购中心</a></li>
									</ul>
								</div>		
							</li>
							<li  class="head_top_nav_ul_li"><a class="head_top_nav_ul_a" href="">学科专业<img src="img/nav01.png" /></a>
								<div class="head_top_nav_ul_subject_content">
									<div class="head_top_nav_ul_subject_content_list">
										<a href="#">重点学科</a>
										<a href="#">学科概况</a>
										<a href="#">专业设置</a>
									</div>	
									<div class="head_top_nav_ul_subject_content_text">
										<p>全国首批法学一级学科博士学位授权单位和全国首批法律硕士专业学位授权单位。</p>
										<a class="head_top_nav_ul_more" href="#">更多>></a>
									</div>
								</div>
							</li>
							<li class="head_top_nav_ul_li"><a class="head_top_nav_ul_a" href="">招生就业<img src="img/nav01.png" /></a>
								<div class="head_top_nav_ul_getjob_content">
									<div >
										<a href="#"><img src="img/20150524213623192047.jpg" /></a>
										
										<span>招生</span>
										<p>欢迎您报考西南政法大学！</p>
										<a class="head_top_nav_ul_more" href="#">更多>></a>
									</div>
									<div >
										<a href="#"><img src="img/20150524213644923221.jpg" /></a>
									
										<span>就业</span>
										<p>西南政法大学就业信息网提供全面快速的就业信息。</p>
										<a class="head_top_nav_ul_more" href="#">更多>></a>
									</div>
								</div>
							</li>
							<li class="head_top_nav_ul_li"><a class="head_top_nav_ul_a" href="">学术研究<img src="img/nav01.png" /></a>
								<div class="head_top_nav_ul_academic_content">
									<div class="head_top_nav_ul_academic_content_list">
										<a href="#">研究基地</a>
										<a href="#">学术专题</a>
										<a href="#">科研管理系统</a>
									</div>	
									<div class="head_top_nav_ul_academic_content_text">
										<p>学校建有国家人权教育与培训基地，国家民委民族理论政策研究基地，
											中国法学会法治研究基地，重庆市2011协同创新中心，重庆市人文社会科学重点研究基地，
											重庆市社会科学普及基地，重庆市高校资政中心，重庆市高校...</p>
										<a class="head_top_nav_ul_more" href="#">更多>></a>
									</div>
								</div>
								
								
							</li>
							
						</ul>
						
					</div>
					<div class="head_top_nav_homepage">	<a href="#">首页</a></div>
					<div class="head_nav_title_label">
						<div>新闻资讯</div>
						<div>News</div>
					</div>
				</div>
				
			</div>
			<div class="head_bgrongdimg"><!--为了加5张轮播背景图而设立此盒子-->
				
			</div>
			
			
		</header>
		<!--头部结束-->
		<!--主体内容开始-->
		<section class="news_main_max"> 
			<div class="main">
				<ul>
					<li>
						<div class="main_font">
							<div class="font_top">
								<h4><a href="#">${areOne.newsTitle}</a></h4>
								<p>${areOne.describ}</p>
							</div>
						</div>
						<div class="banner_hidden"><a href="#"><img id="image" src="${areOne.newsImage}"/></a></div>
					</li>
					<li>
						<div class="main_font">
							<div class="font_top">
								<h4><a href="#">${areTwo.newsTitle}</a></h4>
								<p>${areTwo.describ}</p>
							</div>
						</div>
						<div class="banner_hidden"><a href="#"><img id="image" src="${areTwo.newsImage}" /></a></div>
					</li>
				</ul>
				<ul>
					<li>
						<div class="main_font">
							<div class="font_top">
								<h4><a href="#">${areThree.newsTitle}</a></h4>
								<p>${areThree.describ}</p>
							</div>
						</div>
						<div class="banner_hidden"><a href="#"><img id="image" src="${areThree.newsImage}" /></a></div>
					</li>
					<li class="main_banner_min">
						<div class="banner_min_lf">
						<a href="#"><img id="image" src="${areFour.newsImage}" /><span>${areFour.newsTitle}</span></a>
						</div>
						<div class="banner_min_rt">

						</div>
					</li>
				</ul>
				<ul>
					<li>
						<div class="banner_qc">
							<a href="#"><img src="img/news_img/news_main_img5.jpg" />新浪微博</a>
						</div>
						<div class="banner_qc">
							<a href="#"><img src="img/news_img/news_main_img6.jpg" />新浪微博</a>
						</div>
						<div class="banner_qc">
							<a href="#"><img src="img/news_img/news_main_img7.jpg" />微信频道</a>
						</div>
					</li>
					<li>
						<div class="main_font">
							<div class="font_top">
								<h4><a href="#">图说西政</a></h4>
								<p>西南政法大学就业信息网提供全面快速的就业信息、就业指导。 </p>
							</div>
						</div>
						<div class="banner_hidden"><a href="#"><img id="image" src="img/news_img/news_main_img8.jpg" /></a></div>
					</li>
				</ul>
				<ul>
					<li>
						<div class="main_font">
							<div class="font_top">
								<h4><a href="#">橱窗画册</a></h4>
								<p>西政橱窗网络版是校内橱窗展示的网络平台，您可以在这里查看校内橱窗展示的所有内容。</p>
							</div>
						</div>
						<div class="banner_hidden"><a href="#"><img id="image" src="img/news_img/news_main_img9.jpg" /></a></div>
					</li>
					<li>
						<div class="main_font">
							<div class="font_top">
								<h4><a href="#">展览馆</a></h4>
								<p>网上展览馆陈列了我校三次创业时期的辉煌成就，供社会各界参观。</p>
							</div>
						</div>
						<div class="banner_hidden"><a href="#"><img id="image" src="img/news_img/news_main_img10.jpg" /></a></div>
					</li>
				</ul>
				<ul>
					<li class="main_banner_min">
						<div class="banner_min_lf">
							<a href="#"><img id="image" src="img/news_img/news_main_img11.jpg" /><span>各类专题</span></a>
						</div>
						<div class="banner_min_rt">
							<a href="#"><img id="image" src="img/news_img/news_main_img12.jpg" /><span>校园刊物</span></a>	
						</div>
					</li>
					<li class="main_banner_min">
						<div class="banner_min_lf">
							<div class="font_min_lf">
								<div class="font_lf_top">
								<h4>讲座论坛</h4>
								<a href="#"><img src="img/news_img/news_main_img13.jpg" style="width: 11px; height: 12px;"/></a>
								</div>
								<div class="font_lf_down">
								<p><i>主讲题目：</i><a href="#">北京大学张守文教授将做客金开名家讲坛</a></p>
								<p><i>主 讲 人：</i><em>经济法与经济法研究的若干前沿问题</em></p>
								<p><i></i>时间：</span><em>2018年1月13日19：00</em></p>
								<p><i>地点：</i><em>敬业楼6029会议室</em></p>
								</div>
							</div>
						</div>
						<div class="banner_min_rt">
							<div class="font_min_rt">
								<div class="font_rt_top">
								<h4>通知公告</h4>
								<a href="#"><img src="img/news_img/news_main_img13.jpg" style="width: 11px; height: 12px;"/></a>
								</div>
								<div class="font_rt_down" >
									<a href="#"><img src="img/news_img/news_main_img14.jpg" /><p>关于启动“2018年优秀本科生国际交... [2018-03-05]</p> </a>
									<a href="#"><img src="img/news_img/news_main_img14.jpg" /><p>关于召开全市教育系统2018年全面从... [2018-03-05] </p> </a>
									<a href="#"><img src="img/news_img/news_main_img14.jpg" /><p>关于推荐教师赴海外华校任教的通知 [2018-03-01] </p> </a>
								</div>
							</div>
						</div>
					</li>
				</ul>
			</div>
		</section>
		<!--主体内容结束-->
		<!--尾部开始-->
		<footer>
			<div class="foot" >
				<div class="foot_left">
					<div class="foot_left_top">
						<a href="#"><img src="img/警厅JingTing.jpg"/></a>
						<a href="#"><img src="img/footer beianbgs.png"/></a>
						<a href="#"><img src="img/事业单位ShiYeDanWei.jpg"/></a>
					</div>
					<div class="foot_left_bottom">
						<a href="#"><img src="img/footer beianbgs.png"/>
						<span >渝公网安备 50011202500557号</span></a>
					</div>
				</div>
				<div class="foot_center">
					<a href="#"><img src="img/logo02.jpg" /></a>
					<p>西南政法大学版权所有 ©1994,2009,2012,2015年   渝ICP备05001036号-1</p>
					<p>党委宣传部（新闻中心） 设计制作发布</p>
					<p>渝北校区：重庆市渝北区宝圣大道301号  邮编：401120</p>
					<p>沙坪坝校区：重庆市沙坪坝区壮志路2号  邮编：400031</p>
				</div>
				<div class="foot_right">
					<a href="#"><figure>
						<img src="img/西政微信频道wx01.jpg" />
						<figcaption>西政微信频道</figcaption>
					</figure></a>
					<a href="#"><figure>
						<img src="img/新浪官方微博wx02.jpg" />
						<figcaption>新浪官方微博</figcaption>
					</figure></a>
					<a href="#"><figure>
						<img src="img/腾讯官方微博wx03.jpg" />
						<figcaption>腾讯官方微博</figcaption>
					</figure></a>
					<a href="#"><figure>
						<img src="img/西政网wx04.jpg" />
						<figcaption>西政网</figcaption>
					</figure></a>
				</div>
			</div>
		</footer>
	</body>
</html>
