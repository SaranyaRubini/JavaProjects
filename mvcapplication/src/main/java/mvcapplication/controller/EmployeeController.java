package mvcapplication.controller;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	//Map<Long, Employee> employeeMap = new HashMap<>();
      
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("addEmployee", "employee", new Employee());
    }
	
	
	    @RequestMapping("/")	
		public ModelAndView getPage() {
			return new ModelAndView("welcome");
		}
        
	    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
        public String submit(ModelMap model) {
	    	model.addAttribute("name", "jancsi");
	        return "employeeView";
            //return new ModelAndView("employeeView", "name", "saran");
        }
        
    	@RequestMapping(value = "/addEmployee", method = RequestMethod.GET)
        public ModelAndView submit(@Validated @ModelAttribute("employee")Employee employee, 
          BindingResult result, ModelMap model) {
            if (result.hasErrors()) {
                //return "error";
            }
            model.addAttribute("name", employee.getName());
            model.addAttribute("dept", employee.getDept());
            model.addAttribute("id", employee.getId());
            //ModelAndView mav = new ModelAndView();
           // mav.setViewName("employeeView");
            //mav.addObject("employee",employee);
            System.out.println("name is " + model.getAttribute("name"));
            System.out.println("id is " + model.getAttribute("id"));
            System.out.println("dept is " + model.getAttribute("dept"));
            //model.put("employee", employee);
            //return "employeeView";
            //return mav;
            return new ModelAndView("employeeView", "name", "saran");
        }
    	
    	 @RequestMapping(value = "/addEmployee", method = RequestMethod.POST, params = "cancel")
    	    public String cancel(@Validated @ModelAttribute("employee") final Employee employee, final BindingResult result, final ModelMap model) {
    	        model.addAttribute("message", "You clicked cancel, please re-enter employee details:");
    	        return "welcome";
    	    }
}
