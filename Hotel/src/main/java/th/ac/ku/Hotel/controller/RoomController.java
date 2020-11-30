package th.ac.ku.Hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import th.ac.ku.Hotel.model.Room;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RoomController {
    private List<Room> rooms = new ArrayList<>();
    @GetMapping ("/room")
    public String getRoomPage(Model model) {
        model.addAttribute("allRooms", rooms);
        return "room";
    }
    @PostMapping("/room")
    public String Room(@ModelAttribute Room room, Model model) {
        rooms.add(room);
        model.addAttribute("allRooms", rooms);
        return "redirect:room";
    }
}
