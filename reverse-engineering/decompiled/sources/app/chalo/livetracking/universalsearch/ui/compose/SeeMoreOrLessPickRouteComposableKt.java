package app.chalo.livetracking.universalsearch.ui.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import defpackage.k31;
import defpackage.o01;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SeeMoreOrLessPickRouteComposableKt {
    public static final void a(String btnText, Function0 onClick, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.i(btnText, "btnText");
        Intrinsics.i(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1536857493);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(btnText) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1536857493, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.SeeMoreOrLessPickRouteComposable (SeeMoreOrLessPickRouteComposable.kt:20)");
            }
            Modifier modifierM275borderxT4_qwU = BorderKt.m275borderxT4_qwU(PaddingKt.m784padding3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(Modifier.INSTANCE, ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).h), ChaloTheme.b(composerStartRestartGroup, 0).b, ChaloTheme.a(composerStartRestartGroup, 0).B, RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).c));
            boolean z = (i2 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new o01(onClick, 18);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(btnText, SizeKt.wrapContentSize$default(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(ClickableKt.m299clickableoSLSa3U$default(modifierM275borderxT4_qwU, false, null, null, null, (Function0) objRememberedValue, 15, null), 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).n), Alignment.INSTANCE.getCenter(), false, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).f1915a, null, 0L, null, FontWeight.INSTANCE.getSemiBold(), null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, (i2 & 14) | 1572864, 0, 129976);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new k31(btnText, onClick, i, 18));
        }
    }
}
