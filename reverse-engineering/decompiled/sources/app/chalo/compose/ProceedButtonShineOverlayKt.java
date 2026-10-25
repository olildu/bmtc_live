package app.chalo.compose;

import androidx.collection.SieveCacheKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import app.chalo.compose.ProceedButtonShineOverlayKt;
import app.chalo.compose.theme.ChaloTheme;
import defpackage.mn;
import defpackage.u3;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0006²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"", "lastHandledTriggerSignal", "", "showShineOverlay", "", "progress", "chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ProceedButtonShineOverlayKt {
    public static final void a(final Modifier modifier, final int i, final float f, final float f2, final int i2, Composer composer, final int i3) {
        int i4;
        float f3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1442542323);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            f3 = f2;
            i4 |= composerStartRestartGroup.changed(f3) ? 2048 : 1024;
        } else {
            f3 = f2;
        }
        if ((i3 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1442542323, i4, -1, "app.chalo.compose.ProceedButtonShineCanvas (ProceedButtonShineOverlay.kt:88)");
            }
            int i5 = i < i2 ? i2 : i;
            long jM4604copywmQWz5c$default = Color.m4604copywmQWz5c$default(ChaloTheme.a(composerStartRestartGroup, 6).t, f3, 0.0f, 0.0f, 0.0f, 14, null);
            boolean zChanged = composerStartRestartGroup.changed(jM4604copywmQWz5c$default);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Color.Companion companion = Color.INSTANCE;
                objRememberedValue = CollectionsKt.S(Color.m4595boximpl(companion.m4640getTransparent0d7_KjU()), Color.m4595boximpl(jM4604copywmQWz5c$default), Color.m4595boximpl(companion.m4640getTransparent0d7_KjU()));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            List list = (List) objRememberedValue;
            State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("proceed_button_shine", composerStartRestartGroup, 6, 0), 0.0f, 1.0f, AnimationSpecKt.m174infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(i5, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), "proceed_button_shine_progress", composerStartRestartGroup, (InfiniteRepeatableSpec.$stable << 9) | InfiniteTransition.$stable | 25008, 0);
            boolean zChanged2 = ((i4 & 896) == 256) | composerStartRestartGroup.changed(stateAnimateFloat) | composerStartRestartGroup.changedInstance(list);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new u3(f, list, stateAnimateFloat, 6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            CanvasKt.Canvas(modifier, (Function1) objRememberedValue2, composerStartRestartGroup, i4 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: fx0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ProceedButtonShineOverlayKt.a(modifier, i, f, f2, i2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                    return Unit.f17538a;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final int i, final Modifier modifier, final long j, float f, float f2, float f3, int i2, Composer composer, final int i3) {
        int i4;
        int i5;
        final float f4;
        final float f5;
        final int i6;
        Composer composer2;
        final float f6;
        Composer composerStartRestartGroup = composer.startRestartGroup(681926261);
        if ((i3 & 6) == 0) {
            i4 = i;
            i5 = (composerStartRestartGroup.changed(i4) ? 4 : 2) | i3;
        } else {
            i4 = i;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(true) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(j) ? 2048 : 1024;
        }
        int i7 = i5 | 14376960;
        if (composerStartRestartGroup.shouldExecute((4793491 & i7) != 4793490, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(681926261, i7, -1, "app.chalo.compose.ProceedButtonShineOverlay (ProceedButtonShineOverlay.kt:39)");
            }
            boolean zChanged = ((i7 & 7168) == 2048) | composerStartRestartGroup.changed(1);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = Integer.valueOf((int) RangesKt.g(j, 1, SieveCacheKt.NodeLinkMask));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int iIntValue = ((Number) objRememberedValue).intValue();
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(-1, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue3;
            Integer numValueOf = Integer.valueOf(i4);
            Boolean bool = Boolean.TRUE;
            Integer numValueOf2 = Integer.valueOf(iIntValue);
            boolean zChanged2 = ((i7 & 14) == 4) | ((i7 & 112) == 32) | composerStartRestartGroup.changed(iIntValue);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new ProceedButtonShineOverlayKt$ProceedButtonShineOverlay$1$1(i4, true, iIntValue, mutableState, mutableState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(numValueOf, bool, numValueOf2, (Function2) objRememberedValue4, composerStartRestartGroup, i7 & WebSocketProtocol.PAYLOAD_SHORT);
            if (!((Boolean) mutableState2.getValue()).booleanValue()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new mn(i, modifier, j, 0.95f, 0.3f, 0.9f, i3));
                    return;
                }
                return;
            }
            a(AlphaKt.alpha(modifier, RangesKt.d(0.95f, 0.0f, 1.0f)), iIntValue, 0.3f, RangesKt.d(0.9f, 0.0f, 1.0f), 1, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2 = composerStartRestartGroup;
            f4 = 0.95f;
            f6 = 0.3f;
            f5 = 0.9f;
            i6 = 1;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            f4 = f;
            f5 = f3;
            i6 = i2;
            composer2 = composerStartRestartGroup;
            f6 = f2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: ex0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ProceedButtonShineOverlayKt.b(i, modifier, j, f4, f6, f5, i6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                    return Unit.f17538a;
                }
            });
        }
    }
}
