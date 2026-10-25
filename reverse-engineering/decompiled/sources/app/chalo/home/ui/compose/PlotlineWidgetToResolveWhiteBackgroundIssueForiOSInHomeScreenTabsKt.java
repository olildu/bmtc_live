package app.chalo.home.ui.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.plotline.PlotlineComposeWidgetKt;
import app.chalo.utils.PlatformFeature;
import defpackage.nb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "shouldShowPaddedContainer", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PlotlineWidgetToResolveWhiteBackgroundIssueForiOSInHomeScreenTabsKt {
    public static final void a(int i, Composer composer, Modifier modifier, String widgetId) {
        int i2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        nb nbVar;
        Intrinsics.i(modifier, "modifier");
        Intrinsics.i(widgetId, "widgetId");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1229681255);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(widgetId) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1229681255, i2, -1, "app.chalo.home.ui.compose.PlotlineWidgetToResolveWhiteBackgroundIssueForiOSInHomeScreenTabs (PlotlineWidgetToResolveWhiteBackgroundIssueForiOSInHomeScreenTabs.kt:22)");
            }
            float f = PlatformFeature.f10436a;
            composerStartRestartGroup.startReplaceGroup(-1657949391);
            PlotlineComposeWidgetKt.a(((i2 >> 3) & 14) | ((i2 << 3) & 112), 0, composerStartRestartGroup, modifier, widgetId);
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            } else {
                nbVar = new nb(modifier, widgetId, i, 5);
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            } else {
                nbVar = new nb(modifier, widgetId, i, 6);
            }
        }
        scopeUpdateScopeEndRestartGroup.updateScope(nbVar);
    }
}
