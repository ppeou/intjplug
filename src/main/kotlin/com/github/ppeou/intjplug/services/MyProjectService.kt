package com.github.ppeou.intjplug.services

import com.github.ppeou.intjplug.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
