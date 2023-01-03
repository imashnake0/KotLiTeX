package preamble

import core.Command

/**
 * ```LaTeX
 * \documentclass[⟨main-option-list⟩]{⟨class⟩}[⟨version⟩]
 * ```
 * There must be exactly one such declaration, and it must come first. The ⟨main-option-list⟩ is a list of options which
 * can modify the formatting of elements which are defined in the ⟨class⟩ file as well as in all following `\usepackage`
 * declarations (see below). The ⟨version⟩ is a version number, beginning with a date in the format `YYYY/MM/DD`. If an
 * older version of the class is found, a warning is issued.
 */
@Preamble
class DocumentClass : Command(name = "documentclass") {
    fun documentClass() {

    }
}
