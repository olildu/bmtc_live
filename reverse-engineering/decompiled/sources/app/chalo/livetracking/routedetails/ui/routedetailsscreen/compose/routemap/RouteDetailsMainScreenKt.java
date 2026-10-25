package app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.routemap;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.components.ChaloRoundedBottomSheetKt;
import app.chalo.compose.insets.PlatformInsets_androidKt;
import app.chalo.compose.utils.CommonContext_androidKt;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetScaffoldKt;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetScaffoldState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetValue;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.RouteDetailsScreenKt;
import app.chalo.livetracking.ui.routedetailsscreen.LivePassengerIndicatorBottomSheetContentUIState;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsIntent;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsViewState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.h0;
import defpackage.k31;
import defpackage.pk0;
import defpackage.r31;
import defpackage.sx0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewState;", "viewState", "", "shouldShowLivePassengerBottomSheet", "livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RouteDetailsMainScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(RouteDetailsComponent routeDetailsComponent, ChaloBuildConfig chaloBuildConfig, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.i(chaloBuildConfig, "chaloBuildConfig");
        Composer composerStartRestartGroup = composer.startRestartGroup(-258265573);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(routeDetailsComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(chaloBuildConfig) ? 32 : 16;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-258265573, i3, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.routemap.RouteDetailsMainScreen (RouteDetailsMainScreen.kt:51)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            MutableState mutableStateA = SubscribeAsStateKt.a(routeDetailsComponent.t0(), composerStartRestartGroup);
            BottomSheetScaffoldState bottomSheetScaffoldStateC = BottomSheetScaffoldKt.c(BottomSheetScaffoldKt.d(BottomSheetValue.Expanded, composerStartRestartGroup), composerStartRestartGroup, 5);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new r31(9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, (Function1) objRememberedValue2, composerStartRestartGroup, 54, 0);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(routeDetailsComponent) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(bottomSheetScaffoldStateC) | composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                RouteDetailsMainScreenKt$RouteDetailsMainScreen$1$1 routeDetailsMainScreenKt$RouteDetailsMainScreen$1$1 = new RouteDetailsMainScreenKt$RouteDetailsMainScreen$1$1(routeDetailsComponent, coroutineScope, bottomSheetScaffoldStateC, sheetStateRememberModalBottomSheetState, null);
                composerStartRestartGroup.updateRememberedValue(routeDetailsMainScreenKt$RouteDetailsMainScreen$1$1);
                objRememberedValue3 = routeDetailsMainScreenKt$RouteDetailsMainScreen$1$1;
            }
            EffectsKt.LaunchedEffect(routeDetailsComponent, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, i3 & 14);
            RouteDetailsViewState routeDetailsViewState = (RouteDetailsViewState) mutableStateA.getValue();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(routeDetailsComponent);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                RouteDetailsMainScreenKt$RouteDetailsMainScreen$2$1 routeDetailsMainScreenKt$RouteDetailsMainScreen$2$1 = new RouteDetailsMainScreenKt$RouteDetailsMainScreen$2$1(1, routeDetailsComponent, RouteDetailsComponent.class, "processIntent", "processIntent(Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsIntent;)V", 0);
                composerStartRestartGroup.updateRememberedValue(routeDetailsMainScreenKt$RouteDetailsMainScreen$2$1);
                objRememberedValue4 = routeDetailsMainScreenKt$RouteDetailsMainScreen$2$1;
            }
            composer2 = composerStartRestartGroup;
            b(routeDetailsViewState, bottomSheetScaffoldStateC, sheetStateRememberModalBottomSheetState, chaloBuildConfig, (Function1) ((KFunction) objRememberedValue4), composer2, (i3 << 6) & 7168);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new k31(routeDetailsComponent, chaloBuildConfig, i, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(RouteDetailsViewState routeDetailsViewState, BottomSheetScaffoldState bottomSheetScaffoldState, final SheetState sheetState, ChaloBuildConfig chaloBuildConfig, final Function1 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1861423234);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(routeDetailsViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(bottomSheetScaffoldState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(sheetState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(chaloBuildConfig) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1861423234, i2, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.routemap.RouteDetailsScreenContent (RouteDetailsMainScreen.kt:93)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            int i3 = i2 & 896;
            boolean zChangedInstance = ((i2 & 57344) == 16384) | (i3 == 256) | composerStartRestartGroup.changedInstance(coroutineScope);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.routemap.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        SheetState sheetState2 = sheetState;
                        if (sheetState2.isVisible()) {
                            BuildersKt.d(coroutineScope, null, null, new RouteDetailsMainScreenKt$RouteDetailsScreenContent$1$1$1(sheetState2, null), 3);
                        } else {
                            function1.invoke(RouteDetailsIntent.OnBackPressed.f4843a);
                        }
                        return Unit.f17538a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            int i4 = i2;
            BackHandlerKt.a(false, (Function0) objRememberedValue2, 0, 0, composerStartRestartGroup, 3);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(sheetState.isVisible()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState = (MutableState) objRememberedValue3;
            boolean z = i3 == 256;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new RouteDetailsMainScreenKt$RouteDetailsScreenContent$2$1(sheetState, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            int i5 = (i4 >> 6) & 14;
            EffectsKt.LaunchedEffect(sheetState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, i5);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(2121371122);
                LivePassengerIndicatorBottomSheetContentUIState livePassengerIndicatorBottomSheetContentUIState = routeDetailsViewState.f4877a;
                if (livePassengerIndicatorBottomSheetContentUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(1337995343);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1337995344);
                    ChaloRoundedBottomSheetKt.a(sheetState, null, false, false, false, ComposableLambdaKt.rememberComposableLambda(-1328855979, true, new sx0(livePassengerIndicatorBottomSheetContentUIState, 10), composerStartRestartGroup, 54), composerStartRestartGroup, i5 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                    composerStartRestartGroup.endReplaceGroup();
                }
            } else {
                composerStartRestartGroup.startReplaceGroup(1332824544);
            }
            composerStartRestartGroup.endReplaceGroup();
            CommonContext_androidKt.a(composerStartRestartGroup);
            PlatformInsets_androidKt.a(6, composerStartRestartGroup, r18);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, 0);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r18);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            RouteDetailsScreenKt.a(routeDetailsViewState, function1, bottomSheetScaffoldState, composerStartRestartGroup, (i4 & 14) | ((i4 >> 9) & 112) | ((i4 << 3) & 896));
            chaloBuildConfig.getClass();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h0(routeDetailsViewState, bottomSheetScaffoldState, sheetState, chaloBuildConfig, function1, i, 29));
        }
    }
}
