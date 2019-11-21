package chronometre;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class main {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Table table;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			main window = new main();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(676, 579);
		shell.setText("SWT Application");
		shell.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_FOREGROUND));
		composite.setLayout(new GridLayout(2, false));
		
		Composite composite_1 = new Composite(composite, SWT.NONE);
		composite_1.setLayout(new GridLayout(3, false));
		GridData gd_composite_1 = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_composite_1.heightHint = 101;
		gd_composite_1.widthHint = 401;
		composite_1.setLayoutData(gd_composite_1);
		
		text = new Text(composite_1, SWT.BORDER);
		text.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text.setText("00");
		GridData gd_text = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_text.widthHint = 84;
		gd_text.heightHint = 104;
		text.setLayoutData(gd_text);
		
		text_1 = new Text(composite_1, SWT.BORDER);
		text_1.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_1.setText("00");
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		text_2 = new Text(composite_1, SWT.BORDER);
		text_2.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_2.setText("00");
		text_2.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		table = new Table(composite, SWT.BORDER | SWT.FULL_SELECTION);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2));
		table.setBounds(0, 0, 85, 45);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		Composite composite_2 = new Composite(composite, SWT.NONE);
		composite_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_FOREGROUND));
		GridData gd_composite_2 = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_composite_2.widthHint = 398;
		composite_2.setLayoutData(gd_composite_2);
		composite_2.setLayout(new GridLayout(3, false));
		
		Button btnStart = new Button(composite_2, SWT.NONE);
		btnStart.setImage(SWTResourceManager.getImage(main.class, "/com/sun/javafx/webkit/prism/resources/mediaPlayDisabled.png"));
		GridData gd_btnStart = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_btnStart.widthHint = 111;
		gd_btnStart.heightHint = 48;
		btnStart.setLayoutData(gd_btnStart);
		btnStart.setText("Start");
		
		Button btnRestart = new Button(composite_2, SWT.NONE);
		btnRestart.setImage(SWTResourceManager.getImage(main.class, "/org/eclipse/jface/action/images/stop@2x.png"));
		GridData gd_btnRestart = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_btnRestart.heightHint = 45;
		gd_btnRestart.widthHint = 105;
		btnRestart.setLayoutData(gd_btnRestart);
		btnRestart.setText("Restart");
		
		Button btnTour = new Button(composite_2, SWT.NONE);
		btnTour.setImage(SWTResourceManager.getImage(main.class, "/org/eclipse/jface/fieldassist/images/required_field_cue@2x.png"));
		GridData gd_btnTour = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_btnTour.heightHint = 46;
		gd_btnTour.widthHint = 102;
		btnTour.setLayoutData(gd_btnTour);
		btnTour.setText("Tour");
		new Label(composite_2, SWT.NONE);
		new Label(composite_2, SWT.NONE);
		new Label(composite_2, SWT.NONE);
		new Label(composite_2, SWT.NONE);
		new Label(composite_2, SWT.NONE);
		new Label(composite_2, SWT.NONE);
		
		Tree tree = new Tree(composite_2, SWT.BORDER);
		tree.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				System.out.println(e.stateMask);
//				e.stateMask
			}
		});
	
		GridData gd_tree = new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1);
		gd_tree.widthHint = 335;
		tree.setLayoutData(gd_tree);
		
		TreeItem trtmNewTreeitem = new TreeItem(tree, SWT.NONE);
		trtmNewTreeitem.setText("New TreeItem");
		
		TreeItem trtmNewTreeitem_1 = new TreeItem(trtmNewTreeitem, SWT.NONE);
		trtmNewTreeitem_1.setText("New TreeItem");
		
		TreeItem trtmNewTreeitem_2 = new TreeItem(trtmNewTreeitem, SWT.NONE);
		trtmNewTreeitem_2.setText("New TreeItem");
		trtmNewTreeitem.setExpanded(true);

	}
}
