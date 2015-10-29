package badrecipebook1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class RecipeBookFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	JLabel rlabel;
	JComboBox recipenames;
	JTextArea displayArea;
	JComboBox operationSelectField;
	String[] operations = {"Display", "Add", "Modify"};
	JComboBox ingredientsCounterSelectField;
	JLabel ingredientLabel;
	JComboBox instructionsCounterSelectField;
	JLabel instructionLabel;
	String[] counters = {"1", "2", "3", "4", "5"};
	JTextField title;
	JTextField category;
	JTextField textFieldIngredientsUnit1, textFieldIngredientsUnit2, textFieldIngredientsUnit3, textFieldIngredientsUnit4, textFieldIngredientsUnit5;
	JTextField textFieldIngredientsUOM1, textFieldIngredientsUOM2, textFieldIngredientsUOM3, textFieldIngredientsUOM4, textFieldIngredientsUOM5;
	JTextField textFieldIngredientsName1, textFieldIngredientsName2, textFieldIngredientsName3, textFieldIngredientsName4, textFieldIngredientsName5;
	JTextField textFieldInstructions1, textFieldInstructions2, textFieldInstructions3, textFieldInstructions4, textFieldInstructions5;
	JButton jButton1;
	int numberOfIngredients = 1;
	int numberOfInstructions = 1;
	private RecipeBook recipebook;
	public RecipeBookFrame() {
		super("RecipeBook Frame");
		setLayout(new FlowLayout());
		
		recipebook = new RecipeBook();
		operationSelectField = new JComboBox(operations);
		operationSelectField.setSelectedIndex(-1);
		operationSelectField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox) e.getSource();
				String operation = (String) cb.getSelectedItem();
				
				
				
				
				
				
				
				//DISPLAY
				
				
				
				
				
				//ADD
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				switch(operation){
				case "Display":
					if(title != null){
						remove(title);
					}
					if(category != null){
						remove(category);
					}
					if(ingredientsCounterSelectField != null){
						remove(ingredientsCounterSelectField);
					}
					if(instructionsCounterSelectField != null){
						remove(instructionsCounterSelectField);
					}
					
					
					
					
					
					if(ingredientLabel != null){
						remove(ingredientLabel);
					}
					if(instructionLabel != null){
						remove(instructionLabel);
					}
					
					if(textFieldIngredientsUnit1 != null){
						remove(textFieldIngredientsUnit1);
					}
					if(textFieldIngredientsUnit2 != null){
						remove(textFieldIngredientsUnit2);
					}
					if(textFieldIngredientsUnit3 != null){
						remove(textFieldIngredientsUnit3);
					}
					if(textFieldIngredientsUnit4 != null){
						remove(textFieldIngredientsUnit4);
					}
					if(textFieldIngredientsUnit5 != null){
						remove(textFieldIngredientsUnit5);
					}
					
					if(textFieldIngredientsUOM1 != null){
						remove(textFieldIngredientsUOM1);
					}
					if(textFieldIngredientsUOM2 != null){
						remove(textFieldIngredientsUOM2);
					}
					if(textFieldIngredientsUOM3 != null){
						remove(textFieldIngredientsUOM3);
					}
					if(textFieldIngredientsUOM4 != null){
						remove(textFieldIngredientsUOM4);
					}
					if(textFieldIngredientsUOM5 != null){
						remove(textFieldIngredientsUOM5);
					}
					
					if(textFieldIngredientsName1 != null){
						remove(textFieldIngredientsName1);
					}
					if(textFieldIngredientsName2 != null){
						remove(textFieldIngredientsName2);
					}
					if(textFieldIngredientsName3 != null){
						remove(textFieldIngredientsName3);
					}
					if(textFieldIngredientsName4 != null){
						remove(textFieldIngredientsName4);
					}
					if(textFieldIngredientsName5 != null){
						remove(textFieldIngredientsName5);
					}
					
					if(textFieldInstructions1 != null){
						remove(textFieldInstructions1);
					}
					if(textFieldInstructions2 != null){
						remove(textFieldInstructions2);
					}
					if(textFieldInstructions3 != null){
						remove(textFieldInstructions3);
					}
					if(textFieldInstructions4 != null){
						remove(textFieldInstructions4);
					}
					if(textFieldInstructions5 != null){
						remove(textFieldInstructions5);
					}
					
					if(jButton1 != null){
						remove(jButton1);
					}
					
					
					
					
					
					
					
					
					// contents of main frame
					
					rlabel = new JLabel("Select a Recipe");
					recipenames = new JComboBox(recipebook.getAllRecipes());
					recipenames.setSelectedIndex(-1);
					recipenames.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							JComboBox cb = (JComboBox) e.getSource();
							String recipename = (String) cb.getSelectedItem();
							// display the recipe
							//violation – controller!!
							// violation – low coupling!!
							// violation – high cohesion!!
							ArrayList < Recipe > recipes = recipebook.getAllRecipeObjects();
							for (Recipe r: recipes) {
								if (r.getRecipeName().equals(recipename)) {
									displayArea.setText(recipebook.printRecipe(r));

								}
							}
						}
					});
					displayArea = new JTextArea(20, 30);
					
					add(rlabel);
					add(recipenames);
					add(displayArea);
					
					System.out.println("I have selected display");
					
					break;
				case "Add":
					System.out.println("I have selected add");
					if(rlabel != null){
						remove(rlabel);
					}
					if(recipenames != null){
						remove(recipenames);
					}
					if(displayArea != null){
						remove(displayArea);
					}
					
					title = new JTextField("Title", 35);
					
					category = new JTextField("Category", 35);
					
					jButton1 = new JButton("Submit");
					
					jButton1.addActionListener(new ActionListener() {
					    public void actionPerformed(ActionEvent e)
					    {
					    	System.out.println("Title: " + title.getText());
					    	System.out.println("Category: " + category.getText());
					    	
					    	recipebook.createRecipe(title.getText(), category.getText());
					    	
//					    	recipebook.addIngredient(title.getText(), 1, UnitOfMeasure.tsp, "salt");
					    	//
					    	
					    	switch(numberOfIngredients){
					    	case 1:
					    		//textFieldIngredientsUnit1, textFieldIngredientsUOM1, textFieldIngredientsName1
					    		recipebook.addIngredient(title.getText(), Integer.parseInt(textFieldIngredientsUnit1.getText()), UnitOfMeasure.valueOf(textFieldIngredientsUOM1.getText()), textFieldIngredientsName1.getText());
					    		break;
					    	case 2:
					    		recipebook.addIngredient(title.getText(), Integer.parseInt(textFieldIngredientsUnit1.getText()), UnitOfMeasure.valueOf(textFieldIngredientsUOM1.getText()), textFieldIngredientsName1.getText());
					    		recipebook.addIngredient(title.getText(), Integer.parseInt(textFieldIngredientsUnit2.getText()), UnitOfMeasure.valueOf(textFieldIngredientsUOM2.getText()), textFieldIngredientsName2.getText());
					    		break;
					    	case 3:
					    		recipebook.addIngredient(title.getText(), Integer.parseInt(textFieldIngredientsUnit1.getText()), UnitOfMeasure.valueOf(textFieldIngredientsUOM1.getText()), textFieldIngredientsName1.getText());
					    		recipebook.addIngredient(title.getText(), Integer.parseInt(textFieldIngredientsUnit2.getText()), UnitOfMeasure.valueOf(textFieldIngredientsUOM2.getText()), textFieldIngredientsName2.getText());
					    		recipebook.addIngredient(title.getText(), Integer.parseInt(textFieldIngredientsUnit3.getText()), UnitOfMeasure.valueOf(textFieldIngredientsUOM3.getText()), textFieldIngredientsName3.getText());
					    		break;
					    	case 4:
					    		recipebook.addIngredient(title.getText(), Integer.parseInt(textFieldIngredientsUnit1.getText()), UnitOfMeasure.valueOf(textFieldIngredientsUOM1.getText()), textFieldIngredientsName1.getText());
					    		recipebook.addIngredient(title.getText(), Integer.parseInt(textFieldIngredientsUnit2.getText()), UnitOfMeasure.valueOf(textFieldIngredientsUOM2.getText()), textFieldIngredientsName2.getText());
					    		recipebook.addIngredient(title.getText(), Integer.parseInt(textFieldIngredientsUnit3.getText()), UnitOfMeasure.valueOf(textFieldIngredientsUOM3.getText()), textFieldIngredientsName3.getText());
					    		recipebook.addIngredient(title.getText(), Integer.parseInt(textFieldIngredientsUnit4.getText()), UnitOfMeasure.valueOf(textFieldIngredientsUOM4.getText()), textFieldIngredientsName4.getText());
					    		break;
					    	case 5:
					    		recipebook.addIngredient(title.getText(), Integer.parseInt(textFieldIngredientsUnit1.getText()), UnitOfMeasure.valueOf(textFieldIngredientsUOM1.getText()), textFieldIngredientsName1.getText());
					    		recipebook.addIngredient(title.getText(), Integer.parseInt(textFieldIngredientsUnit2.getText()), UnitOfMeasure.valueOf(textFieldIngredientsUOM2.getText()), textFieldIngredientsName2.getText());
					    		recipebook.addIngredient(title.getText(), Integer.parseInt(textFieldIngredientsUnit3.getText()), UnitOfMeasure.valueOf(textFieldIngredientsUOM3.getText()), textFieldIngredientsName3.getText());
					    		recipebook.addIngredient(title.getText(), Integer.parseInt(textFieldIngredientsUnit4.getText()), UnitOfMeasure.valueOf(textFieldIngredientsUOM4.getText()), textFieldIngredientsName4.getText());
					    		recipebook.addIngredient(title.getText(), Integer.parseInt(textFieldIngredientsUnit5.getText()), UnitOfMeasure.valueOf(textFieldIngredientsUOM5.getText()), textFieldIngredientsName5.getText());					    		
					    		break;
					    	}
					    	
					    	switch(numberOfInstructions){
					    	case 1:
					    		recipebook.addInstruction(title.getText(), textFieldInstructions1.getText());
					    		break;
					    	case 2:
					    		recipebook.addInstruction(title.getText(), textFieldInstructions1.getText());
					    		recipebook.addInstruction(title.getText(), textFieldInstructions2.getText());
					    		break;
					    	case 3:
					    		recipebook.addInstruction(title.getText(), textFieldInstructions1.getText());
					    		recipebook.addInstruction(title.getText(), textFieldInstructions2.getText());
					    		recipebook.addInstruction(title.getText(), textFieldInstructions3.getText());
					    		break;
					    	case 4:
					    		recipebook.addInstruction(title.getText(), textFieldInstructions1.getText());
					    		recipebook.addInstruction(title.getText(), textFieldInstructions2.getText());
					    		recipebook.addInstruction(title.getText(), textFieldInstructions3.getText());
					    		recipebook.addInstruction(title.getText(), textFieldInstructions4.getText());
					    		break;
					    	case 5:
					    		recipebook.addInstruction(title.getText(), textFieldInstructions1.getText());
					    		recipebook.addInstruction(title.getText(), textFieldInstructions2.getText());
					    		recipebook.addInstruction(title.getText(), textFieldInstructions3.getText());
					    		recipebook.addInstruction(title.getText(), textFieldInstructions4.getText());
					    		recipebook.addInstruction(title.getText(), textFieldInstructions5.getText());
					    		break;
					    	}
					    	
					    }
					});
					
					ingredientLabel = new JLabel("Select a Number of Ingredients");					
					ingredientsCounterSelectField = new JComboBox(counters);
					ingredientsCounterSelectField.setSelectedIndex(-1);
					ingredientsCounterSelectField.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							JComboBox cb = (JComboBox) e.getSource();
							String count = (String) cb.getSelectedItem();
							int countInt = Integer.parseInt(count);
							numberOfIngredients = countInt;
							//show those many fields

//							textFieldsIngredientsUnit = new JTextField[countInt];
//							textFieldsIngredientsUOM = new JTextField[countInt];
//							textFieldsIngredientsName = new JTextField[countInt];
							
							textFieldIngredientsUnit5 = new JTextField("1", 11);
							textFieldIngredientsUnit4 = new JTextField("1", 11);
							textFieldIngredientsUnit3 = new JTextField("1", 11);
							textFieldIngredientsUnit2 = new JTextField("1", 11);
							textFieldIngredientsUnit1 = new JTextField("1", 11);
							
							textFieldIngredientsUOM5 = new JTextField("units", 11);
							textFieldIngredientsUOM4 = new JTextField("units", 11);
							textFieldIngredientsUOM3 = new JTextField("units", 11);
							textFieldIngredientsUOM2 = new JTextField("units", 11);
							textFieldIngredientsUOM1 = new JTextField("units", 11);
							
							textFieldIngredientsName5 = new JTextField("name 5", 11);
							textFieldIngredientsName4 = new JTextField("name 4", 11);
							textFieldIngredientsName3 = new JTextField("name 3", 11);
							textFieldIngredientsName2 = new JTextField("name 2", 11);
							textFieldIngredientsName1 = new JTextField("name 1", 11);
							
							switch(countInt){
							case 5:	
								add(textFieldIngredientsUnit1);add(textFieldIngredientsUOM1);add(textFieldIngredientsName1);
								add(textFieldIngredientsUnit2);add(textFieldIngredientsUOM2);add(textFieldIngredientsName2);
								add(textFieldIngredientsUnit3);add(textFieldIngredientsUOM3);add(textFieldIngredientsName3);
								add(textFieldIngredientsUnit4);add(textFieldIngredientsUOM4);add(textFieldIngredientsName4);
								add(textFieldIngredientsUnit5);add(textFieldIngredientsUOM5);add(textFieldIngredientsName5);
								break;
							case 4:	
								add(textFieldIngredientsUnit1);add(textFieldIngredientsUOM1);add(textFieldIngredientsName1);
								add(textFieldIngredientsUnit2);add(textFieldIngredientsUOM2);add(textFieldIngredientsName2);
								add(textFieldIngredientsUnit3);add(textFieldIngredientsUOM3);add(textFieldIngredientsName3);
								add(textFieldIngredientsUnit4);add(textFieldIngredientsUOM4);add(textFieldIngredientsName4);
								break;
							case 3:	
								add(textFieldIngredientsUnit1);add(textFieldIngredientsUOM1);add(textFieldIngredientsName1);
								add(textFieldIngredientsUnit2);add(textFieldIngredientsUOM2);add(textFieldIngredientsName2);
								add(textFieldIngredientsUnit3);add(textFieldIngredientsUOM3);add(textFieldIngredientsName3);
								break;
							case 2:	
								add(textFieldIngredientsUnit1);add(textFieldIngredientsUOM1);add(textFieldIngredientsName1);
								add(textFieldIngredientsUnit2);add(textFieldIngredientsUOM2);add(textFieldIngredientsName2);
								break;
							case 1:	
								add(textFieldIngredientsUnit1);add(textFieldIngredientsUOM1);add(textFieldIngredientsName1);
								break;
							}
							
							revalidate();
							repaint();
						}
					});
					
					instructionLabel = new JLabel("Select a Number of Instructions");
					instructionsCounterSelectField = new JComboBox(counters);
					instructionsCounterSelectField.setSelectedIndex(-1);
					instructionsCounterSelectField.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							JComboBox cb = (JComboBox) e.getSource();
							String count = (String) cb.getSelectedItem();
							int countInt = Integer.parseInt(count);
							numberOfInstructions = countInt;
							
							textFieldInstructions5 = new JTextField("instruction 5", 35);
							textFieldInstructions4 = new JTextField("instruction 4", 35);
							textFieldInstructions3 = new JTextField("instruction 3", 35);
							textFieldInstructions2 = new JTextField("instruction 2", 35);
							textFieldInstructions1 = new JTextField("instruction 1", 35);
							
							switch(countInt){
							case 5:								
								add(textFieldInstructions1);add(textFieldInstructions2);add(textFieldInstructions3);add(textFieldInstructions4);add(textFieldInstructions5);
								break;
							case 4:
								add(textFieldInstructions1);add(textFieldInstructions2);add(textFieldInstructions3);add(textFieldInstructions4);
								break;
							case 3:
								add(textFieldInstructions1);add(textFieldInstructions2);add(textFieldInstructions3);
								break;
							case 2:
								add(textFieldInstructions1);add(textFieldInstructions2);
								break;
							case 1:
								add(textFieldInstructions1);
							}
//							textFieldsIngredientsUnit = new JTextField[5];
//							textFieldsIngredientsUOM = new JTextField[5];
//							textFieldsIngredientsName = new JTextField[5];
//							textFieldsInstructions = new JTextField[5];
							
							
							revalidate();
							repaint();
							
						}
					});
					
					add(jButton1);
					
					add(title);
					add(category);
					add(ingredientLabel);
					add(ingredientsCounterSelectField);
					add(instructionLabel);
					add(instructionsCounterSelectField);
					
					
					break;
				case "Modify":
					System.out.println("I have selected modify");
					
				}
				revalidate();
				repaint();
			}
		});
		add(operationSelectField);
		
		
		
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		RecipeBookFrame fr = new RecipeBookFrame();
		fr.setSize(400, 500);
		fr.setVisible(true);
	}
}