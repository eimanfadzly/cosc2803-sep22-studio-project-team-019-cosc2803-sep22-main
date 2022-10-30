package app;

import java.util.ArrayList;

import io.javalin.http.Context;
import io.javalin.http.Handler;

/**
 * Example Index HTML class using Javalin
 * <p>
 * Generate a static HTML page using Javalin
 * by writing the raw HTML into a Java String object
 *
 * @author Timothy Wiley, 2021. email: timothy.wiley@rmit.edu.au
 * @author Santha Sumanasekara, 2021. email: santha.sumanasekara@rmit.edu.au
 */
public class PageST21 implements Handler {

    // URL of this page relative to http://localhost:7001/
    public static final String URL = "/page3.html";

    /* (non-Javadoc)
     * @see io.javalin.http.Handler#handle(io.javalin.http.Context)
     */
    @Override
    public void handle(Context context) throws Exception {
        // Create a simple HTML webpage in a String
        String html = "<html>";

        // Add header content block
        html = html + """
            <div class='header'>
                <h1>2021 Census</h1>
            </div>
        """;

        // Add some Head information
        html = html + "<head>" + 
               "<title>Subtask 2.1</title>";

        // Add some CSS (external file)
        html = html + "<link rel='stylesheet' type='text/css' href='common.css' />";
        html = html + "</head>";

        // Add the body
        html = html + "<body>";

        // Add the topnav
        // This uses a Java v15+ Text Block
        html = html + """
            <div class='topnav'>
                <a href='/'>Home</a>
                <a href='mission.html'>Our Mission</a>
                <a href='page3.html'>2021 Census</a>
                <a href='page4.html'>Focused view by LGA or State</a>
                <a href='page5.html'>The Gap Score</a>
                <a href='page6.html'>Similarities by LGA</a>
            </div>
        """;


        // Add Div for page Content
        html = html + "<div class='content'>";


        html = html + """
                <div class = 'selectoutcome'>
                    <h3> Select an outcome to explore </h3>
                </div>
                """;

        html = html + """
                <div class = 'explore'>
                    <div class = 'longhealthylives'> 
                        <label for ='checkbox'>Long & Healthy Lives</label>
                        <input id = 'checkbox' name = 'outcome1' value = 'checked'
                        type = 'checkbox'>
                    </div>

                    <div class = 'learningpotential'>
                        <label for ='checkbox'>Achieving Learning Potential</label>
                        <input id = 'checkbox' name = 'outcome2' value = 'checked'
                        type = 'checkbox'>
                    </div>

                    <div class = 'participation'>
                        <label for ='checkbox'>Economic Participation</label>
                        <input id = 'checkbox' name = 'outcome3' value = 'checked'
                        type = 'checkbox'>
                    </div>
                </div>
                """;

        html = html + """
                <div class = 'sorting-display'>

                    <div class = 'sorting'>

                        <div class = 'agerange'>
                            <h2>Age range</h2>

                            <label for = 'selectlist'></label>
                            <select id = 'selectlist' name = 'selectlist'>

                                    <option value='0'>Select Age:</option>
                                    <option value='1'>0 - 4</option>
                                    <option value='2'>5 - 9</option>
                                    <option value='3'>10 - 14</option>
                                    <option value='4'>15 - 19</option>
                                    <option value='5'>20 - 24</option>
                                    <option value='5'>25 - 29</option>
                                    <option value='5'>30 - 34</option>
                                    <option value='5'>35 - 39</option>
                                    <option value='5'>40 - 44</option>
                                    <option value='5'>45 - 49</option>
                                    <option value='5'>50 - 54</option>
                                    <option value='5'>55 - 59</option>
                                    <option value='5'>65 > </option>

                            </select>
                        </div>

                        <div class = 'gender'>
                            <h2>Gender</h2>

                            <label for = 'selectlist'></label>
                            <select id = 'selectlist' name = 'selectlist'>

                                    <option value='0'>Select Gender:</option>
                                    <option value='1'>Male</option>
                                    <option value='2'>Female</option>

                            </select>
                            
                        </div>

                        <div class = 'order'>
                            <h2>Orders</h2>

                            <label for = 'selectlist'></label>
                            <select id = 'selectlist' name = 'selectlist'>

                                    <option value='0'>Select Order:</option>
                                    <option value='1'>Ascending</option>
                                    <option value='2'>Descending</option>

                            </select>

                        </div>

                    </div>

                    <div class = 'display'>

                    </div>


                </div>
                """;

        















        // Look up some information from JDBC
        // First we need to use your JDBCConnection class
        JDBCConnection jdbc = new JDBCConnection();

        // Next we will ask this *class* for the LGAs
        ArrayList<LGA> lgas = jdbc.getLGAs();

        // Add HTML for the LGA list
        html = html + "<h1>All LGAs</h1>" + "<ul>";

        // Finally we can print out all of the LGAs
        for (LGA lga : lgas) {
            html = html + "<li>" + lga.getCode16()
                        + " - " + lga.getName16() + "</li>";
        }

        // Finish the List HTML
        html = html + "</ul>";

        // Close Content div
        html = html + "</div>";

        // Footer
        html = html + """
            <div class='footer'>
                <p>COSC2803 - Studio Project Starter Code (Sep22)</p>
            </div>
        """;

        // Finish the HTML webpage
        html = html + "</body>" + "</html>";
        

        // DO NOT MODIFY THIS
        // Makes Javalin render the webpage
        context.html(html);
    }

}
