package com.example;

import com.example.mediator.ArticleDialogBox;
import com.example.observer.Chart;
import com.example.observer.DataSource;
import com.example.observer.SpreadSheet;

public class Main {

    public static void main(String[] args) {
	// write your code here

        var dialog = new ArticleDialogBox();
         dialog.simulateInteraction();
        //-------------------------------------------------
        //Observer method
        /*var dataSource = new DataSource();
        var sheet1 = new SpreadSheet(dataSource);
        var sheet2 = new SpreadSheet(dataSource);
        var chart = new Chart(dataSource);

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);*/

        //-----------------------------------------------
        //Command Pattern
        /*var service  = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();*/

        /*var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();*/

        /*var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello Command pattern");

        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());*/

        //------------------------------------
        //Template method patter
     /*   var task  = new TransferMoneyTask();
        task.execute();*/

       //---------------------------------------------
        //Strategy Pattern
       /* var imageStorage = new ImageStorage();
        imageStorage.store("q", new JpegCompressor(),
                new BlackAndWhiteFilter());
        imageStorage.store("q", new PngCompressor(),
                new HighContrastFilter());*/

       //-----------------------------------
        //Iterator pattern
       /* var history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        Iterator iterator = history.createIterator();
        while (iterator.hasNext()){
            var url =  iterator.current();
            System.out.println(url);
            iterator.next();
        }
*/
       //-------------------------------------
        //State pattern
        /*var canvas  = new Canvas();
        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();*/

        //------------------------------------
        //Momento Pattern
       /* var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());
        editor.setContent("b");
        history.push(editor.createState());
        editor.setContent("c");
        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println(editor.getContent());*/
       //------------------------------------------
        /*var mailService = new MailService();
        mailService.sendEmail();*/

        /*var account = new Account();
        account.deposit(10);
        account.withdraw(5);
        System.out.println(account.getBalance());*/


        /*TaxCalculator calculator = getCalculator();
        calculator.calculateTax();*/
    }

     public static void drawUIControl(UIControl control){
        control.draw();
     }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }
}
