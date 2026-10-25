package app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.ChaloCircularProgressIndicatorKt;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.CircularProgressIndicatorUIState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetScaffoldState;
import app.chalo.livetracking.ui.routedetailsscreen.ReportProblemDialogUIState;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsViewState;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsViewTypeUIState;
import app.chalo.livetracking.ui.routedetailsscreen.RouteViewTargetType;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteAvailabilityDialogUIState;
import defpackage.h01;
import defpackage.pk0;
import defpackage.q80;
import defpackage.r31;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RouteDetailsScreenKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4464a;

        static {
            int[] iArr = new int[RouteViewTargetType.values().length];
            try {
                iArr[RouteViewTargetType.MAIN_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteViewTargetType.TIME_TABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RouteViewTargetType.ALL_VEHICLES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RouteViewTargetType.STOP_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RouteViewTargetType.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f4464a = iArr;
        }
    }

    public static final void a(RouteDetailsViewState viewState, Function1 sendIntent, BottomSheetScaffoldState modalBottomSheetState, Composer composer, int i) {
        int i2;
        BoxScopeInstance boxScopeInstance;
        Composer composer2;
        Intrinsics.i(viewState, "viewState");
        RouteDetailsViewTypeUIState routeDetailsViewTypeUIState = viewState.d;
        CircularProgressIndicatorUIState circularProgressIndicatorUIState = viewState.c;
        Intrinsics.i(sendIntent, "sendIntent");
        Intrinsics.i(modalBottomSheetState, "modalBottomSheetState");
        Composer composerStartRestartGroup = composer.startRestartGroup(920086046);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modalBottomSheetState) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 131) != 130, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(920086046, i2, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.RouteDetailsScreen (RouteDetailsScreen.kt:31)");
            }
            RouteAvailabilityDialogUIState routeAvailabilityDialogUIState = viewState.e;
            if (routeAvailabilityDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-197683604);
            } else {
                composerStartRestartGroup.startReplaceGroup(-197683603);
                RouteAvailabilityBannerKt.b(routeAvailabilityDialogUIState, null, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            ReportProblemDialogUIState reportProblemDialogUIState = viewState.f;
            if (reportProblemDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-197592464);
            } else {
                composerStartRestartGroup.startReplaceGroup(-197592463);
                ReportProblemKt.d(reportProblemDialogUIState, null, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            if (viewState.b == null) {
                composerStartRestartGroup.startReplaceGroup(-407266099);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                boxScopeInstance = boxScopeInstance2;
            } else {
                composerStartRestartGroup.startReplaceGroup(-407266098);
                boxScopeInstance = boxScopeInstance2;
                composer2 = composerStartRestartGroup;
                ChaloLoadingDialogKt.b(null, false, null, composer2, 0, 7);
                composer2.endReplaceGroup();
            }
            if (circularProgressIndicatorUIState != null) {
                composer2.startReplaceGroup(-407151615);
                ChaloCircularProgressIndicatorKt.a(boxScopeInstance.align(companion, companion2.getCenter()), circularProgressIndicatorUIState, composer2, 0, 0);
                composer2.endReplaceGroup();
                composerStartRestartGroup = composer2;
            } else {
                composer2.startReplaceGroup(-406913473);
                if (routeDetailsViewTypeUIState != null) {
                    composer2.startReplaceGroup(-406864772);
                    RouteViewTargetType routeViewTargetType = routeDetailsViewTypeUIState.f4884a;
                    Object objRememberedValue = composer2.rememberedValue();
                    Composer.Companion companion4 = Composer.INSTANCE;
                    if (objRememberedValue == companion4.getEmpty()) {
                        objRememberedValue = new r31(10);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    Function1 function1 = (Function1) objRememberedValue;
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == companion4.getEmpty()) {
                        objRememberedValue2 = new r31(11);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1570782167, true, new q80(5, viewState, modalBottomSheetState, boxScopeInstance), composer2, 54);
                    composerStartRestartGroup = composer2;
                    AnimatedContentKt.AnimatedContent(routeViewTargetType, null, function1, null, null, (Function1) objRememberedValue2, composableLambdaRememberComposableLambda, composerStartRestartGroup, 1769856, 26);
                } else {
                    composerStartRestartGroup = composer2;
                    composerStartRestartGroup.startReplaceGroup(-409253570);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h01(i, 9, viewState, sendIntent, modalBottomSheetState));
        }
    }
}
