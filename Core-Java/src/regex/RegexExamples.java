package regex;

import java.io.*;
import org.junit.*;

public class RegexExamples {

	@Test
	public void validateEmailID() throws IOException {

		String regex = ".+@[\\w-]+\\.[a-zA-Z]+";

		/**
		 * Lets fragment the regex
		 * 
		 * First part -> . is a meta character which has a special meaning. This matches all the characters (alphanumeric, special characters, space characters) 
		 * except a line break
		 * 
		 * Second part -> + is a quantifier, which specifies the desired number of repetitions. + matches 1 or more repetitions of preceding character/meta character.
		 * In our example if the given email id is example123@gmail.com then the regex .+ matches one or more repetitions of any character except line break, so it will 
		 * match the entire string example123gmail.com. Why it matches the entire mail id ? because the mail id is composed of  several repetitions of characters - not 
		 * only alphabets but also numbers and specials characters
		 * 
		 * Third part -> @ does not have any special meaning. The regex .+@ means one or more repetitions of characters followed by the special character @. So the regex
		 * .+@ will match example123@ in the mail id - emample123@gmail.com
		 * 
		 * Fourth part -> [\\w-]+, \w is a shorthand which matches alphanumeric characters and - does not have any special meaning. As domain names is composed of 
		 * alphabets, numbers and the special character -, we have enclosed both \w and - in character class []. The character class will apply OR logic to the regex elements
		 * inside it. This regex [abc] will match a or b or c, so the regex [\\w-] will match  a alphanumeric character or special character. The entire fourth part
		 * [\\w-]+ will match one or more repetitions of a alphanumeric character or the special character -. So this part of our regex will match the domain name
		 * after @, which is gmail
		 * 
		 * Fifth part -> .[a-zA-Z]+ We have included ranges in character class, small case a to z and upper case A to Z. [a-zA-Z] matches small case a to z or upper case A to Z.
		 * We use this part to validate the top level domain for ex .com, .org, .in, .COM etc.. so .[a-zA-Z]+ means period followed by one or more repetitions of lower or upper case
		 * alphabets
		 * 
		 * Note: the double back slash before period -> \\. means we are treating . as normal character without any special meaning to the complier. As the period is the meta
		 * character in regex, we need to escape its special meaning to match a normal period.
		 * 
		 * Conclusion: The entire regex can be interpreted as one or more repetitions of any character followed by the special character @ followed by one or more repetitions
		 * of alphanumeric or the special character - followed by the special character . followed by one or more repetition of smaller case or upper case alphabets
		 */

		System.out.println("Enter email id and press enter...");
		BufferedReader lineReader = new BufferedReader(new InputStreamReader(System.in));
		String emailID = lineReader.readLine(); 

		if(emailID.matches(regex)) {
			System.out.println("It is a valid email id");
		}
		else {
			System.out.println("Invalid email id");
			Assert.fail();
		}
	}
	

}

