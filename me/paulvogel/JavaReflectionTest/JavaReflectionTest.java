import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.*;

public class Main
{
    public static void main(String[] args)
    {
        Field field = Charset.class.getDeclaredField("defaultCharset");
        field.setAccessible(true);
        field.set(null, StandardCharsets.UTF_8);
    }
}
