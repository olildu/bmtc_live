package app.chalo.onboarding.di;

import app.chalo.onboarding.languageselection.splitinstallhandler.AndroidSplitInstallHandler;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import defpackage.i71;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class SharedOnboardingModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$1 implements Function2<Scope, ParametersHolder, AndroidSplitInstallHandler> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Scope scope = (Scope) obj;
        return new AndroidSplitInstallHandler((SplitInstallManager) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", SplitInstallManager.class), null, null));
    }
}
