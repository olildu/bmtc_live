package app.chalo.compose.components.divider;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import app.chalo.compose.components.divider.DashedDividerKt;
import app.chalo.compose.utils.ComposeDpHelper;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.divider.DashedDividerUIState;
import defpackage.fp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DashedDividerKt {
    public static final void a(DashedDividerUIState state, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-554286899);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-554286899, i2, -1, "app.chalo.compose.components.divider.DashedDivider (DashedDivider.kt:47)");
            }
            modifier2 = modifier;
            b(state.f10016a, ChaloColorTokenKt.c(state.b), state.c, state.d, modifier2, composerStartRestartGroup, (i2 << 9) & 57344);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fp(state, modifier2, i, 25));
        }
    }

    public static final void b(final float f, final long j, final float f2, final float f3, final Modifier modifier, Composer composer, final int i) {
        final float f4;
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1896081569);
        if ((i & 6) == 0) {
            f4 = f;
            i2 = (composerStartRestartGroup.changed(f4) ? 4 : 2) | i;
        } else {
            f4 = f;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(f3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1896081569, i3, -1, "app.chalo.compose.components.divider.DashedDivider (DashedDivider.kt:22)");
            }
            final float fA = ComposeDpHelper.a(f2, composerStartRestartGroup, ((i3 >> 6) & 14) | 48);
            final float fA2 = ComposeDpHelper.a(f3, composerStartRestartGroup, ((i3 >> 9) & 14) | 48);
            boolean zChanged = ((i3 & 14) == 4) | ((((i3 & 112) ^ 48) > 32 && composerStartRestartGroup.changed(j)) || (i3 & 48) == 32) | composerStartRestartGroup.changed(fA) | composerStartRestartGroup.changed(fA2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Function1 function1 = new Function1() { // from class: fv
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        DrawScope Canvas = (DrawScope) obj;
                        Intrinsics.i(Canvas, "$this$Canvas");
                        DrawScope.CC.O(Canvas, j, 0L, 0L, 0L, new Stroke(Canvas.mo404toPx0680j_4(f4), 0.0f, 0, 0, PathEffect.INSTANCE.dashPathEffect(new float[]{fA, fA2}, 0.0f), 14, null), 0.0f, null, 0, 238, null);
                        return Unit.f17538a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue = function1;
            }
            CanvasKt.Canvas(modifier, (Function1) objRememberedValue, composerStartRestartGroup, (i3 >> 12) & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: gv
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    DashedDividerKt.b(f, j, f2, f3, modifier, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.f17538a;
                }
            });
        }
    }
}
