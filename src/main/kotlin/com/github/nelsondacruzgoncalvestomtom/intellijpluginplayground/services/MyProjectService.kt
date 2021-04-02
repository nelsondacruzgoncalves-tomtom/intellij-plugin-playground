package com.github.nelsondacruzgoncalvestomtom.intellijpluginplayground.services

import com.github.nelsondacruzgoncalvestomtom.intellijpluginplayground.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
