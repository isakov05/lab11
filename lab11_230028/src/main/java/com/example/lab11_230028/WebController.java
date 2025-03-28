package com.example.lab11_230028;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class WebController {
    @GetMapping("/")
    public String index() {
        return  "<!DOCTYPE html>"
                + "<html>"
                + "<head>"
                + "<title>Web Application</title>"
                + "<link rel='stylesheet' type='text/css' href='/style.css'>" // Link CSS
                + "</head>"
                + "<body>"

                + "<h1>Welcome to Our Web Application</h1>"
                + "<p>Navigate to:</p>"
                + "<ul>"
                + "<li><a href='/home'>Home</a></li>"
                + "<li><a href='/services'>Services</a></li>"
                + "<li><a href='/about'>About</a></li>"
                + "<li><a href='/faq'>FAQ</a></li>"
                + "<li><a href='/contact-us'>Contact Us</a></li>"
                + "<li><a href='/team'>Team</a></li>"
                + "</ul>"

                + "<h2>Try Our Functions:</h2>"

                + "<form action='/double' method='get'>"
                + "Enter a number to double: <input type='number' name='num' required>"
                + "<input type='submit' value='Double It'>"
                + "</form><br>"

                + "<form action='/length' method='get'>"
                + "Enter text to check length: <input type='text' name='text' required>"
                + "<input type='submit' value='Get Length'>"
                + "</form><br>"

                + "<form action='/reverse' method='get'>"
                + "Enter text to reverse: <input type='text' name='text' required>"
                + "<input type='submit' value='Reverse It'>"
                + "</form><br>"

                + "<form action='/concat' method='get'>"
                + "Enter first text: <input type='text' name='str1' required>"
                + "Enter second text: <input type='text' name='str2' required>"
                + "<input type='submit' value='Concatenate'>"
                + "</form>"

                + "<form action='/subtract' method='get'>"
                + "Enter first number: <input type='number' name='x' required>"
                + "Enter second number: <input type='number' name='y' required>"
                + "<input type='submit' value='Subtract'>"
                + "</form><br>"

                + "<form action='/divide' method='get'>"
                + "Enter first number: <input type='number' name='x' required>"
                + "Enter second number: <input type='number' name='y' required>"
                + "<input type='submit' value='Divide'>"
                + "</form><br>"

                + "<form action='/modulus' method='get'>"
                + "Enter first number: <input type='number' name='x' required>"
                + "Enter second number: <input type='number' name='y' required>"
                + "<input type='submit' value='Modulus'>"
                + "</form><br>"

                + "<form action='/power' method='get'>"
                + "Enter base: <input type='number' name='base' required>"
                + "Enter exponent: <input type='number' name='exp' required>"
                + "<input type='submit' value='Calculate Power'>"
                + "</form><br>"

                + "<h2>Explore Entities:</h2>"

                + "<button onclick=\"location.href='/teacher'\">View Teacher</button><br><br>"
                + "<button onclick=\"location.href='/course'\">View Course</button><br><br>"
                + "<button onclick=\"location.href='/book'\">View Book</button><br><br>"

                + "<h2>Update Student Age:</h2>"
                + "<form action='/update-student/age' method='get'>"
                + "Enter new age: <input type='number' name='age' required>"
                + "<input type='submit' value='Update Age'>"
                + "</form>"

                + "<div class='function-box'>"
                + "<form action='/calculate' method='get'>"
                + "<h3>Calculator</h3>"
                + "<input type='number' name='x' placeholder='Enter first number' required>"
                + "<input type='number' name='y' placeholder='Enter second number' required>"
                + "<select name='operation'>"
                + "<option value='add'>Add</option>"
                + "<option value='subtract'>Subtract</option>"
                + "<option value='multiply'>Multiply</option>"
                + "<option value='divide'>Divide</option>"
                + "</select>"
                + "<input type='submit' value='Calculate'>"
                + "</form>"
                + "</div>"

                + "<div class='function-box'>"
                + "<form action='/convert' method='get'>"
                + "<h3>Temperature Converter</h3>"
                + "<input type='number' name='temperature' placeholder='Enter Celsius' required>"
                + "<input type='submit' value='Convert to Fahrenheit'>"
                + "</form>"
                + "</div>"

                + "<div class='function-box'>"
                + "<form action='/discount' method='get'>"
                + "<h3>Discount Calculator</h3>"
                + "<input type='number' name='originalPrice' placeholder='Original Price' required>"
                + "<input type='number' name='discountRate' placeholder='Discount Rate (%)' required>"
                + "<input type='submit' value='Calculate Discount'>"
                + "</form>"
                + "</div>"

                + "</div>"

                + "<h2>API Endpoints:</h2>"
                + "<div class='functions-container'>"

                + "<div class='function-box'>"
                + "<h3>Course Info</h3>"
                + "<button onclick=\"location.href='/api/course-info'\">View JSON</button>"
                + "</div>"

                + "<div class='function-box'>"
                + "<h3>User Profile</h3>"
                + "<button onclick=\"location.href='/api/user-profile'\">View JSON</button>"
                + "</div>"

                + "<div class='function-box'>"
                + "<h3>Product Details</h3>"
                + "<button onclick=\"location.href='/api/product-details'\">View JSON</button>"
                + "</div>"

                + "<div class='function-box'>"
                + "<h3>Order Summary</h3>"
                + "<button onclick=\"location.href='/api/order-summary'\">View JSON</button>"
                + "</div>"

                + "</div>"

                + "</body></html>";
    }

    @GetMapping ("/ home ")
    public String home () {
        return " Welcome to Home Page !";
    }
    @GetMapping("/ services ")
    public String services () {
        return "<h2 >Our Services </h2 >"
                + "<ul >"
                + "<li > Web Development </li >"
                + "<li > Mobile App Development </li >"
                + "<li > SEO Optimization </li >"
                + " </ul >";
    }

    @GetMapping("/about")
    public String about() {
        return "This is a web application for lab 11";
    }

    @GetMapping("/faq")
    public String faq() {
        return "<h2>Frequently Asked Questions</h2>";
    }

    @GetMapping("/contact-us")
    public String contactUs() {
        return "<h2>Contact Us</h2><p>Email: contact@example.com<br>Phone: +123456789</p>";
    }

    @GetMapping("/team")
    public String team() {
        return "<h2>Meet Our Team</h2><p>Alex<br>Boss</p>";
    }



    @GetMapping("/double")
    public String doubleNumber(@RequestParam int num) {
        return "Twice of " + num + " is " + (num * 2) + ".";
    }
    @GetMapping("/length")
    public String getTextLength(@RequestParam String text) {
        return "The length of '" + text + "' is " + text.length() + ".";
    }
    @GetMapping("/reverse")
    public String reverseText(@RequestParam String text) {
        return "Reversed text: " + new StringBuilder(text).reverse().toString();
    }
    @GetMapping("/concat")
    public String concatenateStrings(@RequestParam String text1, @RequestParam String text2) {
        return "Concatenated result: " + text1 + text2;
    }

    @GetMapping("/subtract")
    public String subtract(@RequestParam int x, @RequestParam int y) {
        return "The difference of " + x + " and " + y + " is " + (x - y) + ".";
    }
    @GetMapping("/divide")
    public String divide(@RequestParam int x, @RequestParam int y) {
        if (y == 0) {
            return "Division by zero is not allowed.";
        }
        return "The division of " + x + " by " + y + " is " + (x / (double) y) + ".";
    }
    @GetMapping("/modulus")
    public String modulus(@RequestParam int x, @RequestParam int y) {
        if (y == 0) {
            return "Modulus by zero is not allowed.";
        }
        return "The remainder of " + x + " divided by " + y + " is " + (x % y) + ".";
    }
    @GetMapping("/power")
    public String power(@RequestParam int base, @RequestParam int exp) {
        return base + " raised to the power of " + exp + " is " + Math.pow(base, exp) + ".";
    }


    private final student student = new student();

    @GetMapping("/teacher")
    public String getTeacher() {
        teacher teacher = new teacher("Muhammadali Khayatov", "Web Programming");
        return "Teacher Name: " + teacher.getName() + ", Subject: " + teacher.getSubject();
    }
    @GetMapping("/course")
    public String getCourse() {
        Course course = new Course("Web Development", "New Course", 16);
        return "Course Title: " + course.getTitle() + ", Duration: " + course.getDuration() + " weeks";
    }
    @GetMapping("/update-student/age")
    public String updateStudentAge(@RequestParam int age) {
        student.setAge(age);
        return "Updated Student Age: " + student.getAge();
    }
    @GetMapping("/book")
    public String getBook() {
        book book = new book("Spring Boot for Beginners", "Good Guy", 19);
        return "Book Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Price: $" + book.getPrice();
    }


    @GetMapping("/calculate")
    public String calculate(@RequestParam double x, @RequestParam double y, @RequestParam String operation){

        double result;

        switch (operation.toLowerCase()) {
            case "add":
                result = x + y;
                break;
            case "subtract":
                result = x - y;
                break;
            case "multiply":
                result = x * y;
                break;
            case "divide":
                if (y == 0) return "Error: Division by zero is not allowed.";
                result = x / y;
                break;
            default:
                return "Error: Invalid operation. Use 'add', 'subtract', 'multiply', or 'divide'.";
        }
        return "<h2>Calculation Result</h2>"
                + "<p>Operation: " + operation + "</p>"
                + "<p>Numbers: " + x + " and " + y + "</p>"
                + "<p>Result: " + result + "</p>";
    }
    @GetMapping("/convert")
    public String convertTemperature(@RequestParam double temperature) {
        double fahrenheit = (temperature * 9/5) + 32;
        return "<h2>Temperature Conversion</h2>" + "<p>" + temperature + "°C is equal to "
                + fahrenheit + "°F.</p>";
    }
    @GetMapping("/discount")
    public String calculateDiscount(
            @RequestParam double Price,
            @RequestParam double disRate) {

        if (disRate < 0 || disRate > 100) {
            return "Error. Wrong discount.";
        }

        double disAmount = (Price * disRate) / 100;
        double finalPrice = Price - disAmount;

        return "<h2>Discount Calculation</h2>"
                + "<p>Real Price: $" + Price + "</p>"
                + "<p>Discount Rate: " + disRate + "%</p>"
                + "<p>Discount Amount: $" + disAmount + "</p>"
                + "<p>Final Price: $" + finalPrice + "</p>";
    }
}
