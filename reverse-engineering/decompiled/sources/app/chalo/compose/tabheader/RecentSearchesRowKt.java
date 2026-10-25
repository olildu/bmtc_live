package app.chalo.compose.tabheader;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.components.RecentlySearchedContainerSpec;
import app.chalo.uistate.components.RecentlySearchedContainerUiState;
import defpackage.t01;
import defpackage.yu0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RecentSearchesRowKt {
    public static final void a(RecentlySearchedContainerUiState uiState, Composer composer, int i) {
        int i2;
        Intrinsics.i(uiState, "uiState");
        Object obj = uiState.b;
        Object obj2 = uiState.f9942a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-218450469);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(uiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-218450469, i2, -1, "app.chalo.compose.tabheader.RegularBusRecentSearchesRow (RecentSearchesRow.kt:20)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj2);
            } else {
                obj2 = objRememberedValue;
            }
            RecentlySearchedContainerSpec recentlySearchedContainerSpec = (RecentlySearchedContainerSpec) obj2;
            boolean zChanged2 = composerStartRestartGroup.changed(obj);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue2;
            }
            List list = (List) obj;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(PlotlineComposeWidgetKt.a(Modifier.INSTANCE, "PL_Recent_Searches"), 0.0f, 1, null), ChaloColorTokenKt.c(recentlySearchedContainerSpec.b), null, 2, null), recentlySearchedContainerSpec.f9941a);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list) | composerStartRestartGroup.changed(recentlySearchedContainerSpec);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new t01(0, list, recentlySearchedContainerSpec);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            LazyDslKt.LazyRow(modifierC, null, null, false, null, null, null, false, null, (Function1) objRememberedValue3, composerStartRestartGroup, 0, TypedValues.PositionType.TYPE_POSITION_TYPE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yu0(uiState, i, 23));
        }
    }
}
