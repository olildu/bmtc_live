package app.chalo.compose.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.snackbar.SnackbarUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.c6;
import defpackage.d0;
import defpackage.h5;
import defpackage.ri;
import defpackage.s4;
import defpackage.xj;
import defpackage.z;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloSnackbarKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f1826a = Dp.m7278constructorimpl(600);

    public static final void a(Modifier modifier, String snackbarText, String str, Function0 onActionClicked, Composer composer, int i, int i2) {
        int i3;
        Intrinsics.i(snackbarText, "snackbarText");
        Intrinsics.i(onActionClicked, "onActionClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1482983621);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(snackbarText) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changed(str)) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onActionClicked) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if ((i2 & 4) != 0) {
                    str = StringResourcesHelperKt.c(StringEnum.RETRY, new Object[0], composerStartRestartGroup, 6);
                    i3 &= -897;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1482983621, i3, -1, "app.chalo.compose.components.ChaloSnackbar (ChaloSnackbar.kt:91)");
            }
            boolean z = (((i3 & 896) ^ 384) > 256 && composerStartRestartGroup.changed(str)) || (i3 & 384) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            ComposableLambda composableLambdaRememberComposableLambda = null;
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = (str == null || StringsKt.F(str)) ? null : str;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            String str2 = (String) objRememberedValue;
            if (str2 == null) {
                composerStartRestartGroup.startReplaceGroup(-1531048669);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1531048668);
                composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(2033940340, true, new d0(18, onActionClicked, str2), composerStartRestartGroup, 54);
            }
            composerStartRestartGroup.endReplaceGroup();
            c(modifier, composableLambdaRememberComposableLambda, ComposableLambdaKt.rememberComposableLambda(165637607, true, new xj(snackbarText, 3), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        String str3 = str;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ri(modifier2, snackbarText, str3, onActionClicked, i, i2, 1));
        }
    }

    public static final void b(SnackbarUIState state, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Intrinsics.i(state, "state");
        TextUIState.ChaloTextUIState chaloTextUIState = state.b;
        Composer composerStartRestartGroup = composer.startRestartGroup(2087644643);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
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
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2087644643, i3, -1, "app.chalo.compose.components.ChaloSnackbar (ChaloSnackbar.kt:40)");
            }
            boolean zChanged = composerStartRestartGroup.changed(chaloTextUIState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            ComposableLambda composableLambdaRememberComposableLambda = null;
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                if (chaloTextUIState == null || StringsKt.F(chaloTextUIState.b)) {
                    chaloTextUIState = null;
                }
                composerStartRestartGroup.updateRememberedValue(chaloTextUIState);
                objRememberedValue = chaloTextUIState;
            }
            TextUIState.ChaloTextUIState chaloTextUIState2 = (TextUIState.ChaloTextUIState) objRememberedValue;
            if (chaloTextUIState2 == null) {
                composerStartRestartGroup.startReplaceGroup(1895435035);
            } else {
                composerStartRestartGroup.startReplaceGroup(1895435036);
                composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1443823356, true, new d0(19, chaloTextUIState2, state), composerStartRestartGroup, 54);
            }
            composerStartRestartGroup.endReplaceGroup();
            c(modifier, composableLambdaRememberComposableLambda, ComposableLambdaKt.rememberComposableLambda(154816655, true, new c6(state, 12), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new z(state, modifier2, i, i2, 8));
        }
    }

    public static final void c(Modifier modifier, Function3 function3, Function3 function4, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-177052934);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function4) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-177052934, i2, -1, "app.chalo.compose.components.ChaloSnackbarContainer (ChaloSnackbar.kt:143)");
            }
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr), ComposableLambdaKt.rememberComposableLambda(-998766662, true, new h5(2, modifier, function4, function3), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s4(i, 21, modifier, function3, function4));
        }
    }
}
