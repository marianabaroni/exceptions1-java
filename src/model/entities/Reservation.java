package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
	public Reservation() {
		
	}

	public Reservation(Integer roomNumber, Date checkin, Date checkout) {
		this.roomNumber = roomNumber;
		this.checkIn = checkin;
		this.checkOut = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkIn;
	}

	public Date getCheckout() {
		return checkOut;
	}	
	
	public long duration() {
		long diff = checkIn.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);//converte o diff que está em miliseconds para dias.
	}
	
	public void updateDates(Date checkIn, Date checkOut) {
		this.checkIn = checkIn;// o checini do objeto receber o checkin que veio como argumento do metodo
		this.checkOut = checkOut;
	}

	@Override
	public String toString() {
		 //"Reservation [roomNumber=" + roomNumber + ", checkIn=" + checkIn + ", checkOut=" + checkOut + "]";
		return 	"ROOM "
				+ roomNumber
				+ ", check-in"
				+ sdf.format(checkIn)
				+ ", check - out"
				+ sdf.format(checkOut)
				+ ","
				+ duration()
				+ " nights";
	}
	
	
	
}
