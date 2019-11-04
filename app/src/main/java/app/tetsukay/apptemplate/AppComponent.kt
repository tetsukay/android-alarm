package app.tetsukay.apptemplate

import dagger.BindsInstance
import dagger.Component

@Component
interface AppComponent {

    @Component.Builder
    interface Builder {
        fun build(): AppComponent

        @BindsInstance
        fun application(application: App): Builder

    }
}