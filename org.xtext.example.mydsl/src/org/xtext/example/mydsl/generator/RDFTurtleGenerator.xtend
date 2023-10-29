/*
 * generated by Xtext 2.32.0.M3
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl.rDFTurtle.TurtleDoc
import org.xtext.example.mydsl.rDFTurtle.Directive
import org.xtext.example.mydsl.rDFTurtle.Triples

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class RDFTurtleGenerator extends AbstractGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		// print("Generate:" + resource.className + ".xmi\r\n")
		var path = "rdf_example.xmi"
		fsa.generateFile(path, toXMI(resource.contents.head as TurtleDoc))
	}
	
	protected def String toXMI(TurtleDoc doc) {
		return'''
		<?xml version="1.0" encoding="UTF-8"?>
		<rdf:TurtleDoc xmi:version="2.0" 
			xmlns:xmi="http://www.omg.org/XMI" 
			xmlns:rml="http://www.xtext.org/example/rdf/RDFTurtle">
			«FOR s : doc.statements»
				«IF s.directive !== null»
					«s.directive.generateNamespace»
				«ELSEIF s.triples !== null»
					«s.triples.generateTriple»
				«ENDIF»
			«ENDFOR»
		</rdf:TurtleDoc>
		'''
	}
	//这里应该把Turtle模型转换为RDF模型，这样在ATL中会容易操作一些
	protected def generateNamespace(Directive ns) {
		var ePrefix = ""
		var eIRI = ""
		var prefix = "";
		var iri = "";
		if (ns.prefix !== null) {
			if (ns.prefix.prefixName !== null) {
				prefix = ns.prefix.prefixName
				ePrefix = ''' prefix="«prefix»"'''
			}
			iri = ns.prefix.iriref
			eIRI = ''' iri="«iri»"'''
		}
		else if (ns.base !== null) {
			prefix = "base"
			iri = ns.base.iriref
			eIRI = ''' base="«iri»"'''
		}
		// NAMESPACE.NSMappingPut(prefix, iri)
		var result = '''<directives«ePrefix»«eIRI»/>'''
		//print(result + "\r\n")
		return result
	}
	
	protected def generateTriple(Triples triples) {
		var subject = triples.subject
		for (po: triples.predicateObjectList.predicateObjects) {
			
		}
	}
}
