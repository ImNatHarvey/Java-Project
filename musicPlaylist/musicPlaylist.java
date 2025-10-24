package musicPlaylist;

import java.util.Scanner;

public class musicPlaylist {
    
    static class Node {
        String songTitle;
        Node next;
        
        public Node(String songTitle) {
            this.songTitle = songTitle;
            this.next = null;
        }
    }

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        Node playlist = null;
        boolean isRunning = true;
        
        while (isRunning) {
        	
        	System.out.println("==========================");
            System.out.println("===== Music Playlist =====");
            System.out.println("[1] Show playlist");
            System.out.println("[2] Add song");
            System.out.println("[3] Delete song");
            System.out.println("[4] Exit");
            System.out.print("Choose an operation: ");
            
            int operationType = scanner.nextInt();
            scanner.nextLine();
            
            if (operationType == 1) {
                showPlaylist(playlist);
            } 
            
            else if (operationType == 2) {
                System.out.print("Enter song to add: ");
                String songToAdd = scanner.nextLine();
                playlist = addSong(playlist, songToAdd);
                System.out.println("\n" + songToAdd + " has been added to the playlist.\n");
            } 
            
            else if (operationType == 3) {
                System.out.print("Enter song to delete: ");
                String songToRemove = scanner.nextLine();
                playlist = removeSong(playlist, songToRemove);
            } 
            
            else if (operationType == 4) {
                System.out.println("Exiting program.");
                isRunning = false;
            } 
            
            else {
                System.out.println("\nInvalid option. Try again.\n");
            }
        }
        scanner.close();
    }
    
    public static void showPlaylist(Node head) {
        if (head == null) {
            System.out.println("\nThe playlist is empty!\n");
            return;
        }
        
        System.out.print("\nCurrent Playlist: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.songTitle + " → ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static Node addSong(Node head, String songTitle) {
        Node newNode = new Node(songTitle);
        
        if (head == null) {
            return newNode;
        }
        
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    public static Node removeSong(Node head, String songTitle) {
        if (head == null) {
            System.out.println("\nPlaylist is empty. Nothing to remove.\n");
            return null;
        }
        
        if (head.songTitle.equals(songTitle)) {
            System.out.println("\n" + songTitle + " has been removed from the playlist.\n");
            return head.next;
        }
        
        Node current = head;
        while (current.next != null && !current.next.songTitle.equals(songTitle)) {
            current = current.next;
        }
        
        if (current.next != null && current.next.songTitle.equals(songTitle)) {
            current.next = current.next.next;
            System.out.println("\n" + songTitle + " has been removed from the playlist.\n");
        } else {
            System.out.println("\nSong not found: " + songTitle + "\n");
        }
        return head;
    }
}