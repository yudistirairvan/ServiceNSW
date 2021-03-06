## Table of contents
* [Description](#ServiceNSW)
* [UI Automation](#UI-Automation)
* [How To Build UI Automation](#How-To-Build-UI-Automation)
* [How To Run UI Automation](#How-To-Run-UI-Automation)
* [API Automation](#API-Automation)
* [How To Build API Automation](#How-To-Build-API-Automation)
* [How To Run API Automation](#How-To-Run-API-Automation)

## ServiceNSW

A test case for [ServiceNSW](https://www.service.nsw.gov.au/) using katalon


## UI Automation
After runing the automation script using katalon we confirm taht all page goes to appropriate page, How ever when im running the automation test we its seem to slow and make the automation stoped. 


## How To Build UI Automation
To build UI Automation test we can use [Katalon](https://katalon.com/).

* In case you allready open the aplication, first you have to make a new Project, you can find it on Flie > New > Project

* Fill the name of your project and if you want to Test the UI, make sure you choose the Web Type

* By the default the project will saved on KatalonStudio Folder, you can change it on another location.

* If all step done, klik on Ok Button, and it will generate the file 

* Next step try to make script for testing the UI, you have to create new Test Case, you can find it on File > New > Test Case

* Then generate the Script on Test case 

## How To Run UI Automation

For running the script/test case you can run by click on Button Run and Choose the browser that you want to use it.

Test will automaticly run by youre script if there is somethink wrong it will stopp and you can see on the log Viewer Section

## API Automation

Performance tests for the API Testing with 10 times in a 1 minute duration 

All API test passed

![Pict1](https://github.com/yudistirairvan/ServiceNSW/blob/main/pict1.png)
![Pict1](https://github.com/yudistirairvan/ServiceNSW/blob/main/pic2.png)

You can download the data in here :
* [Postman Collection](https://github.com/yudistirairvan/ServiceNSW/blob/main/weatherbit.io.postman_test_run.json)
* [Data Curent Long Lat](https://github.com/yudistirairvan/ServiceNSW/blob/main/Data%20Curent%20Long%20Lat)
* [Data Forecast Hourly by postal code](https://github.com/yudistirairvan/ServiceNSW/blob/main/Data%20Forecast%20Hourly%20by%20postal%20code)


## How To Build API Automation

* In case you already open the postman aplication, first you have to make a collection by clik on new button on left and top of postman app, and choose the collection Building Blocks, then fill the name of your collection and don't forget write the description. then click create button.

* Make a new request for testing api, by click + button on youre workspace, don't forget to choose the GET method because we want to test GET data from the API, then add your URL.

* Don't forget to add Content-Type:application/x-www-form-urlencoded and Accept:application/json on Headers because we want to get JSON format for the Data

* Next step add the test requierdment for passed the api test, with this : 

For Curent By Long Lat 

```

pm.test("Status test", function(){
    pm.response.to.have.status(200);
})

pm.test("state code is not empty", () => {
    const jsonData = pm.response.json();
    const datas = jsonData.data.find(m => m.rh === 77 );
    pm.expect(datas.state_code).to.not.empty;
   
});
```

For Forecast Hourly by Postal Code

```

pm.test("Status test", function(){
    pm.response.to.have.status(200);
})

pm.test("Timestamp is not empty", () => {
    const jsonData = pm.response.json();
    const datas = jsonData.data.find(m => m.wind_cdir === "NNW" );
    pm.expect(datas.timestamp_utc).to.not.empty;
   
});

pm.test("Weather is not empty", () => {
    const jsonData = pm.response.json();
    const datas = jsonData.data.find(m => m.wind_cdir === "NNW" );
    pm.expect(datas.weather).to.not.empty;
});
```
 
## How To Run API Automation

When you allready finish all step, then it's time to start runner for testing API

* First click on runner button, it will open new window for Test API.

* Don't forget to select your collection and environment. 

* You can set up literation and delay for your testing plan

* if all things was clear you can click Start/Run Button and wait till you get the result
