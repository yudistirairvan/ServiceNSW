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
After runing the automation script using katalon

Sydney International Airport 2020

Sydney Domestic Airport 2020

## How To Build UI Automation

## How To Run UI Automation

## API Automation

Performance tests for the API Testing with 10 times in a 1 minute duration 

Test Api Passed

![Pict1](https://github.com/yudistirairvan/ServiceNSW/blob/main/pict1.png)
![Pict1](https://github.com/yudistirairvan/ServiceNSW/blob/main/pic2.png)

You can download the data in here :
* [Postman Collection](https://github.com/yudistirairvan/ServiceNSW/blob/main/weatherbit.io.postman_test_run.json)
* [Data Curent Long Lat](https://github.com/yudistirairvan/ServiceNSW/blob/main/Data%20Curent%20Long%20Lat)
* [Data Forecast Hourly by postal code](https://github.com/yudistirairvan/ServiceNSW/blob/main/Data%20Forecast%20Hourly%20by%20postal%20code)
 [UI Automation](#UI-Automation)

## How To Build API Automation
how to build an postman API Test
* in case you already open the postman aplication, first you have to make a collection by clik on new button on left and top of postman app, and choose the collection Building Blocks, then fill the name of your collection and don't forget write the description. then click create button.

* make a new request for testing api, by click + button on youre workspace, don't forget to choose the GET method because we want to test GET data from the API, then add your URL.

* don't forget to add Content-Type:application/x-www-form-urlencoded and Accept:application/json on Headers because we want to get JSON format for the Data

* next step add the test requierdment for passed the api test, with this : 
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
