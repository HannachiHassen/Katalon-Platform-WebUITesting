<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>STS005_Multiple Test Data</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>05583fc2-93e7-455f-be6a-c4bd45e09b57</testSuiteGuid>
   <testCaseLink>
      <guid>51f0a60b-ee94-448d-8d6c-12f8d3c312e3</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Data Driven/TC001_Find a place</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>209b8c12-a254-4ca4-a8e1-86772cb8f553</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/100 cities_CSV</testDataId>
      </testDataLink>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>31710211-767b-4e3c-b088-9f875a070a58</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/100 cities_DB</testDataId>
      </testDataLink>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>0f05c806-19a5-486b-a4f4-e73895108b45</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/100 cities_Excel</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>31710211-767b-4e3c-b088-9f875a070a58</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>city</value>
         <variableId>01c0a0bb-a8af-457f-b66f-74d47032aec5</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>209b8c12-a254-4ca4-a8e1-86772cb8f553</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>expectedResult</value>
         <variableId>cc6ecfbd-b42f-4825-87ea-dc3e1ab3ee81</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
