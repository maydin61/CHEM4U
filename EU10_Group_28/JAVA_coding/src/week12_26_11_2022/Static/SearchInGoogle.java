package week12_26_11_2022.Static;

import static week12_26_11_2022.Static.BrowserUtilities.navigateURL;
import static week12_26_11_2022.Static.BrowserUtilities.search;

public class SearchInGoogle {
    public static void main(String[] args) {


        navigateURL("Google"); // without using the BrowserUtilities  methods are called
        search("Adam");   // without using the BrowserUtilities

        navigateURL("MSN");
        search("Aydin");
    }
}
