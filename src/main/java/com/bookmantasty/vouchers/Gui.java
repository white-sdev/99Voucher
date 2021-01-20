/*
 *  Filename:  Gui.java
 *  Creation Date:  Oct 15, 2020
 *  Purpose:   
 *  Author:    
 * 
 *  *** Creative Commons Attribution 4.0 International Public License ***
 *  Web Version: https://creativecommons.org/licenses/by/4.0/legalcode
 * 
 * By exercising the Licensed Rights (defined below), You accept and agree to be bound by the terms and conditions of this Creative Commons Attribution 4.0 International Public License ("Public License"). To the extent this Public License may be interpreted as a contract, You are granted the Licensed Rights in consideration of Your acceptance of these terms and conditions, and the Licensor grants You such rights in consideration of benefits the Licensor receives from making the Licensed Material available under these terms and conditions.
 * 
 * Section 1 – Definitions.
 * 
 * Adapted Material means material subject to Copyright and Similar Rights that is derived from or based upon the Licensed Material and in which the Licensed Material is translated, altered, arranged, transformed, or otherwise modified in a manner requiring permission under the Copyright and Similar Rights held by the Licensor. For purposes of this Public License, where the Licensed Material is a musical work, performance, or sound recording, Adapted Material is always produced where the Licensed Material is synched in timed relation with a moving image.
 * Adapter's License means the license You apply to Your Copyright and Similar Rights in Your contributions to Adapted Material in accordance with the terms and conditions of this Public License.
 * Copyright and Similar Rights means copyright and/or similar rights closely related to copyright including, without limitation, performance, broadcast, sound recording, and Sui Generis Database Rights, without regard to how the rights are labeled or categorized. For purposes of this Public License, the rights specified in Section 2(b)(1)-(2) are not Copyright and Similar Rights.
 * Effective Technological Measures means those measures that, in the absence of proper authority, may not be circumvented under laws fulfilling obligations under Article 11 of the WIPO Copyright Treaty adopted on December 20, 1996, and/or similar international agreements.
 * Exceptions and Limitations means fair use, fair dealing, and/or any other exception or limitation to Copyright and Similar Rights that applies to Your use of the Licensed Material.
 * Licensed Material means the artistic or literary work, database, or other material to which the Licensor applied this Public License.
 * Licensed Rights means the rights granted to You subject to the terms and conditions of this Public License, which are limited to all Copyright and Similar Rights that apply to Your use of the Licensed Material and that the Licensor has authority to license.
 * Licensor means the individual(s) or entity(ies) granting rights under this Public License.
 * Share means to provide material to the public by any means or process that requires permission under the Licensed Rights, such as reproduction, public display, public performance, distribution, dissemination, communication, or importation, and to make material available to the public including in ways that members of the public may access the material from a place and at a time individually chosen by them.
 * Sui Generis Database Rights means rights other than copyright resulting from Directive 96/9/EC of the European Parliament and of the Council of 11 March 1996 on the legal protection of databases, as amended and/or succeeded, as well as other essentially equivalent rights anywhere in the world.
 * You means the individual or entity exercising the Licensed Rights under this Public License. Your has a corresponding meaning.
 * Section 2 – Scope.
 * 
 * License grant.
 * Subject to the terms and conditions of this Public License, the Licensor hereby grants You a worldwide, royalty-free, non-sublicensable, non-exclusive, irrevocable license to exercise the Licensed Rights in the Licensed Material to:
 * reproduce and Share the Licensed Material, in whole or in part; and
 * produce, reproduce, and Share Adapted Material.
 * Exceptions and Limitations. For the avoidance of doubt, where Exceptions and Limitations apply to Your use, this Public License does not apply, and You do not need to comply with its terms and conditions.
 * Term. The term of this Public License is specified in Section 6(a).
 * Media and formats; technical modifications allowed. The Licensor authorizes You to exercise the Licensed Rights in all media and formats whether now known or hereafter created, and to make technical modifications necessary to do so. The Licensor waives and/or agrees not to assert any right or authority to forbid You from making technical modifications necessary to exercise the Licensed Rights, including technical modifications necessary to circumvent Effective Technological Measures. For purposes of this Public License, simply making modifications authorized by this Section 2(a)(4) never produces Adapted Material.
 * Downstream recipients.
 * Offer from the Licensor – Licensed Material. Every recipient of the Licensed Material automatically receives an offer from the Licensor to exercise the Licensed Rights under the terms and conditions of this Public License.
 * No downstream restrictions. You may not offer or impose any additional or different terms or conditions on, or apply any Effective Technological Measures to, the Licensed Material if doing so restricts exercise of the Licensed Rights by any recipient of the Licensed Material.
 * No endorsement. Nothing in this Public License constitutes or may be construed as permission to assert or imply that You are, or that Your use of the Licensed Material is, connected with, or sponsored, endorsed, or granted official status by, the Licensor or others designated to receive attribution as provided in Section 3(a)(1)(A)(i).
 * Other rights.
 * 
 * Moral rights, such as the right of integrity, are not licensed under this Public License, nor are publicity, privacy, and/or other similar personality rights; however, to the extent possible, the Licensor waives and/or agrees not to assert any such rights held by the Licensor to the limited extent necessary to allow You to exercise the Licensed Rights, but not otherwise.
 * Patent and trademark rights are not licensed under this Public License.
 * To the extent possible, the Licensor waives any right to collect royalties from You for the exercise of the Licensed Rights, whether directly or through a collecting society under any voluntary or waivable statutory or compulsory licensing scheme. In all other cases the Licensor expressly reserves any right to collect such royalties.
 * Section 3 – License Conditions.
 * 
 * Your exercise of the Licensed Rights is expressly made subject to the following conditions.
 * 
 * Attribution.
 * 
 * If You Share the Licensed Material (including in modified form), You must:
 * 
 * retain the following if it is supplied by the Licensor with the Licensed Material:
 * identification of the creator(s) of the Licensed Material and any others designated to receive attribution, in any reasonable manner requested by the Licensor (including by pseudonym if designated);
 * a copyright notice;
 * a notice that refers to this Public License;
 * a notice that refers to the disclaimer of warranties;
 * a URI or hyperlink to the Licensed Material to the extent reasonably practicable;
 * indicate if You modified the Licensed Material and retain an indication of any previous modifications; and
 * indicate the Licensed Material is licensed under this Public License, and include the text of, or the URI or hyperlink to, this Public License.
 * You may satisfy the conditions in Section 3(a)(1) in any reasonable manner based on the medium, means, and context in which You Share the Licensed Material. For example, it may be reasonable to satisfy the conditions by providing a URI or hyperlink to a resource that includes the required information.
 * If requested by the Licensor, You must remove any of the information required by Section 3(a)(1)(A) to the extent reasonably practicable.
 * If You Share Adapted Material You produce, the Adapter's License You apply must not prevent recipients of the Adapted Material from complying with this Public License.
 * Section 4 – Sui Generis Database Rights.
 * 
 * Where the Licensed Rights include Sui Generis Database Rights that apply to Your use of the Licensed Material:
 * 
 * for the avoidance of doubt, Section 2(a)(1) grants You the right to extract, reuse, reproduce, and Share all or a substantial portion of the contents of the database;
 * if You include all or a substantial portion of the database contents in a database in which You have Sui Generis Database Rights, then the database in which You have Sui Generis Database Rights (but not its individual contents) is Adapted Material; and
 * You must comply with the conditions in Section 3(a) if You Share all or a substantial portion of the contents of the database.
 * For the avoidance of doubt, this Section 4 supplements and does not replace Your obligations under this Public License where the Licensed Rights include other Copyright and Similar Rights.
 * Section 5 – Disclaimer of Warranties and Limitation of Liability.
 * 
 * Unless otherwise separately undertaken by the Licensor, to the extent possible, the Licensor offers the Licensed Material as-is and as-available, and makes no representations or warranties of any kind concerning the Licensed Material, whether express, implied, statutory, or other. This includes, without limitation, warranties of title, merchantability, fitness for a particular purpose, non-infringement, absence of latent or other defects, accuracy, or the presence or absence of errors, whether or not known or discoverable. Where disclaimers of warranties are not allowed in full or in part, this disclaimer may not apply to You.
 * To the extent possible, in no event will the Licensor be liable to You on any legal theory (including, without limitation, negligence) or otherwise for any direct, special, indirect, incidental, consequential, punitive, exemplary, or other losses, costs, expenses, or damages arising out of this Public License or use of the Licensed Material, even if the Licensor has been advised of the possibility of such losses, costs, expenses, or damages. Where a limitation of liability is not allowed in full or in part, this limitation may not apply to You.
 * The disclaimer of warranties and limitation of liability provided above shall be interpreted in a manner that, to the extent possible, most closely approximates an absolute disclaimer and waiver of all liability.
 * Section 6 – Term and Termination.
 * 
 * This Public License applies for the term of the Copyright and Similar Rights licensed here. However, if You fail to comply with this Public License, then Your rights under this Public License terminate automatically.
 * Where Your right to use the Licensed Material has terminated under Section 6(a), it reinstates:
 * 
 * automatically as of the date the violation is cured, provided it is cured within 30 days of Your discovery of the violation; or
 * upon express reinstatement by the Licensor.
 * For the avoidance of doubt, this Section 6(b) does not affect any right the Licensor may have to seek remedies for Your violations of this Public License.
 * For the avoidance of doubt, the Licensor may also offer the Licensed Material under separate terms or conditions or stop distributing the Licensed Material at any time; however, doing so will not terminate this Public License.
 * Sections 1, 5, 6, 7, and 8 survive termination of this Public License.
 * Section 7 – Other Terms and Conditions.
 * 
 * The Licensor shall not be bound by any additional or different terms or conditions communicated by You unless expressly agreed.
 * Any arrangements, understandings, or agreements regarding the Licensed Material not stated herein are separate from and independent of the terms and conditions of this Public License.
 * Section 8 – Interpretation.
 * 
 * For the avoidance of doubt, this Public License does not, and shall not be interpreted to, reduce, limit, restrict, or impose conditions on any use of the Licensed Material that could lawfully be made without permission under this Public License.
 * To the extent possible, if any provision of this Public License is deemed unenforceable, it shall be automatically reformed to the minimum extent necessary to make it enforceable. If the provision cannot be reformed, it shall be severed from this Public License without affecting the enforceability of the remaining terms and conditions.
 * No term or condition of this Public License will be waived and no failure to comply consented to unless expressly agreed to by the Licensor.
 * Nothing in this Public License constitutes or may be interpreted as a limitation upon, or waiver of, any privileges and immunities that apply to the Licensor or You, including from the legal processes of any jurisdiction or authority.
 * Creative Commons is not a party to its public licenses. Notwithstanding, Creative Commons may elect to apply one of its public licenses to material it publishes and in those instances will be considered the “Licensor.” The text of the Creative Commons public licenses is dedicated to the public domain under the CC0 Public Domain Dedication. Except for the limited purpose of indicating that material is shared under a Creative Commons public license or as otherwise permitted by the Creative Commons policies published at creativecommons.org/policies, Creative Commons does not authorize the use of the trademark “Creative Commons” or any other trademark or logo of Creative Commons without its prior written consent including, without limitation, in connection with any unauthorized modifications to any of its public licenses or any other arrangements, understandings, or agreements concerning use of licensed material. For the avoidance of doubt, this paragraph does not form part of the public licenses.
 * 
 * Creative Commons may be contacted at creativecommons.org.
 */
package com.bookmantasty.vouchers;

import java.awt.EventQueue;
import java.io.File;
import java.io.IOException;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Gui {

    private JFrame frmvouchersGeneradorDe;
    //creamos las variables para manejar el png y el csv
    String archIMG = null;
    String archCSV = null;
    String salCSV = null;
    String rdyI = "No seleccionado";
    String rdyC = "No seleccionado";
    BufferedImage prevIMG;
    private JTextField ingUX;
    private JTextField ingUY;
    private JTextField ingCX;
    private JTextField ingCY;
    int perUX = 270;
    int perUY = 150;
    int perCX = 270;
    int perCY = 300;
    String fuePER = "Calibri";
    int fueTAM = 62;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    Gui window = new Gui();
		    window.frmvouchersGeneradorDe.setVisible(true);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
    }

    /**
     * Create the application.
     */
    public Gui() {
	initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    public void initialize() {
	frmvouchersGeneradorDe = new JFrame();
	frmvouchersGeneradorDe.setTitle("99Vouchers Generador de Fichas");
	frmvouchersGeneradorDe.setBounds(100, 100, 718, 502);
	frmvouchersGeneradorDe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	//cargamos las fuentes l combo box
	GraphicsEnvironment graphEnviron
		= GraphicsEnvironment.getLocalGraphicsEnvironment();
	Font[] fuentes = graphEnviron.getAllFonts();

	JPanel MenuGEN = new JPanel();
	frmvouchersGeneradorDe.getContentPane().add(MenuGEN, BorderLayout.SOUTH);
	MenuGEN.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

	JPanel panel_3 = new JPanel();
	MenuGEN.add(panel_3);

	JLabel lblNewLabel = new JLabel("Tama\u00F1o en pixeles");
	panel_3.add(lblNewLabel);

	JPanel panel_2 = new JPanel();
	MenuGEN.add(panel_2);

	JLabel lblNewLabel_1 = new JLabel("Alto");
	panel_2.add(lblNewLabel_1);

	JLabel cordY = new JLabel("000");
	panel_2.add(cordY);

	JLabel lblNewLabel_3 = new JLabel("Ancho");
	panel_2.add(lblNewLabel_3);

	JLabel cordX = new JLabel("000");
	panel_2.add(cordX);

	JButton genV = new JButton("Generar Fichas");
	genV.setAlignmentX(Component.CENTER_ALIGNMENT);
	genV.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		selDIR();
		generarIMG();
		System.out.println(salCSV);

	    }
	});

	JPanel panel = new JPanel();
	MenuGEN.add(panel);

	JLabel lblNewLabel_7 = new JLabel("Posicion del cursor");
	panel.add(lblNewLabel_7);

	JPanel panel_1 = new JPanel();
	MenuGEN.add(panel_1);

	JLabel lblNewLabel_14 = new JLabel("X");
	panel_1.add(lblNewLabel_14);

	JLabel corRX = new JLabel("0");
	panel_1.add(corRX);

	JLabel lblNewLabel_16 = new JLabel("Y");
	panel_1.add(lblNewLabel_16);

	JLabel corRY = new JLabel("0");
	panel_1.add(corRY);
	MenuGEN.add(genV);

	JButton actuFICH = new JButton("Actualizar");
	JComboBox fonSEL = new JComboBox(fuentes);

	JPanel MenuCarga = new JPanel();
	frmvouchersGeneradorDe.getContentPane().add(MenuCarga, BorderLayout.NORTH);

	JLabel lblSEL = new JLabel(rdyI);
	lblSEL.setForeground(Color.red);
	JLabel lblCSV = new JLabel(rdyC);
	lblCSV.setForeground(Color.red);
	JSlider tamSEL = new JSlider();

	JLabel wIcon = new JLabel(new ImageIcon());
	wIcon.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent e) {
		if (prevIMG != null) {
		    int coimgx = e.getX();
		    int coimgy = e.getY();
		    corRX.setText(coimgx + "");
		    corRY.setText(coimgy + "");

		}

	    }
	});

	JButton loadIMG = new JButton("Cargar Plantilla");
	loadIMG.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		cargarIMG();
		lblSEL.setText(rdyI);
		lblSEL.setForeground(Color.BLUE);
		try {
		    prevIMG = PngGen.imgGENP(archIMG, perUX, perUY, perCX, perCY, fuePER, fueTAM);
		} catch (IOException e1) {
		    // TODO Auto-generated catch block
		    e1.printStackTrace();
		}
		int ancho = prevIMG.getWidth();
		int largo = prevIMG.getHeight();
		cordX.setText(ancho + "");
		cordY.setText(largo + "");
		ImageIcon preICO = new ImageIcon(prevIMG);
		wIcon.setIcon(preICO);

		//activamos el menu de edicion
		ingUX.setEnabled(true);
		ingUY.setEnabled(true);
		ingCX.setEnabled(true);
		ingCY.setEnabled(true);
		fonSEL.setEnabled(true);
		actuFICH.setEnabled(true);
		tamSEL.setEnabled(true);

	    }
	});

	JButton loadCSV = new JButton("Cargar Usuarios");
	loadCSV.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		cargarCSV();
		lblCSV.setText(rdyC);
		lblCSV.setForeground(Color.blue);
	    }
	});

	MenuCarga.add(loadIMG);
	MenuCarga.add(lblSEL);
	MenuCarga.add(loadCSV);
	MenuCarga.add(lblCSV);

	JPanel visPREP = new JPanel();
	visPREP.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
	frmvouchersGeneradorDe.getContentPane().add(visPREP, BorderLayout.CENTER);

	visPREP.add(wIcon);

	JPanel MenuPER = new JPanel();
	frmvouchersGeneradorDe.getContentPane().add(MenuPER, BorderLayout.EAST);
	MenuPER.setLayout(new GridLayout(0, 1, 0, 0));

	JLabel lblNewLabel_2 = new JLabel("\u00A0\u00A0Personalizar");
	lblNewLabel_2.setPreferredSize(new Dimension(40, 14));
	lblNewLabel_2.setMinimumSize(new Dimension(40, 14));
	lblNewLabel_2.setMaximumSize(new Dimension(40, 14));
	MenuPER.add(lblNewLabel_2);

	JLabel lblNewLabel_4 = new JLabel("\u00A0\u00A0Posici\u00F3n Usuario");
	MenuPER.add(lblNewLabel_4);

	JPanel perPU = new JPanel();
	MenuPER.add(perPU);

	JLabel lblNewLabel_8 = new JLabel("X");
	perPU.add(lblNewLabel_8);

	ingUX = new JTextField();
	ingUX.setEnabled(false);
	ingUX.setText(perUX + "");
	perPU.add(ingUX);
	ingUX.setColumns(3);

	JLabel lblNewLabel_9 = new JLabel("Y");
	perPU.add(lblNewLabel_9);

	ingUY = new JTextField();
	ingUY.setEnabled(false);
	ingUY.setText(perUY + "");
	perPU.add(ingUY);
	ingUY.setColumns(3);

	JLabel lblNewLabel_5 = new JLabel("\u00A0\u00A0Posici\u00F3n Contrase\u00F1a \u00A0\u00A0");
	MenuPER.add(lblNewLabel_5);

	JPanel perPC = new JPanel();
	MenuPER.add(perPC);

	JLabel lblNewLabel_10 = new JLabel("X");
	perPC.add(lblNewLabel_10);

	ingCX = new JTextField();
	ingCX.setEnabled(false);
	ingCX.setText(perCX + "");
	perPC.add(ingCX);
	ingCX.setColumns(3);

	JLabel lblNewLabel_11 = new JLabel("Y");
	perPC.add(lblNewLabel_11);

	ingCY = new JTextField();
	ingCY.setEnabled(false);
	ingCY.setText(perCY + "");
	perPC.add(ingCY);
	ingCY.setColumns(3);

	JLabel lblNewLabel_6 = new JLabel("\u00A0\u00A0Fuente");
	MenuPER.add(lblNewLabel_6);

	JPanel perFU = new JPanel();
	MenuPER.add(perFU);

	fonSEL.setEnabled(false);
	fonSEL.setPreferredSize(new Dimension(120, 20));
	fonSEL.setRenderer(new DefaultListCellRenderer() {
	    @Override
	    public Component getListCellRendererComponent(JList<?> list,
		    Object value, int index, boolean isSelected, boolean cellHasFocus) {
		if (value != null) {
		    Font font = (Font) value;
		    value = font.getName();
		}
		return super.getListCellRendererComponent(list, value, index,
			isSelected, cellHasFocus);
	    }
	});
	perFU.add(fonSEL);

	JLabel lblNewLabel_12 = new JLabel("\u00A0\u00A0Tama\u00F1o");
	MenuPER.add(lblNewLabel_12);

	JPanel peTA = new JPanel();
	MenuPER.add(peTA);

	JLabel lblTAM = new JLabel(fueTAM + "");

	tamSEL.setEnabled(false);
	tamSEL.setMaximum(99);
	tamSEL.addChangeListener(new ChangeListener() {
	    public void stateChanged(ChangeEvent e) {
		fueTAM = tamSEL.getValue();
		lblTAM.setText(fueTAM + "");

	    }
	});
	tamSEL.setValue(62);
	tamSEL.setMinimum(5);
	tamSEL.setPreferredSize(new Dimension(100, 26));
	peTA.add(tamSEL);

	peTA.add(lblTAM);

	JLabel lblNewLabel_13 = new JLabel("\u00A0\u00A0");
	MenuPER.add(lblNewLabel_13);

	JPanel perCO = new JPanel();
	MenuPER.add(perCO);

	actuFICH.setEnabled(false);
	actuFICH.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {

		perUX = Integer.parseInt(ingUX.getText());
		perUY = Integer.parseInt(ingUY.getText());
		perCX = Integer.parseInt(ingCX.getText());
		perCY = Integer.parseInt(ingCY.getText());

		String fueTEM = fonSEL.getSelectedItem().toString();
		String[] fueREC = fueTEM.split(",");
		fuePER = fueREC[1].replace("name=", "");

		fueTAM = tamSEL.getValue();

		try {
		    prevIMG = PngGen.imgGENP(archIMG, perUX, perUY, perCX, perCY, fuePER, fueTAM);
		} catch (IOException e1) {
		    // TODO Auto-generated catch block
		    e1.printStackTrace();
		}
		int ancho = prevIMG.getWidth();
		int largo = prevIMG.getHeight();
		cordX.setText(ancho + "");
		cordY.setText(largo + "");
		ImageIcon preICO = new ImageIcon(prevIMG);
		wIcon.setIcon(preICO);
		System.out.println(fuePER);
	    }

	});
	MenuPER.add(actuFICH);

    }

    private void cargarIMG() {

	JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
	jfc.setDialogTitle("Selecciona plantilla");
	jfc.setAcceptAllFileFilterUsed(false);
	FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagenes PNG y GIF", "png", "gif");
	jfc.addChoosableFileFilter(filtro);

	int returnValue = jfc.showOpenDialog(null);
	// int returnValue = jfc.showSaveDialog(null); esta linea la utilizaremos en caso de querer grabar archivos

	if (returnValue == JFileChooser.APPROVE_OPTION) {
	    File selectedFile = jfc.getSelectedFile();
	    archIMG = selectedFile.getAbsolutePath();
	    rdyI = "Seleccionado";
	}

    }

    private void cargarCSV() {

	JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
	jfc.setDialogTitle("Selecciona CSV de User Manager");
	jfc.setAcceptAllFileFilterUsed(false);
	FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos CSV", "CSV");
	jfc.addChoosableFileFilter(filtro);

	int returnValue = jfc.showOpenDialog(null);
	// int returnValue = jfc.showSaveDialog(null); esta linea la utilizaremos en caso de querer grabar archivos

	if (returnValue == JFileChooser.APPROVE_OPTION) {
	    File selectedFile = jfc.getSelectedFile();
	    archCSV = selectedFile.getAbsolutePath();
	    rdyC = "Seleccionado";
	}
    }

    private void selDIR() {

	JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
	jfc.setDialogTitle("Elija un directorio para guardar su archivo");
	jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	//jfc.setAcceptAllFileFilterUsed(false);
	//FileNameExtensionFilter filtro = new FileNameExtensionFilter("Selecciona directorio", "PNG");
	//jfc.addChoosableFileFilter(filtro);

	int returnValue = jfc.showSaveDialog(null);
	// int returnValue = jfc.showSaveDialog(null); esta linea la utilizaremos en caso de querer grabar archivos

	if (returnValue == JFileChooser.APPROVE_OPTION) {
	    File selectedFile = jfc.getSelectedFile();
	    salCSV = selectedFile.getAbsolutePath();
	}

    }

    private void generarIMG() {
	if (archIMG != null && archCSV != null && salCSV != null) {

	    PngGen.csvRead(archIMG, archCSV, salCSV, perUX, perUY, perCX, perCY, fuePER, fueTAM);
	} else {
	    JOptionPane.showMessageDialog(null, "No se han seleccionado los archivos o directorio de salida", "Error", JOptionPane.ERROR_MESSAGE);
	}

    }
}
