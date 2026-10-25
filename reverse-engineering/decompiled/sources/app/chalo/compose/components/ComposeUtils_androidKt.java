package app.chalo.compose.components;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import app.chalo.contract.BasicInfoContract;
import defpackage.wl;
import defpackage.wr;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ComposeUtils_androidKt {
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public static final void a(Composer composer, int i) {
        Activity activity;
        Composer composerStartRestartGroup = composer.startRestartGroup(1692285759);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1692285759, i, -1, "app.chalo.compose.components.PreventScreenShots (ComposeUtils.android.kt:33)");
            }
            if (((BasicInfoContract) ComposeUtilsHelper.f1841a.getValue()).f()) {
                composerStartRestartGroup.startReplaceGroup(557945827);
            } else {
                composerStartRestartGroup.startReplaceGroup(559027696);
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                boolean zChanged = composerStartRestartGroup.changed(context);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Intrinsics.i(context, "<this>");
                    while (true) {
                        if (!(context instanceof ContextWrapper)) {
                            activity = null;
                            break;
                        } else if (context instanceof Activity) {
                            activity = (Activity) context;
                            break;
                        }
                    }
                    objRememberedValue = activity;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Activity activity2 = (Activity) objRememberedValue;
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(activity2);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new wr(activity2, 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                EffectsKt.DisposableEffect(activity2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wl(i, 3));
        }
    }

    public static final float b(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(229648447, 0, -1, "app.chalo.compose.components.getScreenHeight (ComposeUtils.android.kt:28)");
        }
        float fM7278constructorimpl = Dp.m7278constructorimpl(((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fM7278constructorimpl;
    }

    public static final float c(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2116180278, 0, -1, "app.chalo.compose.components.getScreenWidth (ComposeUtils.android.kt:23)");
        }
        float fM7278constructorimpl = Dp.m7278constructorimpl(((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenWidthDp);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fM7278constructorimpl;
    }

    public static final long d(String value) {
        Intrinsics.i(value, "value");
        String string = StringsKt.u0(value).toString();
        if (string.length() == 0) {
            string = "#00000000";
        } else if (!StringsKt.a0(string, "#", false)) {
            if (StringsKt.a0(string, "0x", true)) {
                String strSubstring = string.substring(2);
                Intrinsics.h(strSubstring, "substring(...)");
                string = "#".concat(strSubstring);
            } else {
                string = "#".concat(string);
            }
        }
        String strM = StringsKt.M(string, "#");
        if (strM.length() != 6 && strM.length() != 8) {
            throw new IllegalArgumentException("Unsupported color format: ".concat(value).toString());
        }
        String upperCase = strM.toUpperCase(Locale.ROOT);
        Intrinsics.h(upperCase, "toUpperCase(...)");
        String strM2 = StringsKt.M("#".concat(upperCase), "#");
        if (strM2.length() == 6) {
            strM2 = "FF".concat(strM2);
        }
        CharsKt.b(16);
        int i = (int) Long.parseLong(strM2, 16);
        return ColorKt.Color((i >>> 16) & 255, (i >>> 8) & 255, i & 255, (i >>> 24) & 255);
    }
}
