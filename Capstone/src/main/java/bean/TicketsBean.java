package bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.*;


@ManagedBean(name="ticket", eager=true)
@RequestScoped
public class TicketsBean implements Serializable {

    private int Ticket_ID;
    private String summary;
    private String description;
    private boolean closed;
    private Date date_opened;
    private Date date_closed;
   

    public TicketsBean() {
    }

    
    


    public int getTicket_ID() {
        return Ticket_ID;
    }

    public void setTicket_ID(int Ticket_ID) {
        this.Ticket_ID = Ticket_ID;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public Date getDate_opened() {
        return date_opened;
    }

    public void setDate_opened(Date date_opened) {
        this.date_opened = date_opened;
    }

    public Date getDate_closed() {
        return date_closed;
    }

    public void setDate_closed(Date date_closed) {
        this.date_closed = date_closed;
    }

 
     
    

}
