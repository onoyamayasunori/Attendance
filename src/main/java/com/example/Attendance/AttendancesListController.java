package com.example.Attendance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AttendancesListController {

    @GetMapping("/attendanceList")
    public String attendanceList(){
        return "attendanceList";
    }
}
