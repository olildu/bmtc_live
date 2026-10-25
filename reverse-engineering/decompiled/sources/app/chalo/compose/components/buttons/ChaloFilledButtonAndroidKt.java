package app.chalo.compose.components.buttons;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import app.chalo.compose.theme.ChaloTheme;
import defpackage.d0;
import defpackage.hb;
import defpackage.u6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloFilledButtonAndroidKt {
    public static final void a(String text, Modifier modifier, TextStyle textStyle, Function0 onClickAction, Composer composer, int i) {
        int i2;
        TextStyle headlineSmall;
        int i3;
        Intrinsics.i(text, "text");
        Intrinsics.i(onClickAction, "onClickAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1517150251);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickAction) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                headlineSmall = ChaloTheme.e(composerStartRestartGroup, 6).getHeadlineSmall();
                i3 = i2 & (-897);
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                i3 = i2 & (-897);
                headlineSmall = textStyle;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1517150251, i3, -1, "app.chalo.compose.components.buttons.ChaloButtonWithOrangeArrow (ChaloFilledButtonAndroid.kt:34)");
            }
            boolean z = (i3 & 7168) == 2048;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new hb(onClickAction, 24);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            FlowLayoutKt.FlowRow(PaddingKt.m786paddingVpY3zN4$default(ClickableKt.m299clickableoSLSa3U$default(modifier, false, null, null, null, (Function0) objRememberedValue, 15, null), 0.0f, ChaloTheme.b(composerStartRestartGroup, 6).f, 1, null), null, Arrangement.INSTANCE.getCenter(), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(-576819526, true, new d0(13, text, headlineSmall), composerStartRestartGroup, 54), composerStartRestartGroup, 1573248, 58);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            headlineSmall = textStyle;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u6(text, modifier, headlineSmall, onClickAction, i, 11));
        }
    }
}
