package app.chalo.premiumbus.ui.slotselection;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.components.ChaloRadioButtonKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.dialog.ErrorBottomSheetUISpecs;
import app.chalo.uistate.dialog.ErrorBottomSheetUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.radiobutton.RadioButtonUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.utils.timeutil.TimeUtilsContract;
import defpackage.ar0;
import defpackage.b3;
import defpackage.b9;
import defpackage.bu0;
import defpackage.dk;
import defpackage.dq;
import defpackage.dv0;
import defpackage.eh;
import defpackage.fp0;
import defpackage.fu0;
import defpackage.i41;
import defpackage.kn0;
import defpackage.lu0;
import defpackage.md;
import defpackage.n20;
import defpackage.nf1;
import defpackage.nm;
import defpackage.pk0;
import defpackage.qv0;
import defpackage.r1;
import defpackage.rb;
import defpackage.sm;
import defpackage.tv0;
import defpackage.u3;
import defpackage.uv0;
import defpackage.v;
import defpackage.vd;
import defpackage.y4;
import defpackage.yu0;
import defpackage.zc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004¨\u0006\u0007²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "selectedHour", "selectedMinute", "", "selectedAmPm", "wheelHeight", "lastFocusedItem", "productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusSlotSelectionUiStateKt {
    public static final void a(Modifier modifier, int i, int i2, Function1 onFocusItem, boolean z, Function4 content, Composer composer, int i3) {
        int i4;
        Function4 function4;
        Composer composer2;
        boolean z2;
        State state;
        int i5;
        Continuation continuation;
        Intrinsics.i(modifier, "modifier");
        Intrinsics.i(onFocusItem, "onFocusItem");
        Intrinsics.i(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1362470624);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onFocusItem) ? 2048 : 1024;
        }
        int i6 = i4 | 221184;
        if ((1572864 & i3) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(content) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i6) != 599186, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1362470624, i6, -1, "app.chalo.premiumbus.ui.slotselection.AMPMPicker (PremiumBusSlotSelectionUiState.kt:1759)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            HapticFeedback hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
            float f = ChaloThemeHelper.a().n;
            composerStartRestartGroup.startReplaceGroup(-630741537);
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(i, 0, composerStartRestartGroup, (i6 >> 3) & 14, 2);
            composerStartRestartGroup.endReplaceGroup();
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableIntState mutableIntState = (MutableIntState) objRememberedValue2;
            boolean zIsScrollInProgress = lazyListStateRememberLazyListState.isScrollInProgress();
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.derivedStateOf(new tv0(lazyListStateRememberLazyListState, mutableIntState, 0));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            State state2 = (State) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState = (MutableState) objRememberedValue4;
            Integer numValueOf = Integer.valueOf(i);
            boolean zChanged = ((i6 & 112) == 32) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new PremiumBusSlotSelectionUiStateKt$AMPMPicker$1$1(i, lazyListStateRememberLazyListState, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, (i6 >> 3) & 14);
            Boolean boolValueOf = Boolean.valueOf(zIsScrollInProgress);
            boolean zChanged2 = ((i6 & 896) == 256) | composerStartRestartGroup.changed(zIsScrollInProgress) | ((i6 & 7168) == 2048) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue6 == companion.getEmpty()) {
                int i7 = i6;
                state = state2;
                i5 = i7;
                continuation = null;
                PremiumBusSlotSelectionUiStateKt$AMPMPicker$2$1 premiumBusSlotSelectionUiStateKt$AMPMPicker$2$1 = new PremiumBusSlotSelectionUiStateKt$AMPMPicker$2$1(zIsScrollInProgress, state, i2, onFocusItem, coroutineScope, mutableState, lazyListStateRememberLazyListState, null);
                composerStartRestartGroup.updateRememberedValue(premiumBusSlotSelectionUiStateKt$AMPMPicker$2$1);
                objRememberedValue6 = premiumBusSlotSelectionUiStateKt$AMPMPicker$2$1;
            } else {
                i5 = i6;
                state = state2;
                continuation = null;
            }
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 0);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(hapticFeedback);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new PremiumBusSlotSelectionUiStateKt$AMPMPicker$3$1(state, hapticFeedback, continuation);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            EffectsKt.LaunchedEffect(lazyListStateRememberLazyListState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composerStartRestartGroup, 0);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            int i8 = 5;
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new vd(mutableIntState, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifier, (Function1) objRememberedValue8);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i9 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i9), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, continuation), Dp.m7278constructorimpl(r23 * 3));
            boolean zChanged3 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | composerStartRestartGroup.changed(r23) | ((i5 & 3670016) == 1048576);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue9 == companion.getEmpty()) {
                function4 = content;
                objRememberedValue9 = new u3(lazyListStateRememberLazyListState, f, function4, i8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            } else {
                function4 = content;
            }
            composer2 = composerStartRestartGroup;
            LazyDslKt.LazyColumn(modifierM814height3ABfNKs, lazyListStateRememberLazyListState, null, false, null, null, null, true, null, (Function1) objRememberedValue9, composer2, (i5 << 9) & 29360128, 380);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = true;
        } else {
            function4 = content;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            z2 = z;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new uv0(modifier, i, i2, onFocusItem, z2, function4, i3, 0));
        }
    }

    public static final void b(Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(307670127);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(307670127, i2, -1, "app.chalo.premiumbus.ui.slotselection.FromToStopIconView (PremiumBusSlotSelectionUiState.kt:964)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            IconType iconType = IconType.IC_BUS_STOP;
            CommonImageKt.a(new ImageUIState(iconType, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), null, false, composerStartRestartGroup, 0, 6);
            v(columnScopeInstance.weight(Modifier.INSTANCE, 1.0f, true), composerStartRestartGroup, 0);
            CommonImageKt.a(new ImageUIState(iconType, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), null, false, composerStartRestartGroup, 0, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zc(modifier, i, 20));
        }
    }

    public static final void c(ErrorBottomSheetUIState errorBottomSheetUIState, Composer composer, int i) {
        int i2;
        Object obj = errorBottomSheetUIState.g;
        Composer composerStartRestartGroup = composer.startRestartGroup(628319464);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(errorBottomSheetUIState) : composerStartRestartGroup.changedInstance(errorBottomSheetUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(628319464, i2, -1, "app.chalo.premiumbus.ui.slotselection.MultiDateSelectionCalendarErrorBottomSheetContent (PremiumBusSlotSelectionUiState.kt:1893)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            ErrorBottomSheetUISpecs errorBottomSheetUISpecs = (ErrorBottomSheetUISpecs) obj;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierC = ChaloThemeKt.c(companion, errorBottomSheetUISpecs.f9997a);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
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
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageUIState imageUIState = errorBottomSheetUIState.f;
            if (imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1435638813);
            } else {
                composerStartRestartGroup.startReplaceGroup(1435638814);
                CommonImageKt.a(imageUIState, null, false, composerStartRestartGroup, 0, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            SpacerKt.Spacer(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            ImageUIState imageUIState2 = errorBottomSheetUIState.e;
            if (imageUIState2 == null) {
                composerStartRestartGroup.startReplaceGroup(1435782281);
            } else {
                composerStartRestartGroup.startReplaceGroup(1435782282);
                CommonImageKt.a(imageUIState2, null, false, composerStartRestartGroup, 0, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            ChaloSpacersKt.a(errorBottomSheetUISpecs.b, composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, errorBottomSheetUIState.f9998a, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup = composerStartRestartGroup;
            TextUIState.ChaloTextUIState chaloTextUIState = errorBottomSheetUIState.b;
            if (chaloTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1963947733);
            } else {
                composerStartRestartGroup.startReplaceGroup(1963947734);
                ChaloSpacersKt.a(errorBottomSheetUISpecs.c, composerStartRestartGroup, 0);
                ChaloTextViewKt.a(null, chaloTextUIState, null, null, composerStartRestartGroup, 0, 13);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            ButtonUIState buttonUIState = errorBottomSheetUIState.c;
            if (buttonUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1964089434);
            } else {
                composerStartRestartGroup.startReplaceGroup(1964089435);
                ChaloSpacersKt.a(errorBottomSheetUISpecs.d, composerStartRestartGroup, 0);
                ChaloFilledButtonKt.a(6, 0, composerStartRestartGroup, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), buttonUIState);
            }
            composerStartRestartGroup.endReplaceGroup();
            ButtonUIState buttonUIState2 = errorBottomSheetUIState.d;
            if (buttonUIState2 == null) {
                composerStartRestartGroup.startReplaceGroup(1964320198);
            } else {
                composerStartRestartGroup.startReplaceGroup(1964320199);
                ChaloSpacersKt.a(errorBottomSheetUISpecs.e, composerStartRestartGroup, 0);
                ChaloFilledButtonKt.a(6, 0, composerStartRestartGroup, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), buttonUIState2);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yu0(errorBottomSheetUIState, i, 7));
        }
    }

    public static final void d(Modifier modifier, NoRideAvailableForSelectedTimeUIState state, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        Object obj = state.f7814a;
        Composer composerStartRestartGroup = composer.startRestartGroup(2144349583);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2144349583, i2, -1, "app.chalo.premiumbus.ui.slotselection.NoRideAvailableForSelectedTimeUI (PremiumBusSlotSelectionUiState.kt:1503)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            NoRideAvailableForSelectedTimeUISpec noRideAvailableForSelectedTimeUISpec = (NoRideAvailableForSelectedTimeUISpec) obj;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloColorTokenKt.c(noRideAvailableForSelectedTimeUISpec.c), ChaloThemeKt.d(noRideAvailableForSelectedTimeUISpec.b)), noRideAvailableForSelectedTimeUISpec.f7813a);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
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
            ImageUIState imageUIState = state.c;
            if (imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(738198861);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(738198862);
                CommonImageKt.a(imageUIState, null, false, composerStartRestartGroup, 0, 6);
                nf1.t(Modifier.INSTANCE, noRideAvailableForSelectedTimeUISpec.d, composerStartRestartGroup, 0);
            }
            ChaloTextViewKt.a(null, state.b, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bu0(i, 12, modifier, state));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0267  */
    /* JADX WARN: Code duplicated, block: B:102:0x026b  */
    /* JADX WARN: Code duplicated, block: B:105:0x029b  */
    /* JADX WARN: Code duplicated, block: B:106:0x029d  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:117:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:120:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:74:0x019f  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:91:0x020b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0223  */
    /* JADX WARN: Code duplicated, block: B:98:0x025b  */
    public static final void e(Modifier modifier, int i, int i2, Function1 onFocusItem, boolean z, Function4 function4, Composer composer, int i3) {
        int i4;
        final int i5;
        Composer composer2;
        boolean z2;
        boolean z3;
        Integer num;
        Object premiumBusSlotSelectionUiStateKt$NumberPicker$1$1;
        MutableState mutableState;
        Integer num2;
        int i6;
        final LazyListState lazyListState;
        Boolean boolValueOf;
        int i7;
        boolean z4;
        boolean z5;
        boolean zChangedInstance;
        Object objRememberedValue;
        Boolean bool;
        State state;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Function0<ComposeUiNode> constructor;
        boolean z6;
        boolean zChanged;
        Object objRememberedValue4;
        final Function4 content = function4;
        Intrinsics.i(modifier, "modifier");
        Intrinsics.i(onFocusItem, "onFocusItem");
        Intrinsics.i(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2026972640);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onFocusItem) ? 2048 : 1024;
        }
        int i8 = i4 | 221184;
        if ((1572864 & i3) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(content) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i8) != 599186, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2026972640, i8, -1, "app.chalo.premiumbus.ui.slotselection.NumberPicker (PremiumBusSlotSelectionUiState.kt:1651)");
            }
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue5;
            HapticFeedback hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
            final float f = ChaloThemeHelper.a().n;
            int i9 = ((i2 * 1000) + i) - 2;
            composerStartRestartGroup.startReplaceGroup(1994463457);
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(i9, 0, composerStartRestartGroup, 0, 2);
            composerStartRestartGroup.endReplaceGroup();
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            MutableIntState mutableIntState = (MutableIntState) objRememberedValue6;
            boolean zIsScrollInProgress = lazyListStateRememberLazyListState.isScrollInProgress();
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                State stateDerivedStateOf = SnapshotStateKt.derivedStateOf(new tv0(lazyListStateRememberLazyListState, mutableIntState, 1));
                composerStartRestartGroup.updateRememberedValue(stateDerivedStateOf);
                z3 = true;
                objRememberedValue7 = stateDerivedStateOf;
            } else {
                z3 = true;
            }
            State state2 = (State) objRememberedValue7;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue8;
            Integer numValueOf = Integer.valueOf(i2);
            Integer numValueOf2 = Integer.valueOf(i);
            int i10 = i8 & 112;
            boolean zChanged2 = (i10 == 32 ? z3 : false) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | composerStartRestartGroup.changed(i9);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                num = numValueOf;
            } else {
                num = numValueOf;
                if (objRememberedValue9 != companion.getEmpty()) {
                    premiumBusSlotSelectionUiStateKt$NumberPicker$1$1 = objRememberedValue9;
                    lazyListState = lazyListStateRememberLazyListState;
                    mutableState = mutableState2;
                    num2 = num;
                    i6 = i10;
                }
                EffectsKt.LaunchedEffect(num2, numValueOf2, (Function2) premiumBusSlotSelectionUiStateKt$NumberPicker$1$1, composerStartRestartGroup, ((i8 >> 6) & 14) | i6);
                boolValueOf = Boolean.valueOf(zIsScrollInProgress);
                boolean zChanged3 = composerStartRestartGroup.changed(zIsScrollInProgress);
                i7 = i8 & 896;
                if (i7 == 256) {
                    z4 = z3;
                } else {
                    z4 = false;
                }
                boolean z7 = zChanged3 | z4;
                if ((i8 & 7168) == 2048) {
                    z5 = z3;
                } else {
                    z5 = false;
                }
                zChangedInstance = z7 | z5 | composerStartRestartGroup.changedInstance(r23) | composerStartRestartGroup.changed(lazyListState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == companion.getEmpty()) {
                    LazyListState lazyListState2 = lazyListState;
                    bool = boolValueOf;
                    PremiumBusSlotSelectionUiStateKt$NumberPicker$2$1 premiumBusSlotSelectionUiStateKt$NumberPicker$2$1 = new PremiumBusSlotSelectionUiStateKt$NumberPicker$2$1(zIsScrollInProgress, state2, i2, onFocusItem, coroutineScope, mutableState, lazyListState2, null);
                    state = state2;
                    i5 = i2;
                    lazyListState = lazyListState2;
                    composerStartRestartGroup.updateRememberedValue(premiumBusSlotSelectionUiStateKt$NumberPicker$2$1);
                    objRememberedValue = premiumBusSlotSelectionUiStateKt$NumberPicker$2$1;
                } else {
                    i5 = i2;
                    state = state2;
                    bool = boolValueOf;
                }
                EffectsKt.LaunchedEffect((Object) bool, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, (int) r20);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(hapticFeedback);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new PremiumBusSlotSelectionUiStateKt$NumberPicker$3$1(state, hapticFeedback, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                EffectsKt.LaunchedEffect((Object) lazyListState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, (int) r20);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new vd(mutableIntState, 6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifier, (Function1) objRememberedValue3);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r20);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, r20);
                int i11 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
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
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i11), composerM3915constructorimpl));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7278constructorimpl(f * 5));
                if (i7 == 256) {
                    z6 = true;
                } else {
                    z6 = r20;
                }
                zChanged = z6 | composerStartRestartGroup.changed(lazyListState) | composerStartRestartGroup.changed(f) | ((i8 & 3670016) == 1048576);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue4 == companion.getEmpty()) {
                    content = function4;
                    objRememberedValue4 = new Function1() { // from class: vv0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            LazyListScope LazyColumn = (LazyListScope) obj;
                            Intrinsics.i(LazyColumn, "$this$LazyColumn");
                            final int i12 = i5;
                            final LazyListState lazyListState3 = lazyListState;
                            final float f2 = f;
                            final Function4 function5 = content;
                            LazyListScope.CC.o(LazyColumn, Integer.MAX_VALUE, null, null, ComposableLambdaKt.composableLambdaInstance(388626116, true, new Function4() { // from class: xv0
                                @Override // kotlin.jvm.functions.Function4
                                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                    int i13;
                                    LazyItemScope items = (LazyItemScope) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    Composer composer3 = (Composer) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    Intrinsics.i(items, "$this$items");
                                    if ((iIntValue2 & 6) == 0) {
                                        i13 = (composer3.changed(items) ? 4 : 2) | iIntValue2;
                                    } else {
                                        i13 = iIntValue2;
                                    }
                                    if ((iIntValue2 & 48) == 0) {
                                        i13 |= composer3.changed(iIntValue) ? 32 : 16;
                                    }
                                    if (composer3.shouldExecute((i13 & 147) != 146, i13 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(388626116, i13, -1, "app.chalo.premiumbus.ui.slotselection.NumberPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PremiumBusSlotSelectionUiState.kt:1725)");
                                        }
                                        int i14 = iIntValue % i12;
                                        Modifier modifierAlpha = AlphaKt.alpha(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, f2), 0.0f, 1, null), 1.0f - (RangesKt.d(Math.abs((iIntValue - lazyListState3.getFirstVisibleItemIndex()) - 2) / 2.0f, 0.0f, 1.0f) * 0.7f));
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                                        int i15 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierAlpha);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor2);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer3);
                                        pk0.v(companion3, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                                        Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i15), composerM3915constructorimpl2));
                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                        function5.invoke(items, Integer.valueOf(i14), composer3, Integer.valueOf(i13 & 14));
                                        composer3.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer3.skipToGroupEnd();
                                    }
                                    return Unit.f17538a;
                                }
                            }), 6, null);
                            return Unit.f17538a;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    content = function4;
                }
                composer2 = composerStartRestartGroup;
                LazyDslKt.LazyColumn(modifierM814height3ABfNKs, lazyListState, null, false, null, null, null, true, null, (Function1) objRememberedValue4, composer2, (i8 << 9) & 29360128, 380);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z2 = true;
            }
            mutableState = mutableState2;
            num2 = num;
            i6 = i10;
            lazyListState = lazyListStateRememberLazyListState;
            premiumBusSlotSelectionUiStateKt$NumberPicker$1$1 = new PremiumBusSlotSelectionUiStateKt$NumberPicker$1$1(i, lazyListState, i9, mutableState, null);
            composerStartRestartGroup.updateRememberedValue(premiumBusSlotSelectionUiStateKt$NumberPicker$1$1);
            EffectsKt.LaunchedEffect(num2, numValueOf2, (Function2) premiumBusSlotSelectionUiStateKt$NumberPicker$1$1, composerStartRestartGroup, ((i8 >> 6) & 14) | i6);
            boolValueOf = Boolean.valueOf(zIsScrollInProgress);
            boolean zChanged4 = composerStartRestartGroup.changed(zIsScrollInProgress);
            i7 = i8 & 896;
            if (i7 == 256) {
                z4 = z3;
            } else {
                z4 = false;
            }
            boolean z8 = zChanged4 | z4;
            if ((i8 & 7168) == 2048) {
                z5 = z3;
            } else {
                z5 = false;
            }
            zChangedInstance = z8 | z5 | composerStartRestartGroup.changedInstance(r23) | composerStartRestartGroup.changed(lazyListState);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
                LazyListState lazyListState3 = lazyListState;
                bool = boolValueOf;
                PremiumBusSlotSelectionUiStateKt$NumberPicker$2$1 premiumBusSlotSelectionUiStateKt$NumberPicker$2$2 = new PremiumBusSlotSelectionUiStateKt$NumberPicker$2$1(zIsScrollInProgress, state2, i2, onFocusItem, coroutineScope, mutableState, lazyListState3, null);
                state = state2;
                i5 = i2;
                lazyListState = lazyListState3;
                composerStartRestartGroup.updateRememberedValue(premiumBusSlotSelectionUiStateKt$NumberPicker$2$2);
                objRememberedValue = premiumBusSlotSelectionUiStateKt$NumberPicker$2$2;
            } else {
                LazyListState lazyListState4 = lazyListState;
                bool = boolValueOf;
                PremiumBusSlotSelectionUiStateKt$NumberPicker$2$1 premiumBusSlotSelectionUiStateKt$NumberPicker$2$3 = new PremiumBusSlotSelectionUiStateKt$NumberPicker$2$1(zIsScrollInProgress, state2, i2, onFocusItem, coroutineScope, mutableState, lazyListState4, null);
                state = state2;
                i5 = i2;
                lazyListState = lazyListState4;
                composerStartRestartGroup.updateRememberedValue(premiumBusSlotSelectionUiStateKt$NumberPicker$2$3);
                objRememberedValue = premiumBusSlotSelectionUiStateKt$NumberPicker$2$3;
            }
            EffectsKt.LaunchedEffect((Object) bool, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, (int) r20);
            zChangedInstance2 = composerStartRestartGroup.changedInstance(hapticFeedback);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2) {
                objRememberedValue2 = new PremiumBusSlotSelectionUiStateKt$NumberPicker$3$1(state, hapticFeedback, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new PremiumBusSlotSelectionUiStateKt$NumberPicker$3$1(state, hapticFeedback, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect((Object) lazyListState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, (int) r20);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new vd(mutableIntState, 6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierOnSizeChanged2 = OnRemeasuredModifierKt.onSizeChanged(modifier, (Function1) objRememberedValue3);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r20);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, r20);
            int i12 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i12), composerM3915constructorimpl2));
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            Modifier modifierM814height3ABfNKs2 = SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7278constructorimpl(f * 5));
            if (i7 == 256) {
                z6 = true;
            } else {
                z6 = r20;
            }
            zChanged = z6 | composerStartRestartGroup.changed(lazyListState) | composerStartRestartGroup.changed(f) | ((i8 & 3670016) == 1048576);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                content = function4;
                objRememberedValue4 = new Function1() { // from class: vv0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        Intrinsics.i(LazyColumn, "$this$LazyColumn");
                        final int i13 = i5;
                        final LazyListState lazyListState5 = lazyListState;
                        final float f2 = f;
                        final Function4 function5 = content;
                        LazyListScope.CC.o(LazyColumn, Integer.MAX_VALUE, null, null, ComposableLambdaKt.composableLambdaInstance(388626116, true, new Function4() { // from class: xv0
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                int i14;
                                LazyItemScope items = (LazyItemScope) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                Composer composer3 = (Composer) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                Intrinsics.i(items, "$this$items");
                                if ((iIntValue2 & 6) == 0) {
                                    i14 = (composer3.changed(items) ? 4 : 2) | iIntValue2;
                                } else {
                                    i14 = iIntValue2;
                                }
                                if ((iIntValue2 & 48) == 0) {
                                    i14 |= composer3.changed(iIntValue) ? 32 : 16;
                                }
                                if (composer3.shouldExecute((i14 & 147) != 146, i14 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(388626116, i14, -1, "app.chalo.premiumbus.ui.slotselection.NumberPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PremiumBusSlotSelectionUiState.kt:1725)");
                                    }
                                    int i15 = iIntValue % i13;
                                    Modifier modifierAlpha = AlphaKt.alpha(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, f2), 0.0f, 1, null), 1.0f - (RangesKt.d(Math.abs((iIntValue - lazyListState5.getFirstVisibleItemIndex()) - 2) / 2.0f, 0.0f, 1.0f) * 0.7f));
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                                    int i16 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierAlpha);
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer3);
                                    pk0.v(companion4, composerM3915constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
                                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl3, Integer.valueOf(i16), composerM3915constructorimpl3));
                                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                                    function5.invoke(items, Integer.valueOf(i15), composer3, Integer.valueOf(i14 & 14));
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                                return Unit.f17538a;
                            }
                        }), 6, null);
                        return Unit.f17538a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                content = function4;
                objRememberedValue4 = new Function1() { // from class: vv0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        Intrinsics.i(LazyColumn, "$this$LazyColumn");
                        final int i13 = i5;
                        final LazyListState lazyListState5 = lazyListState;
                        final float f2 = f;
                        final Function4 function5 = content;
                        LazyListScope.CC.o(LazyColumn, Integer.MAX_VALUE, null, null, ComposableLambdaKt.composableLambdaInstance(388626116, true, new Function4() { // from class: xv0
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                int i14;
                                LazyItemScope items = (LazyItemScope) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                Composer composer3 = (Composer) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                Intrinsics.i(items, "$this$items");
                                if ((iIntValue2 & 6) == 0) {
                                    i14 = (composer3.changed(items) ? 4 : 2) | iIntValue2;
                                } else {
                                    i14 = iIntValue2;
                                }
                                if ((iIntValue2 & 48) == 0) {
                                    i14 |= composer3.changed(iIntValue) ? 32 : 16;
                                }
                                if (composer3.shouldExecute((i14 & 147) != 146, i14 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(388626116, i14, -1, "app.chalo.premiumbus.ui.slotselection.NumberPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PremiumBusSlotSelectionUiState.kt:1725)");
                                    }
                                    int i15 = iIntValue % i13;
                                    Modifier modifierAlpha = AlphaKt.alpha(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, f2), 0.0f, 1, null), 1.0f - (RangesKt.d(Math.abs((iIntValue - lazyListState5.getFirstVisibleItemIndex()) - 2) / 2.0f, 0.0f, 1.0f) * 0.7f));
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                                    int i16 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierAlpha);
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer3);
                                    pk0.v(companion4, composerM3915constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
                                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl3, Integer.valueOf(i16), composerM3915constructorimpl3));
                                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                                    function5.invoke(items, Integer.valueOf(i15), composer3, Integer.valueOf(i14 & 14));
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                                return Unit.f17538a;
                            }
                        }), 6, null);
                        return Unit.f17538a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composer2 = composerStartRestartGroup;
            LazyDslKt.LazyColumn(modifierM814height3ABfNKs2, lazyListState, null, false, null, null, null, true, null, (Function1) objRememberedValue4, composer2, (i8 << 9) & 29360128, 380);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = true;
        } else {
            i5 = i2;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            z2 = z;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new uv0(modifier, i, i5, onFocusItem, z2, content, i3, 1));
        }
    }

    public static final void f(Modifier modifier, PBOdPairWithSlotsCardUIState state, boolean z, Composer composer, int i, int i2) {
        int i3;
        Intrinsics.i(state, "state");
        Object obj = state.f7822a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-999049523);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-999049523, i3, -1, "app.chalo.premiumbus.ui.slotselection.ODPairWithSlotsCard (PremiumBusSlotSelectionUiState.kt:842)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            PBOdPairWithSlotsCardUISpecs pBOdPairWithSlotsCardUISpecs = (PBOdPairWithSlotsCardUISpecs) obj;
            ChaloRoundedCardKt.b(ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloColorTokenKt.c(pBOdPairWithSlotsCardUISpecs.c), ChaloThemeKt.d(pBOdPairWithSlotsCardUISpecs.d)), pBOdPairWithSlotsCardUISpecs.b), null, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1351744212, true, new n20(pBOdPairWithSlotsCardUISpecs, state, z), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b9(modifier2, state, z, i, i2, 6));
        }
    }

    public static final void g(OfferTagUIState offerTagUIState, Composer composer, int i) {
        int i2;
        Intrinsics.i(offerTagUIState, "offerTagUIState");
        Object obj = offerTagUIState.f7818a;
        Composer composerStartRestartGroup = composer.startRestartGroup(1294670118);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(offerTagUIState) : composerStartRestartGroup.changedInstance(offerTagUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1294670118, i2, -1, "app.chalo.premiumbus.ui.slotselection.OfferTag (PremiumBusSlotSelectionUiState.kt:1874)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            OfferTagUISpecs offerTagUISpecs = (OfferTagUISpecs) obj;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, ChaloThemeKt.d(offerTagUISpecs.b)), ChaloColorTokenKt.c(offerTagUISpecs.f7817a), null, 2, null), offerTagUIState.d);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
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
            ImageUIState imageUIState = offerTagUIState.c;
            if (imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(555179001);
            } else {
                composerStartRestartGroup.startReplaceGroup(555179002);
                CommonImageKt.a(imageUIState, null, false, composerStartRestartGroup, 0, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloSpacersKt.B(composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, offerTagUIState.b, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yu0(offerTagUIState, i, 8));
        }
    }

    public static final void h(OutlinedButtonUIState state, boolean z, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        BorderUIState borderUIState = state.e;
        Composer composerStartRestartGroup = composer.startRestartGroup(788929400);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(788929400, i2, -1, "app.chalo.premiumbus.ui.slotselection.OutlinedButtonRow (PremiumBusSlotSelectionUiState.kt:933)");
            }
            Modifier modifierClip = ClipKt.clip(Modifier.INSTANCE, ChaloThemeKt.d(borderUIState.c));
            boolean z2 = !z;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(state);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new qv0(state, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(BorderKt.m275borderxT4_qwU(ClickableKt.m299clickableoSLSa3U$default(modifierClip, z2, null, null, null, (Function0) objRememberedValue, 14, null), borderUIState.f7793a, ChaloColorTokenKt.c(borderUIState.b), ChaloThemeKt.d(borderUIState.c)), ChaloColorTokenKt.c(state.f), ChaloThemeKt.d(state.g)), state.f7819a);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageUIState imageUIState = state.c;
            if (imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1267481383);
            } else {
                composerStartRestartGroup.startReplaceGroup(1267481384);
                CommonImageKt.a(imageUIState, null, false, composerStartRestartGroup, 0, 6);
                ChaloSpacersKt.B(composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloTextViewKt.a(null, state.b, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new md(i, z, i3, state));
        }
    }

    public static final void i(Modifier modifier, PassPurchaseNudgeCardUIState state, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        Object obj = state.f7831a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2017452226);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2017452226, i2, -1, "app.chalo.premiumbus.ui.slotselection.PbPrebookingBuyPassNudgeCard (PremiumBusSlotSelectionUiState.kt:1437)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            PassPurchaseNudgeCardUISpecs passPurchaseNudgeCardUISpecs = (PassPurchaseNudgeCardUISpecs) obj;
            RoundedCornerShape roundedCornerShapeD = ChaloThemeKt.d(passPurchaseNudgeCardUISpecs.b);
            BorderUIState borderUIState = passPurchaseNudgeCardUISpecs.d;
            BorderStroke borderStrokeM290BorderStrokecXLIe8U = BorderStrokeKt.m290BorderStrokecXLIe8U(borderUIState.f7793a, ChaloColorTokenKt.c(borderUIState.b));
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            float f = ChaloTheme.c(composerStartRestartGroup, 0).f1917a;
            int i3 = CardDefaults.$stable;
            CardElevation cardElevationM1695cardElevationaqJV_2Y = cardDefaults.m1695cardElevationaqJV_2Y(f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, i3 << 18, 62);
            CardColors cardColorsM1694cardColorsro_MJ88 = cardDefaults.m1694cardColorsro_MJ88(ChaloColorTokenKt.c(ChaloColorToken.White.f9870a), 0L, 0L, 0L, composerStartRestartGroup, i3 << 12, 14);
            Modifier modifierClip = ClipKt.clip(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloThemeKt.d(passPurchaseNudgeCardUISpecs.b));
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(state);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new qv0(state, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            CardKt.Card(ClickableKt.m299clickableoSLSa3U$default(modifierClip, false, null, null, null, (Function0) objRememberedValue2, 15, null), roundedCornerShapeD, cardColorsM1694cardColorsro_MJ88, cardElevationM1695cardElevationaqJV_2Y, borderStrokeM290BorderStrokecXLIe8U, ComposableLambdaKt.rememberComposableLambda(2014924428, true, new fu0(8, passPurchaseNudgeCardUISpecs, state), composerStartRestartGroup, 54), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bu0(i, 13, modifier, state));
        }
    }

    public static final void j(PremiumBusDefaultOptionUIState premiumBusDefaultOptionUIState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1562960136);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(premiumBusDefaultOptionUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1562960136, i2, -1, "app.chalo.premiumbus.ui.slotselection.PremiumBusDefaultOptionUI (PremiumBusSlotSelectionUiState.kt:1146)");
            }
            boolean zChanged = composerStartRestartGroup.changed(premiumBusDefaultOptionUIState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = premiumBusDefaultOptionUIState.f7843a;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            PremiumBusDefaultOptionUISpecs premiumBusDefaultOptionUISpecs = (PremiumBusDefaultOptionUISpecs) objRememberedValue;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(premiumBusDefaultOptionUIState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new qv0(premiumBusDefaultOptionUIState, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue2, 15, null);
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            long jC = ChaloColorTokenKt.c(premiumBusDefaultOptionUISpecs.b);
            int i3 = CardDefaults.$stable;
            CardKt.Card(modifierM299clickableoSLSa3U$default, ChaloThemeKt.d(premiumBusDefaultOptionUISpecs.c), cardDefaults.m1694cardColorsro_MJ88(jC, 0L, 0L, 0L, composerStartRestartGroup, i3 << 12, 14), cardDefaults.m1695cardElevationaqJV_2Y(premiumBusDefaultOptionUISpecs.d, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, i3 << 18, 62), null, ComposableLambdaKt.rememberComposableLambda(449329622, true, new fu0(6, premiumBusDefaultOptionUIState, premiumBusDefaultOptionUISpecs), composerStartRestartGroup, 54), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yu0(premiumBusDefaultOptionUIState, i, 5));
        }
    }

    public static final void k(NewSlotTimeSuggestionSuccessUIState newSlotTimeSuggestionSuccessUIState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Object obj = newSlotTimeSuggestionSuccessUIState.f7811a;
        Composer composerStartRestartGroup = composer.startRestartGroup(1107026400);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(newSlotTimeSuggestionSuccessUIState) : composerStartRestartGroup.changedInstance(newSlotTimeSuggestionSuccessUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1107026400, i2, -1, "app.chalo.premiumbus.ui.slotselection.PremiumBusNewSlotSuggestionSuccessBottomSheet (PremiumBusSlotSelectionUiState.kt:1303)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            NewSlotTimeSuggestionSuccessUISpec newSlotTimeSuggestionSuccessUISpec = (NewSlotTimeSuggestionSuccessUISpec) obj;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloColorTokenKt.c(newSlotTimeSuggestionSuccessUISpec.b), null, 2, null), newSlotTimeSuggestionSuccessUISpec.f7810a);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            CommonImageKt.a(newSlotTimeSuggestionSuccessUIState.d, null, false, composerStartRestartGroup, 0, 6);
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            ChaloTextViewKt.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), newSlotTimeSuggestionSuccessUIState.b, null, null, composerStartRestartGroup, 6, 12);
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            ChaloTextViewKt.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), newSlotTimeSuggestionSuccessUIState.c, null, null, composerStartRestartGroup, 6, 12);
            composer2 = composerStartRestartGroup;
            ChaloSpacersKt.p(composer2, 0);
            if (b3.s(0, 0, composer2, SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), newSlotTimeSuggestionSuccessUISpec.c), newSlotTimeSuggestionSuccessUIState.e)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yu0(newSlotTimeSuggestionSuccessUIState, i, 6));
        }
    }

    public static final void l(PremiumBusPassOptionUIState premiumBusPassOptionUIState, Composer composer, int i) {
        int i2;
        Modifier modifierM263backgroundbw27NRU;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1409531942);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(premiumBusPassOptionUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1409531942, i2, -1, "app.chalo.premiumbus.ui.slotselection.PremiumBusPassOptionUI (PremiumBusSlotSelectionUiState.kt:1166)");
            }
            boolean zChanged = composerStartRestartGroup.changed(premiumBusPassOptionUIState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = premiumBusPassOptionUIState.f7848a;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            PremiumBusPassOptionUISpecs premiumBusPassOptionUISpecs = (PremiumBusPassOptionUISpecs) objRememberedValue;
            if (premiumBusPassOptionUIState.e != null) {
                composerStartRestartGroup.startReplaceGroup(529354841);
                Modifier modifierM263backgroundbw27NRU2 = BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloColorTokenKt.c(premiumBusPassOptionUISpecs.b), ChaloThemeKt.d(premiumBusPassOptionUISpecs.c));
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(premiumBusPassOptionUIState);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new qv0(premiumBusPassOptionUIState, 3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                modifierM263backgroundbw27NRU = ClickableKt.m299clickableoSLSa3U$default(modifierM263backgroundbw27NRU2, false, null, null, null, (Function0) objRememberedValue2, 15, null);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(529564277);
                composerStartRestartGroup.endReplaceGroup();
                modifierM263backgroundbw27NRU = BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloColorTokenKt.c(premiumBusPassOptionUISpecs.b), ChaloThemeKt.d(premiumBusPassOptionUISpecs.c));
            }
            ChaloRoundedCardKt.b(modifierM263backgroundbw27NRU, ChaloThemeKt.d(premiumBusPassOptionUISpecs.c), 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(567336795, true, new fu0(9, premiumBusPassOptionUISpecs, premiumBusPassOptionUIState), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yu0(premiumBusPassOptionUIState, i, 10));
        }
    }

    public static final void m(PremiumBusPurchaseOptionUIState premiumBusPurchaseOptionUIState, Composer composer, int i) {
        float f;
        Composer composerStartRestartGroup = composer.startRestartGroup(1877025370);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(premiumBusPurchaseOptionUIState) ? 4 : 2) | i : i;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1877025370, i2, -1, "app.chalo.premiumbus.ui.slotselection.PremiumBusPurchaseOptionUI (PremiumBusSlotSelectionUiState.kt:1108)");
            }
            boolean zChanged = composerStartRestartGroup.changed(premiumBusPurchaseOptionUIState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = premiumBusPurchaseOptionUIState.f7850a;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            PremiumBusPurchaseOptionUISpecs premiumBusPurchaseOptionUISpecs = (PremiumBusPurchaseOptionUISpecs) objRememberedValue;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ChaloColorToken chaloColorToken = premiumBusPurchaseOptionUISpecs.b;
            float f2 = premiumBusPurchaseOptionUISpecs.d;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(modifierFillMaxWidth$default, ChaloColorTokenKt.c(chaloColorToken), null, 2, null), premiumBusPurchaseOptionUISpecs.f7849a), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextUIState.ChaloTextUIState chaloTextUIState = premiumBusPurchaseOptionUIState.b;
            if (chaloTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-801659416);
                composerStartRestartGroup.endReplaceGroup();
                f = f2;
            } else {
                composerStartRestartGroup.startReplaceGroup(-801659415);
                f = f2;
                ChaloTextViewKt.a(null, chaloTextUIState, null, null, composerStartRestartGroup, 0, 13);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.startReplaceGroup(-1965519120);
            for (PremiumBusPassAvailableOptionUIState premiumBusPassAvailableOptionUIState : premiumBusPurchaseOptionUIState.c) {
                if (premiumBusPassAvailableOptionUIState instanceof PremiumBusPassAvailableOptionUIState.DefaultOption) {
                    composerStartRestartGroup.startReplaceGroup(-592614462);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, f), composerStartRestartGroup, 0);
                    j(((PremiumBusPassAvailableOptionUIState.DefaultOption) premiumBusPassAvailableOptionUIState).f7845a, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (premiumBusPassAvailableOptionUIState instanceof PremiumBusPassAvailableOptionUIState.PassOption) {
                    composerStartRestartGroup.startReplaceGroup(-592364912);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, premiumBusPurchaseOptionUISpecs.c), composerStartRestartGroup, 0);
                    l(((PremiumBusPassAvailableOptionUIState.PassOption) premiumBusPassAvailableOptionUIState).f7846a, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(premiumBusPassAvailableOptionUIState instanceof PremiumBusPassAvailableOptionUIState.CustomerSupportOption)) {
                        throw pk0.p(composerStartRestartGroup, -434760712);
                    }
                    composerStartRestartGroup.startReplaceGroup(-592117470);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, f), composerStartRestartGroup, 0);
                    j(((PremiumBusPassAvailableOptionUIState.CustomerSupportOption) premiumBusPassAvailableOptionUIState).f7844a, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yu0(premiumBusPurchaseOptionUIState, i, 9));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:58:0x0106  */
    /* JADX WARN: Code duplicated, block: B:59:0x010a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0151  */
    /* JADX WARN: Code duplicated, block: B:63:0x0154  */
    /* JADX WARN: Code duplicated, block: B:65:0x0158  */
    /* JADX WARN: Code duplicated, block: B:68:0x0164  */
    /* JADX WARN: Code duplicated, block: B:69:0x0168  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:86:0x0241  */
    /* JADX WARN: Code duplicated, block: B:88:0x0246  */
    /* JADX WARN: Code duplicated, block: B:91:0x0251  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    public static final void n(PremiumBusSlotSelectionDateAndTimePickerUIState state, Function2 function2, Function3 onTimeSelected, Composer composer, int i, int i2) {
        int i3;
        Function2 function3;
        int i4;
        boolean z;
        Composer composer2;
        Function2 function4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        boolean zChanged;
        Modifier.Companion companion;
        Function0<ComposeUiNode> constructor;
        boolean z2;
        Function0<ComposeUiNode> constructor2;
        boolean z3;
        Function2 function5;
        boolean z4;
        Object objRememberedValue;
        int i5;
        Intrinsics.i(state, "state");
        Object obj = state.d;
        Intrinsics.i(onTimeSelected, "onTimeSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(-244918354);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                function3 = function2;
                i3 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (composerStartRestartGroup.changedInstance(onTimeSelected)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i4 = i3;
            if ((i4 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i4 & 1)) {
                if (i6 != 0) {
                    function3 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-244918354, i4, -1, "app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDateAndTimePickerBottomSheet (PremiumBusSlotSelectionUiState.kt:1333)");
                }
                zChanged = composerStartRestartGroup.changed(obj);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    composerStartRestartGroup.updateRememberedValue(obj);
                } else {
                    obj = objRememberedValue2;
                }
                PremiumBusSlotSelectionDateAndTimePickerUISpecs premiumBusSlotSelectionDateAndTimePickerUISpecs = (PremiumBusSlotSelectionDateAndTimePickerUISpecs) obj;
                companion = Modifier.INSTANCE;
                Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloColorTokenKt.c(ChaloColorToken.White.f9870a), null, 2, null);
                float f = ChaloThemeHelper.a().h;
                Modifier modifierC = ChaloThemeKt.c(modifierM264backgroundbw27NRU$default, new ChaloPadding(f, f, f, f));
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
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
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i8 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i8), composerM3915constructorimpl2));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                function5 = function3;
                ChaloTextViewKt.a(null, state.e, null, null, composerStartRestartGroup, 0, 13);
                SpacerKt.Spacer(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                CommonImageKt.a(state.j, null, false, composerStartRestartGroup, 0, 6);
                composerStartRestartGroup.endNode();
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, premiumBusSlotSelectionDateAndTimePickerUISpecs.c), composerStartRestartGroup, 0);
                int i9 = state.f7861a;
                int i10 = state.b;
                String str = state.c;
                if ((i4 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new dk(onTimeSelected, 4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                u(i9, i10, str, 0, (Function3) objRememberedValue, composerStartRestartGroup, 0);
                composer2 = composerStartRestartGroup;
                if (function5 == null) {
                    composer2.startReplaceGroup(-342096459);
                } else {
                    composer2.startReplaceGroup(1790079948);
                    function5.invoke(composer2, Integer.valueOf((i4 >> 3) & 14));
                }
                composer2.endReplaceGroup();
                ChaloSpacersKt.o(composer2, 0);
                ChaloFilledButtonKt.a(0, 0, composer2, SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloThemeHelper.a().n), state.h);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, premiumBusSlotSelectionDateAndTimePickerUISpecs.e), composer2, 0);
                if (b3.s(0, 0, composer2, SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloThemeHelper.a().n), state.i)) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function5;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                function4 = function3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new v(state, function4, onTimeSelected, i, i2, 23));
            }
        }
        i3 |= 48;
        function3 = function2;
        if ((i & 384) == 0) {
            if (composerStartRestartGroup.changedInstance(onTimeSelected)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        i4 = i3;
        if ((i4 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i4 & 1)) {
            if (i6 != 0) {
                function3 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-244918354, i4, -1, "app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDateAndTimePickerBottomSheet (PremiumBusSlotSelectionUiState.kt:1333)");
            }
            zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                composerStartRestartGroup.updateRememberedValue(obj);
            }
            PremiumBusSlotSelectionDateAndTimePickerUISpecs premiumBusSlotSelectionDateAndTimePickerUISpecs2 = (PremiumBusSlotSelectionDateAndTimePickerUISpecs) obj;
            companion = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default2 = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloColorTokenKt.c(ChaloColorToken.White.f9870a), null, 2, null);
            float f2 = ChaloThemeHelper.a().h;
            Modifier modifierC2 = ChaloThemeKt.c(modifierM264backgroundbw27NRU$default2, new ChaloPadding(f2, f2, f2, f2));
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i11 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC2);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            constructor = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion5, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl3, Integer.valueOf(i11), composerM3915constructorimpl3));
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion4.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i12 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            constructor2 = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion5, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
            Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl4, Integer.valueOf(i12), composerM3915constructorimpl4));
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            function5 = function3;
            ChaloTextViewKt.a(null, state.e, null, null, composerStartRestartGroup, 0, 13);
            SpacerKt.Spacer(i41.a(rowScopeInstance2, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            CommonImageKt.a(state.j, null, false, composerStartRestartGroup, 0, 6);
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, premiumBusSlotSelectionDateAndTimePickerUISpecs2.c), composerStartRestartGroup, 0);
            int i13 = state.f7861a;
            int i14 = state.b;
            String str2 = state.c;
            if ((i4 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z4) {
                objRememberedValue = new dk(onTimeSelected, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new dk(onTimeSelected, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            u(i13, i14, str2, 0, (Function3) objRememberedValue, composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            if (function5 == null) {
                composer2.startReplaceGroup(-342096459);
            } else {
                composer2.startReplaceGroup(1790079948);
                function5.invoke(composer2, Integer.valueOf((i4 >> 3) & 14));
            }
            composer2.endReplaceGroup();
            ChaloSpacersKt.o(composer2, 0);
            ChaloFilledButtonKt.a(0, 0, composer2, SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloThemeHelper.a().n), state.h);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, premiumBusSlotSelectionDateAndTimePickerUISpecs2.e), composer2, 0);
            if (b3.s(0, 0, composer2, SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloThemeHelper.a().n), state.i)) {
                ComposerKt.traceEventEnd();
            }
            function4 = function5;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            function4 = function3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new v(state, function4, onTimeSelected, i, i2, 23));
        }
    }

    public static final void o(List tabs, Composer composer, int i) {
        int i2;
        Intrinsics.i(tabs, "tabs");
        Composer composerStartRestartGroup = composer.startRestartGroup(1068088066);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(tabs) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1068088066, i2, -1, "app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionSectionTab (PremiumBusSlotSelectionUiState.kt:786)");
            }
            Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHorizontalScroll$default);
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
            composerStartRestartGroup.startReplaceGroup(389987527);
            Iterator it = tabs.iterator();
            while (it.hasNext()) {
                t((PBSlotSelectionTabItemUIState) it.next(), null, composerStartRestartGroup, 0);
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eh(tabs, i, 8));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void p(PremiumBusSlotSelectionToolBarUIState state, Function0 onBack, Composer composer, int i) {
        int i2;
        ComposeUiNode.Companion companion;
        ?? r1;
        float f;
        Intrinsics.i(state, "state");
        Intrinsics.i(onBack, "onBack");
        Composer composerStartRestartGroup = composer.startRestartGroup(-752568718);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(state) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onBack) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-752568718, i2, -1, "app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionToolBar (PremiumBusSlotSelectionUiState.kt:740)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
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
            pk0.v(companion4, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m264backgroundbw27NRU$default(companion2, ChaloColorTokenKt.c(state.d), null, 2, null), 0.0f, 1, null), state.f);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM814height3ABfNKs);
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
            pk0.v(companion4, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageUIState imageUIState = state.b;
            if (imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(469798460);
                composerStartRestartGroup.endReplaceGroup();
                companion = companion4;
                r1 = 0;
                f = 0.0f;
            } else {
                composerStartRestartGroup.startReplaceGroup(469798461);
                boolean z = (i2 & 112) == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new ar0(onBack, 13);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                companion = companion4;
                r1 = 0;
                f = 0.0f;
                IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, null, ComposableLambdaKt.rememberComposableLambda(1066954371, true, new sm(imageUIState, 4), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 62);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            ChaloSpacersKt.w(composerStartRestartGroup, r1);
            PremiumBusSlotSelectionToolBarTitleUIState premiumBusSlotSelectionToolBarTitleUIState = state.f7890a;
            if (premiumBusSlotSelectionToolBarTitleUIState == null) {
                composerStartRestartGroup.startReplaceGroup(470030774);
            } else {
                float f2 = premiumBusSlotSelectionToolBarTitleUIState.c;
                composerStartRestartGroup.startReplaceGroup(470030775);
                Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(r16, f, 1, null), state.g);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, r1);
                int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
                Function0<ComposeUiNode> constructor3 = companion.getConstructor();
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
                ComposeUiNode.Companion companion5 = companion;
                pk0.v(companion5, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
                ChaloTextViewKt.a(rowScopeInstance.weight(r16, 1.0f, r1), premiumBusSlotSelectionToolBarTitleUIState.f7889a, null, null, composerStartRestartGroup, 0, 12);
                TextUIState.ChaloTextUIState chaloTextUIState = premiumBusSlotSelectionToolBarTitleUIState.b;
                if (chaloTextUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(1130846606);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1130846607);
                    SpacerKt.Spacer(SizeKt.m833width3ABfNKs(r16, f2), composerStartRestartGroup, r1);
                    ImageUIState imageUIState2 = premiumBusSlotSelectionToolBarTitleUIState.d;
                    Composer composer2 = composerStartRestartGroup;
                    CommonImageKt.a(imageUIState2, null, false, composer2, 0, 6);
                    composerStartRestartGroup = composer2;
                    SpacerKt.Spacer(SizeKt.m833width3ABfNKs(r16, f2), composerStartRestartGroup, r1);
                    ChaloTextViewKt.a(rowScopeInstance.weight(companion2, 1.0f, r1), chaloTextUIState, null, null, composerStartRestartGroup, 0, 12);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
            }
            composerStartRestartGroup.endReplaceGroup();
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bu0(state, onBack, i, 8));
        }
    }

    public static final void q(Modifier modifier, PbSlotCardUIState state, boolean z, Composer composer, int i) {
        int i2;
        int i3;
        Intrinsics.i(modifier, "modifier");
        Intrinsics.i(state, "state");
        OfferTagUIState offerTagUIState = state.h;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1154529787);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1154529787, i2, -1, "app.chalo.premiumbus.ui.slotselection.SlotInfoCard (PremiumBusSlotSelectionUiState.kt:1020)");
            }
            boolean zChanged = composerStartRestartGroup.changed(state);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = state.f7835a;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            PbSlotCardUISpecs pbSlotCardUISpecs = (PbSlotCardUISpecs) objRememberedValue;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            BorderUIState borderUIState = pbSlotCardUISpecs.i;
            float f = pbSlotCardUISpecs.g;
            UIShape uIShape = pbSlotCardUISpecs.h;
            Modifier modifierAlpha = AlphaKt.alpha(BackgroundKt.m263backgroundbw27NRU(BorderKt.m275borderxT4_qwU(modifierFillMaxWidth$default, borderUIState.f7793a, ChaloColorTokenKt.c(borderUIState.b), ChaloThemeKt.d(pbSlotCardUISpecs.i.c)), ChaloColorTokenKt.c(pbSlotCardUISpecs.b), ChaloThemeKt.d(uIShape)), f);
            if (state.i != null) {
                composerStartRestartGroup.startReplaceGroup(-498157465);
                Modifier modifierClip = ClipKt.clip(modifierAlpha, ChaloThemeKt.d(uIShape));
                boolean z2 = !z;
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(state);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new kn0(state, 29);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                modifierAlpha = ClickableKt.m299clickableoSLSa3U$default(modifierClip, z2, null, null, null, (Function0) objRememberedValue2, 14, null);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-497914146);
                composerStartRestartGroup.endReplaceGroup();
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlpha);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierAlpha2 = AlphaKt.alpha(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), pbSlotCardUISpecs.f7834a), f);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlpha2);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            RadioButtonUIState radioButtonUIState = state.b;
            if (radioButtonUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1514480796);
                composerStartRestartGroup.endReplaceGroup();
                i3 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(1514480797);
                i3 = 0;
                ChaloRadioButtonKt.a(null, radioButtonUIState, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion3, pbSlotCardUISpecs.c), composerStartRestartGroup, i3);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, i3);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i3);
            int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl3, Integer.valueOf(i6), composerM3915constructorimpl3));
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
            Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
            Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl4, Integer.valueOf(i7), composerM3915constructorimpl4));
            ChaloTextViewKt.a(null, state.c, null, null, composerStartRestartGroup, 0, 13);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion3, pbSlotCardUISpecs.d), composerStartRestartGroup, 0);
            SlotDelayTextUIState slotDelayTextUIState = state.d;
            if (slotDelayTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-241065078);
            } else {
                composerStartRestartGroup.startReplaceGroup(-241065077);
                ChaloTextViewKt.a(ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(companion3, ChaloColorTokenKt.c(slotDelayTextUIState.b), ChaloThemeKt.d(slotDelayTextUIState.c)), slotDelayTextUIState.d), slotDelayTextUIState.f7897a, null, null, composerStartRestartGroup, 0, 12);
            }
            composerStartRestartGroup.endReplaceGroup();
            SpacerKt.Spacer(i41.a(rowScopeInstance, companion3, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            if (offerTagUIState == null || z) {
                composerStartRestartGroup.startReplaceGroup(-240323340);
                TextUIState.ChaloTextUIState chaloTextUIState = state.e;
                if (chaloTextUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(-240323341);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-240323340);
                    ChaloTextViewKt.a(null, chaloTextUIState, null, null, composerStartRestartGroup, 0, 13);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-240451494);
                UIShape.Rectangle rectangle = UIShape.f1926a;
                g(offerTagUIState, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, pbSlotCardUISpecs.e), composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, state.f, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            ExpressSlotIndicatorUIState expressSlotIndicatorUIState = state.g;
            if (expressSlotIndicatorUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-758678447);
            } else {
                composerStartRestartGroup.startReplaceGroup(-758678446);
                Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ChaloColorTokenKt.c(expressSlotIndicatorUIState.c), ChaloThemeKt.d(expressSlotIndicatorUIState.d)), expressSlotIndicatorUIState.e);
                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i8 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
                Function0<ComposeUiNode> constructor5 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor5);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion2, composerM3915constructorimpl5, measurePolicyRowMeasurePolicy3, composerM3915constructorimpl5, currentCompositionLocalMap5);
                Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl5, Integer.valueOf(i8), composerM3915constructorimpl5));
                CommonImageKt.a(expressSlotIndicatorUIState.f7797a, null, false, composerStartRestartGroup, 0, 6);
                composerStartRestartGroup = composerStartRestartGroup;
                SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion3, pbSlotCardUISpecs.f), composerStartRestartGroup, 0);
                ChaloTextViewKt.a(null, expressSlotIndicatorUIState.b, null, null, composerStartRestartGroup, 0, 13);
                composerStartRestartGroup.endNode();
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new y4(modifier, state, z, i, 6));
        }
    }

    public static final void r(Modifier modifier, SlotSelectionFullScreenErrorUIState state, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        Object obj = state.e;
        Composer composerStartRestartGroup = composer.startRestartGroup(-431183981);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-431183981, i2, -1, "app.chalo.premiumbus.ui.slotselection.SlotSelectionFullScreenErrorUI (PremiumBusSlotSelectionUiState.kt:1387)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            NoODPairAvailableErrorUISpecs noODPairAvailableErrorUISpecs = (NoODPairAvailableErrorUISpecs) obj;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            ChaloColorToken chaloColorToken = noODPairAvailableErrorUISpecs.b;
            float f = noODPairAvailableErrorUISpecs.c;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(modifierFillMaxSize$default, ChaloColorTokenKt.c(chaloColorToken), null, 2, null), noODPairAvailableErrorUISpecs.f7812a);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            SpacerKt.Spacer(dq.a(columnScopeInstance, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            ImageUIState imageUIState = state.f7898a;
            if (imageUIState == null) {
                composerStartRestartGroup.startReplaceGroup(193607223);
            } else {
                composerStartRestartGroup.startReplaceGroup(193607224);
                CommonImageKt.a(imageUIState, null, false, composerStartRestartGroup, 0, 6);
                ChaloSpacersKt.p(composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloTextViewKt.a(null, state.b, null, null, composerStartRestartGroup, 0, 13);
            composerStartRestartGroup = composerStartRestartGroup;
            SpacerKt.Spacer(dq.a(columnScopeInstance, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            ButtonUIState buttonUIState = state.c;
            if (buttonUIState == null) {
                composerStartRestartGroup.startReplaceGroup(193826982);
            } else {
                composerStartRestartGroup.startReplaceGroup(193826983);
                ChaloFilledButtonKt.a(0, 0, composerStartRestartGroup, SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), f), buttonUIState);
            }
            composerStartRestartGroup.endReplaceGroup();
            ButtonUIState buttonUIState2 = state.d;
            if (buttonUIState2 == null) {
                composerStartRestartGroup.startReplaceGroup(194065310);
            } else {
                composerStartRestartGroup.startReplaceGroup(194065311);
                ChaloSpacersKt.n(composerStartRestartGroup, 0);
                ChaloFilledButtonKt.a(0, 0, composerStartRestartGroup, SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), f), buttonUIState2);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bu0(i, 9, modifier, state));
        }
    }

    public static final void s(TextUIState.ChaloTextUIState title, TextUIState.ChaloTextUIState chaloTextUIState, Composer composer, int i) {
        int i2;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        Intrinsics.i(title, "title");
        Composer composerStartRestartGroup = composer.startRestartGroup(1341033989);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(chaloTextUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1341033989, i2, -1, "app.chalo.premiumbus.ui.slotselection.StopInfo (PremiumBusSlotSelectionUiState.kt:1005)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloTextViewKt.a(null, title, null, null, composerStartRestartGroup, (i2 << 3) & 112, 13);
            if (chaloTextUIState != null) {
                composerStartRestartGroup.startReplaceGroup(1993701750);
                ChaloSpacersKt.t(composerStartRestartGroup, 0);
                chaloTextUIState2 = chaloTextUIState;
                ChaloTextViewKt.a(null, chaloTextUIState2, null, null, composerStartRestartGroup, i2 & 112, 13);
            } else {
                chaloTextUIState2 = chaloTextUIState;
                composerStartRestartGroup.startReplaceGroup(1953551635);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            chaloTextUIState2 = chaloTextUIState;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bu0(title, chaloTextUIState2, i, 10));
        }
    }

    public static final void t(PBSlotSelectionTabItemUIState tabUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Intrinsics.i(tabUIState, "tabUIState");
        Object obj = tabUIState.f7828a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-723376558);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(tabUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-723376558, i3, -1, "app.chalo.premiumbus.ui.slotselection.TextWithIconAndBottomBar (PremiumBusSlotSelectionUiState.kt:803)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            PBSlotSelectionTabItemUISpecs pBSlotSelectionTabItemUISpecs = (PBSlotSelectionTabItemUISpecs) obj;
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(ClipKt.clip(SizeKt.m833width3ABfNKs(modifier2, pBSlotSelectionTabItemUISpecs.d), ChaloThemeKt.d(ChaloThemeHelper.d.f1923a)), ChaloColorTokenKt.c(pBSlotSelectionTabItemUISpecs.e), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloSpacersKt.n(composerStartRestartGroup, 0);
            ChaloTextViewKt.a(null, tabUIState.b, null, null, composerStartRestartGroup, 0, 13);
            ChaloSpacersKt.n(composerStartRestartGroup, 0);
            SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(modifier2, pBSlotSelectionTabItemUISpecs.f), 0.0f, 1, null), ChaloColorTokenKt.c(pBSlotSelectionTabItemUISpecs.g), null, 2, null), composerStartRestartGroup, 0);
            SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(modifier2, pBSlotSelectionTabItemUISpecs.b), 0.0f, 1, null), ChaloColorTokenKt.c(pBSlotSelectionTabItemUISpecs.c), null, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bu0(tabUIState, modifier2, i, 11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void u(int i, int i2, String initialAmOrPM, int i3, Function3 onTimeChanged, Composer composer, int i4) {
        int i5;
        MutableIntState mutableIntState;
        final MutableIntState mutableIntState2;
        Intrinsics.i(initialAmOrPM, "initialAmOrPM");
        Intrinsics.i(onTimeChanged, "onTimeChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1757297774);
        int i6 = (i4 & 6) == 0 ? (composerStartRestartGroup.changed(i) ? 4 : 2) | i4 : i4;
        if ((i4 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(initialAmOrPM) ? 256 : 128;
        }
        int i7 = i6 | 3072;
        if ((i4 & 24576) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onTimeChanged) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i7 & 9363) != 9362, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1757297774, i7, -1, "app.chalo.premiumbus.ui.slotselection.TimePickerComposable (PremiumBusSlotSelectionUiState.kt:1529)");
            }
            boolean z = (i7 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(i);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableIntState mutableIntState3 = (MutableIntState) objRememberedValue;
            int iC = TimeUtilsContract.f10451a.a().C(i2);
            boolean zChanged = composerStartRestartGroup.changed(iC);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(iC);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableIntState mutableIntState4 = (MutableIntState) objRememberedValue2;
            boolean z2 = (i7 & 896) == 256;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(initialAmOrPM, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState = (MutableState) objRememberedValue3;
            final ArrayList arrayList = new ArrayList();
            for (int i8 = 1; i8 < 13; i8++) {
                arrayList.add(Integer.valueOf(i8));
            }
            final ArrayList arrayList2 = new ArrayList();
            for (int i9 = 0; i9 < 6; i9++) {
                arrayList2.add(Integer.valueOf(i9 * 10));
            }
            List listS = CollectionsKt.S("AM", "PM");
            Integer numValueOf = Integer.valueOf(mutableIntState3.getIntValue());
            Integer numValueOf2 = Integer.valueOf(mutableIntState4.getIntValue());
            String str = (String) mutableState.getValue();
            boolean zChanged2 = ((i7 & 57344) == 16384) | composerStartRestartGroup.changed(mutableIntState3) | composerStartRestartGroup.changed(mutableIntState4) | composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                mutableIntState = mutableIntState4;
                PremiumBusSlotSelectionUiStateKt$TimePickerComposable$1$1 premiumBusSlotSelectionUiStateKt$TimePickerComposable$1$1 = new PremiumBusSlotSelectionUiStateKt$TimePickerComposable$1$1(onTimeChanged, mutableIntState3, mutableIntState, mutableState, null);
                mutableIntState2 = mutableIntState3;
                composerStartRestartGroup.updateRememberedValue(premiumBusSlotSelectionUiStateKt$TimePickerComposable$1$1);
                objRememberedValue4 = premiumBusSlotSelectionUiStateKt$TimePickerComposable$1$1;
            } else {
                mutableIntState2 = mutableIntState3;
                mutableIntState = mutableIntState4;
            }
            final MutableIntState mutableIntState5 = mutableIntState;
            EffectsKt.LaunchedEffect(numValueOf, numValueOf2, str, (Function2) objRememberedValue4, composerStartRestartGroup, 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).h, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i10 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i10), composerM3915constructorimpl));
            BoxKt.Box(BackgroundKt.m263backgroundbw27NRU(BoxScopeInstance.INSTANCE.align(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloThemeHelper.a().n), companion2.getCenter()), ChaloColorTokenKt.c(ChaloColorToken.LightOrangeSpf.f9817a), ChaloThemeKt.d(ChaloThemeHelper.d.g)), composerStartRestartGroup, 0);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion2.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i11 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i11), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierA = i41.a(rowScopeInstance, companion, 1.0f, false, 2, null);
            int iIndexOf = arrayList.indexOf(Integer.valueOf(i));
            int size = arrayList.size();
            boolean zChanged3 = composerStartRestartGroup.changed(mutableIntState2) | composerStartRestartGroup.changedInstance(arrayList);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                final int i12 = 0;
                objRememberedValue5 = new Function1() { // from class: rv0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i13 = i12;
                        int iIntValue = ((Integer) obj).intValue();
                        switch (i13) {
                            case 0:
                                mutableIntState2.setIntValue(((Number) arrayList.get(iIntValue)).intValue());
                                break;
                            default:
                                mutableIntState2.setIntValue(((Number) arrayList.get(iIntValue)).intValue());
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final int i13 = 0;
            e(modifierA, iIndexOf, size, (Function1) objRememberedValue5, false, ComposableLambdaKt.rememberComposableLambda(-2090408274, true, new Function4() { // from class: sv0
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    switch (i13) {
                        case 0:
                            LazyItemScope NumberPicker = (LazyItemScope) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            Composer composer2 = (Composer) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            Intrinsics.i(NumberPicker, "$this$NumberPicker");
                            if ((iIntValue2 & 48) == 0) {
                                iIntValue2 |= composer2.changed(iIntValue) ? 32 : 16;
                            }
                            if (composer2.shouldExecute((iIntValue2 & 145) != 144, iIntValue2 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2090408274, iIntValue2, -1, "app.chalo.premiumbus.ui.slotselection.TimePickerComposable.<anonymous>.<anonymous>.<anonymous> (PremiumBusSlotSelectionUiState.kt:1587)");
                                }
                                ArrayList arrayList3 = arrayList;
                                String strH = ((Number) arrayList3.get(iIntValue)).intValue() < 10 ? gf.h("0", arrayList3.get(iIntValue)) : String.valueOf(((Number) arrayList3.get(iIntValue)).intValue());
                                int iM7168getCentere0LSkKk = TextAlign.INSTANCE.m7168getCentere0LSkKk();
                                TextStyle textStyleB = ChaloTypographyKt.b(ChaloTheme.e(composer2, 0));
                                MutableIntState mutableIntState6 = mutableIntState2;
                                TextKt.m2623TextNvy7gAk(strH, null, ChaloColorTokenKt.c(mutableIntState6.getIntValue() == ((Number) arrayList3.get(iIntValue)).intValue() ? ChaloColorToken.Black.f9759a : ChaloColorToken.ShadyGray.f9851a), null, 0L, null, mutableIntState6.getIntValue() == ((Number) arrayList3.get(iIntValue)).intValue() ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal(), null, 0L, null, TextAlign.m7161boximpl(iM7168getCentere0LSkKk), 0L, 0, false, 0, 0, null, textStyleB, composer2, 0, 0, 129978);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            LazyItemScope NumberPicker2 = (LazyItemScope) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            Composer composer3 = (Composer) obj3;
                            int iIntValue4 = ((Integer) obj4).intValue();
                            Intrinsics.i(NumberPicker2, "$this$NumberPicker");
                            if ((iIntValue4 & 48) == 0) {
                                iIntValue4 |= composer3.changed(iIntValue3) ? 32 : 16;
                            }
                            if (composer3.shouldExecute((iIntValue4 & 145) != 144, iIntValue4 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(239072933, iIntValue4, -1, "app.chalo.premiumbus.ui.slotselection.TimePickerComposable.<anonymous>.<anonymous>.<anonymous> (PremiumBusSlotSelectionUiState.kt:1611)");
                                }
                                ArrayList arrayList4 = arrayList;
                                String strH2 = ((Number) arrayList4.get(iIntValue3)).intValue() < 10 ? gf.h("0", arrayList4.get(iIntValue3)) : String.valueOf(((Number) arrayList4.get(iIntValue3)).intValue());
                                int iM7168getCentere0LSkKk2 = TextAlign.INSTANCE.m7168getCentere0LSkKk();
                                TextStyle textStyleB2 = ChaloTypographyKt.b(ChaloTheme.e(composer3, 0));
                                MutableIntState mutableIntState7 = mutableIntState2;
                                TextKt.m2623TextNvy7gAk(strH2, null, ChaloColorTokenKt.c(mutableIntState7.getIntValue() == ((Number) arrayList4.get(iIntValue3)).intValue() ? ChaloColorToken.Black.f9759a : ChaloColorToken.ShadyGray.f9851a), null, 0L, null, mutableIntState7.getIntValue() == ((Number) arrayList4.get(iIntValue3)).intValue() ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal(), null, 0L, null, TextAlign.m7161boximpl(iM7168getCentere0LSkKk2), 0L, 0, false, 0, 0, null, textStyleB2, composer3, 0, 0, 129978);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572864);
            TextKt.m2623TextNvy7gAk(":", null, 0L, null, TextUnitKt.getSp(20), null, FontWeight.INSTANCE.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, 1597446, 0, 262062);
            composerStartRestartGroup = composerStartRestartGroup;
            Modifier modifierA2 = i41.a(rowScopeInstance, companion, 1.0f, false, 2, null);
            int iIndexOf2 = arrayList2.indexOf(Integer.valueOf(iC));
            int size2 = arrayList2.size();
            boolean zChanged4 = composerStartRestartGroup.changed(mutableIntState5) | composerStartRestartGroup.changedInstance(arrayList2);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                final int i14 = 1;
                objRememberedValue6 = new Function1() { // from class: rv0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i15 = i14;
                        int iIntValue = ((Integer) obj).intValue();
                        switch (i15) {
                            case 0:
                                mutableIntState5.setIntValue(((Number) arrayList2.get(iIntValue)).intValue());
                                break;
                            default:
                                mutableIntState5.setIntValue(((Number) arrayList2.get(iIntValue)).intValue());
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            final int i15 = 1;
            e(modifierA2, iIndexOf2, size2, (Function1) objRememberedValue6, false, ComposableLambdaKt.rememberComposableLambda(239072933, true, new Function4() { // from class: sv0
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    switch (i15) {
                        case 0:
                            LazyItemScope NumberPicker = (LazyItemScope) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            Composer composer2 = (Composer) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            Intrinsics.i(NumberPicker, "$this$NumberPicker");
                            if ((iIntValue2 & 48) == 0) {
                                iIntValue2 |= composer2.changed(iIntValue) ? 32 : 16;
                            }
                            if (composer2.shouldExecute((iIntValue2 & 145) != 144, iIntValue2 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2090408274, iIntValue2, -1, "app.chalo.premiumbus.ui.slotselection.TimePickerComposable.<anonymous>.<anonymous>.<anonymous> (PremiumBusSlotSelectionUiState.kt:1587)");
                                }
                                ArrayList arrayList3 = arrayList2;
                                String strH = ((Number) arrayList3.get(iIntValue)).intValue() < 10 ? gf.h("0", arrayList3.get(iIntValue)) : String.valueOf(((Number) arrayList3.get(iIntValue)).intValue());
                                int iM7168getCentere0LSkKk = TextAlign.INSTANCE.m7168getCentere0LSkKk();
                                TextStyle textStyleB = ChaloTypographyKt.b(ChaloTheme.e(composer2, 0));
                                MutableIntState mutableIntState6 = mutableIntState5;
                                TextKt.m2623TextNvy7gAk(strH, null, ChaloColorTokenKt.c(mutableIntState6.getIntValue() == ((Number) arrayList3.get(iIntValue)).intValue() ? ChaloColorToken.Black.f9759a : ChaloColorToken.ShadyGray.f9851a), null, 0L, null, mutableIntState6.getIntValue() == ((Number) arrayList3.get(iIntValue)).intValue() ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal(), null, 0L, null, TextAlign.m7161boximpl(iM7168getCentere0LSkKk), 0L, 0, false, 0, 0, null, textStyleB, composer2, 0, 0, 129978);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            LazyItemScope NumberPicker2 = (LazyItemScope) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            Composer composer3 = (Composer) obj3;
                            int iIntValue4 = ((Integer) obj4).intValue();
                            Intrinsics.i(NumberPicker2, "$this$NumberPicker");
                            if ((iIntValue4 & 48) == 0) {
                                iIntValue4 |= composer3.changed(iIntValue3) ? 32 : 16;
                            }
                            if (composer3.shouldExecute((iIntValue4 & 145) != 144, iIntValue4 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(239072933, iIntValue4, -1, "app.chalo.premiumbus.ui.slotselection.TimePickerComposable.<anonymous>.<anonymous>.<anonymous> (PremiumBusSlotSelectionUiState.kt:1611)");
                                }
                                ArrayList arrayList4 = arrayList2;
                                String strH2 = ((Number) arrayList4.get(iIntValue3)).intValue() < 10 ? gf.h("0", arrayList4.get(iIntValue3)) : String.valueOf(((Number) arrayList4.get(iIntValue3)).intValue());
                                int iM7168getCentere0LSkKk2 = TextAlign.INSTANCE.m7168getCentere0LSkKk();
                                TextStyle textStyleB2 = ChaloTypographyKt.b(ChaloTheme.e(composer3, 0));
                                MutableIntState mutableIntState7 = mutableIntState5;
                                TextKt.m2623TextNvy7gAk(strH2, null, ChaloColorTokenKt.c(mutableIntState7.getIntValue() == ((Number) arrayList4.get(iIntValue3)).intValue() ? ChaloColorToken.Black.f9759a : ChaloColorToken.ShadyGray.f9851a), null, 0L, null, mutableIntState7.getIntValue() == ((Number) arrayList4.get(iIntValue3)).intValue() ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal(), null, 0L, null, TextAlign.m7161boximpl(iM7168getCentere0LSkKk2), 0L, 0, false, 0, 0, null, textStyleB2, composer3, 0, 0, 129978);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572864);
            Modifier modifierA3 = i41.a(rowScopeInstance, companion, 1.0f, false, 2, null);
            int iIndexOf3 = listS.indexOf(initialAmOrPM);
            int size3 = listS.size();
            boolean zChanged5 = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChanged5 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new fp0(listS, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            a(modifierA3, iIndexOf3, size3, (Function1) objRememberedValue7, false, ComposableLambdaKt.rememberComposableLambda(-1488832274, true, new rb(10, listS, mutableState), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864);
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            i5 = 10;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            i5 = i3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new nm(i, i2, initialAmOrPM, i5, onTimeChanged, i4));
        }
    }

    public static final void v(Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(115405721);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(115405721, i2, -1, "app.chalo.premiumbus.ui.slotselection.VerticalDashedLine (PremiumBusSlotSelectionUiState.kt:991)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new dv0(20);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CanvasKt.Canvas(modifier, (Function1) objRememberedValue, composerStartRestartGroup, (i2 & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zc(modifier, i, 21));
        }
    }

    public static final void w(ViewAllSlotsBottomSheetUIState viewAllSlotsBottomSheetUIState, Composer composer, int i) {
        int i2;
        Object obj = viewAllSlotsBottomSheetUIState.f7905a;
        Composer composerStartRestartGroup = composer.startRestartGroup(1326487552);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(viewAllSlotsBottomSheetUIState) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1326487552, i2, -1, "app.chalo.premiumbus.ui.slotselection.ViewAllSlotsBottomSheet (PremiumBusSlotSelectionUiState.kt:1215)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            ViewAllSlotsBottomSheetUISpec viewAllSlotsBottomSheetUISpec = (ViewAllSlotsBottomSheetUISpec) obj;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            ChaloColorToken chaloColorToken = viewAllSlotsBottomSheetUISpec.b;
            float f = viewAllSlotsBottomSheetUISpec.g;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(modifierFillMaxWidth$default, ChaloColorTokenKt.c(chaloColorToken), null, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
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
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewAllSlotsBottomSheetUIState) | composerStartRestartGroup.changedInstance(viewAllSlotsBottomSheetUISpec);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new lu0(6, viewAllSlotsBottomSheetUIState, viewAllSlotsBottomSheetUISpec);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            LazyDslKt.LazyColumn(modifierFillMaxWidth$default2, null, null, false, null, null, null, false, null, (Function1) objRememberedValue2, composerStartRestartGroup, 6, TypedValues.PositionType.TYPE_POSITION_TYPE);
            ButtonUIState buttonUIState = viewAllSlotsBottomSheetUIState.d;
            if (buttonUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-2042774332);
            } else {
                composerStartRestartGroup.startReplaceGroup(-2042774331);
                Modifier modifierAlign = boxScopeInstance.align(ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloThemeKt.d(viewAllSlotsBottomSheetUISpec.i)), ChaloColorTokenKt.c(viewAllSlotsBottomSheetUISpec.j), null, 2, null), viewAllSlotsBottomSheetUISpec.k), companion2.getBottomEnd());
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
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
                pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                ChaloFilledButtonKt.a(0, 0, composerStartRestartGroup, SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f), buttonUIState);
                ButtonUIState buttonUIState2 = viewAllSlotsBottomSheetUIState.e;
                if (buttonUIState2 == null) {
                    composerStartRestartGroup.startReplaceGroup(19100504);
                } else {
                    composerStartRestartGroup.startReplaceGroup(19100505);
                    ChaloSpacersKt.n(composerStartRestartGroup, 0);
                    ChaloFilledButtonKt.a(0, 0, composerStartRestartGroup, SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f), buttonUIState2);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yu0(viewAllSlotsBottomSheetUIState, i, 4));
        }
    }
}
