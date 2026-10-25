package app.chalo.compose.components;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloTheme;
import defpackage.nk;
import defpackage.xj;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloHollowOrangeButtonKt {
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0110  */
    /* JADX WARN: Code duplicated, block: B:44:0x0115  */
    /* JADX WARN: Code duplicated, block: B:47:0x0120  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    public static final void a(int i, int i2, Composer composer, Modifier modifier, String text, Function0 onClickAction) {
        int i3;
        Modifier modifier2;
        boolean z;
        Composer composer2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier4;
        int i4;
        Intrinsics.i(text, "text");
        Intrinsics.i(onClickAction, "onClickAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-160146798);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (composerStartRestartGroup.changedInstance(onClickAction)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                if (i5 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-160146798, i3, -1, "app.chalo.compose.components.ChaloHollowOrangeButton (ChaloHollowOrangeButton.kt:19)");
                }
                BorderStroke borderStrokeM290BorderStrokecXLIe8U = BorderStrokeKt.m290BorderStrokecXLIe8U(ChaloTheme.b(composerStartRestartGroup, 6).b, ChaloTheme.a(composerStartRestartGroup, 6).f1915a);
                ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                long j = ChaloTheme.a(composerStartRestartGroup, 6).t;
                int i6 = ButtonDefaults.$stable;
                int i7 = i3;
                float f = 0;
                modifier2 = modifier4;
                ButtonKt.Button(onClickAction, modifier2, false, null, buttonDefaults.m1674buttonColorsro_MJ88(j, 0L, 0L, 0L, composerStartRestartGroup, i6 << 12, 14), buttonDefaults.m1675buttonElevationR_JCAzs(Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), 0.0f, 0.0f, Dp.m7278constructorimpl(f), composerStartRestartGroup, (i6 << 15) | 24630, 12), borderStrokeM290BorderStrokecXLIe8U, PaddingKt.m778PaddingValuesYgX7TsA(ChaloTheme.b(composerStartRestartGroup, 6).i, ChaloTheme.b(composerStartRestartGroup, 6).g), null, ComposableLambdaKt.rememberComposableLambda(1829955202, true, new xj(text, 2), composerStartRestartGroup, 54), composerStartRestartGroup, ((i7 >> 6) & 14) | 805306368 | (i7 & 112), 268);
                composer2 = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
            }
            modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new nk(text, modifier3, onClickAction, i, i2));
            }
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) == 0) {
            if (composerStartRestartGroup.changedInstance(onClickAction)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            if (i5 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-160146798, i3, -1, "app.chalo.compose.components.ChaloHollowOrangeButton (ChaloHollowOrangeButton.kt:19)");
            }
            BorderStroke borderStrokeM290BorderStrokecXLIe8U2 = BorderStrokeKt.m290BorderStrokecXLIe8U(ChaloTheme.b(composerStartRestartGroup, 6).b, ChaloTheme.a(composerStartRestartGroup, 6).f1915a);
            ButtonDefaults buttonDefaults2 = ButtonDefaults.INSTANCE;
            long j2 = ChaloTheme.a(composerStartRestartGroup, 6).t;
            int i8 = ButtonDefaults.$stable;
            int i9 = i3;
            float f2 = 0;
            modifier2 = modifier4;
            ButtonKt.Button(onClickAction, modifier2, false, null, buttonDefaults2.m1674buttonColorsro_MJ88(j2, 0L, 0L, 0L, composerStartRestartGroup, i8 << 12, 14), buttonDefaults2.m1675buttonElevationR_JCAzs(Dp.m7278constructorimpl(f2), Dp.m7278constructorimpl(f2), 0.0f, 0.0f, Dp.m7278constructorimpl(f2), composerStartRestartGroup, (i8 << 15) | 24630, 12), borderStrokeM290BorderStrokecXLIe8U2, PaddingKt.m778PaddingValuesYgX7TsA(ChaloTheme.b(composerStartRestartGroup, 6).i, ChaloTheme.b(composerStartRestartGroup, 6).g), null, ComposableLambdaKt.rememberComposableLambda(1829955202, true, new xj(text, 2), composerStartRestartGroup, 54), composerStartRestartGroup, ((i9 >> 6) & 14) | 805306368 | (i9 & 112), 268);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        modifier3 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new nk(text, modifier3, onClickAction, i, i2));
        }
    }
}
