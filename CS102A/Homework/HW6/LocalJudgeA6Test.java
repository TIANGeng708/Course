
import org.junit.jupiter.api.*;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class LocalJudgeA6Test {

    StringBuilder builder;
    String ls = System.lineSeparator();
    String[] fieldsExpected;
    String[] methodsExpected;
    List<String> fields;
    List<String> methods;
    static Cinema cinema = new ConcreteCinema();

    @BeforeEach
    void BeforeEach() {
        builder = new StringBuilder();
    }

    @Test
    void testCinema_01_ClassInfo_Time() {
        int wrongCount = 0;
        try {
            Class<?> time = Class.forName("Time");
            fieldsExpected = new String[]{"private int Time.hour", "private int Time.minute"};
            methodsExpected = new String[]{"public java.lang.String Time.toString()"};
            fields = Arrays.stream(time.getDeclaredFields()).map(Field::toString).collect(Collectors.toCollection(ArrayList::new));
            methods = Arrays.stream(time.getDeclaredMethods()).map(Method::toString).collect(Collectors.toCollection(ArrayList::new));
            for (String s : fieldsExpected) {
                if (!fields.contains(s)) {
                    wrongCount++;
                    builder.append(ls).append(s).append(" is missing!");
                }
            }
            for (String s : methodsExpected) {
                if (!methods.contains(s)) {
                    wrongCount++;
                    builder.append(ls).append(s).append(" is missing!");
                }
            }

        } catch (ClassNotFoundException e) {
            builder.append(e.toString());
            wrongCount++;
        }
        assertEquals(0, wrongCount, builder.toString());
    }

    @Test
    void testCinema_02_ClassInfo_Movie() {
        int wrongCount = 0;
        try {
            Class<?> movie = Class.forName("Movie");
            fieldsExpected = new String[]{"private int Movie.id", "private java.lang.String Movie.name", "private Time Movie.startTime",
                    "private int Movie.runtime", "private double Movie.price", "protected int Movie.ticketsLeft"};
            methodsExpected = new String[]{"public java.lang.String Movie.toString()", "public abstract double Movie.purchase(int)"};
            fields = Arrays.stream(movie.getDeclaredFields()).map(Field::toString).collect(Collectors.toCollection(ArrayList::new));
            methods = Arrays.stream(movie.getDeclaredMethods()).map(Method::toString).collect(Collectors.toCollection(ArrayList::new));
            for (String s : fieldsExpected) {
                if (!fields.contains(s)) {
                    wrongCount++;
                    builder.append(ls).append(s).append(" is missing!");
                }
            }
            for (String s : methodsExpected) {
                if (!methods.contains(s)) {
                    wrongCount++;
                    builder.append(ls).append(s).append(" is missing!");
                }
            }
        } catch (ClassNotFoundException e) {
            builder.append(e.toString());
            wrongCount++;
        }
        assertEquals(0, wrongCount, builder.toString());
    }

    @Test
    void testCinema_03_ClassInfo_MovieSubclasses() {
        int wrongCount = 0;
        try {
            Class<?> ordinaryMovie = Class.forName("OrdinaryMovie");
            methodsExpected = new String[]{"public java.lang.String OrdinaryMovie.toString()", "public double OrdinaryMovie.purchase(int)"};
            methods = Arrays.stream(ordinaryMovie.getDeclaredMethods()).map(Method::toString).collect(Collectors.toCollection(ArrayList::new));
            for (String s : methodsExpected) {
                if (!methods.contains(s)) {
                    wrongCount++;
                    builder.append(ls).append(s).append(" is missing!");
                }
            }
        } catch (ClassNotFoundException e) {
            builder.append(e.toString());
            wrongCount++;
        }
        assertEquals(0, wrongCount, builder.toString());
        wrongCount = 0;
        try {
            Class<?> threeDMovie = Class.forName("ThreeDMovie");
            fieldsExpected = new String[]{"private final int ThreeDMovie.GLASS_PRICE"};
            methodsExpected = new String[]{"public java.lang.String ThreeDMovie.toString()", "public double ThreeDMovie.purchase(int)"};
            fields = Arrays.stream(threeDMovie.getDeclaredFields()).map(Field::toString).collect(Collectors.toCollection(ArrayList::new));
            methods = Arrays.stream(threeDMovie.getDeclaredMethods()).map(Method::toString).collect(Collectors.toCollection(ArrayList::new));
            for (String s : fieldsExpected) {
                if (!fields.contains(s)) {
                    wrongCount++;
                    builder.append(ls).append(s).append(" is missing!");
                }
            }
            for (String s : methodsExpected) {
                if (!methods.contains(s)) {
                    wrongCount++;
                    builder.append(ls).append(s).append(" is missing!");
                }
            }
        } catch (ClassNotFoundException e) {
            builder.append(e.toString());
            wrongCount++;
        }
        assertEquals(0, wrongCount, builder.toString());
    }


    @Test
    void testCinema_04_ClassInfo_ConcreteCinema() {
        int wrongCount = 0;
        try {
            Class<?> concreteCinema = Class.forName("ConcreteCinema");
            fieldsExpected = new String[]{"java.util.List ConcreteCinema.movies"};
            fields = Arrays.stream(concreteCinema.getDeclaredFields()).map(Field::toString).collect(Collectors.toCollection(ArrayList::new));
            for (String s : fieldsExpected) {
                if (!fields.contains(s)) {
                    wrongCount++;
                    builder.append(ls).append(s).append(" is missing!");
                }
            }
        } catch (ClassNotFoundException e) {
            builder.append(e.toString());
            wrongCount++;
        }
        assertEquals(0, wrongCount, builder.toString());
    }

    @Test
    void testCinema_05_time() {
        String expected = "12:05" + ls
                + "04:11";
        builder.append(new Time(12, 5).toString()).append(ls);
        builder.append(new Time(4, 11).toString());
        assertEquals(expected, builder.toString());
    }

    @Test
    void testCinema_06_addMovieHall() {
        String expected = "1-10" + ls +
                "2-15" + ls +
                "3-4" + ls;
        cinema.addMovieHall(10);
        cinema.addMovieHall(15);
        cinema.addMovieHall(4);
        cinema.getAllMovieHallsCapacity().forEach(s -> {
            builder.append(s).append(ls);
        });
        assertEquals(expected, builder.toString());
    }

    @Test
    void testCinema_07_addMovieWithoutConflict() {
        String expected = "id=1, name='Da Vinci Code', startTime:01:15, runtime=120, price=50.4, ticketsLeft=10 OrdinaryMovie" + ls +
                "id=2, name='She diao ying xiong zhuan', startTime:06:25, runtime=125, price=60.0, ticketsLeft=10 OrdinaryMovie" + ls +
                "id=3, name='Hong jian', startTime:16:15, runtime=125, price=58.5, ticketsLeft=4 ThreeDMovie" + ls;
        cinema.addMovie("Da Vinci Code", 120, 1, 50.4, 0, new Time(1, 15));
        cinema.addMovie("She diao ying xiong zhuan", 125, 1, 60, 0, new Time(6, 25));
        cinema.addMovie("Hong jian", 125, 3, 58.5, 1, new Time(16, 15));
        cinema.getAllMovies().forEach(s -> {
            builder.append(s).append(ls);
        });
        assertEquals(expected, builder.toString());
    }

    @Test
    void testCinema_08_addMovieWithConflict() {
        String expected = "id=1, name='Da Vinci Code', startTime:01:15, runtime=120, price=50.4, ticketsLeft=10 OrdinaryMovie" + ls +
                "id=2, name='She diao ying xiong zhuan', startTime:06:25, runtime=125, price=60.0, ticketsLeft=10 OrdinaryMovie" + ls +
                "id=3, name='Hong jian', startTime:16:15, runtime=125, price=58.5, ticketsLeft=4 ThreeDMovie" + ls +
                "id=4, name='Nian shou da zuo zhan', startTime:03:40, runtime=120, price=35.5, ticketsLeft=10 ThreeDMovie" + ls;
        cinema.addMovie("Nian shou da zuo zhan", 120, 1, 35.5, 1, new Time(3, 40));
        cinema.addMovie("Bu xiu", 180, 1, 60.5, 1, new Time(3, 35));
        cinema.addMovie("Da mo zu shi", 100, 1, 45, 1, new Time(5, 39));
        cinema.addMovie("Ling de jiao dian", 100, 1, 45, 1, new Time(5, 49));
        cinema.getAllMovies().forEach(s -> {
            builder.append(s).append(ls);
        });
        assertEquals(expected, builder.toString());
    }

    @Test
    void testCinema_09_movieHallOrderByStartTime() {
        String expected = "id=1, name='Da Vinci Code', startTime:01:15, runtime=120, price=50.4, ticketsLeft=10 OrdinaryMovie" + ls +
                "id=4, name='Nian shou da zuo zhan', startTime:03:40, runtime=120, price=35.5, ticketsLeft=10 ThreeDMovie" + ls +
                "id=2, name='She diao ying xiong zhuan', startTime:06:25, runtime=125, price=60.0, ticketsLeft=10 OrdinaryMovie" + ls;
        cinema.getMoviesFromMovieHallOrderByStartTime(1).forEach(s -> {
            builder.append(s.toString()).append(ls);
        });
        assertEquals(expected, builder.toString());
    }

    @Test
    void testCinema_10_reserveMovie() {
        String expected = "403" + ls +
                "100" + ls +
                "78" + ls +
                "58" + ls;
        builder.append((int) cinema.reserveMovie(1, 8)).append(ls);
        builder.append((int) cinema.reserveMovie(1, 5)).append(ls);
        builder.append((int) cinema.reserveMovie(3, 1)).append(ls);
        builder.append((int) cinema.reserveMovie(3, 0)).append(ls);
        assertEquals(expected, builder.toString());
    }

    @Test
    void testCinema_11_getMovieById() {
        String expected = "Movie 1 ticket Left: 0" + ls +
                "Movie 3 ticket Left: 2" + ls;
        builder.append("Movie 1 ticket Left: ").append(cinema.getMovieById(1).ticketsLeft).append(ls);
        builder.append("Movie 3 ticket Left: ").append(cinema.getMovieById(3).ticketsLeft).append(ls);
        assertEquals(expected, builder.toString());
    }

    @Test
    void testCinema_12_oneMovieIncome() {
        String expected = "Income of Movie 1: 504" + ls +
                "Income of Movie 3: 137" + ls;
        builder.append("Income of Movie 1: ").append((int) cinema.getOneMovieIncome(1)).append(ls);
        builder.append("Income of Movie 3: ").append((int) cinema.getOneMovieIncome(3)).append(ls);
        assertEquals(expected, builder.toString());
    }

    @Test
    void testCinema_13_totalIncome() {
        String expected = "total income:641";
        builder.append("total income:").append((int) cinema.getTotalIncome());
        assertEquals(expected, builder.toString());
    }

    @Test
    void testCinema_14_getAvailableMoviesByName() {
        String expected = "id=5, name='name5', startTime:11:35, runtime=110, price=60.5, ticketsLeft=4 ThreeDMovie" + ls +
                "id=6, name='name5', startTime:19:35, runtime=110, price=60.5, ticketsLeft=4 ThreeDMovie" + ls +
                "id=6, name='name5', startTime:19:35, runtime=110, price=60.5, ticketsLeft=4 ThreeDMovie";
        cinema.addMovie("name5", 110, 3, 60.5, 1, new Time(16, 35));
        cinema.addMovie("name5", 110, 3, 60.5, 1, new Time(11, 35));
        cinema.addMovie("name5", 110, 3, 60.5, 1, new Time(19, 35));
        cinema.getAvailableMoviesByName(new Time(11, 20), "name5").forEach(s -> {
            builder.append(s.toString()).append(ls);
        });
        cinema.getAvailableMoviesByName(new Time(16, 35), "name5").forEach(s -> {
            builder.append(s.toString());
        });
        assertEquals(expected.trim(), builder.toString().trim());
    }

    @Test
    void testTree_01_classInfo() {
        int wrongCount = 0;
        try {
            List<String> fieldsName;
            String fieldsNameExpected;
            Class<?> myBinaryTree = Class.forName("MyBinaryTree");
            Constructor constructor = myBinaryTree.getDeclaredConstructor(Object.class);
            fieldsExpected = new String[]{"private int MyBinaryTree.size"};
            fieldsNameExpected = "root";
            methodsExpected = new String[]{"MyBinaryTree.getRoot()",
                    "public int MyBinaryTree.getSize()",
                    "public void MyBinaryTree.addTreeNodes(java.lang.String,java.lang.Object[])",
                    "public java.lang.String MyBinaryTree.levelTraverse()"};
            fieldsName = Arrays.stream(myBinaryTree.getDeclaredFields()).map(Field::getName).collect(Collectors.toCollection(ArrayList::new));
            fields = Arrays.stream(myBinaryTree.getDeclaredFields()).map(Field::toString).collect(Collectors.toCollection(ArrayList::new));
            methods = Arrays.stream(myBinaryTree.getDeclaredMethods()).map(Method::toString).collect(Collectors.toCollection(ArrayList::new));
            if (constructor.getGenericParameterTypes().length != 1) {
                builder.append("public MyBinaryTree(T root) is missing");
                wrongCount++;
            }
            if (!fieldsName.contains(fieldsNameExpected)) {
                wrongCount++;
            }
            for (String s : fieldsExpected) {
                if (!fields.contains(s)) {
                    wrongCount++;
                    builder.append(ls).append(s).append(" is missing!");
                }
            }
            for (String s : methodsExpected) {
                if (methods.stream().noneMatch(m -> m.contains(s))) {
                    wrongCount++;
                    builder.append(ls).append(s).append(" is missing!");
                }

            }
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            builder.append(e.toString());
            wrongCount++;
        }
        assertEquals(0, wrongCount, builder.toString());
    }

    @Test
    void testTree_02_constructor() {
        MyBinaryTree<String> stringTree = new MyBinaryTree<>("root");
        MyBinaryTree<Time> timeTree = new MyBinaryTree<>(new Time(3, 4));
        try {
            Method getRoot = MyBinaryTree.class.getDeclaredMethod("getRoot");
            String stringName = getRoot.invoke(stringTree).getClass().getName();
            String timeName = getRoot.invoke(timeTree).getClass().getName();
            assertSame(stringName, timeName, "the type of node of stringTree and timeTree should be same");

            Method addTreeNodes = getAddTreeNodes();
            assertEquals(1, getGetSize().invoke(stringTree), "Initial size should be 1");
            assertEquals(1, getGetSize().invoke(timeTree), "Initial size should be 1");
            assertNotEquals("java.lang.Object[]", addTreeNodes.getGenericParameterTypes()[1].getTypeName(), "Object[] is not a generic type!");

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            builder.append(e.toString());
        }
        assertEquals(0, builder.length(), builder.toString());
    }

    @Test
    void testTree_03_countOfAddNodes() {
        String expected = "11";
        String msg = "";
        try {
            MyBinaryTree<String> stringTree2 = getStringTree();
            builder.append(getGetSize().invoke(stringTree2));
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            msg = e.toString();
        }
        assertEquals(expected, builder.toString(), msg);
    }

    @Test
    void testTree_04_intAddNode() {
        String expected = "13";
        String msg = "";
        try {
            MyBinaryTree<Integer> intTree = getIntegerTree();
            builder.append(getGetSize().invoke(intTree));
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            msg = e.toString();
        }
        assertEquals(expected, builder.toString().trim(), msg);
    }

    private Method getGetSize() throws NoSuchMethodException {
        return MyBinaryTree.class.getDeclaredMethod("getSize");
    }


    @Test
    void testTree_05_levelTraverse() {

        String expected = "root j h k b g i l c d e " + ls +
                "1 5 12 6 3 9 13 7 4 10 14 11 15";
        String msg = "";

        try {
            MyBinaryTree<String> stringTree2 = getStringTree();
            MyBinaryTree<Integer> intTree = getIntegerTree();
            Method levelTraverse = MyBinaryTree.class.getDeclaredMethod("levelTraverse");
            builder.append(levelTraverse.invoke(stringTree2));
            builder.append(ls);
            builder.append(levelTraverse.invoke(intTree));

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            msg = e.toString();
        }
        assertEquals(expected, builder.toString().trim(), msg);
    }

    private Method getAddTreeNodes() throws NoSuchMethodException {
        return MyBinaryTree.class.getDeclaredMethod("addTreeNodes", String.class, Object[].class);
    }


    private MyBinaryTree<Integer> getIntegerTree() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        MyBinaryTree<Integer> intTree = new MyBinaryTree<>(1);

        Method addTreeNodes = getAddTreeNodes();
        addTreeNodes.invoke(intTree, "010", new Integer[]{2, 3, 4});
        addTreeNodes.invoke(intTree, "001", new Integer[]{5, 6, 7});
        addTreeNodes.invoke(intTree, "1010", new Integer[]{8, 9, 10, 11});
        addTreeNodes.invoke(intTree, "1110", new Integer[]{12, 13, 14, 15});

        return intTree;
    }

    private MyBinaryTree<String> getStringTree() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        MyBinaryTree<String> stringTree2 = new MyBinaryTree<>("root");

        Method addTreeNodes = getAddTreeNodes();
        addTreeNodes.invoke(stringTree2, "01101", new String[]{"a", "b", "c", "d", "e"});
        addTreeNodes.invoke(stringTree2, "10", new String[]{"f", "g"});
        addTreeNodes.invoke(stringTree2, "11", new String[]{"h", "i"});
        addTreeNodes.invoke(stringTree2, "001", new String[]{"j", "k", "l"});


        return stringTree2;
    }
}