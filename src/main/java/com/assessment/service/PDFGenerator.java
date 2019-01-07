package com.assessment.service;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import org.apache.pdfbox.debugger.PDFDebugger;
import org.springframework.core.io.ClassPathResource;

import com.assessment.model.Message;
import com.assessment.model.PersonalDetails;
import com.assessment.model.Questions;
import com.assessment.model.TotalInformation;
import com.itextpdf.awt.geom.Rectangle;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPTableBody;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.DottedLineSeparator;
import com.itextpdf.text.pdf.draw.LineSeparator;
import com.itextpdf.tool.xml.XMLWorkerHelper;

import cz.vutbr.web.css.CSSProperty.Border;

public class PDFGenerator {
	public static final int AUTOMATED = 0;
	public static final int MANUAL = 1;

	private static float lineWidth = 0.5f;
	private static BaseColor lineColor = new BaseColor(200,210,120);
	private static Font fontTopTitle = new Font(FontFamily.TIMES_ROMAN, 20);
	private static final Paragraph headingPara = new Paragraph("Summary of Assessment Report",fontTopTitle);
	
	
	public static void main(String[] args) {}

	public static void generatePDFFromHTML(TotalInformation inf, MessageService messageService,String fileName) throws Exception {
		generatePDFFromHTML(inf,messageService,MANUAL,fileName);
	}
	
	public static void generatePDFFromHTML(TotalInformation inf, MessageService messageService,int type,String fileName) throws Exception {
	    Document document = new Document();
	    PdfWriter writer = PdfWriter.getInstance(document,new FileOutputStream("src/main/" + fileName +".pdf"));
	    document.open();
	    
	    
	    Paragraph newLineP = new Paragraph(new Paragraph("Your Personalized Test Automation Capabilities Matrix",fontTopTitle)); 
	    newLineP.add(Chunk.NEWLINE);
	    newLineP.add(Chunk.NEWLINE);
	    PdfPTable docTable = new PdfPTable(1);
	    docTable.setWidthPercentage(100);

	    
	    PdfPCell mainCell = new PdfPCell();
	    mainCell.addElement(newLineP);
	    
	    Paragraph compName = new Paragraph(inf.getPersonalDetails().getCompanyName());
	    compName.setAlignment(Element.ALIGN_CENTER);
	    Paragraph phNumber = new Paragraph(inf.getPersonalDetails().getPhoneNumber());
	    phNumber.setAlignment(Element.ALIGN_CENTER);
	    mainCell.addElement(compName);
	    mainCell.addElement(phNumber);
	    mainCell.addElement(Chunk.NEWLINE);
	    
	    mainCell.addElement(new Paragraph(inf.getPersonalDetails().getFirstName() + " " + inf.getPersonalDetails().getLastName()));
	    mainCell.addElement(new Paragraph(inf.getPersonalDetails().getEmail()));
	    
	    LineSeparator line2 = new LineSeparator();
	    line2.setLineColor(lineColor);
	    line2.setLineWidth(lineWidth);
	    mainCell.addElement(Chunk.NEWLINE);

	    mainCell.addElement(line2);
	    Chunk question = new Chunk("Questions",new Font(FontFamily.TIMES_ROMAN,14, Font.NORMAL));
	    Paragraph questionHeading = new Paragraph(question);
	    questionHeading.setAlignment(Element.ALIGN_CENTER);
	   
	    
	    mainCell.addElement(questionHeading);
	    int i=1;
	    for(Questions q : inf.getQuestions()) {
	    	Paragraph p = new Paragraph();
	    	    	
	    	p.add(Chunk.NEWLINE);
	    	p.add(q.getQuestion());
	    	p.add(Chunk.NEWLINE);
	    	p.add(new Chunk("Answer : ",new Font(FontFamily.TIMES_ROMAN,13, Font.NORMAL)));
	    	String collect = q.getAnswer().stream().collect(Collectors.joining(","));
	    	
	    	Font fontAnswers = new Font(FontFamily.TIMES_ROMAN,13, Font.NORMAL, new BaseColor(0, 0, 139));
	    	p.add(new Chunk(collect,fontAnswers));
			
	    	mainCell.addElement(Chunk.NEWLINE);
	    	mainCell.addElement(p);
	    }
	  /*  File resFie = new ClassPathResource("messages.properties").getFile();
		Properties props = new Properties();
		props.load(new FileInputStream(resFie)); */
		
		mainCell.addElement(Chunk.NEWLINE);
		
		mainCell.addElement(new Chunk("Thank you for completing the survey. An SDLC Partners Representative will be in contact with you soon to discuss the summary of assessment report."));
		mainCell.addElement(new Chunk("Should you need support prior to then, please contact us at xxx-xxx-xxxx.")); 
		
		mainCell.addElement(Chunk.NEWLINE);
	    
	    LineSeparator line = new LineSeparator();
	    line.setLineWidth(lineWidth );
	    line.setLineColor(lineColor);
	    mainCell.addElement(Chunk.NEWLINE);

	    mainCell.addElement(line);
		   
	    headingPara.setAlignment(Element.ALIGN_CENTER);
	    mainCell.addElement(headingPara);
	    mainCell.addElement(Chunk.NEWLINE);

	    mainCell.setBorder(PdfPCell.NO_BORDER);
	    docTable.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
	    
	    docTable.addCell(mainCell);
	    document.add(docTable);
		 
	    
	    if(type==AUTOMATED) {
	    	 PdfPTable table = new PdfPTable(33);
		 	    table.setWidthPercentage(100);
		 	    table.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
		 	   
		 	   addColorCell(table, new BaseColor(129,172, 120));
		 	   addCell(table, new Chunk("Optimized"));

		 	   addColorCell(table, new BaseColor(255,255, 153));
		 	   addCell(table, new Chunk("Progressive"));

		 	   addColorCell(table, new BaseColor(240,128,128));
		 	   addCell(table, new Chunk("AD Hoc"));
		 	   
		 	   document.add(table);		 	
	    }
	    
	    Font fontTitle = new Font(FontFamily.TIMES_ROMAN, 14);
	    
	   // ResourceBundle rb = ResourceBundle.getBundle("messages");
	   
	    if(messageService!=null) {
	    	 PdfPTable table = new PdfPTable(1);
	 	    table.setWidthPercentage(100);
	 	    table.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
	 	    
	 	    String oldTitle = "" ;
	    	for(Message q : messageService.getMessages()) {
		    	Paragraph p = new Paragraph();
		    	//String title =  rb.getString("report.category." + q.getCategory().toLowerCase());
				String title  = q.getCategory();
				PdfPCell cell = new PdfPCell();
				cell.setBorder(PdfPCell.NO_BORDER);
				
				if(!title.equalsIgnoreCase(oldTitle)) {
					oldTitle = title;
					switch(title) {
						case "ROI"  : title = "ROI (Return of Investment)"; break;
						
					
					}
					 Paragraph titleP = new Paragraph("",fontTitle);
					 titleP.add(Chunk.NEWLINE);
					titleP.add(title);
					titleP.add(Chunk.NEWLINE);
					
					 titleP.add("\n");
					 titleP.setAlignment(Element.ALIGN_CENTER);
					 PdfPCell pCell = new PdfPCell();
					 pCell.setBorder(PdfPCell.NO_BORDER);
					  pCell.addElement(titleP); 
					  
					table.addCell(pCell);
				}
				Paragraph msg = new Paragraph(q.getMessage());
				 p.add(msg);
				p.add(Chunk.NEWLINE);
				cell.addElement(p);
				if(type==AUTOMATED) {
					BaseColor color =  null;
					switch(q.getColor()) {	 
						case  "green-answer" : color = new BaseColor(129,172, 120); break;
						case  "yellow-answer" : color = new BaseColor(255,255, 153); break; 
						case  "red-answer" : color = new BaseColor(240,128,128); break;
						default :color =  BaseColor.LIGHT_GRAY;
					}
					cell.setBackgroundColor(color);				
				}
			  
				table.addCell(cell);
		    }
		    document.add(table);	
	    }
	    
	    
	    document.close();
	   
		
	}

	private static void addColorCell(PdfPTable table,BaseColor color) {
		PdfPCell cell = new PdfPCell();
		cell.setBorder(PdfPCell.NO_BORDER);
		cell.addElement(new Chunk("  "));
		cell.setBackgroundColor(color);
		table.addCell(cell);
	}
	
	private static void addEmptyCell(PdfPTable table) {
		PdfPCell cell = new PdfPCell();
		cell.setBorder(PdfPCell.NO_BORDER);
		cell.addElement(new Chunk("  "));
		table.addCell(cell);
	}
	
	private static void addCell(PdfPTable table, Chunk chunk) {
		PdfPCell cell = new PdfPCell();
		cell.setBorder(PdfPCell.NO_BORDER);
		cell.addElement(chunk);
		cell.setColspan(11);
		table.addCell(cell);
	}
	
}
