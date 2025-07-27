import Homework_5_1_Strategy.Logger;
import Homework_5_1_Strategy.LoggerDB;
import Homework_5_1_Strategy.LoggerFile;
import Homework_5_2_Chain_of_Responsibility.FriendRequestEvent;
import Homework_5_2_Chain_of_Responsibility.MessageReceivedEvent;
import Homework_5_2_Chain_of_Responsibility.NotificationWorker;
import Homework_5_3_Builder.Car;
import Homework_5_4_Proxy.DataAccess;
import Homework_5_4_Proxy.ProxyDataAccess;
import Homework_5_5_Decorator.Drink;
import Homework_5_5_Decorator.Gas;
import Homework_5_5_Decorator.Syrup;
import Homework_5_5_Decorator.Water;
import Homework_5_6_Adapter.BmpAdapter;
import Homework_5_6_Adapter.ImageLoader;
import Homework_5_6_Adapter.JpegAdapter;


public class Main {

    /*//region Homework 4.2

    //region Вариант 2

    private static boolean booleanFirst = true;

    //endregion Вариант 2

    //endregion Homework 4.2*/

    public static void main(String[] args) {


        //region Homework 2

/*

        int intCountBooksMin=5;
        int intCountBooksMax=10;
        int intTemp;
        Student student;
        List<Student> listStudents;
        List<Book> listBooks;
        List<Book> listBooksTemp;
        List<Book> listBooksTemp2;
        List<String> listBooksNamesTemp;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.yyyy");



        listBooks = Stream.of(
                new Book("Сказки", LocalDate.of(2025, 7, 1), 110)
                ,new Book("Рассказы", LocalDate.of(2022, 2, 7), 201)
                ,new Book("Доктор Живаго", LocalDate.of(2010, 4, 5), 300)
                ,new Book("Лермонтов", LocalDate.of(2021, 5, 25), 250)
                ,new Book("Покер", LocalDate.of(2003, 1, 19), 120)
                ,new Book("Сноуборд", LocalDate.of(2024, 9, 3), 200)
                ,new Book("Хобби", LocalDate.of(2019, 10, 9), 180))
                .collect(Collectors.toList());




        listStudents = Stream.of(
                 new Student("Михаил","Петров","Александрович")
                 ,new Student("Фёдор","Андреев","Николаевич")
                 ,new Student("Михаил","Антонов","Сергеевич"))
                .collect(Collectors.toList());

        //1
        listStudents.stream().forEach(Student::toString);

        //2 Получить список книг
        listStudents = listStudents.stream()
                .map(Student -> {
                    List<String> bookTitles = listBooks.stream()
                            .map(Book::getTitle)
                            .collect(Collectors.toList());
                    int randomCount = ThreadLocalRandom.current()
                            .nextInt(5, listBooks.size());
                    int randomCount2 = ThreadLocalRandom.current()
                            .nextInt(0, 2);

                    List<String> selectedTitles = bookTitles.stream()
                            .skip(randomCount2)
                            .limit(randomCount)
                            .collect(Collectors.toList());

                    Student.setListBooksNames(selectedTitles);
                    return Student;
                })
                .collect(Collectors.toList());


        *//*for(int i=0;i<listStudents.size();i++) {
            listBooksNamesTemp = new ArrayList<String>();
            Random random = new Random();
            intTemp = random.nextInt(intCountBooksMax - intCountBooksMin + 1) + intCountBooksMin;
            for (int j = 0; j < intTemp; j++) {
                listBooksNamesTemp.add(listBooks.get(random.nextInt(listBooks.size() - 1)).getTitle());
            }
            listStudents.get(i).setListBooksNames(listBooksNamesTemp);
        }*//*

        //3 Получить книги


        listStudents = listStudents.stream()
                .peek(Student -> {
                    Student.getListBooksNames().stream()
                            .map(title -> {
                                // Находим книгу по названию
                                return listBooks.stream()
                                        .filter(book -> book.getTitle().equals(title))
                                        .findFirst();
                            })
                            .filter(Optional::isPresent) // оставляем только найденные книги
                            .map(Optional::get) // извлекаем книгу из Optional
                            .collect(Collectors.toList())
                            .forEach(book -> Student.getListBooks().add(book));
                })
                .collect(Collectors.toList());

        *//*listStudents.stream().forEach(Student::toString);
        for(int i=0;i<listStudents.size();i++)
        {
            Student studentTemp=listStudents.get(i);
            for (String strCycle: studentTemp.getListBooksNames()) {
                for (int j = 0; j < listBooks.size(); j++) {
                    if(listBooks.get(j).getTitle() == strCycle) {
                        studentTemp.getListBooks().add(listBooks.get(j));
                        break;
                    }
                }
            }
        }*//*

        //4 Отсортировать книги по количеству страниц
        for(int i=0;i<listStudents.size();i++)
        {
            listStudents.get(i).getListBooks().sort((b1, b2) -> Integer.compare(b1.getPagesCount(), b2.getPagesCount()));
        }

        //5 Оставить только уникальные кникги
        for(int i=0;i<listStudents.size();i++)
        {
            listBooksTemp=listStudents.get(i).getListBooks();
            listBooksTemp2= new ArrayList<Book>();
            for (Book BookCycle : listBooksTemp) {
                if (!listBooksTemp2.contains(BookCycle)) {
                    listBooksTemp2.add(BookCycle);
                }
            }
            listStudents.get(i).setListBooks(listBooksTemp2);
        }

        //6
        for(int i=0;i<listStudents.size();i++)
        {
            listStudents.get(i).getListBooks().removeIf(datePublic -> datePublic.getDateOfPublication().getYear()>2000);
        }

        //7
        for(int i=0;i<listStudents.size();i++)
        {
            listStudents.get(i).setListBooks(listStudents.get(i)
                    .getListBooks()
                    .stream()
                    .limit(3)
                    .collect(Collectors.toList()));
        }

        //8
        for(int i=0;i<listStudents.size();i++)
        {
            List<Date> datesPublications = listStudents.get(i)
                    .getListBooks()
                    .stream()
                    .map(Book::getDateOfPublication)
                    .collect(Collectors.toList());
        }

        //9
        Optional<Book> bookFirst = listStudents.get(0)
                .getListBooks()
                .stream()
                .findFirst();

        //10
        Book defaultBook = new Book("Сказки", new Date(Long.MAX_VALUE), 110);
        Date dateTemp;
        dateTemp=bookFirst
                .orElse(defaultBook).getDateOfPublication();
        System.out.println(dateTemp==new Date(Long.MAX_VALUE)?"Книга отсутствует":dateTemp.toString());

        */

        //endregion Homework 2

        //region Homework 3
/*

        WorkingWithFiles workingWithFiles = new WorkingWithFiles();

        //String fileName = Paths.get(System.getProperty("user.home"), "Desktop").resolve("Homework 3.1").resolve("Homework 3.1.txt") .toString();
        String fileName = Paths.get(System.getProperty("user.home"), "Desktop").resolve("Homework 3.1.txt") .toString();
        String textTemp;

        textTemp ="Это первая строка файла \"" + fileName + "\"";
        textTemp += System.lineSeparator() + "Это последняя строка файла \"" + fileName + "\"";

        try {
            workingWithFiles.OverrideFile(fileName, textTemp);
            System.out.println("В файл: " + System.lineSeparator() + fileName + System.lineSeparator() + "записан текст.");

            textTemp = workingWithFiles.GetTextFromFile(fileName);
            System.out.println("Из файла " + System.lineSeparator() + fileName
                    + System.lineSeparator() + "Прочитан тескст:"
                    + System.lineSeparator() + textTemp);

            textTemp="Теперь эта строка - последняя.";
            workingWithFiles.AddTextToFile(fileName, textTemp);
            System.out.println("В файл: " + System.lineSeparator() + fileName + System.lineSeparator() + "добавлен текст.");

            textTemp = workingWithFiles.GetTextFromFile(fileName);
            System.out.println("Из файла " + System.lineSeparator() + fileName
                    + System.lineSeparator() + "Прочитан тескст:"
                    + System.lineSeparator() + textTemp);

        } catch (FileWorkerException e) {
            System.err.println(e.toString());
        }
*/

        //endregion Homework 3

        //region Homework 4

        //region Homework 4.1

        //1) Реализовать программы, которые получают DeadLock и LiveLock.

        //region DeadLock

        //region Example from Oracle
        //не отловил.
/*
        try {
            for (int i = 1; i < 10000000; i++) {

                System.out.format("Попытка deadlock № %s%n", i);
                final DeadLock deadlockFirst = new DeadLock("deadlockFirst" + i);
                final DeadLock deadlockSecond = new DeadLock("deadlockSecond" + i);
                Thread treadFirst = new Thread(() ->{ deadlockFirst.DoFirst(deadlockSecond);});
                Thread treadSecond = new Thread(() -> { deadlockSecond.DoFirst(deadlockFirst);});
                treadFirst.start();
                treadSecond.start();
                treadSecond.join();
            }
        } catch (InterruptedException exception) {
            System.out.println(exception.toString());
        }
        */
        //endregion Example from Oracle

        //region Simple example
/*

        Object objectLock1 = new Object();
        Object objectLock2 = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized (objectLock1) {
                System.out.println("Поток 1 синхронизирован через objectLock1");
                try {
                    Thread.sleep(1000); // Имитация работы
                    synchronized (objectLock2) {
                        System.out.println("Поток 1 синхронизирован через objectLock2");
                    }
                    System.out.println("Поток 1 вышел из синхронизации по objectLock2");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Поток 1 вышел из синхронизации по objectLock1");
        });


        Thread thread2 = new Thread(() -> {
            synchronized (objectLock2) {
                System.out.println("Поток 2 синхронизирован через objectLock2");
                try {
                    Thread.sleep(1000); // Имитация работы
                    synchronized (objectLock1) {
                        System.out.println("Поток 2 синхронизирован через objectLock1");
                    }
                    System.out.println("Поток 2 вышел из синхронизации по objectLock1");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Поток 2 вышел из синхронизации по objectLock2");
        });

        thread1.start();

*/
/*
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
*//*


        thread2.start();
*/

        //endregion Simple example

        //endregion DeadLock

        //region LiveLock
/*

        Lock first = new ReentrantLock();
        Lock second = new ReentrantLock();

        Runnable locker = () -> {
            boolean firstLocked = false;
            boolean secondLocked = false;
            try {
                while (!firstLocked || !secondLocked) {
                    firstLocked = first.tryLock(100, TimeUnit.MILLISECONDS);
                    WorkImmitation("First Locked: " + firstLocked);
                    secondLocked = second.tryLock(100, TimeUnit.MILLISECONDS);
                    WorkImmitation("Second Locked: " + secondLocked);
                }
                first.unlock();
                second.unlock();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        new Thread(locker).start();
        new Thread(locker).start();
*/

        //endregion LiveLock

        //endregion Homework 4.1

        //region Homework 4.2

        //2) Создать два потока (поток 1 постоянно выводит "1", а поток 2 выводит "2"), которые будут бесконечно выводить в консоль "1" и "2" по очереди(начиная с "1")
/*

        //region Вариант 1
        Object objectLock = new Object();

        Runnable task = () -> {
                while(true) {
                    try {
                        synchronized (objectLock) {
                            System.out.println(Thread.currentThread().getName());
                        }
                        Thread.sleep(5000);

                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println("Поток № " + Thread.currentThread().getName() + " выбросил исключение!"
                                + System.lineSeparator() + e.toString());
                        }
                    }
        };

        Thread thread1 = new Thread(task);
        thread1.setName("1");
        Thread thread2 = new Thread(task);
        thread2.setName("2");
        thread1.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
        //endregion Вариант 1
*/

        //region Вариант 2
/*

                Object objectLock = new Object();

                Thread thread1 = new Thread(() -> {
                    while (true) {
                        synchronized (objectLock) {
                            try {
                                while (!booleanFirst) {
                                    objectLock.wait();
                                }
                                System.out.println("1");
                                //Thread.sleep(500);
                                booleanFirst = false;
                                objectLock.notify();
                            } catch (InterruptedException e) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    }
                });

                Thread thread2 = new Thread(() -> {
                    while (true) {
                        synchronized (objectLock) {
                            try {
                                while (booleanFirst) {
                                    objectLock.wait();
                                }
                                System.out.println("2");
                                //Thread.sleep(500);
                                booleanFirst = true;
                                objectLock.notify();
                            } catch (InterruptedException e) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    }
                });

                booleanFirst=true;
                thread1.start();
                thread2.start();
*/

        //endregion Вариант 2

        //endregion Homework 4.2

        //endregion Homework 4

        //region Homework 5
/*

        //region Homework 5.1  Стратегия

        Logger logger = new Logger();

        logger.setLoggingData(new LoggerDB());
        logger.LogData("Логируем в БД");

        logger.setLoggingData(new LoggerFile());
        logger.LogData("Логируем в файл");

        //endregion Homework 5.1 Стратегия
*/
/*
        //region Homework 5.2  Цепочка обязанностей

        NotificationWorker notificationWorker  = new NotificationWorker();

        notificationWorker .addEvent(new FriendRequestEvent("Пользователь Афанасий"));
        notificationWorker .addEvent(new MessageReceivedEvent("Пользователь Афанасий", "Привет!"));

        notificationWorker .processNotifications();

        //endregion Homework 5.2 Цепочка обязанностей*/
/*

        //region Homework 5.3  Строитель

        Car car = new Car.CarBuilder("Джип")
                .withEngine("V12")
                .withAirConditioning(true)
                .withSunroof(false)
                .build();

        System.out.println("Модель: " + car.getModel());
        System.out.println("Двигатель: " + car.getEngine());
        System.out.println("Кондиционер: " + car.hasAirConditioning());
        System.out.println("Люк: " + car.hasSunroof());

        //endregion Homework 5.3  Строитель
*/
/*

        //region Homework 5.4  Прокси

        DataAccess dataAccessAdmin = new ProxyDataAccess("admin", "password");

        dataAccessAdmin.writeData("Конфиденциальные данные");
        dataAccessAdmin.readData();

        DataAccess dataAccessJustUser = new ProxyDataAccess("user", "pass");
        dataAccessJustUser.readData();

        //endregion Homework 5.4  Прокси
*/
/*
        //region Homework 5.5  Декоратор

        Drink drink = new Water();
        System.out.println(drink.getDescription() + " - $" + drink.cost());
        drink = new Gas(drink);
        System.out.println(drink.getDescription() + " - $" + drink.cost());
        drink = new Syrup(drink);
        System.out.println(drink.getDescription() + " - $" + drink.cost());

        //endregion Homework 5.5  Декоратор*/
/*

        //region Homework 5.6  Адаптер

        ImageLoader jpeg = new JpegAdapter();
        ImageLoader png = new BmpAdapter();

        jpeg.loadImage("image.jpg");
        png.loadImage("image.png");

        //endregion Homework 5.6  Адаптер
*/

        //endregion Homework 5
    }

    //region LiveLock
/*

    public static void WorkImmitation(String text) {
        try {
            System.out.println(text + " " + ", я - поток с id = " + Thread.currentThread().getId() + " и я усердно работаю!");
            Thread.currentThread().sleep( 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
*/

    //endregion LiveLock

}