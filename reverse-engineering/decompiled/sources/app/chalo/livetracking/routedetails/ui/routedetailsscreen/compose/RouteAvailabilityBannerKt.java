package app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteAvailabilityBannerUISpec;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteAvailabilityBannerUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteAvailabilityDialogUIState;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUrlUIState;
import coil3.compose.SingletonAsyncImageKt;
import defpackage.k31;
import defpackage.pk0;
import defpackage.rx0;
import defpackage.zt0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RouteAvailabilityBannerKt {
    public static final void a(RouteAvailabilityBannerUIState state, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        RouteAvailabilityBannerUISpec routeAvailabilityBannerUISpec = state.d;
        Composer composerStartRestartGroup = composer.startRestartGroup(-163046029);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-163046029, i2, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.RouteAvailabilityBanner (RouteAvailabilityBanner.kt:81)");
            }
            Modifier modifierC = ChaloThemeKt.c(modifier, routeAvailabilityBannerUISpec.f4913a);
            UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1 = state.c;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(uiEventHandler$Companion$fromLambda$1);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                RouteAvailabilityBannerKt$RouteAvailabilityBanner$4$1 routeAvailabilityBannerKt$RouteAvailabilityBanner$4$1 = new RouteAvailabilityBannerKt$RouteAvailabilityBanner$4$1(0, uiEventHandler$Companion$fromLambda$1, UiEventHandler.class, "onClick", "onClick()V", 0);
                composerStartRestartGroup.updateRememberedValue(routeAvailabilityBannerKt$RouteAvailabilityBanner$4$1);
                objRememberedValue = routeAvailabilityBannerKt$RouteAvailabilityBanner$4$1;
            }
            Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifierC, false, null, null, null, (Function0) ((KFunction) objRememberedValue), 15, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM299clickableoSLSa3U$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageUrlUIState imageUrlUIState = state.f4914a;
            if (imageUrlUIState == null) {
                composerStartRestartGroup.startReplaceGroup(413570201);
            } else {
                composerStartRestartGroup.startReplaceGroup(413570202);
                SingletonAsyncImageKt.a(imageUrlUIState.f10037a, "Route availability banner", ChaloThemeKt.c(Modifier.INSTANCE, routeAvailabilityBannerUISpec.b), null, composerStartRestartGroup, 48, 2040);
            }
            composerStartRestartGroup.endReplaceGroup();
            TextKt.c(state.b, ChaloThemeKt.c(Modifier.INSTANCE, routeAvailabilityBannerUISpec.c), null, null, composerStartRestartGroup, 0, 12);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rx0(state, modifier, i, 29));
        }
    }

    public static final void b(RouteAvailabilityDialogUIState state, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1418071493);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            modifier = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1418071493, i3, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.RouteAvailabilityDialog (RouteAvailabilityBanner.kt:154)");
            }
            ChaloLoadingDialogKt.c(state.e.d, ComposableLambdaKt.rememberComposableLambda(-1969275611, true, new zt0(3, modifier, state), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new k31(state, modifier, i, 0));
        }
    }
}
