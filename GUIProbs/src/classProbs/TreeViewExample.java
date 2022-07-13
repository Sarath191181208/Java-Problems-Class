package classProbs;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TreeViewExample extends Application {
   public void start(Stage stage) {
      // Creating tree items
      TreeItem root1 = new TreeItem("Programming Languages");
      TreeItem item1 = new TreeItem("Java");
      TreeItem item2 = new TreeItem("Python");
      TreeItem item3 = new TreeItem("C++");
      // Adding elements to root1
      root1.getChildren().addAll(item1, item2, item3);
      TreeItem root2 = new TreeItem("NoSQL Databases");
      TreeItem item4 = new TreeItem("Neo4j");
      TreeItem item5 = new TreeItem("HBase");
      TreeItem item6 = new TreeItem("Cassandra");
      // Adding elements to root2
      root2.getChildren().addAll(item4, item5, item6);
      TreeItem root3 = new TreeItem("Bigdata & Analytics");
      TreeItem item7 = new TreeItem("Hadoop");
      TreeItem item8 = new TreeItem("Mahout");
      TreeItem item9 = new TreeItem("Hive");
      // Adding elements to root2
      root3.getChildren().addAll(item7, item8, item9);
      // list View for educational qualification
      TreeItem<String> base = new TreeItem<String>("Technologies");
      base.setExpanded(true);
      base.getChildren().addAll(root1, root2, root3);
      // Creating a TreeView item
      TreeView view = new TreeView(base);
      view.setPrefHeight(300);
      VBox pane = new VBox(10);
      pane.setPadding(new Insets(5, 5, 5, 50));
      pane.getChildren().addAll(view);
      // Setting the stage
      Group node = new Group(pane);
      Scene scene = new Scene(node, 595, 320, Color.BEIGE);
      stage.setTitle("List View Example");
      stage.setScene(scene);
      stage.show();
   }

   public static void main(String args[]) {
      launch(args);
   }
}