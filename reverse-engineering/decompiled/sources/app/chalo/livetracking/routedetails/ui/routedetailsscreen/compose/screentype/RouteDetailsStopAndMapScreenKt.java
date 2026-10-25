package app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import app.chalo.ads.UnifiedAdCapability_androidKt;
import app.chalo.ads.UnifiedAdHostsKt;
import app.chalo.ads.UnifiedAdSlotSpec;
import app.chalo.ads.UnifiedAdSlotSpecs;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.components.buttons.ChaloCircularBackButtonKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.crashlytics.CrashlyticsLoggerUtils;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetScaffoldState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetValue;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.RouteDetailsAnchoredAdLayout;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.RouteDetailsStopListBottomSheetKt;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsMainScreenSpec;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsViewTypeUIState;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.IconButtonUIState;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import com.google.firebase.messaging.ServiceStarter;
import defpackage.c0;
import defpackage.dd;
import defpackage.h01;
import defpackage.ik;
import defpackage.p01;
import defpackage.pk0;
import defpackage.qv0;
import defpackage.t31;
import defpackage.u31;
import defpackage.v31;
import defpackage.vd;
import defpackage.w31;
import defpackage.yt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004¨\u0006\u0011²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0004\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\n\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0010\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"", "offsetReady", "Landroidx/compose/ui/unit/Dp;", "headerPadding", "elevation", "Lapp/chalo/uistate/button/IconButtonUIState;", "backButtonState", "sheetPeakHeight", "", "anchoredAdHeightDp", "footerHeightDp", "Lapp/chalo/livetracking/routedetails/ui/routedetailsbottomsheet/BottomSheetValue;", "sheetValueForAnchoredAdLayout", "Lapp/chalo/livetracking/routedetails/ui/routedetailsscreen/compose/RouteDetailsAnchoredAdLayout;", "anchoredAdLayout", "bottomCornerCtaExtraBottomPaddingDp", "bottomCornerCtaBottomPaddingForAdDp", "livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RouteDetailsStopAndMapScreenKt {
    public static final void a(int i, int i2, Composer composer, Modifier modifier, ButtonUIState state) {
        int i3;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-36830714);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-36830714, i3, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.BookingCTAButton (RouteDetailsStopAndMapScreen.kt:292)");
            }
            ChaloFilledButtonKt.a((i3 << 3) & 112, 0, composerStartRestartGroup, PlotlineComposeWidgetKt.a(modifier.then(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).m)), "PL_Booking_CTA"), state);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ik(state, modifier, i, i2));
        }
    }

    public static final void b(final RouteDetailsViewTypeUIState.MainScreen mainScreen, final BottomSheetScaffoldState modalBottomSheetState, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.i(modalBottomSheetState, "modalBottomSheetState");
        Composer composerStartRestartGroup = composer.startRestartGroup(119191596);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(mainScreen) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modalBottomSheetState) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            modifier = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(119191596, i3, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.RouteDetailsStopAndMapScreen (RouteDetailsStopAndMapScreen.kt:57)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = modalBottomSheetState.f4447a.e;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final State state = (State) objRememberedValue;
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(729979414, true, new Function3() { // from class: app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.a
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i4;
                    Easing easing;
                    float fM7278constructorimpl;
                    BoxWithConstraintsScope BoxWithConstraints = (BoxWithConstraintsScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    Intrinsics.i(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.changed(BoxWithConstraints) ? 4 : 2;
                    }
                    if (composer2.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(729979414, iIntValue, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.RouteDetailsStopAndMapScreen.<anonymous> (RouteDetailsStopAndMapScreen.kt:65)");
                        }
                        int iM7242getMaxHeightimpl = Constraints.m7242getMaxHeightimpl(BoxWithConstraints.mo692getConstraintsmsEJaDk()) / 2;
                        float f = iM7242getMaxHeightimpl < 1 ? 1 : iM7242getMaxHeightimpl;
                        State state2 = state;
                        float fFloatValue = (f - ((Number) state2.getValue()).floatValue()) / f;
                        Object objRememberedValue2 = composer2.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        Object empty = companion.getEmpty();
                        BottomSheetScaffoldState bottomSheetScaffoldState = modalBottomSheetState;
                        if (objRememberedValue2 == empty) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(bottomSheetScaffoldState.f4447a.c.getValue() == BottomSheetValue.ExpandedFull), null, 2, null);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        MutableState mutableState = (MutableState) objRememberedValue2;
                        Object value = state2.getValue();
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new RouteDetailsStopAndMapScreenKt$RouteDetailsStopAndMapScreen$1$1$1(state2, mutableState, null);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        EffectsKt.LaunchedEffect(value, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer2, 0);
                        boolean z = ((Boolean) mutableState.getValue()).booleanValue() && fFloatValue > 0.0f;
                        boolean z2 = !((Boolean) mutableState.getValue()).booleanValue() || fFloatValue <= 0.0f;
                        RouteDetailsViewTypeUIState.MainScreen mainScreen2 = mainScreen;
                        RouteDetailsMainScreenSpec routeDetailsMainScreenSpec = mainScreen2.g;
                        boolean z3 = z2;
                        boolean z4 = z;
                        State<Dp> stateM163animateDpAsStateAjpBEmI = AnimateAsStateKt.m163animateDpAsStateAjpBEmI(routeDetailsMainScreenSpec.c.a(fFloatValue, iM7242getMaxHeightimpl, (int) ((Number) state2.getValue()).floatValue()), AnimationSpecKt.tween$default(300, 0, EasingKt.getLinearOutSlowInEasing(), 2, null), null, null, composer2, 0, 12);
                        State<Dp> stateM163animateDpAsStateAjpBEmI2 = AnimateAsStateKt.m163animateDpAsStateAjpBEmI(routeDetailsMainScreenSpec.c.b(fFloatValue, iM7242getMaxHeightimpl, (int) ((Number) state2.getValue()).floatValue()), AnimationSpecKt.tween$default(100, 0, EasingKt.getLinearOutSlowInEasing(), 2, null), null, null, composer2, 0, 12);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = SnapshotStateKt.derivedStateOf(new p01(18, mainScreen2, stateM163animateDpAsStateAjpBEmI2));
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        State state3 = (State) objRememberedValue4;
                        Object objRememberedValue5 = composer2.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m7276boximpl(Dp.m7278constructorimpl(ChaloThemeHelper.a().u - ChaloThemeHelper.a().f)), null, 2, null);
                            composer2.updateRememberedValue(objRememberedValue5);
                        }
                        MutableState mutableState2 = (MutableState) objRememberedValue5;
                        UnifiedAdSlotSpec unifiedAdSlotSpec = UnifiedAdSlotSpecs.f853a;
                        Set set = UnifiedAdCapability_androidKt.f828a;
                        Intrinsics.i(unifiedAdSlotSpec, "<this>");
                        boolean zChanged = composer2.changed(true);
                        Object objRememberedValue6 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = SnapshotIntStateKt.mutableIntStateOf(0);
                            composer2.updateRememberedValue(objRememberedValue6);
                        }
                        MutableIntState mutableIntState = (MutableIntState) objRememberedValue6;
                        boolean zChanged2 = composer2.changed(mutableIntState.getIntValue()) | composer2.changed(true);
                        Object objRememberedValue7 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue7 == companion.getEmpty()) {
                            objRememberedValue7 = SnapshotStateKt.derivedStateOf(new v31(mutableIntState, 0));
                            composer2.updateRememberedValue(objRememberedValue7);
                        }
                        State state4 = (State) objRememberedValue7;
                        Object objRememberedValue8 = composer2.rememberedValue();
                        if (objRememberedValue8 == companion.getEmpty()) {
                            objRememberedValue8 = SnapshotStateKt.derivedStateOf(new qv0(bottomSheetScaffoldState, 19));
                            composer2.updateRememberedValue(objRememberedValue8);
                        }
                        State state5 = (State) objRememberedValue8;
                        boolean zChanged3 = composer2.changed(true) | composer2.changed(mutableIntState.getIntValue()) | composer2.changed(((Number) state4.getValue()).intValue()) | composer2.changed(((BottomSheetValue) state5.getValue()).ordinal());
                        Object objRememberedValue9 = composer2.rememberedValue();
                        if (zChanged3 || objRememberedValue9 == companion.getEmpty()) {
                            objRememberedValue9 = SnapshotStateKt.derivedStateOf(new w31(state5, mutableIntState, state4));
                            composer2.updateRememberedValue(objRememberedValue9);
                        }
                        State state6 = (State) objRememberedValue9;
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer2);
                        pk0.v(companion4, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ChaloCircularBackButtonKt.b((IconButtonUIState) state3.getValue(), ZIndexModifierKt.zIndex(boxScopeInstance.align(ChaloThemeKt.c(companion2, routeDetailsMainScreenSpec.f4870a), companion3.getTopStart()), 10.0f), composer2, 0, 0);
                        RouteDetailsStopListBottomSheetKt.a(bottomSheetScaffoldState, ComposableLambdaKt.rememberComposableLambda(-1474325647, true, new c0(mainScreen2, stateM163animateDpAsStateAjpBEmI, mutableState2, state6), composer2, 54), RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composer2, 0).f), Dp.m7278constructorimpl(Dp.m7278constructorimpl(((RouteDetailsAnchoredAdLayout) state6.getValue()).f4463a) + ((Dp) mutableState2.getValue()).m7292unboximpl()), Dp.m7278constructorimpl(((RouteDetailsAnchoredAdLayout) state6.getValue()).d), ComposableLambdaKt.rememberComposableLambda(790269925, true, new yt(z3, mainScreen2, 2), composer2, 54), ComposableLambdaKt.rememberComposableLambda(842424489, true, new t31(mainScreen2, 0), composer2, 54), composer2, 1769520);
                        composer2.startReplaceGroup(-254427768);
                        Modifier modifierAlign = boxScopeInstance.align(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.a(composer2, 0).t, null, 2, null), companion3.getBottomCenter());
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion3.getStart(), composer2, 0);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i6 = (int) ((currentCompositeKeyHashCode2 >>> 32) ^ currentCompositeKeyHashCode2);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierAlign);
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer2);
                        pk0.v(companion4, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                        Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i6), composerM3915constructorimpl2));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        if (mutableIntState.getIntValue() > 0) {
                            composer2.startReplaceGroup(1082916905);
                            DividerKt.m1950HorizontalDivider9IZ8Weo(null, ChaloTheme.b(composer2, 0).b, ChaloTheme.a(composer2, 0).S, composer2, 0, 1);
                        } else {
                            composer2.startReplaceGroup(1072946499);
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                        boolean zChanged4 = composer2.changed(mutableIntState);
                        Object objRememberedValue10 = composer2.rememberedValue();
                        if (zChanged4 || objRememberedValue10 == companion.getEmpty()) {
                            i4 = 0;
                            objRememberedValue10 = new u31(mutableIntState, 0);
                            composer2.updateRememberedValue(objRememberedValue10);
                        } else {
                            i4 = 0;
                        }
                        Function2 function2 = (Function2) objRememberedValue10;
                        boolean zChanged5 = composer2.changed(mutableIntState);
                        Object objRememberedValue11 = composer2.rememberedValue();
                        if (zChanged5 || objRememberedValue11 == companion.getEmpty()) {
                            objRememberedValue11 = new vd(mutableIntState, 8);
                            composer2.updateRememberedValue(objRememberedValue11);
                        }
                        Function1 function1 = (Function1) objRememberedValue11;
                        CrashlyticsLogger crashlyticsLoggerA = CrashlyticsLoggerUtils.a();
                        boolean zChangedInstance = composer2.changedInstance(crashlyticsLoggerA);
                        Object objRememberedValue12 = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue12 == companion.getEmpty()) {
                            objRememberedValue12 = new RouteDetailsStopAndMapScreenKt$RouteDetailsStopAndMapScreen$1$2$4$3$1(1, crashlyticsLoggerA, CrashlyticsLogger.class, "addLog", "addLog(Lapp/chalo/crashlytics/CrashlyticsLog;)V", 0);
                            composer2.updateRememberedValue(objRememberedValue12);
                        }
                        int i7 = i4;
                        UnifiedAdHostsKt.a(unifiedAdSlotSpec, modifierFillMaxWidth$default, false, 0L, 0.0f, function2, function1, (Function1) ((KFunction) objRememberedValue12), composer2, 432, 408);
                        composer2.endNode();
                        composer2.endReplaceGroup();
                        Object objRememberedValue13 = composer2.rememberedValue();
                        if (objRememberedValue13 == companion.getEmpty()) {
                            objRememberedValue13 = new MutableTransitionState(Boolean.FALSE);
                            composer2.updateRememberedValue(objRememberedValue13);
                        }
                        MutableTransitionState mutableTransitionState = (MutableTransitionState) objRememberedValue13;
                        mutableTransitionState.setTargetState$animation_core(Boolean.valueOf(z4));
                        Object objRememberedValue14 = composer2.rememberedValue();
                        if (objRememberedValue14 == companion.getEmpty()) {
                            objRememberedValue14 = SnapshotIntStateKt.mutableIntStateOf(i7);
                            composer2.updateRememberedValue(objRememberedValue14);
                        }
                        MutableIntState mutableIntState2 = (MutableIntState) objRememberedValue14;
                        boolean zChanged6 = composer2.changed(mutableIntState.getIntValue()) | composer2.changed(true) | composer2.changed(((Number) state4.getValue()).intValue());
                        Object objRememberedValue15 = composer2.rememberedValue();
                        if (zChanged6 || objRememberedValue15 == companion.getEmpty()) {
                            objRememberedValue15 = SnapshotStateKt.derivedStateOf(new p01(19, mutableIntState, state4));
                            composer2.updateRememberedValue(objRememberedValue15);
                        }
                        State state7 = (State) objRememberedValue15;
                        Boolean boolValueOf = Boolean.valueOf(z4);
                        Integer numValueOf = Integer.valueOf(((Number) state7.getValue()).intValue());
                        boolean zChanged7 = composer2.changed(z4) | composer2.changed(state7);
                        Object objRememberedValue16 = composer2.rememberedValue();
                        if (zChanged7 || objRememberedValue16 == companion.getEmpty()) {
                            easing = null;
                            objRememberedValue16 = new RouteDetailsStopAndMapScreenKt$RouteDetailsStopAndMapScreen$1$2$5$1(z4, state7, mutableIntState2, null);
                            composer2.updateRememberedValue(objRememberedValue16);
                        } else {
                            easing = null;
                        }
                        EffectsKt.LaunchedEffect(boolValueOf, numValueOf, (Function2) objRememberedValue16, composer2, i7);
                        EnterTransition enterTransitionM86scaleInL8ZKhE$default = EnterExitTransitionKt.m86scaleInL8ZKhE$default(AnimationSpecKt.tween$default(i7, ServiceStarter.ERROR_UNKNOWN, easing, 5, easing), 0.0f, 0L, 6, null);
                        ExitTransition exitTransitionM88scaleOutL8ZKhE$default = EnterExitTransitionKt.m88scaleOutL8ZKhE$default(null, 0.0f, 0L, 7, null);
                        Modifier modifierAlign2 = boxScopeInstance.align(companion2, companion3.getBottomEnd());
                        float f2 = ChaloTheme.b(composer2, i7).h;
                        float f3 = ChaloTheme.b(composer2, i7).h;
                        if (mutableIntState2.getIntValue() > 0) {
                            composer2.startReplaceGroup(-251942188);
                            composer2.endReplaceGroup();
                            fM7278constructorimpl = Dp.m7278constructorimpl(mutableIntState2.getIntValue());
                        } else {
                            composer2.startReplaceGroup(-251843422);
                            fM7278constructorimpl = ChaloTheme.b(composer2, i7).j;
                            composer2.endReplaceGroup();
                        }
                        AnimatedVisibilityKt.AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState, PaddingKt.m787paddingqDBjuR0(modifierAlign2, f2, ChaloTheme.b(composer2, i7).j, f3, fM7278constructorimpl), enterTransitionM86scaleInL8ZKhE$default, exitTransitionM88scaleOutL8ZKhE$default, (String) null, ComposableLambdaKt.rememberComposableLambda(1131599736, true, new t31(mainScreen2, 2), composer2, 54), composer2, MutableTransitionState.$stable | 200064, 16);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
            ConfirmationDialogUiState confirmationDialogUiState = mainScreen.f;
            if (confirmationDialogUiState == null) {
                composerStartRestartGroup.startReplaceGroup(-1091205508);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                dd.l(composerStartRestartGroup, -1091205507, confirmationDialogUiState, composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h01(i, 10, mainScreen, modalBottomSheetState, modifier2));
        }
    }
}
