import java.util.HashMap;
import java.util.Map;

public class MostBookedHotelRoom {

    public static void main(String[] args) {
        String[] bookings = {"+1A", "+3E", "-1A", "+4F", "+1A", "-3E", "+1A", "+1A"};

        String mostBookedRoom = findMostBookedRoom(bookings);

        System.out.println("Most booked room: " + mostBookedRoom);
    }

    static String findMostBookedRoom(String[] bookings) {
        Map<String, Integer> roomBookings = new HashMap<String, Integer>();
        String mostBookedRoom = "";
        int maxBookings = 0;

        for (String booking : bookings) {
            char operation = booking.charAt(0);
            String room = booking.substring(1);

            if (operation == '+') {
                roomBookings.put(room, roomBookings.getOrDefault(room, 0) + 1);
                if (roomBookings.get(room) > maxBookings ||
                        (roomBookings.get(room) == maxBookings && room.compareTo(mostBookedRoom) < 0)) {
                    maxBookings = roomBookings.get(room);
                    mostBookedRoom = room;
                }
            } else if (operation == '-') {
                roomBookings.put(room, roomBookings.getOrDefault(room, 0) - 1);
                if (roomBookings.get(room) > maxBookings ||
                        (roomBookings.get(room) == maxBookings && room.compareTo(mostBookedRoom) < 0)) {
                    maxBookings = roomBookings.get(room);
                    mostBookedRoom = room;
                }
            }
        }

        return mostBookedRoom;
    }
}
