package th.ac.ku.Hotel.service;

import org.springframework.stereotype.Service;
import th.ac.ku.Hotel.model.Room;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {
    private List<Room> roomList;
    @PostConstruct
    public void postConstruct(){
        this.roomList = new ArrayList<>();
    }
    public void createRoom(Room room){ roomList.add(room); }
    public List<Room> getRooms() {
        return new ArrayList<>(this.roomList);
    }
}