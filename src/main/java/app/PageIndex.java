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
 * @author Timothy Wiley, 2022. email: timothy.wiley@rmit.edu.au
 * @author Santha Sumanasekara, 2021. email: santha.sumanasekara@rmit.edu.au
 */
public class PageIndex implements Handler {

    // URL of this page relative to http://localhost:7001/
    public static final String URL = "/";

    /* (non-Javadoc)
     * @see io.javalin.http.Handler#handle(io.javalin.http.Context)
     */
    /* (non-Javadoc)
     * @see io.javalin.http.Handler#handle(io.javalin.http.Context)
     */
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
                <h1>REFINE-NOLOGY</h1>
            </div>
        """;

        // Add some Header information
        html = html + "<head>" + 
               "<title>Homepage</title>";

        // Google Fonts
        html = html + "<link rel='preconnect' href='https://fonts.googleapis.com'>" + 
            "<link rel='preconnect' href='https://fonts.gstatic.com' crossorigin>" + 
            "<link href='https://fonts.googleapis.com/css2?family=Playfair+Display&display=swap' rel='stylesheet'>";

        html = html + """
            <link rel='preconnect' href='https://fonts.googleapis.com'>
            <link rel='preconnect' href='https://fonts.gstatic.com' crossorigin>
            <link href='https://fonts.googleapis.com/css2?family=Raleway:ital,wght@1,200&display=swap' rel='stylesheet'>
            """;

        html = html + """
            <link rel='preconnect' href='https://fonts.googleapis.com'>
            <link rel='preconnect' href='https://fonts.gstatic.com' crossorigin>
            <link href='https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,300;1,400&display=swap' rel='stylesheet'>
            """;
        
    
        // Add some CSS (external file)
        html = html + "<link rel='stylesheet' type='text/css' href='common.css' />";
        html = html + "</head>";
        html = html + "<meta name='viewport' content='width=device-width, initial-scale=1'>";

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

        // Add HTML for the list of pages (as well as topnav)
        /*html = html + """
            <p>Homepage information</p>
            """;*/

        // aboriginal banner image
        html = html + """
                <div class = 'Flexbox-imageup'>
                    <h2>
                    'Closing The Gap' empower Aboriginal and Torres Strait Islander people 
                    to live a prosperous lives. 
                    </h2>
                </div>
                """;

        // Text Box beneath the banner
        html = html + """
                <div class = 'FirstText'>

                    <div class = 'textbox'>

                    <h3> 'It recognises the continued fortitude and resiliency of Aboriginal and Torres Strait
                    Islander people in upholding the oldest still-existing civilizations in the world. We believe that a 
                    better live outcomes are attained when they truly participate in the creation and execution of 
                    policies, programs and services that affect them.' </h3>
                     
                    </div>
                </div>

                """;
        
        // Highlighted outcomes
        html = html + """
            <p>Collapsible Set:</p>
            <button class='collapsible'>Open Section 1</button>
            <div class='content'>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
            </div>
            <button class='collapsible'>Open Section 2</button>
            <div class='content'>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
            </div>
            <button class='collapsible'>Open Section 3</button>
            <div class='content'>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
            </div>

            <script>
            var coll = document.getElementsByClassName('collapsible');
            var i;

            for (i = 0; i < coll.length; i++) {
            coll[i].addEventListener('click', function() {
            this.classList.toggle('active');
            var content = this.nextElementSibling;
            if (content.style.maxHeight){
            content.style.maxHeight = null;
            } else {
            content.style.maxHeight = content.scrollHeight + 'px';
            } 
            });
            }
            </script>
            """;


        // Did you know that...
        html = html + """
                <div class = 'didyouknow'>
                    <h2> Did you know that... </h2>
                </div>
                """;

        // First Fact 
        html = html + """
            <div class= 'Neville-Bonner'>
                <div class= 'Neville-images'>
                    <h1></h1>
                </div>

                <div class= 'Neville-text'>
                    <h3> Neville Bonner</h3>

                    <h4> The first aboriginal to enter federal politics, 
                    becoming a member of the Parliament of Australia although he 
                    only had a third-grade education. Described himself as having 'an 
                    all-consuming burning desire to help my own people'. Wished to see 
                    his people gain access to economic, educational, social possibilities 
                    and maintain cultural identity. 
                    </h4>
                </div>
                
            </div> 
            """;
        
        // Second Fact
        html = html + """
            <div class= 'trachoma'>

                <div class= 'trachoma-text'>
                    <h3> Reduction in trachoma rates</h3>

                    <h4> In Aboriginal and Torres Strait Islander communities, there has 
                    been progress in the fight against trachoma. Children's active 
                    trachoma rates dropped from 15% in 2009 to 4.5% from 2013 to 2019 in a
                    few at-risk communities. </h4>
                </div>

                <div class= 'trachoma-images'>
                    <h1></h1>
                </div>

            </div> 
            """;

        // Third Fact
        html = html + """
            <div class= 'Bronwyn-Bancroft'>
                <div class= 'Bancroft-images'>
                    <h1></h1>
                </div>
        
                <div class= 'Bancroft-text'>
                    <h3> Bronwyn Bancroft </h3>

                    <h4>A Bundjalung lady who is also an artist and a fashion designer,
                    is renowned for being the first Australian to have her work exhibited in Paris. She helped 
                    hundreds of Indigenous artists pursue thriving careers in the arts as a founding member
                    of Boomalli Aboriginal Artists Co-operative.</h4>
                </div>
                        
            </div> 
            """;


        //Read more button

        html = html + """
            <div class = 'readmore'>

                <div class = 'readbutton'>

                    <h2><a href='https://www.w3schools.com/'' target='_blank'>READ MORE!</a></h2>

                </div>

            </div>
                

                """;

        // Line pattern
        html = html + """
                <div class = 'line'>

                    <h1></h1>

                </div>

                """;

        // 17 Socioeconomic Outcomes
        html= html +"""
                <div class = 'sociooutcomes'>

                    <div class = 'agreementtitle'>
                        <img src='closethegap.png' class='top-image' alt='Closing the Gap' height='200' >
                        <h1> National Agreement on Closing The Gap </h1>
                    </div>

                    <div class = 'seventeenoutcomes'>
            
                        <ol> 
                            <li> ABORIGINAL AND TORRES STRAIT ISLANDER PEOPLE ENJOY LONG AND HEALTHY LIVES</li>
                            <li> ABORIGINAL AND TORRES STRAIT ISLANDER CHILDREN ARE BORN HEALTHY AND STRONG</li>
                            <li> ABORIGINAL AND TORRES STRAIT ISLANDER CHILDREN ARE ENGAGED IN HIGH QUALITY, CULTURALLY APPROPRIATE EARLY CHILDHOOD EDUCATION IN THEIR EARLY YEARS</li>
                            <li> ABORIGINAL AND TORRES STRAIT ISLANDER CHILDREN THRIVE IN THEIR EARLY YEARS</li>
                            <li> ABORIGINAL AND TORRES STRAIT ISLANDER STUDENTS ACHIEVE THEIR FULL LEARNING POTENTIAL</li>
                            <li> ABORIGINAL AND TORRES STRAIT ISLANDER STUDENTS REACH THEIR FULL POTENTIAL THROUGH FURTHER EDUCATION PATHWAYS</li>
                            <li> ABORIGINAL AND TORRES STRAIT ISLANDER YOUTH ARE ENGAGED IN EMPLOYMENT OR EDUCATION</li>
                            <li> STRONG ECONOMIC PARTICIPATION AND DEVELOPMENT OF ABORIGINAL AND TORRES STRAIT ISLANDER PEOPLE AND COMMUNITIES</li>
                            <li> ABORIGINAL AND TORRES STRAIT ISLANDER PEOPLE SECURE APPROPRIATE, AFFORDABLE HOUSING THAT IS ALIGNED WITH THEIR PRIORITIES AND NEED</li>
                            <li> ABORIGINAL AND TORRES STRAIT ISLANDER PEOPLE ARE NOT OVERREPRESENTED IN THE CRIMINAL JUSTICE SYSTEM</li>
                            <li> ABORIGINAL AND TORRES STRAIT ISLANDER YOUNG PEOPLE ARE NOT OVERREPRESENTED IN THE CRIMINAL JUSTICE SYSTEM</li>
                            <li> ABORIGINAL AND TORRES STRAIT ISLANDER CHILDREN ARE NOT OVERREPRESENTED IN THE CHILD PROTECTION SYSTEM</li>
                            <li> ABORIGINAL AND TORRES STRAIT ISLANDER FAMILIES AND HOUSEHOLDS ARE SAFE</li>
                            <li> ABORIGINAL AND TORRES STRAIT ISLANDER PEOPLE ENJOY HIGH LEVELS OF SOCIAL AND EMOTIONAL WELLBEING</li>
                            <li> ABORIGINAL AND TORRES STRAIT ISLANDER PEOPLE MAINTAIN A DISTINCTIVE CULTURAL, SPIRITUAL, PHYSICAL AND ECONOMIC RELATIONSHIP WITH THEIR LAND AND WATERS</li>
                            <li> ABORIGINAL AND TORRES STRAIT ISLANDER CULTURES AND LANGUAGES ARE STRONG, SUPPORTED AND FLOURISHING</li>
                            <li> ABORIGINAL AND TORRES STRAIT ISLANDER PEOPLE HAVE ACCESS TO INFORMATION AND SERVICES ENABLING PARTICIPATION IN INFORMED DECISION-MAKING REGARDING THEIR OWN LIVES</li>
                        </ol>
            
                    </div>
                    

                </div>

                """;

        /* 
                
        // Using JDBC class
        JDBCConnection jdbc = new JDBCConnection();
 

        //Socioeconomic outcomes database
        ArrayList<SeventeenOutcomes> seventeenOutcomes = jdbc.getSeventeenOutcomes();

        for (int i = 0; i < 17; i++) {

            html = html + "<ul>";
            
            String [] title = seventeenOutcomes.getOutcomestitle();

            for (String titles : title) {
                html = html + "<li>" + title + "</li>";
            }

            html = html + "</ul>";

        }
        */


        /* 
        
        html = html + """
                <div class = 'Flexbox-container'> 

                    <div class = 'first-fact aboriginal-flag'> 
                    <h3>THE ABORIGINAL FLAG </h3>
                    
                    <p>was designed in the 1970s and its colours represent different 
                    aspects of Aboriginal life. The black symbolises Aboriginal people, the yellow represents the sun 
                    and the red represents the earth and the relationship between people and the land.</p>
                    </div>

                    <div class = 'first-fact indigenous-flag'> 
                        <h1></h1>
                    </div>

                    <div class = 'first-fact torres-strait-islander-flag'> 
                    <h3>THE TORRES STRAIT ISLANDER FLAG</h3>
                    
                    <p>was designed in the 1990s and features a white 
                    dharri or deri (a type of headdress) with a five-pointed star representing the 
                    different island groups. The white represents peace, the green represents land, 
                    the black represents the people and the blue represents the sea.</p>
                    </div>
                    
                </div>
                """;

        //third row facts
        html = html + """
                <div class = 'Flexbox-container1'> 
    
                    <div class = 'second-fact dreamtime'> 
                    <img src='the dreamtime.png' class='top-image' alt='dreamtime artwork' height='200'>
                    <h3> The Dreamtime </h3>

                    <p>Aboriginals believe that the Dreamtime was way back, at the very beginning. 
                    The land and the people were created by the Spirits. They made the rivers, streams,
                    water holes the land, hills, rocks, plants and animals. It is believed that the 
                    Spirits gave them their hunting tools and each tribe its land, their totems and their Dreaming.</p>

                    <p>The Aboriginals believed that the entire world was made by their Ancestors way back</p>
                    in the very beginning of time, the Dreamtime. The Ancestors made everything.
                    </div>
    
                    <div class = 'second-fact tagai'> 
                    <img src='tagai.png' class='top-image' alt='tagai star' height='200'>
                    <h2>The Tagai </h2>

                    <p>Torres Strait Islander culture and spirituality are closely linked to the stars 
                    and the stories of Tagai, a great fisherman and spirit being whom the Torres Strait 
                    Islander peoples believe created the world. Tagai is represented by a constellation of 
                    stars in the southern sky. Torres Strait Islander law, customs, and practices are 
                    shaped by the Tagai stories. The Torres Strait Islander peoples’ deep knowledge of 
                    the stars and sea provide them with valuable information regarding changes in the seasons,
                     when to plant gardens and hunt for turtles or the manatee-like dugong, and how to circumnavigate the seas.</p>
                    </div>
                        
                </div>
                """;

        //Left Box
        html = html + """
            <div class = 'images-slogan'> 
                
                <div class = 'image-slogan aboriginalimage'> 
                facts about aborginal people
                </div>

                <div class = 'image-slogan slogan'> 
                images
                </div>

            </div>

                """;
        */

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
