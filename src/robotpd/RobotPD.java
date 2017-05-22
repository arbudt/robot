/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package robotpd;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

/**
 *
 * @author ARBUDT
 */
public class RobotPD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        // TODO code application logic here
        System.out.println("start");
//        URL url = new URL("http://tepijalan.com/");
        URL url = new URL("http://duniaevent.com/");

//        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
//        System.out.println(reader.readLine());
//        String content = "";
//        Integer count = 0;
//        for (String line; (line = reader.readLine()) != null;) {
//            content += line.trim();
//            System.out.println(line.trim());
//            count += line.trim().length();
//            
//            //System.out.println(line);
//        }
//        System.out.println("Finish");
//        System.out.println(content);
//        System.out.println(count);
//        System.out.println(content.length());

        String str = "<html><head><title>Dunia Event</title><title>Dunia 23232</title><meta http-equiv='Content-Type' content='text/html; charset=UTF-8'></head><title>Dunia lain</title><body><div>Dunia Event</div></body></html>";
//        String pattern = "#<title>(.*?)</title>#";
//        System.out.println(str.matches(pattern));
        List<String> titles = new ArrayList<String>();
        Matcher matcher = Pattern.compile("<title>(.*?)</title>").matcher(str);
//        while (matcher.find()) {
//            titles.add(matcher.group(1));
//        }

//        Pattern p = Pattern.compile("<title>(.*?)</title>");

    }
}
