package app.chalo.compose.components.navigationbar;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.NavigationBarDefaults;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.components.navigationbar.NavigationBarKt;
import defpackage.ml0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NavigationBarKt {
    /* JADX WARN: Code duplicated, block: B:68:0x00ee  */
    public static final void a(final Modifier modifier, final long j, long j2, final float f, WindowInsets windowInsets, final float f2, final Dp dp, final Function3 content, Composer composer, final int i) {
        Modifier modifier2;
        int i2;
        float f3;
        final long j3;
        final WindowInsets windowInsets2;
        long jM1812contentColorFor4WTKRHQ;
        int i3;
        WindowInsets windowInsets3;
        Arrangement.HorizontalOrVertical spaceBetween;
        Intrinsics.i(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1116348910);
        if ((i & 6) == 0) {
            modifier2 = modifier;
            i2 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            f3 = f;
            i2 |= composerStartRestartGroup.changed(f3) ? 2048 : 1024;
        } else {
            f3 = f;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(f2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(dp) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 8388608 : 4194304;
        }
        if (composerStartRestartGroup.shouldExecute((4785299 & i2) != 4785298, i2 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                jM1812contentColorFor4WTKRHQ = ColorSchemeKt.m1812contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable), j);
                i3 = i2 & (-58241);
                windowInsets3 = NavigationBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, NavigationBarDefaults.$stable);
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                i3 = i2 & (-58241);
                jM1812contentColorFor4WTKRHQ = j2;
                windowInsets3 = windowInsets;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1116348910, i3, -1, "app.chalo.compose.components.navigationbar.NavigationBar (NavigationBar.kt:36)");
            }
            if (dp != null) {
                spaceBetween = Arrangement.INSTANCE.m672spacedBy0680j_4(dp.m7292unboximpl());
                if (spaceBetween == null) {
                    spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                }
            } else {
                spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            }
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(572690519, true, new ml0(f2, spaceBetween, content), composerStartRestartGroup, 54);
            int i4 = (i3 & 14) | 12582912;
            int i5 = i3 << 3;
            Modifier modifier3 = modifier2;
            j3 = jM1812contentColorFor4WTKRHQ;
            SurfaceKt.m2480SurfaceT9BRK9s(modifier3, null, j, j3, f3, 0.0f, null, composableLambdaRememberComposableLambda, composerStartRestartGroup, i4 | (i5 & 896) | (i5 & 57344), 98);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            windowInsets2 = windowInsets3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            j3 = j2;
            windowInsets2 = windowInsets;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: pl0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    NavigationBarKt.a(modifier, j, j3, f, windowInsets2, f2, dp, content, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.f17538a;
                }
            });
        }
    }
}
