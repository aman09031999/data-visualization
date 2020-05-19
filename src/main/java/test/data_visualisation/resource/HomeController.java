package test.data_visualisation.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController
{
	
	@RequestMapping("/")
	public ModelAndView showHome()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/linechartdata")
	public Data getDataFromDB()	
	{
		List<Integer> values = new ArrayList<>();
		List<String> day = new ArrayList<>();
			
			values.add(30);
			values.add(30);
			values.add(50);
			values.add(38);
			values.add(25);
			values.add(10);
			values.add(15);
			
			day.add("Mon");
			day.add("Tue");
			day.add("Wed");
			day.add("Thr");
			day.add("Fri");
			day.add("Sat");
			day.add("Sun");
		
		return new Data(values, day);
	}
}

class Data	{
	private List<Integer> values = new ArrayList<>();
	private List<String> day = new ArrayList<>();
	
	
public Data()	{
	
}
	public Data(List<Integer> values, List<String> day)
	{
		this.values = values;
		this.day = day;
	}
	public List<Integer> getValues() {
		return values;
	}
	public List<String> getDay() {
		return day;
	}
	public void setValues(List<Integer> values) {
		this.values = values;
	}
	public void setDay(List<String> day) {
		this.day = day;
	}
	
	
}