<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>STS001_Data Driven</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>6ebe9ce3-bad5-41ba-b3b1-dfa03d139002</testSuiteGuid>
   <testCaseLink>
      <guid>6a08a550-0493-4ee0-935d-9186980cd80b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Data Driven/TC001_Find a place</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>e54a3288-fe07-4dd4-94ca-7acea8707659</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/100 cities</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>e54a3288-fe07-4dd4-94ca-7acea8707659</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>city</value>
         <variableId>01c0a0bb-a8af-457f-b66f-74d47032aec5</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e54a3288-fe07-4dd4-94ca-7acea8707659</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>result</value>
         <variableId>cc6ecfbd-b42f-4825-87ea-dc3e1ab3ee81</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>0d572395-85fa-4007-ae49-29cfddf1bfa5</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Data Driven/TC002_Fina a place - Tokyo</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
