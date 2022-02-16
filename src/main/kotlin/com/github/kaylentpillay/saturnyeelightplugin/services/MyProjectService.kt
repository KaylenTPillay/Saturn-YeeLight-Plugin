package com.github.kaylentpillay.saturnyeelightplugin.services

import com.intellij.openapi.project.Project
import com.github.kaylentpillay.saturnyeelightplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
