package app.chalo.compose.components;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.card.CardUISpec;
import defpackage.gc;
import defpackage.v;
import defpackage.zx0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloRoundedCardKt {
    public static final void a(CardUISpec spec, Modifier modifier, Function3 content, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Intrinsics.i(spec, "spec");
        Intrinsics.i(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-32458612);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(spec) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-32458612, i3, -1, "app.chalo.compose.components.Card (ChaloRoundedCard.kt:38)");
            }
            int i5 = i3;
            modifier2 = modifier3;
            b(modifier2, ChaloThemeKt.d(spec.f9924a), spec.b, 0.0f, content, composerStartRestartGroup, ((i5 >> 3) & 14) | ((i5 << 6) & 57344), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new v(spec, modifier2, content, i, i2, 8));
        }
    }

    public static final void b(Modifier modifier, Shape shape, float f, float f2, Function3 content, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Shape shape2;
        float f3;
        float f4;
        Composer composer2;
        Modifier modifier3;
        Shape shape3;
        float f5;
        float f6;
        Modifier modifier4;
        Shape shape4;
        float f7;
        Shape shape5;
        Intrinsics.i(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-709974018);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                shape2 = shape;
                int i5 = composerStartRestartGroup.changed(shape2) ? 32 : 16;
                i3 |= i5;
            } else {
                shape2 = shape;
            }
            i3 |= i5;
        } else {
            shape2 = shape;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                f3 = f;
                int i6 = composerStartRestartGroup.changed(f3) ? 256 : 128;
                i3 |= i6;
            } else {
                f3 = f;
            }
            i3 |= i6;
        } else {
            f3 = f;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                f4 = f2;
                int i7 = composerStartRestartGroup.changed(f4) ? 2048 : 1024;
                i3 |= i7;
            } else {
                f4 = f2;
            }
            i3 |= i7;
        } else {
            f4 = f2;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    shape4 = ChaloTheme.d(composerStartRestartGroup, 6).c;
                    i3 &= -113;
                } else {
                    shape4 = shape2;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    f3 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    f7 = ChaloTheme.b(composerStartRestartGroup, 6).f1916a;
                } else {
                    f7 = f4;
                }
                shape5 = shape4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                f3 = f3;
                f7 = f4;
                shape5 = shape2;
                modifier4 = modifier2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-709974018, i3, -1, "app.chalo.compose.components.ChaloRoundedCard (ChaloRoundedCard.kt:21)");
            }
            composer2 = composerStartRestartGroup;
            SurfaceKt.m2480SurfaceT9BRK9s(modifier4, shape5, ChaloTheme.a(composerStartRestartGroup, 6).t, ChaloTheme.a(composerStartRestartGroup, 6).Z, 0.0f, f3, null, ComposableLambdaKt.rememberComposableLambda(824520963, true, new gc(f7, content), composerStartRestartGroup, 54), composer2, (i3 & 14) | 12582912 | (i3 & 112) | ((i3 << 9) & 458752), 80);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f6 = f7;
            modifier3 = modifier4;
            shape3 = shape5;
            f5 = f3;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
            shape3 = shape2;
            f5 = f3;
            f6 = f4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zx0(modifier3, shape3, f5, f6, content, i, i2));
        }
    }
}
