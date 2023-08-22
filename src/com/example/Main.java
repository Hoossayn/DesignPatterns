package com.example;


import com.example.Behavioral.TaxCalculator;
import com.example.Behavioral.TaxCalculator2019;
import com.example.Behavioral.UIControl;
import com.example.Behavioral.visitor.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //-------------Visitor pattern ----------------------
        var document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.execute(new HighlightOperation());
        document.execute(new PlainTextOperation());

        //-------chain of responsibility--------------------
        //auth -> logger -> compressor -> Encrypt
       /* var encryptor = new Encryptor(null);
        var compressor = new Compressor(encryptor);
        var logger = new Logging(compressor);
        var authenticator  = new Authenticator(logger);

        var server = new WebServer(authenticator);
        server.handle(new HttpRequest("admin", "1234"));
        */
        //----------Mediator-------------------------
        /*var dialog = new ArticleDialogBox();
         dialog.simulateInteraction();*/

        //----------------Observer method---------------------------------
        /*var dataSource = new DataSource();
        var sheet1 = new SpreadSheet(dataSource);
        var sheet2 = new SpreadSheet(dataSource);
        var chart = new Chart(dataSource);

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);*/

        //------------------Command Pattern-----------------------------
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

        //---------------Template method pattern---------------------
        //Template method patter
     /*   var task  = new TransferMoneyTask();
        task.execute();*/

       //----------------Strategy Pattern-----------------------------
        //Strategy Pattern
       /* var imageStorage = new ImageStorage();
        imageStorage.store("q", new JpegCompressor(),
                new BlackAndWhiteFilter());
        imageStorage.store("q", new PngCompressor(),
                new HighContrastFilter());*/

       //---------------Iterator pattern--------------------
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
       //--------------State pattern-----------------------
        //State pattern
        /*var canvas  = new Canvas();
        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();*/

        //---------------Momento Pattern---------------------
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
