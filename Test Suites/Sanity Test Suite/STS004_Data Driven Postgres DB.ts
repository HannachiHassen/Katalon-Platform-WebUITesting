<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>STS004_Data Driven Postgres DB</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>04fef41d-8f80-4a00-b331-67c2700ff340</testSuiteGuid>
   <testCaseLink>
      <guid>4e3a7164-dcd1-440f-b5d1-276e89fa5ccc</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Data Driven/TC001_Find a place</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>c1b96815-8a0c-4f9f-98e7-eadb982b626d</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/100 cities_DB</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>c1b96815-8a0c-4f9f-98e7-eadb982b626d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>city</value>
         <variableId>01c0a0bb-a8af-457f-b66f-74d47032aec5</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>c1b96815-8a0c-4f9f-98e7-eadb982b626d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>expectedResult</value>
         <variableId>cc6ecfbd-b42f-4825-87ea-dc3e1ab3ee81</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
