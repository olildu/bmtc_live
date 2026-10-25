package defpackage;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.components.buttons.ChaloCircularBackButtonKt;
import app.chalo.compose.components.chalomap.ChaloMap_androidKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.RouteDetailsStopAndMapScreenKt;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsMainScreenSpec;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsViewTypeUIState;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.IconButtonUIState;
import app.chalo.uistate.components.map.ChaloMapUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t31 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19624a;
    public final /* synthetic */ RouteDetailsViewTypeUIState.MainScreen b;

    public /* synthetic */ t31(RouteDetailsViewTypeUIState.MainScreen mainScreen, int i) {
        this.f19624a = i;
        this.b = mainScreen;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f19624a) {
            case 0:
                PaddingValues contentPadding = (PaddingValues) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(contentPadding, "contentPadding");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= composer.changed(contentPadding) ? 4 : 2;
                }
                if (composer.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(842424489, iIntValue, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.RouteDetailsStopAndMapScreen.<anonymous>.<anonymous>.<anonymous> (RouteDetailsStopAndMapScreen.kt:187)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer);
                    pk0.v(companion3, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    RouteDetailsViewTypeUIState.MainScreen mainScreen = this.b;
                    ChaloMapUIState chaloMapUIState = mainScreen.h;
                    RouteDetailsMainScreenSpec routeDetailsMainScreenSpec = mainScreen.g;
                    ChaloMap_androidKt.c(chaloMapUIState, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), composer, 48);
                    IconButtonUIState iconButtonUIState = mainScreen.e;
                    if (iconButtonUIState == null) {
                        composer.startReplaceGroup(-1361310963);
                    } else {
                        composer.startReplaceGroup(-1361310962);
                        ChaloCircularBackButtonKt.b(iconButtonUIState, boxScopeInstance.align(PaddingKt.m788paddingqDBjuR0$default(companion, 0.0f, 0.0f, routeDetailsMainScreenSpec.b.c, Dp.m7278constructorimpl(contentPadding.getBottom() + routeDetailsMainScreenSpec.b.d), 3, null), companion2.getBottomEnd()), composer, 0, 0);
                    }
                    composer.endReplaceGroup();
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 1:
                AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1968627389, iIntValue2, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.RouteDetailsStopAndMapScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RouteDetailsStopAndMapScreen.kt:175)");
                }
                ButtonUIState buttonUIState = this.b.c;
                if (buttonUIState == null) {
                    composer2.startReplaceGroup(-399825566);
                } else {
                    composer2.startReplaceGroup(-399825565);
                    RouteDetailsStopAndMapScreenKt.a(0, 0, composer2, PaddingKt.m788paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, ChaloTheme.b(composer2, 0).f, ChaloTheme.b(composer2, 0).g, 3, null), buttonUIState);
                }
                composer2.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                break;
            default:
                AnimatedVisibilityScope AnimatedVisibility2 = (AnimatedVisibilityScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                Intrinsics.i(AnimatedVisibility2, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1131599736, iIntValue3, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.RouteDetailsStopAndMapScreen.<anonymous>.<anonymous>.<anonymous> (RouteDetailsStopAndMapScreen.kt:274)");
                }
                ButtonUIState buttonUIState2 = this.b.c;
                if (buttonUIState2 == null) {
                    composer3.startReplaceGroup(289466817);
                } else {
                    composer3.startReplaceGroup(289466818);
                    RouteDetailsStopAndMapScreenKt.a(0, 2, composer3, null, buttonUIState2);
                }
                composer3.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                break;
        }
        return Unit.f17538a;
    }
}
