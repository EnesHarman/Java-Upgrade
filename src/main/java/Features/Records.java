package Features;

import java.time.LocalDate;
import java.util.Objects;

public class Records {
    public static void main(String[] args) {
        var response = new CreateMessageResponse(12, LocalDate.now(), "Enes");
        System.out.println(response.toString()); // Output CreateMessageResponse{messageId=12, createDate=2023-05-21, creator='Enes'}

        var responseRecord = new CreateMessageResponseRecord(12, LocalDate.now(), "Enes");
        System.out.println(responseRecord.toString()); // Output CreateMessageResponseRecord[messageId=12, createDate=2023-05-21, creator=Enes]
    }
}

class CreateMessageResponse { //Old Way
    private final int messageId;
    private final LocalDate createDate;
    private final String creator;

    public CreateMessageResponse(int messageId, LocalDate createDate, String creator) {
        this.messageId = messageId;
        this.createDate = createDate;
        this.creator = creator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateMessageResponse that = (CreateMessageResponse) o;
        return messageId == that.messageId && createDate.equals(that.createDate) && creator.equals(that.creator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, createDate, creator);
    }

    @Override
    public String toString() {
        return "CreateMessageResponse{" +
                "messageId=" + messageId +
                ", createDate=" + createDate +
                ", creator='" + creator + '\'' +
                '}';
    }

    public int getMessageId() {
        return messageId;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public String getCreator() {
        return creator;
    }
}

record CreateMessageResponseRecord(int messageId, LocalDate createDate, String creator) {}