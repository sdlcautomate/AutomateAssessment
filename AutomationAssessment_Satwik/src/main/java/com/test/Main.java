package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import com.assessment.model.Message;
import com.assessment.model.PersonalDetails;
import com.assessment.model.Questions;
import com.assessment.model.TotalInformation;
import com.assessment.service.AutomationTestMessageService;
import com.assessment.service.ManualTestMessageService;
import com.assessment.service.MessageService;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

public class Main {

	private static final Paragraph headingPara = new Paragraph("Summary of Assessment Report");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello");
try {
	 //String html = "<html><body>Hello SA</body></html>";
	 // String test = " <body class=\\\"bg\\\">\\r\\n\\r\\n  <header>\\r\\n    <div class=\\\"container-fluid header-info\\\">\\r\\n          <div class=\\\"d-flex flex-row\\\">\\r\\n            <div class=\\\"col-sm-2 col-md-2 logo-column mr-4\\\">\\r\\n              <div class=\\\"pl-4 logo-section\\\">\\r\\n                <a class=\\\"navbar-brand py-4\\\" href=\\\"../index.html\\\">\\r\\n                    <img src=\\\"../img/svg/sdlc_2blue_Logo.svg\\\" height=\\\"54\\\" alt=\\\"SDLC logo\\\">\\r\\n                </a>\\r\\n              </div>\\r\\n            </div>\\r\\n            <div class=\\\"col-xs-3 col-sm-3 col-md-3 header-main-text d-flex align-items-center pt-2\\\">\\r\\n              <h3 class=\\\"header-title text-nowrap pt-3\\\">Test Automation Assessment</h3>\\r\\n            </div>\\r\\n          </div>\\r\\n        </div>\\r\\n  </header>\\r\\n\\r\\n    <!-- main content -->\\r\\n    <section class=\\\"container-fluid mask rgba-black-strong contact\\\">\\r\\n      <div class=\\\"main-content\\\">\\r\\n        <div class=\\\"overlay-one\\\">\\r\\n          <div class=\\\"row d-flex ml-4 text-questions-content-white-background animated fadeIn pl-1\\\">\\r\\n            <div class=\\\"col-sm-10 offset-sm-2 col-md-10 offset-md-2 col-lg-10 offset-lg-2 opening-content\\\">\\r\\n              <h3 class=\\\"question-header\\\">Please let us know who you are</h3>\\r\\n              <form method=\\\"post\\\" action=\\\"/personalDetails\\\">\\r\\n                <div class=\\\"pt-2 sdlc-contact-info\\\">\\r\\n                  <div class=\\\"md-form form-sm form-group\\\">\\r\\n                      <input type=\\\"text\\\" id=\\\"first-name\\\" class=\\\"form-control\\\" th:field=\\\"${personaldetails.firstName}\\\" required=\\\"true\\\">\\r\\n                      <label for=\\\"inputMDEx\\\" th:text=\\\"#{label.firstName}\\\"></label>\\r\\n                  </div>\\r\\n\\r\\n                  <div class=\\\"md-form form-sm pt-2 form-group \\\">\\r\\n                      <input type=\\\"text\\\" id=\\\"last-name\\\" class=\\\"form-control\\\" required=\\\"true\\\" name=\\\"lastName\\\" value=\\\"\\\">\\r\\n                      <label for=\\\"inputMDEx\\\">Last Name*</label>\\r\\n                  </div>\\r\\n                  <div class=\\\"md-form form-sm pt-2 form-group\\\">\\r\\n                      <input type=\\\"email\\\" id=\\\"email\\\" class=\\\"form-control\\\" required=\\\"true\\\" name=\\\"email\\\" value=\\\"\\\">\\r\\n                      <label for=\\\"inputMDEx\\\">Email*</label>\\r\\n                  </div>\\r\\n                  <div class=\\\"md-form form-sm pt-2 form-group \\\">\\r\\n                      <input type=\\\"tel\\\" id=\\\"phone\\\" class=\\\"form-control\\\" required=\\\"true\\\" onkeypress=\\\"return numberPressed(event);\\\" name=\\\"phoneNumber\\\" value=\\\"\\\">\\r\\n                      <label for=\\\"inputMDEx\\\">Phone*</label>\\r\\n                  </div>\\r\\n                  <div class=\\\"md-form form-sm pt-2 form-group\\\">\\r\\n                      <input type=\\\"text\\\" id=\\\"companyName\\\" class=\\\"form-control\\\" required=\\\"true\\\" name=\\\"companyName\\\" value=\\\"\\\">\\r\\n                      <label for=\\\"inputMDEx\\\">Company Name*</label>\\r\\n                  </div>\\r\\n                </div>\\r\\n                <div class=\\\"pt-4\\\">\\r\\n                  <button type=\\\"submit\\\" value=\\\"Submit\\\" class=\\\"btn btn-primary btn-rounded waves-effect waves-light\\\" id=\\\"submit-button\\\">Submit</button>\\r\\n                </div>\\r\\n              </form>\\r\\n            </div>\\r\\n          </div>\\r\\n        </div>\\r\\n      </div>\\r\\n    </section>\\r\\n\\r\\n    <!-- Footer -->\\r\\n      <footer class=\\\"page-footer font-small blue-grey lighten-5 mt-4\\\">\\r\\n\\r\\n        <!-- Copyright -->\\r\\n        <div class=\\\"footer-copyright text-left py-3 pl-5\\\">\\r\\n          <div class=\\\"copyright-div pl-3\\\">\\r\\n            \\u00A9 2018 SDLC Partners, L.P.\\r\\n          </div>\\r\\n        </div>\\r\\n        <!-- Copyright -->\\r\\n\\r\\n      </footer>\\r\\n      <!-- /Footer -->\\r\\n\\r\\n    <!-- SCRIPTS -->\\r\\n    <!-- JQuery -->\\r\\n    <script type=\\\"text/javascript\\\" src=\\\"../js/jquery-3.2.1.min.js\\\"></script>\\r\\n    <!-- Bootstrap tooltips -->\\r\\n    <script type=\\\"text/javascript\\\" src=\\\"../js/popper.min.js\\\"></script>\\r\\n    <!-- Bootstrap core JavaScript -->\\r\\n    <script type=\\\"text/javascript\\\" src=\\\"../js/bootstrap.min.js\\\"></script>\\r\\n    <!-- MDB core JavaScript -->\\r\\n    <script type=\\\"text/javascript\\\" src=\\\"../js/mdb.min.js\\\"></script>\\r\\n    <script type=\\\"text/javascript\\\" src=\\\"../js/questionscripting/contactDetails.js\\\"></script>\\r\\n        <script>\\r\\n      //phone number input parse function\\r\\n      // Format the phone number as the user types it\\r\\n      document.getElementById('phone').addEventListener('keyup',function(evt){\\r\\n              var phone = document.getElementById('phone');\\r\\n              var charCode = (evt.which) ? evt.which : evt.keyCode;\\r\\n              phone.value = phoneFormat(phone.value);\\r\\n      });\\r\\n\\r\\n      // manually format the phone number on page load\\r\\n      document.getElementById('phone').value = phoneFormat(document.getElementById('phone').value);\\r\\n\\r\\n     \\r\\n      </script>\\r\\n\\r\\n\\r\\n\\r\\n<div class=\\\"hiddendiv common\\\"></div></body>"; 
	//generatePDFFromHTML(test);
	TotalInformation inf = new TotalInformation();
	PersonalDetails personalDetails = new PersonalDetails();
	personalDetails.setCity("CHA");
	personalDetails.setEmail("email.com");
	personalDetails.setFirstName("FN");
	personalDetails.setLastName("LN");
	personalDetails.setPhoneNumber("785-99-0000");
	personalDetails.setCompanyName("Shruthi Enteprise");
	inf.setPersonalDetails(personalDetails);
	List<Questions> questions = new LinkedList<Questions>();
	Questions q1  = new Questions();
	List<String> l1 = new LinkedList<String>(); 	
	q1.setQuestion("This is the first question");
	l1.add("AN1"); l1.add("AN1 Secodn Options");
 q1.setAnswer(l1);
	
	Questions q2  = new Questions();
	List<String> l2 = new LinkedList<String>(); 	
	q2.setQuestion("This is the second question");
	l2.add("AN1"); l2.add("AN1 Secodn Options");
 q2.setAnswer(l2);
 
 questions.add(q1);
 questions.add(q2);
 
 
	inf.setQuestions(questions);
	
	ResourceBundle rb = ResourceBundle.getBundle("messages");
	String test =  rb.getString("report.category.tool");
	System.out.println(test);
	// generatePDFFromHTML(inf);
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}
	private static void generatePDFFromHTML(String html) throws Exception {
	    Document document = new Document();
	    PdfWriter writer = PdfWriter.getInstance(document,
	      new FileOutputStream("src/main/html.pdf"));
	    document.open();
//	    XMLWorkerHelper.getInstance().parseXHtml(writer, document,new FileInputStream(filename));
	    XMLWorkerHelper.getInstance().parseXHtml(writer, document, new StringReader(html));
	    document.close();
	}
	
	public static void generatePDFFromHTML(TotalInformation inf, MessageService messageService) throws Exception {
	    Document document = new Document();
	    PdfWriter writer = PdfWriter.getInstance(document,new FileOutputStream("src/main/html.pdf"));
	    document.open();
	    
	    document.add(new Paragraph("Your Personalized Test Automation Capabilities Matrix"));
	    document.add(Chunk.NEWLINE);
	    
	    Paragraph compName = new Paragraph(inf.getPersonalDetails().getCompanyName());
	    compName.setAlignment(Element.ALIGN_CENTER);
	    Paragraph phNumber = new Paragraph(inf.getPersonalDetails().getPhoneNumber());
	    phNumber.setAlignment(Element.ALIGN_CENTER);
	    document.add(compName);
	    document.add(phNumber);
	    document.add(Chunk.NEWLINE);
	    
	    document.add(new Paragraph(inf.getPersonalDetails().getFirstName() + " " + inf.getPersonalDetails().getLastName()));
	    document.add(new Paragraph(inf.getPersonalDetails().getEmail()));
	    
	    int i=1;
	    for(Questions q : inf.getQuestions()) {
	    	Paragraph p = new Paragraph();
	    	p.add("Question " + i++);	    	
	    	p.add(Chunk.NEWLINE);
	    	p.add(q.getQuestion());
	    	p.add(Chunk.NEWLINE);
	    	p.add(q.getAnswer().stream().collect(Collectors.joining(",")));
	    	document.add(Chunk.NEWLINE);
	    	document.add(p);
	    }
	    document.add(Chunk.NEWLINE);
	    headingPara.setAlignment(Element.ALIGN_CENTER);
	    document.add(headingPara);
	    
	   // ResourceBundle rb = ResourceBundle.getBundle("messages");
		
	    String oldTitle = "" ;
	    for(Message q : messageService.getMessages()) {
	    	Paragraph p = new Paragraph();
	    	//String title =  rb.getString("report.category." + q.getCategory().toLowerCase());
			String title  = q.getCategory();
			
			
			if(!title.equalsIgnoreCase(oldTitle)) {
				oldTitle = title;
				switch(title) {
					case "ROI"  : title = "ROI (Return of Investment)"; break;
					
				
				}
				 Paragraph titleP = new Paragraph(title);
				 titleP.setAlignment(Element.ALIGN_CENTER);
				   
				    
		    	p.add(titleP);
		    	p.add(Chunk.NEWLINE);
		   	
			}
			 	p.add(q.getMessage());
	    	document.add(Chunk.NEWLINE);
	    	document.add(p);
	    }
	    
	    //messageService removed
	    
	    document.close();
	   
		
	}

}
