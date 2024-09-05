package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminDashboard {

    public AdminDashboard() {PageFactory.initElements(utilities.Driver.getDriver(), this);}


    //Admin Login Panel\\
        //Email/Username
        @FindBy (xpath = "//*[@placeholder='Email/Username']")
        public WebElement emailUsernameForm;
        //Password
        @FindBy (xpath = "//*[@placeholder='Password']")
        public WebElement passwordForm;
        //Sign in Button
        @FindBy (xpath = "//*[@class='btn btn-block login-button']")
        public WebElement signInButton;



    //      **AdminDashboard Main Page**      \\


    //Blog Menu\\
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[3]")
    public WebElement blogButton;

        //Blog Menu Subsections\\
            //Tags button
            @FindBy(xpath = "//*[@id='cms-plugins-blog-tags']/a")
            public WebElement tagsButton;
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
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[5]/ul/li[3]/a")
            public WebElement featuresButton;
            //Facilities Button
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[5]/ul/li[4]/a")
            public WebElement facilitiesButton;
            //Investors Button
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[5]/ul/li[5]/a")
            public WebElement investorsButton;
            //Categories Button
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[5]/ul/li[6]/a")
            public WebElement categoriesButton;
            //Types Button
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[5]/ul/li[7]/a")
            public WebElement typesButton;
            //Reviews Button
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[5]/ul/li[8]/a")
            public WebElement reviewsButton;
            //Settings Button
            @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[1]/div/div/div/ul/li[5]/ul/li[9]/a")
            public WebElement settingsButton;




////////////////////////==================\\\\\\\\\\\\\\\\\\\\\\\\

                //Admin Panel Mutual Elements\\

////////////////////////==================\\\\\\\\\\\\\\\\\\\\\\\\



    //Create button
    @FindBy (xpath = "/html/body/div[2]/div[2]/div[3]/div[2]/div/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/button[1]")
    public WebElement createButton;
    //Listedeki ilk item edit butonu
    @FindBy (xpath = "//*[@data-bs-original-title=\"Edit\"][1]")
    public WebElement editButton;
    //Listedeki ilk item delete butonu
    @FindBy (xpath = "//*[@data-bs-original-title='Delete'][1]")
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
        //"The name field is required." (Can also be used for Title field.)
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
                @FindBy (xpath = "//option[@value='published']")
                public WebElement publishedStatus;
                //Draft
                @FindBy (xpath = "//option[@value='draft']")
                public WebElement draftStatus;
                //Pending
                @FindBy (xpath = "//option[@value='pending']")
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
            public WebElement tagsConfirm;
            //Testimonials
            @FindBy (xpath = "//li[@class='breadcrumb-item active'][text()='Testimonials']")
            public WebElement testimonialsConfirm;
            //Properties
            @FindBy (xpath = "//li[@class='breadcrumb-item active'][text()='Properties']")
            public WebElement propertiesConfirm;
            //Projects
            @FindBy (xpath = "//li[@class='breadcrumb-item active'][text()='Projects']")
            public WebElement projectsConfirm;
            //Features
            @FindBy (xpath = "//li[@class='breadcrumb-item active'][text()='Features']")
            public WebElement featuresConfirm;
            //Facilities
            @FindBy (xpath = "//li[@class='breadcrumb-item active'][text()='Facilities']")
            public WebElement facilitiesConfirm;
            //Investors
            @FindBy (xpath = "//li[@class='breadcrumb-item active'][text()='Investors']")
            public WebElement investorsConfirm;
            //Categories
            @FindBy (xpath = "//li[@class='breadcrumb-item active'][text()='Categories']")
            public WebElement categoriesConfirm;
            //Types
            @FindBy (xpath = "//li[@class='breadcrumb-item active'][text()='Types']")
            public WebElement typesConfirm;
            //Reviews
            @FindBy (xpath = "//li[@class='breadcrumb-item active'][text()='Reviews']")
            public WebElement reviewsConfirm;
            //Settings
            @FindBy (xpath = "//li[@class='breadcrumb-item active'][text()='Settings']")
            public WebElement settingsConfirm;
            //Success Message Popup of Create, Edit and Delete
                @FindBy (xpath = "//*[@class='toast toast-success']")
                public WebElement successPopup;












}
