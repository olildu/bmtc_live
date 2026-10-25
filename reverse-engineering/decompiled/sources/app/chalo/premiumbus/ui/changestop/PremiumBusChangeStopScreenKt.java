package app.chalo.premiumbus.ui.changestop;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.BottomSheetScaffoldState;
import androidx.compose.material3.SheetValue;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.components.ChaloCircularProgressIndicatorKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ComposeUtils_androidKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.buttons.ChaloCircularBackButtonKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.chalomap.ChaloMap_androidKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.premiumbus.ui.changestop.ChangeStopScreenContent;
import app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopIntent;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.utils.SheetDefaultsHelperKt;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.dq;
import defpackage.eq0;
import defpackage.ot0;
import defpackage.pk0;
import defpackage.r1;
import defpackage.t8;
import defpackage.wm0;
import defpackage.zr0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004¨\u0006\b²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "footerHeightPx", "Landroidx/compose/ui/unit/Dp;", "sheetPeekHeight", "backButtonElevation", "titleStartPadding", "productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusChangeStopScreenKt {
    public static final void a(ChangeStopScreenContent.NoStopsAvailable noStopsAvailable, Function0 function0, Composer composer, int i) {
        int i2;
        Function0 function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1160210995);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(noStopsAvailable) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1160210995, i2, -1, "app.chalo.premiumbus.ui.changestop.NoStopsAvailableContent (PremiumBusChangeStopScreen.kt:267)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierA = dq.a(columnScopeInstance, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ChaloMap_androidKt.c(noStopsAvailable.c, boxScopeInstance.matchParentSize(companion), composerStartRestartGroup, 0);
            ChaloCircularBackButtonKt.a(PaddingKt.m784padding3ABfNKs(boxScopeInstance.align(companion, companion2.getTopStart()), ChaloTheme.b(composerStartRestartGroup, 0).h), 0L, 0.0f, function0, composerStartRestartGroup, (i2 << 6) & 7168, 6);
            function1 = function0;
            composerStartRestartGroup.endNode();
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m263backgroundbw27NRU(dq.a(columnScopeInstance, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), ChaloColorTokenKt.c(ChaloColorToken.White.f9870a), ChaloThemeKt.d(UIShape.j)), ChaloTheme.b(composerStartRestartGroup, 0).i);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getCenter(), companion2.getCenterHorizontally(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
            CommonImageKt.a(noStopsAvailable.f7515a, null, false, composerStartRestartGroup, 0, 6);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloSpacersKt.n(composerStartRestartGroup, 0);
            TextKt.c(noStopsAvailable.b, null, null, null, composerStartRestartGroup, 0, 14);
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function1 = function0;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eq0(noStopsAvailable, function1, i, 13));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final PremiumBusChangeStopComponent premiumBusChangeStopComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1747488665);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(premiumBusChangeStopComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1747488665, i2, -1, "app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopScreen (PremiumBusChangeStopScreen.kt:65)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(premiumBusChangeStopComponent.t0(), composerStartRestartGroup);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            final BottomSheetScaffoldState bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(SheetDefaultsHelperKt.a(false, null, SheetValue.PartiallyExpanded, true, composerStartRestartGroup, 3456, 51), null, composerStartRestartGroup, 0, 2);
            boolean zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldStateRememberBottomSheetScaffoldState) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(premiumBusChangeStopComponent);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: app.chalo.premiumbus.ui.changestop.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        BottomSheetScaffoldState bottomSheetScaffoldState = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                        if (bottomSheetScaffoldState.getBottomSheetState().getCurrentValue() == SheetValue.Expanded) {
                            BuildersKt.d(coroutineScope, null, null, new PremiumBusChangeStopScreenKt$PremiumBusChangeStopScreen$1$1$1(bottomSheetScaffoldState, null), 3);
                        } else {
                            premiumBusChangeStopComponent.F0(PremiumBusChangeStopIntent.BackPressed.f7529a);
                        }
                        return Unit.f17538a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            BackHandlerKt.a(false, (Function0) objRememberedValue2, 0, 0, composerStartRestartGroup, 3);
            ChangeStopScreenContent changeStopScreenContent = ((PremiumBusChangeStopViewState) mutableStateA.getValue()).f7540a;
            if (Intrinsics.d(changeStopScreenContent, ChangeStopScreenContent.Loading.f7514a)) {
                composerStartRestartGroup.startReplaceGroup(137043903);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                pk0.v(companion4, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
                ChaloCircularProgressIndicatorKt.b(BoxScopeInstance.INSTANCE.align(companion2, companion3.getCenter()), 0.0f, composerStartRestartGroup, 0, 2);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else if (changeStopScreenContent instanceof ChangeStopScreenContent.StopList) {
                composerStartRestartGroup.startReplaceGroup(4427825);
                ChangeStopScreenContent.StopList stopList = (ChangeStopScreenContent.StopList) changeStopScreenContent;
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(premiumBusChangeStopComponent);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                    final int i4 = 0;
                    objRememberedValue3 = new Function0() { // from class: pt0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i4) {
                                case 0:
                                    premiumBusChangeStopComponent.F0(PremiumBusChangeStopIntent.BackPressed.f7529a);
                                    break;
                                case 1:
                                    premiumBusChangeStopComponent.F0(PremiumBusChangeStopIntent.BackPressed.f7529a);
                                    break;
                                default:
                                    premiumBusChangeStopComponent.F0(PremiumBusChangeStopIntent.OnResultScreenAnimationComplete.f7533a);
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                c(stopList, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, (Function0) objRememberedValue3, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (changeStopScreenContent instanceof ChangeStopScreenContent.NoStopsAvailable) {
                composerStartRestartGroup.startReplaceGroup(4436504);
                ChangeStopScreenContent.NoStopsAvailable noStopsAvailable = (ChangeStopScreenContent.NoStopsAvailable) changeStopScreenContent;
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(premiumBusChangeStopComponent);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                    final int i5 = 1;
                    objRememberedValue4 = new Function0() { // from class: pt0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i5) {
                                case 0:
                                    premiumBusChangeStopComponent.F0(PremiumBusChangeStopIntent.BackPressed.f7529a);
                                    break;
                                case 1:
                                    premiumBusChangeStopComponent.F0(PremiumBusChangeStopIntent.BackPressed.f7529a);
                                    break;
                                default:
                                    premiumBusChangeStopComponent.F0(PremiumBusChangeStopIntent.OnResultScreenAnimationComplete.f7533a);
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                a(noStopsAvailable, (Function0) objRememberedValue4, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(changeStopScreenContent instanceof ChangeStopScreenContent.Result)) {
                    throw pk0.p(composerStartRestartGroup, 4419039);
                }
                composerStartRestartGroup.startReplaceGroup(4443151);
                ChangeStopResultScreenUIState changeStopResultScreenUIState = ((ChangeStopScreenContent.Result) changeStopScreenContent).f7516a;
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(premiumBusChangeStopComponent);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue5 == companion.getEmpty()) {
                    final int i6 = 2;
                    objRememberedValue5 = new Function0() { // from class: pt0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i6) {
                                case 0:
                                    premiumBusChangeStopComponent.F0(PremiumBusChangeStopIntent.BackPressed.f7529a);
                                    break;
                                case 1:
                                    premiumBusChangeStopComponent.F0(PremiumBusChangeStopIntent.BackPressed.f7529a);
                                    break;
                                default:
                                    premiumBusChangeStopComponent.F0(PremiumBusChangeStopIntent.OnResultScreenAnimationComplete.f7533a);
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                PremiumBusChangeStopComposablesKt.c(null, changeStopResultScreenUIState, (Function0) objRememberedValue5, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zr0(premiumBusChangeStopComponent, i, 10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final ChangeStopScreenContent.StopList stopList, BottomSheetScaffoldState bottomSheetScaffoldState, Function0 function0, Composer composer, int i) {
        int i2;
        BottomSheetScaffoldState bottomSheetScaffoldState2;
        float f;
        float f2;
        ChangeStopScreenContent.StopList stopList2 = stopList;
        Composer composerStartRestartGroup = composer.startRestartGroup(289419654);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(stopList2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            bottomSheetScaffoldState2 = bottomSheetScaffoldState;
            i2 |= composerStartRestartGroup.changed(bottomSheetScaffoldState2) ? 32 : 16;
        } else {
            bottomSheetScaffoldState2 = bottomSheetScaffoldState;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(289419654, i2, -1, "app.chalo.premiumbus.ui.changestop.StopListContent (PremiumBusChangeStopScreen.kt:114)");
            }
            float fB = ComposeUtils_androidKt.b(composerStartRestartGroup);
            final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final float fM7292unboximpl = ((Dp) RangesKt.a(Dp.m7276boximpl(Dp.m7278constructorimpl(fB - density.mo401toDpu2uoSUM(((Number) ((MutableState) objRememberedValue).getValue()).intValue()))), Dp.m7276boximpl(Dp.m7278constructorimpl(0)))).m7292unboximpl();
            boolean zChanged = composerStartRestartGroup.changed(fM7292unboximpl);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = Dp.m7276boximpl(Dp.m7278constructorimpl(fM7292unboximpl / 2));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final float fM7292unboximpl2 = ((Dp) objRememberedValue2).m7292unboximpl();
            boolean zChanged2 = composerStartRestartGroup.changed(fM7292unboximpl2);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m7276boximpl(fM7292unboximpl2), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableState mutableState = (MutableState) objRememberedValue3;
            final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            boolean z = bottomSheetScaffoldState2.getBottomSheetState().getTargetValue() == SheetValue.Expanded;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1040560433);
                f = ChaloTheme.b(composerStartRestartGroup, 0).f1916a;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1040559380);
                f = ChaloTheme.b(composerStartRestartGroup, 0).e;
            }
            composerStartRestartGroup.endReplaceGroup();
            State<Dp> stateM163animateDpAsStateAjpBEmI = AnimateAsStateKt.m163animateDpAsStateAjpBEmI(f, AnimationSpecKt.tween$default(100, 0, EasingKt.getLinearOutSlowInEasing(), 2, null), null, null, composerStartRestartGroup, 0, 12);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1040553332);
                f2 = ChaloTheme.b(composerStartRestartGroup, 0).r;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1040552371);
                f2 = ChaloTheme.b(composerStartRestartGroup, 0).h;
            }
            composerStartRestartGroup.endReplaceGroup();
            final State<Dp> stateM163animateDpAsStateAjpBEmI2 = AnimateAsStateKt.m163animateDpAsStateAjpBEmI(f2, AnimationSpecKt.tween$default(300, 0, EasingKt.getLinearOutSlowInEasing(), 2, null), null, null, composerStartRestartGroup, 0, 12);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            pk0.v(companion4, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion4, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            Modifier modifierClipToBounds = ClipKt.clipToBounds(SizeKt.m816heightInVpY3zN4$default(dq.a(ColumnScopeInstance.INSTANCE, companion2, 1.0f, false, 2, null), 0.0f, fM7292unboximpl, 1, null));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierClipToBounds);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion4, composerM3915constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
            stopList2 = stopList;
            int i6 = i2 << 3;
            BottomSheetScaffoldKt.m1663BottomSheetScaffoldsdMYb0k(ComposableLambdaKt.rememberComposableLambda(-547093995, true, new Function3() { // from class: qt0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ColumnScope BottomSheetScaffold = (ColumnScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    Intrinsics.i(BottomSheetScaffold, "$this$BottomSheetScaffold");
                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-547093995, iIntValue, -1, "app.chalo.premiumbus.ui.changestop.StopListContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PremiumBusChangeStopScreen.kt:169)");
                        }
                        Modifier modifierM816heightInVpY3zN4$default = SizeKt.m816heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, fM7292unboximpl, 1, null);
                        Density density2 = density;
                        boolean zChanged3 = composer2.changed(density2);
                        MutableState mutableState2 = mutableState;
                        boolean zChanged4 = zChanged3 | composer2.changed(mutableState2);
                        float f3 = fM7292unboximpl2;
                        boolean zChanged5 = zChanged4 | composer2.changed(f3);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChanged5 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new u3(density2, f3, mutableState2, 4);
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierM816heightInVpY3zN4$default, (Function1) objRememberedValue4);
                        ChangeStopScreenContent.StopList stopList3 = stopList;
                        boolean zChangedInstance = composer2.changedInstance(stopList3);
                        State state = stateM163animateDpAsStateAjpBEmI2;
                        boolean zChanged6 = zChangedInstance | composer2.changed(state);
                        Object objRememberedValue5 = composer2.rememberedValue();
                        if (zChanged6 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new ej0(27, stopList3, state);
                            composer2.updateRememberedValue(objRememberedValue5);
                        }
                        LazyDslKt.LazyColumn(modifierOnGloballyPositioned, lazyListStateRememberLazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue5, composer2, 0, TypedValues.PositionType.TYPE_CURVE_FIT);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), null, bottomSheetScaffoldState, ((Dp) mutableState.getValue()).m7292unboximpl(), 0.0f, ChaloTheme.d(composerStartRestartGroup, 0).j, ChaloTheme.a(composerStartRestartGroup, 0).t, 0L, ChaloTheme.b(composerStartRestartGroup, 0).f1916a, ChaloTheme.b(composerStartRestartGroup, 0).f1916a, ComposableSingletons$PremiumBusChangeStopScreenKt.b, false, null, null, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(-1698680705, true, new ot0(stopList2, 1), composerStartRestartGroup, 54), composerStartRestartGroup, (i6 & 896) | 6, 1572870, 63634);
            composerStartRestartGroup.endNode();
            ChaloFilledButtonKt.a(0, 0, composerStartRestartGroup, PaddingKt.m784padding3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), ChaloThemeHelper.a().h), stopList2.d);
            composerStartRestartGroup.endNode();
            ChaloCircularBackButtonKt.a(PaddingKt.m785paddingVpY3zN4(boxScopeInstance.align(companion2, companion3.getTopStart()), ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloThemeHelper.a().h), 0L, stateM163animateDpAsStateAjpBEmI.getValue().m7292unboximpl(), function0, composerStartRestartGroup, i6 & 7168, 2);
            composerStartRestartGroup = composerStartRestartGroup;
            LoadingDialogUIState loadingDialogUIState = stopList2.e;
            if (loadingDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-942561283);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                t8.m(composerStartRestartGroup, -942561282, loadingDialogUIState, composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new wm0(i, 15, stopList2, bottomSheetScaffoldState, function0));
        }
    }
}
