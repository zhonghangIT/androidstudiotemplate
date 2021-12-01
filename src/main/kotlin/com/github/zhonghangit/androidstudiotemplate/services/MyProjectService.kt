package com.github.zhonghangit.androidstudiotemplate.services

import com.intellij.openapi.project.Project
import com.github.zhonghangit.androidstudiotemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
