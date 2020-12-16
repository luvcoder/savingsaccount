package luv.bank.savingsaccount.controller;

import luv.bank.savingsaccount.model.SavingsAcc;
import luv.bank.savingsaccount.repository.SavingsAccRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import luv.bank.savingsaccount.exception.ResourceNotFoundException;

import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
@RequestMapping("/api/v1/")
@CrossOrigin
public class SavingsAccController {


    @Autowired
    private SavingsAccRepository savingsAccRepository;

    //get all Employees
    @GetMapping("/savingsacc")
    public List<SavingsAcc> getAllAccounts() {
        return savingsAccRepository.findAll();
    }


    //create Ticket Rest Api
    @PostMapping("/savingsacc")
    public SavingsAcc createAccount(@RequestBody SavingsAcc savingsAcc) {
        return savingsAccRepository.save(savingsAcc);
    }

    //get ticket by Id rest api
    @GetMapping("/savingsacc/{accountno}")
    public ResponseEntity<SavingsAcc> getAccountbyId(@PathVariable Long accountno) {
        SavingsAcc savingsAcc = savingsAccRepository.findById(accountno)
                .orElseThrow(() -> new ResourceNotFoundException("Account does not exist with id:"
                        + accountno));
        return ResponseEntity.ok(savingsAcc);

    }



    //Update ticket rest api
    @PutMapping("savingsacc/{accountno}")
    public ResponseEntity<SavingsAcc> updateAccount
    (@PathVariable Long accountno,
     @RequestBody SavingsAcc accountDetails) {

        SavingsAcc savingsAcc = savingsAccRepository.findById(accountno)
                .orElseThrow(() -> new ResourceNotFoundException("Account does not exist with id:"
                        + accountno));

        savingsAcc.setName(accountDetails.getName());
        savingsAcc.setAge(accountDetails.getAge());
        savingsAcc.setAddress(accountDetails.getAddress());
        savingsAcc.setAccounttype(accountDetails.getAccounttype());
        savingsAcc.setBalance(accountDetails.getBalance());

        SavingsAcc updatedSavingsAcc = savingsAccRepository.save(savingsAcc);
        return ResponseEntity.ok(updatedSavingsAcc);


    }


    //    //delete ticket rest api
//    @DeleteMapping("savingsacc/{accountno}")
//    public ResponseEntity<Map<String,Boolean>> deletePassenger(@PathVariable Long accountno){
//        SavingsAcc savingsAcc = savingsAccRepository.findById(accountno)
//                .orElseThrow(() -> new ResourceNotFoundException("Account does not exist with id:"
//                        + accountno));
//        savingsAccRepository.delete(savingsAcc);
//        Map<String,Boolean> response = new HashMap<>();
//        response.put("deleted",Boolean.TRUE);
//        return ResponseEntity.ok(response);
//    }





}
