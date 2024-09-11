package org.interfaces;

import org.testng.IInvokedMethod;
import org.testng.ITestResult;

public interface IInvocationListener {

    void performBeforeInvocation(IInvokedMethod method, ITestResult result);

    void performAfterInvocation(IInvokedMethod method, ITestResult result);
}
