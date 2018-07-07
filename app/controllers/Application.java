package controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller{
	private static final Logger logger = LoggerFactory.getLogger(Application.class);
	
	public Result index() {
		logger.info("Application#top");
		return ok(index.render("神社まっぷ","ようこそ社の森へ"));
	}
}
