# ModelViz
ModelViz is a prototype tool that automates the generation of visual analytics dashboard code for supply chain management applications. ModelViz consists of three parts:
1. A Metamodel created using Eclipse Modeling Framework (EMF).
2. An Eclipse Sirius graphical workbench for creating models that facilitates the interaction with the metamodel.
3. An Eclipse Acceleo Model-To-Text transformer that is a code template and creates dashboard codes from the model.

The ModelViz prototype is created as part of the DigiMat project at Østfold Univeristy College, Norway.

# Instruction to install and use the tool
1. Download and Install the Obeo Designer Package from https://www.obeodesigner.com/en/download.
2. Open the Obeo Designer.
3. Choose the Ecore viewpoint on the top-right hand side of the window.
4. Download all the files from the repository.
5. Open the Metamodel and the Acceleo files from the file menu.
6. Running the metamodel from the 'Run as Eclipse Application' menu will open the Sirius workbench.
7. Within the workbench file menu open the Sirius file downloaded from the repository.
8. Create your desired visualization model using the toolkit in the right hand side of the workbench.
9. Right click on the model and go to 'Acceleo Model To Text' option and press 'Generate Dashboard Code'.
10. Open the generated file in a browser to see the dashboard.
