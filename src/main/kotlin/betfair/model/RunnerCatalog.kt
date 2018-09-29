package betfair.model

data class RunnerCatalog internal constructor(
		val selectionId: Long,
		val runnerName: String,
		val handicap: Double,
		val sortPriority: Int,
		val metadata: Map<String, String>? = null)
