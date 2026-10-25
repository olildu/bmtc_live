package app.chalo.compose.components.buttons;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.IconButtonUIState;
import defpackage.fh1;
import defpackage.n4;
import defpackage.z;
import defpackage.ze;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloCircularBackButtonKt {
    public static final void a(Modifier modifier, long j, float f, Function0 function0, Composer composer, int i, int i2) {
        int i3;
        long j2;
        float f2;
        Composer composer2;
        long j3;
        float f3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1355521498);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                j2 = j;
                int i4 = composerStartRestartGroup.changed(j2) ? 32 : 16;
                i3 |= i4;
            } else {
                j2 = j;
            }
            i3 |= i4;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                f2 = f;
                int i5 = composerStartRestartGroup.changed(f2) ? 256 : 128;
                i3 |= i5;
            } else {
                f2 = f;
            }
            i3 |= i5;
        } else {
            f2 = f;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    j2 = ChaloTheme.a(composerStartRestartGroup, 6).t;
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    f2 = ChaloTheme.b(composerStartRestartGroup, 6).c;
                    i3 &= -897;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            }
            long j4 = j2;
            float f4 = f2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1355521498, i3, -1, "app.chalo.compose.components.buttons.CircularBackButton (ChaloCircularBackButton.kt:28)");
            }
            composer2 = composerStartRestartGroup;
            SurfaceKt.m2480SurfaceT9BRK9s(modifier, RoundedCornerShapeKt.getCircleShape(), j4, 0L, 0.0f, f4, null, ComposableLambdaKt.rememberComposableLambda(-1944314785, true, new ze(function0, 2), composerStartRestartGroup, 54), composer2, (i3 & 14) | 12582912 | ((i3 << 3) & 896) | ((i3 << 9) & 458752), 88);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j3 = j4;
            f3 = f4;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            j3 = j2;
            f3 = f2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fh1(modifier, j3, f3, function0, i, i2));
        }
    }

    public static final void b(final IconButtonUIState state, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-231678240);
        if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(state) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-231678240, i3, -1, "app.chalo.compose.components.buttons.ImageButton (ChaloCircularBackButton.kt:46)");
            }
            int i5 = ((i3 >> 3) & 14) | 12582912;
            Modifier modifier4 = modifier3;
            SurfaceKt.m2480SurfaceT9BRK9s(modifier4, ChaloThemeKt.d(state.c), ChaloColorTokenKt.c(state.d), 0L, 0.0f, state.e, null, ComposableLambdaKt.rememberComposableLambda(-747195803, true, new Function2() { // from class: app.chalo.compose.components.buttons.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-747195803, iIntValue, -1, "app.chalo.compose.components.buttons.ImageButton.<anonymous> (ChaloCircularBackButton.kt:53)");
                        }
                        IconButtonUIState iconButtonUIState = state;
                        UiEventHandler uiEventHandler = iconButtonUIState.b;
                        boolean zChangedInstance = composer2.changedInstance(uiEventHandler);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            ChaloCircularBackButtonKt$ImageButton$1$1$1 chaloCircularBackButtonKt$ImageButton$1$1$1 = new ChaloCircularBackButtonKt$ImageButton$1$1$1(0, uiEventHandler, UiEventHandler.class, "onClick", "onClick()V", 0);
                            composer2.updateRememberedValue(chaloCircularBackButtonKt$ImageButton$1$1$1);
                            objRememberedValue = chaloCircularBackButtonKt$ImageButton$1$1$1;
                        }
                        IconButtonKt.IconButton((Function0) ((KFunction) objRememberedValue), null, false, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1712556925, true, new n4(iconButtonUIState, 7), composer2, 54), composer2, 1572864, 62);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, i5, 88);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new z(state, modifier2, i, i2, 4));
        }
    }
}
