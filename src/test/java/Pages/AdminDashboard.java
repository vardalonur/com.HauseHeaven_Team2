package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminDashboard {

    public AdminDashboard() {PageFactory.initElements(utilities.Driver.getDriver(), this);}


    //Admin Login Panel\\
        //Email/Username
        @FindBy (xpath = "//*[@placeholder='Email/Username']")
        public WebElement emailUsernameFormu;
        //Password
        @FindBy (xpath = "//*[@placeholder='Password']")
        public WebElement passwordFormu;
        //Sign in Button
        @FindBy (xpath = "//*[@class='btn btn-block login-button']")
        public WebElement signInButonu;



    //      **AdminDashboard Main Page**      \\


    //Blog Menu\\
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[3]")
    public WebElement blogButonu;

        //Blog Menu Subsections\\
            //Tags button
            @FindBy(xpath = "//*[@id='cms-plugins-blog-tags']/a")
            public WebElement tagsButonu;
                //Tags Create Page Elements

                    //Status dropdownMenu




    // Testimonials Menu
    @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[4]/a")
    public WebElement testimonialsButton;

    //Real Estate Menu
    @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[5]/a")
    public WebElement realEstateButton;

        //Real Estate Menu Subsections\\
            //Properties Button
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[5]/ul/li[1]/a")
            public WebElement propertiesButton;
            //Projects Button
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[5]/ul/li[2]/a")
            public WebElement projectsButton;
            //Features Button
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[5]/ul/li[2]/a")
            public WebElement featuresButton;
            //Facilities Button
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[5]/ul/li[2]/a")
            public WebElement facilitiesButton;
            //Investors Button
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[5]/ul/li[2]/a")
            public WebElement investorsButton;
            //Categories Button
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[5]/ul/li[2]/a")
            public WebElement categoriesButton;
            //Types Button
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[5]/ul/li[2]/a")
            public WebElement typesButton;
            //Review Button
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[5]/ul/li[2]/a")
            public WebElement reviewButton;
            //Settings Button
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[5]/ul/li[2]/a")
            public WebElement settingsButton;




////////////////////////==================\\\\\\\\\\\\\\\\\\\\\\\\

                //Admin Paneli Mutual Elements\\

////////////////////////==================\\\\\\\\\\\\\\\\\\\\\\\\



    //Create button
    @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/button[1]")
    public WebElement createButton;
    //Listedeki ilk item edit butonu
    @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/div[1]/div[2]/div[2]/div/div/table/tbody/tr[1]/td[7]/div/a[1]")
    public WebElement editButton;
    //Listedeki ilk item delete butonu
    @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/div[1]/div[2]/div[2]/div/div/table/tbody/tr[1]/td[7]/div/a[2]")
    public WebElement deleteButton;
    //Delete Screen
        //X button
        @FindBy (xpath = "//*[@id='main']/div[2]/div/div/div[1]/button")
        public WebElement deleteXButton;
        //DeleteConfirm Button
        @FindBy (xpath = "//*[@class='float-end btn btn-danger delete-crud-entry']")
        public WebElement deleteConfirmButton;
        //Cancel Button
        @FindBy (xpath = "//*[@class='float-end btn btn-danger delete-crud-entry']/preceding-sibling::*" )
        public WebElement cancelButton;
    //Create&Edit Sayfa Elementleri
        //Save&Exit Button
        @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[2]/div[1]/div[2]/div/button[1]")
        public WebElement saveAndExit;
        //Name Form
        @FindBy (xpath = "//*[@placeholder='Name']")
        public WebElement nameForm;
        //"The name field is required."
        @FindBy (xpath = "//*[@id='name-error']")
        public WebElement nameError;
        //Title form
        @FindBy (xpath = "//*[@placeholder='Title']")
        public WebElement titleForm;
        //Description form
        @FindBy (xpath = "//*[@placeholder='Short description']")
        public WebElement descriptionForm;
        //Content Form
        @FindBy (xpath = "//*[@aria-label='Editor editing area: main']")
        public WebElement contentForm;
        //Location Form
        @FindBy (xpath = "//*[@placeholder='Location']")
        public WebElement locationForm;
        //PropertyLocation Form (Properties)
        @FindBy (xpath = "//*[@placeholder='Property location']")
        public WebElement propertyLocationForm;
        //Type Menu (Properties)
        @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[1]/div[3]/div[2]/div/div/select")
        public WebElement typePropertiesMenu;
            //Type Menu Items
                //For Rent
                @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[1]/div[3]/div[2]/div/div/select/option[1]")
                public WebElement forRentType;
                //For Sale
                @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[1]/div[3]/div[2]/div/div/select/option[2]")
                public WebElement forSaleType;
        //Status Menu
        @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[2]/div[4]/div[2]/div/select")
        public WebElement statusMenu;
            //Status Selections
                //Published
                @FindBy (xpath = "//li[text()='Published']")
                public WebElement publishedStatus;
                //Draft
                @FindBy (xpath = "//li[text()='Draft']")
                public WebElement draftStatus;
                //Pending
                @FindBy (xpath = "//li[text()='Pending']")
                public WebElement pendingStatus;
                //Approved
                @FindBy (xpath = "//li[text()='Approved']")
                public WebElement approvedStatus;
                //Rejected
                @FindBy (xpath = "//li[text()='Rejected']")
                public WebElement rejectedStatus;
                //Not Available
                @FindBy (xpath = "//option[@value='not_available']")
                public WebElement notAvailableStatus;
                //Preparing Selling
                @FindBy (xpath = "//option[@value='pre_sale']")
                public WebElement preparingSellingStatus;
                //Selling
                @FindBy (xpath = "//option[@value='selling']")
                public  WebElement SellingStatus;
                //Sold
                @FindBy (xpath = "//option[@value='sold']")
                public WebElement soldStatus;
                //Building
                @FindBy (xpath = "//option[@value='building']")
                public WebElement buildingStatus;

        //Status Menu Alternative (Investor, Categories)
        @FindBy (xpath = "//*[@id='select2-status-container']")
        public WebElement statusMenuAlt;
            // Status Menu Alternative (Investor, Categories)
                /*
                 Bunlar için status elementlerindeki Pending, Draft ve Rejected kullanılacak
                */

        //ModerationStatus (Properties Section)
        @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[2]/div[5]/div[2]/div/span/span[1]/span/span[1]")
        public WebElement moderationStatusMenu;
            //ModerationStatus Selections
                /*
                 Bunlar için status elementlerindeki Pending, Approved ve Rejected kullanılacak
                */


        //Categories Checkboxes (Projects Section)
            //Apartment
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[2]/div[5]/div[2]/div/div/div/div[1]/ul/li[1]/label")
            public WebElement apartmentCat;
            //Villa
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[2]/div[5]/div[2]/div/div/div/div[1]/ul/li[2]/label")
            public WebElement villaCat;
            //Condo
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[2]/div[5]/div[2]/div/div/div/div[1]/ul/li[3]/label")
            public WebElement condoCat;
            //House
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[2]/div[5]/div[2]/div/div/div/div[1]/ul/li[4]/label")
            public WebElement houseCat;
            //Commercial property
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[2]/div[5]/div[2]/div/div/div/div[1]/ul/li[5]/label")
            public WebElement commercialPropertyCat;
            //Single Family Home
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[2]/div[5]/div[2]/div/div/div/div[1]/ul/li[6]/label")
            public WebElement singleFamilyHomeCat;
            //Townhouse
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[2]/div[5]/div[2]/div/div/div/div[1]/ul/li[7]/label")
            public WebElement townhouseCat;
            //Land
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/form/div[2]/div[2]/div[5]/div[2]/div/div/div/div[1]/ul/li[8]/label")
            public WebElement landCat;

        //Create ve edit sayfalarında dönüş teyitleri
            //Save&Exit tuşuna tıklandığında, browser bir önceki sayfaya gelmeli.
            //Tags
            @FindBy (xpath = "//li[@class='breadcrumb-item active'][text()='Tags']")
            public WebElement tagsReturn;
            //Testimonials
            @FindBy (xpath = "//li[@class='breadcrumb-item active'][text()='Testimonials']")
            public WebElement testimonialsReturn;
            //Properties
            @FindBy (xpath = "//li[@class='breadcrumb-item active'][text()='Properties']")
            public WebElement propertiesReturn;
            //Success Message Popup of Create, Edit and Delete
                @FindBy (xpath = "//*[@class='toast toast-success']")
                public WebElement successPopup;












}
