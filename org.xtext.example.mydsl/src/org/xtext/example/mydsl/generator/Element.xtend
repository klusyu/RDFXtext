package org.xtext.example.mydsl.generator

import java.util.List

class Element {
    String type;
    List<Attribute> attributes;
    List<Element> children;
    
    new() {
    	attributes = newArrayList()
    	children = newArrayList()
    }
    
    new(String t) {
    	type = t
    	attributes = newArrayList()
    	children = newArrayList()
    }

	def setType(String t) {
		if (this.type !== null) {
			println("-----error:"+type+"------")
		}
		this.type = t
	}
    
    def addElement(Element e) {
    	children.add(e)
    }
    
    def addElements(List<Element> le) {
    	children.addAll(le)
    }
    
    def addAttribute(String name, String value) {
    	attributes.add(new Attribute(name, value))
    }

    def String toXMI(String tab) {
        val xml = new StringBuilder()
        xml.append(tab + '<' + type)
        attributes.forEach[attr | xml.append(' ' + attr.name + '="' + attr.value + '"')]
        if (children.empty) {
            xml.append('/>\n')
        } else {
            xml.append('>\n')
            children.forEach[child | xml.append(child.toXMI(tab + "\t"))]
            xml.append(tab + '</' + type + '>\n')
        }
        return xml.toString
    }
}

class Attribute {
    public String name;
    public String value;
    
    new(String name, String value) {
        this.name = name
        this.value = value
    }
}
