package com.krishan.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class FetchEmailDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("Comming from fetchEmail delegate");
        //extracting the localVariable
        System.out.println("userId input in fetchEmail delegate:: " + delegateExecution.getVariable("userIdInput"));
        //setting up the global variable
        delegateExecution.setVariable("userEmailIdFromDelegate", "aviral.np12@gmail.com");
    }
}
