package ${package}

import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment

class ${name}Application : Application<${name}Configuration>() {

    override fun getName(): String {
        return "${name}"
    }

    override fun initialize(bootstrap: Bootstrap<${name}Configuration>) {
        // TODO: application initialization
    }

    override fun run(configuration: ${name}Configuration,
                     environment: Environment) {
        // TODO: implement application
    }
}

fun main(args: Array<String>) {
    ${name}Application().run(*args)
}

