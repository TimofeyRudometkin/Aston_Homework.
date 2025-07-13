import Homework_3_1.FileWorkerException;
import Homework_3_1.WorkingWithFiles;

import java.nio.file.Paths;



public class Main {
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

        //endregion Homework 3

    }
}