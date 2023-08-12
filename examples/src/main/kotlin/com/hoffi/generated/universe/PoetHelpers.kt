package com.hoffi.generated.universe

import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.statements.InsertStatement

object PoetHelpers {
    fun <T : Table> insertCompose(vararg insertStatements: T.(InsertStatement<Number>) -> Unit): T.(InsertStatement<Number>) -> Unit {
        return {
            for (insertStatement in insertStatements) {
                insertStatement.invoke(this, it)
            }
        }
    }
}
