import dev.deftu.gradle.utils.GameSide
import dev.deftu.gradle.utils.VersionType

plugins {
    id("java")
    id("dev.deftu.gradle.tools") version("2.34.0")
    id("dev.deftu.gradle.tools.resources") version("2.34.0")
    id("dev.deftu.gradle.tools.bloom") version("2.34.0")
    id("dev.deftu.gradle.tools.shadow") version("2.34.0")
    id("dev.deftu.gradle.tools.minecraft.loom") version("2.34.0")
    id("dev.deftu.gradle.tools.minecraft.releases") version("2.34.0")
}

toolkitLoomHelper {
    useDevAuth("1.2.1")

    disableRunConfigs(GameSide.SERVER)
}

toolkitReleases {
    versionType = VersionType.RELEASE

    modrinth {
        projectId.set("${modData.id}-smm")
    }
}