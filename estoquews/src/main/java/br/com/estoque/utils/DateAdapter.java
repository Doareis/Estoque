package br.com.estoque.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateAdapter extends XmlAdapter<String, Date> {

	private static final String DATE_PATTERN = "dd/MM/yyyy";
	private SimpleDateFormat formatter = new SimpleDateFormat(DATE_PATTERN);

	public String marshal(Date date) throws Exception {
		// TODO Auto-generated method stub
		return formatter.format(date);
	}

	public Date unmarshal(String date) throws Exception {
		return formatter.parse(date);
	}
	
}
