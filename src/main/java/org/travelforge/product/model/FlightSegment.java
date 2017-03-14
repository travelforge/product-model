/*
 * The Travelforge Project
 * http://www.travelforge.org
 *
 * Copyright (c) 2015 - 2017 Matthias Deck
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy 
 * of this software and associated documentation files (the "Software"), to 
 * deal in the Software without restriction, including without limitation the 
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or 
 * sell copies of the Software, and to permit persons to whom the Software is 
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR 
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE 
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *
 */
package org.travelforge.product.model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Matthias Deck
 */
public class FlightSegment implements Serializable {

    private static final long serialVersionUID = 1L;

    private Airline airline;
    private String flightNumber;
    private String travelClass;
    private String bookingClass;
    private Integer duration;
    private Airport departureAirport;
    private LocalDateTime departureDateTime;
    private Airport arrivalAirport;
    private LocalDateTime arrivalDateTime;

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(String travelClass) {
        this.travelClass = travelClass;
    }

    public String getBookingClass() {
        return bookingClass;
    }

    public void setBookingClass(String bookingClass) {
        this.bookingClass = bookingClass;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(Airport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public LocalDateTime getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(LocalDateTime departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(Airport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public LocalDateTime getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightSegment that = (FlightSegment) o;

        if (airline != null ? !airline.equals(that.airline) : that.airline != null) return false;
        if (flightNumber != null ? !flightNumber.equals(that.flightNumber) : that.flightNumber != null) return false;
        if (travelClass != null ? !travelClass.equals(that.travelClass) : that.travelClass != null) return false;
        if (bookingClass != null ? !bookingClass.equals(that.bookingClass) : that.bookingClass != null) return false;
        if (duration != null ? !duration.equals(that.duration) : that.duration != null) return false;
        if (departureAirport != null ? !departureAirport.equals(that.departureAirport) : that.departureAirport != null)
            return false;
        if (departureDateTime != null ? !departureDateTime.equals(that.departureDateTime) : that.departureDateTime != null)
            return false;
        if (arrivalAirport != null ? !arrivalAirport.equals(that.arrivalAirport) : that.arrivalAirport != null)
            return false;
        return arrivalDateTime != null ? arrivalDateTime.equals(that.arrivalDateTime) : that.arrivalDateTime == null;
    }

    @Override
    public int hashCode() {
        int result = airline != null ? airline.hashCode() : 0;
        result = 31 * result + (flightNumber != null ? flightNumber.hashCode() : 0);
        result = 31 * result + (travelClass != null ? travelClass.hashCode() : 0);
        result = 31 * result + (bookingClass != null ? bookingClass.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (departureAirport != null ? departureAirport.hashCode() : 0);
        result = 31 * result + (departureDateTime != null ? departureDateTime.hashCode() : 0);
        result = 31 * result + (arrivalAirport != null ? arrivalAirport.hashCode() : 0);
        result = 31 * result + (arrivalDateTime != null ? arrivalDateTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FlightSegment{" +
                "airline=" + airline +
                ", flightNumber='" + flightNumber + '\'' +
                ", travelClass='" + travelClass + '\'' +
                ", bookingClass='" + bookingClass + '\'' +
                ", duration=" + duration +
                ", departureAirport=" + departureAirport +
                ", departureDateTime=" + departureDateTime +
                ", arrivalAirport=" + arrivalAirport +
                ", arrivalDateTime=" + arrivalDateTime +
                '}';
    }
}
