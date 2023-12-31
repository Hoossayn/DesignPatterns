package com.example;


import com.example.Behavioral.TaxCalculator;
import com.example.Behavioral.TaxCalculator2019;
import com.example.Behavioral.UIControl;
import com.example.Behavioral.visitor.*;
import com.example.creational.abstractFactory.ant.AntWidgetFactory;
import com.example.creational.abstractFactory.app.ContactForm;
import com.example.creational.builder.MovieBuilder;
import com.example.creational.builder.PdfDocumentBuilder;
import com.example.creational.builder.Presentation;
import com.example.creational.builder.Slide;
import com.example.creational.factory.ProductController;
import com.example.creational.singleton.ConfigManager;
import com.example.structural.adapter.CaramelFilter;
import com.example.structural.adapter.Image;
import com.example.structural.adapter.ImagePreview;
import com.example.structural.adapter.VividFilter;
import com.example.structural.adapter.avaFilters.Caramel;
import com.example.structural.bridge.AdvancedRemoteControl;
import com.example.structural.bridge.LGTv;
import com.example.structural.bridge.SonyTv;
import com.example.structural.composite.Group;
import com.example.structural.composite.Shape;
import com.example.structural.decorator.CloudStream;
import com.example.structural.decorator.CompressedCloudStream;
import com.example.structural.decorator.EncryptedCloudStream;
import com.example.structural.decorator.Stream;
import com.example.structural.facade.NotificationService;
import com.example.structural.flyweight.PointIconFactory;
import com.example.structural.flyweight.PointService;
import com.example.structural.proxy.EbookProxy;
import com.example.structural.proxy.Library;
import com.example.structural.proxy.LoggingEbookProxy;
import com.example.structural.proxy.RealEbook;

public class Main {

    public static void main(String[] args) {
	// write your code here


        //-------------Builder pattern -----------------
        var presentation = new Presentation();
        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));

        var builder = new PdfDocumentBuilder();
        presentation.export(builder);
        var pdf =  builder.getPdfDocument();

        //-------------Abstract factory pattern -----------------
        //new ContactForm().render(new AntWidgetFactory());

        //-------------Factory pattern -----------------
        //new ProductController().listProduct();

        //-------------Singleton pattern -----------------
        /*ConfigManager manager = ConfigManager.getInstance();
        manager.set("name","Joe");

        ConfigManager other = ConfigManager.getInstance();
        System.out.println(other.get("name"));*/

        //-------------Proxy pattern -------------------
        /*var library = new Library();
        String[] fileNames = { "a", "b", "c"};
        for (var fileName: fileNames)
            library.add(new LoggingEbookProxy(fileName));

        library.openEbook("a");
        library.openEbook("b");*/

        //-------------Bridge pattern -------------------
        /*var remoteControl = new AdvancedRemoteControl(new LGTv());
        remoteControl.turnOff();*/

        //-------------Flyweight pattern -------------------
        /*var service = new PointService(new PointIconFactory());
        for (var point: service.getPoints()){
            point.draw();
        }*/
        //-------------Facade pattern -------------------
        /*var service = new NotificationService();
        service.send("Hello there!!", "target");*/
        //-------------Decorator pattern -------------------
       /* storeCreditCard(new EncryptedCloudStream(
                new CompressedCloudStream(new CloudStream())
        ));*/
        //-------------Adapter pattern -------------------
       /* var imageView = new ImagePreview(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));*/

        //-------------Composite pattern -------------------
        /*var group1 = new Group();
        group1.add(new Shape());
        group1.add(new Shape());

        var group2 = new Group();
        group2.add(new Shape());
        group2.add(new Shape());

        var group = new Group();
        group.add(group1);
        group.add(group2);
        group.render();
        group.move();
        group.delete();*/

        //-------------Visitor pattern ----------------------
        /*var document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.execute(new HighlightOperation());
        document.execute(new PlainTextOperation());*/

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

    private static void storeCreditCard(Stream stream) {
        stream.write("123-4567-3456-245");
    }

    public static void drawUIControl(UIControl control){
        control.draw();
     }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }
}
