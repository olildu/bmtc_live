package app.chalo.core.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import app.chalo.compose.LocalComponentContextKt;
import app.chalo.core.navigation.root.RootComponent;
import com.arkivanov.decompose.Child;
import defpackage.mk;
import defpackage.n4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DecomposeScreensKt {
    public static final void a(Child.Created child, Composer composer, int i) {
        int i2;
        Intrinsics.i(child, "child");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1251383143);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(child) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1251383143, i2, -1, "app.chalo.core.compose.DecomposeScreens (DecomposeScreens.kt:88)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>) LocalComponentContextKt.f1813a.provides(((RootComponent.Child) child.b).a()), ComposableLambdaKt.rememberComposableLambda(-1990869671, true, new n4(child, 16), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new mk(child, i, 26));
        }
    }
}
