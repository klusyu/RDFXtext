/*
 * generated by Xtext 2.32.0.M3
 */
package org.xtext.example.mydsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.example.mydsl.rDFTurtle.TurtleDoc
import java.nio.file.Files
import java.nio.file.Paths
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import java.io.FileWriter
import org.xtext.example.mydsl.generator.RDFTurtleGenerator

@ExtendWith(InjectionExtension)
@InjectWith(RDFTurtleInjectorProvider)
class RDFTurtleParsingTest {
	@Inject
	ParseHelper<TurtleDoc> parseHelper
	
	
	
	@Test
	def void loadModel() {
		val outpath = "C:\\source\\Xtext_workspace\\RDFXtext\\data\\turtle_out.xmi"
		val content = new String(Files.readAllBytes(Paths.get("C:\\source\\Xtext_workspace\\RDFXtext\\data\\PatientOnto_latest_24_11.turtle")));
		val result = parseHelper.parse(content)
		if (result !== null) {
			var errors = result.eResource.errors
			if (errors.isEmpty()) {
				val fsa = new InMemoryFileSystemAccess()
    			new RDFTurtleGenerator().doGenerate(result.eResource, fsa, null)
    			var files = fsa.getAllFiles()
    			var keys = files.keySet()
    			for	(key : keys) {
    				var writer = new FileWriter(outpath, false)
    				var str = files.get(key) as String
    				writer.write(str)
    				writer.close()
    			}
			}
			for (error : errors) {
				print(error + "\r\n")
			}
			Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: ?errors.join(", ")?''')
		}
	}
}
