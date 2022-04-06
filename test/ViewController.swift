//
//  ViewController.swift
//  test
//
//  Created by Giulia Giordo on 27/03/2022.
//

import UIKit

class ViewController: UIViewController {
//label for stepper
    @IBOutlet weak var lbl:UILabel!
    
    @IBAction func stepper(_ sender: UIStepper) {
        lbl.text = String (sender.value)
    }
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }


}

