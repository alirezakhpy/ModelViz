# ModelViz
ModelViz a prototype tool that automates the generation of visual analytics dashboard code. ModelVis consists of three parts:
1. A Metamodel created using Eclipse Modeling Framework (EMF).
2. An Eclipse Sirius graphical workbench for creating models that facilitates the interaction with the metamodel.
3. An Eclipse Acceleo Model-To-Text transformer that is a code template and create dashboard codes from the model.

THe ModelVis is created as part of the PhD project at Østfold Univeristy College, NORWAY.

# Instruction to install and use the tool
1. Download and Install the Obeo Designer Package from https://www.obeodesigner.com/en/download.
2. Choose the Ecore viepoint on the top-right hand side of the window.
3. Download all the files from the repository.
4. Open the Metamodel and and the Acceleo files from the file menu.
5. Running the metamodel from the run menu will open the Sirius workbench.
6. Within the workbench file menu open the Sirius file downloaded from the repository.
7. Create your desired model using the toolkit in the right hand side of the workbench.
8. Right click on the model and press 'Generate dashboard code'.
9. Open the generated file in a browser to see the dashboard.
