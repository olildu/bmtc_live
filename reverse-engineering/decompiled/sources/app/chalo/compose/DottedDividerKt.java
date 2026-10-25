package app.chalo.compose;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.PathEffect;
import app.chalo.compose.theme.ChaloTheme;
import defpackage.sy;
import defpackage.ty;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DottedDividerKt {
    public static final void a(long j, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.i(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(983539286);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(983539286, i2, -1, "app.chalo.compose.DottedDivider (DottedDivider.kt:28)");
            }
            PathEffect pathEffectDashPathEffect = PathEffect.INSTANCE.dashPathEffect(new float[]{4.0f, 12.0f}, 0.0f);
            Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 6).b);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(pathEffectDashPathEffect) | ((i2 & 14) == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new sy(0, j, pathEffectDashPathEffect);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CanvasKt.Canvas(modifierM814height3ABfNKs, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ty(modifier, i, 0, j));
        }
    }
}
