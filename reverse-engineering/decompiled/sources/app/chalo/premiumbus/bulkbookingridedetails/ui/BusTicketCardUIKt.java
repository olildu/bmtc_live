package app.chalo.premiumbus.bulkbookingridedetails.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.theme.ChaloTheme;
import defpackage.md;
import defpackage.nd;
import defpackage.od;
import defpackage.z4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BusTicketCardUIKt {
    public static final void a(boolean z, RouteInfo routeInfo, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-701463161);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(routeInfo) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-701463161, i2, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.BusTicketCardContentWithRouteInfoUI (BusTicketCardUI.kt:127)");
            }
            ChaloRoundedCardKt.b(PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), null, ChaloTheme.c(composerStartRestartGroup, 0).f1917a, 0.0f, ComposableLambdaKt.rememberComposableLambda(1899429286, true, new z4(z, routeInfo), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 10);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new md(z, routeInfo, i));
        }
    }

    public static final void b(Modifier modifier, String productDesc, boolean z, RouteInfo routeInfo, String str, boolean z2, Function0 onUseNowCtaClicked, Function0 function0, Composer composer, int i) {
        int i2;
        boolean z3;
        Object obj;
        Object obj2;
        Object obj3;
        Composer composer2;
        boolean z4;
        Intrinsics.i(productDesc, "productDesc");
        Intrinsics.i(onUseNowCtaClicked, "onUseNowCtaClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(191395962);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed("") ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(productDesc) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z3 = z;
            i2 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
        } else {
            z3 = z;
        }
        if ((i & 24576) == 0) {
            obj = routeInfo;
            i2 |= composerStartRestartGroup.changed(obj) ? 16384 : 8192;
        } else {
            obj = routeInfo;
        }
        int i3 = i2 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        if ((1572864 & i) == 0) {
            obj2 = str;
            i3 |= composerStartRestartGroup.changed(obj2) ? 1048576 : 524288;
        } else {
            obj2 = str;
        }
        int i4 = i3 | 12582912;
        if ((100663296 & i) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onUseNowCtaClicked) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i) == 0) {
            obj3 = function0;
            i4 |= composerStartRestartGroup.changedInstance(obj3) ? 536870912 : 268435456;
        } else {
            obj3 = function0;
        }
        if (composerStartRestartGroup.shouldExecute((306783379 & i4) != 306783378, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(191395962, i4, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.BusTicketCardUI (BusTicketCardUI.kt:47)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(BackgroundKt.m264backgroundbw27NRU$default(modifier, ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), 0.0f, 1, null);
            z4 = true;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(570369723, true, new nd(obj, z3, productDesc, obj2, onUseNowCtaClicked, obj3, 0), composerStartRestartGroup, 54);
            composer2 = composerStartRestartGroup;
            ChaloRoundedCardKt.b(modifierFillMaxWidth$default, null, 0.0f, 0.0f, composableLambdaRememberComposableLambda, composer2, 24576, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            z4 = z2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new od(modifier, productDesc, z, routeInfo, str, z4, onUseNowCtaClicked, function0, i));
        }
    }
}
