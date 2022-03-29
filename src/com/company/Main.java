package com.company;
import com.company.classes.*;
import java.time.LocalTime;
import java.util.Set;
import static com.company.enums.FileType.*;

public class Main {

    public static void main(String[] args) {
        Application application = new Application();

        FileInfo image1 = new FileInfo("Image1.jpg", "11 Mb", IMAGE);
        FileInfo image2 = new FileInfo("Image2.jpg", "1 Mb", IMAGE);
        FileInfo image3 = new FileInfo("Image3.jpg", "16 Mb", IMAGE);
        FileInfo image4 = new FileInfo("Image4.jpg", "100 Mb", IMAGE);
        FileInfo image5 = new FileInfo("Image5.jpg", "24 Mb", IMAGE);
        FileInfo image6 = new FileInfo("Image6.jpg", "59 Mb", IMAGE);

        // ---------------------------------Paper Book---------------------------------------

        PaperBook book1 = new PaperBook("This is a paperBook", 500, "BookHouse");

        Book<PaperBook> paperBook1 = new Book<>(
                "Don Kihot",
                "Sanches",
                Set.of(image1, image2),
                300,
                book1);

        // ---------------------------------Audio Book---------------------------------------

        FileInfo audioFragment = new FileInfo("AudioFragment.mp3", "45 Mb", AUDIO_FILE);

        FileInfo audioFile = new FileInfo("AudioFile.mp3","200 Mb", AUDIO_FILE);

        AudioBook book2 = new AudioBook(audioFragment, LocalTime.of(2,34,32),audioFile);

        Book<AudioBook> audioBook1 = new Book<>(
                "Samurai",
                "Alan Walker",
                Set.of(image3, image4),
                200,
                book2);

        // ---------------------------------Electronic Book---------------------------------------

        FileInfo fileInfoEbook = new FileInfo("ElectronicBook.pdf", "89 Mb", PDF);

        ElectronicBook electronicBook = new ElectronicBook("This is a Electronic Book fragment",
                350,
                "DilAzyk",
                fileInfoEbook);

        Book<ElectronicBook> ebook1 = new Book<>(
                "Tom Sayer",
                "Jack London",
                Set.of(image5, image6),
                350,
                electronicBook);

        // ---------------------------------Vendor---------------------------------------

        Vendor vendor = new Vendor("VendorBob",
                "bob@gmail.com",
                "0777 77 77 77",
                Set.of(paperBook1, audioBook1, ebook1));

        // ---------------------------------Client---------------------------------------

        Client client1 = new Client("John", "john@yahoo.com");

        Client client2 = new Client("Alan","alan@icloud.com");

        System.out.println(vendor.getVendorName() + "'s books");
        vendor.getBookToSale().forEach(System.out::println);

        System.out.println();

        application.like(client1, paperBook1);
        System.out.println(client1.getClientName() + "'s liked books");
        client1.getLikedBooks().forEach(System.out::println);
        application.buyABook(client1, audioBook1);
        application.buyABook(client1, ebook1);
        System.out.println("Bought books: ");
        client1.getBoughtBooks().forEach(System.out::println);

        System.out.println();

        application.like(client2, audioBook1);
        System.out.println(client2.getClientName() + "'s liked books");
        client2.getLikedBooks().forEach(System.out::println);
        application.dislike(client2, audioBook1);
        System.out.println(client2.getClientName() + "'s liked books");
        client2.getLikedBooks().forEach(System.out::println);
        application.buyABook(client2, ebook1);
        application.buyABook(client2, paperBook1);
        System.out.println("Bought books: ");
        client2.getBoughtBooks().forEach(System.out::println);


    }
}
