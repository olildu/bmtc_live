package app.chalo.livetracking.stoptripplannerresult.compose.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
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
import app.chalo.compose.TextWithLeftAndTrailingRightIconComponentKt;
import app.chalo.compose.TopRightTrimmedRoundedRectangleShape;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.ComposeUtils_androidKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.livetracking.stoptripplannerresult.compose.components.ItineraryConnectedLegsRowUIKt;
import app.chalo.livetracking.stoptripplannerresult.compose.components.ItinerarySingleLegCardKt;
import app.chalo.livetracking.stoptripplannerresult.uistate.ItineraryCardCtaUIState;
import app.chalo.livetracking.stoptripplannerresult.uistate.ItineraryLegItemUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.ItineraryListItemSpecs;
import app.chalo.livetracking.stoptripplannerresult.uistate.ItineraryListItemUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.StepCardSpecs;
import app.chalo.livetracking.stoptripplannerresult.uistate.StepCardUIState;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.f0;
import defpackage.gf;
import defpackage.ir;
import defpackage.p80;
import defpackage.pk0;
import defpackage.v60;
import defpackage.xx;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004¨\u0006\n²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "topTitleHeight", "btmTitleHeight", "", "stepCardWidth", "stepCardHeight", "", "selectedItemIndex", "stepCardClicked", "maxRouteDetailsSectionFraction", "livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ItineraryConnectedLegsRowUIKt {
    public static final void a(Modifier modifier, final ItineraryListItemUiState state, Composer composer, int i) {
        int i2;
        ItineraryListItemUiState itineraryListItemUiState;
        Composer composer2;
        Density density;
        Object itineraryConnectedLegsRowUIKt$ItineraryConnectedLegsRowUI$1$1;
        float f;
        MutableIntState mutableIntState;
        Intrinsics.i(state, "state");
        ItineraryListItemSpecs itineraryListItemSpecs = state.b;
        Composer composerStartRestartGroup = composer.startRestartGroup(1965434087);
        if ((i & 48) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1965434087, i2, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.ItineraryConnectedLegsRowUI (ItineraryConnectedLegsRowUI.kt:76)");
            }
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = gf.b(0, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = gf.b(0, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState2 = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableFloatState mutableFloatState = (MutableFloatState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final MutableFloatState mutableFloatState2 = (MutableFloatState) objRememberedValue4;
            float fM7278constructorimpl = Dp.m7278constructorimpl(ComposeUtils_androidKt.c(composerStartRestartGroup) - Dp.m7278constructorimpl(ChaloTheme.b(composerStartRestartGroup, 0).h * 2));
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotIntStateKt.mutableIntStateOf(-1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            MutableIntState mutableIntState2 = (MutableIntState) objRememberedValue5;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            final MutableIntState mutableIntState3 = (MutableIntState) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            final MutableFloatState mutableFloatState3 = (MutableFloatState) objRememberedValue7;
            Integer numValueOf = Integer.valueOf(mutableIntState3.getIntValue());
            boolean zChanged = composerStartRestartGroup.changed(density2) | composerStartRestartGroup.changed(fM7278constructorimpl) | ((i2 & 112) == 32) | composerStartRestartGroup.changed(scrollStateRememberScrollState);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue8 == companion.getEmpty()) {
                density = density2;
                f = fM7278constructorimpl;
                mutableIntState = mutableIntState2;
                itineraryConnectedLegsRowUIKt$ItineraryConnectedLegsRowUI$1$1 = new ItineraryConnectedLegsRowUIKt$ItineraryConnectedLegsRowUI$1$1(density, f, state, scrollStateRememberScrollState, mutableIntState, null);
                composerStartRestartGroup.updateRememberedValue(itineraryConnectedLegsRowUIKt$ItineraryConnectedLegsRowUI$1$1);
            } else {
                density = density2;
                f = fM7278constructorimpl;
                mutableIntState = mutableIntState2;
                itineraryConnectedLegsRowUIKt$ItineraryConnectedLegsRowUI$1$1 = objRememberedValue8;
            }
            EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) itineraryConnectedLegsRowUIKt$ItineraryConnectedLegsRowUI$1$1, composerStartRestartGroup, 0);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment center = companion2.getCenter();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
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
            Modifier modifierC = ChaloThemeKt.c(ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), scrollStateRememberScrollState, null, false, null, false, 28, null), itineraryListItemSpecs.f);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            final float f2 = f;
            final MutableIntState mutableIntState4 = mutableIntState;
            final Density density3 = density;
            itineraryListItemUiState = state;
            ChaloRoundedCardKt.a(itineraryListItemSpecs.d, companion3, ComposableLambdaKt.rememberComposableLambda(-587359314, true, new Function3() { // from class: zb0
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v0 */
                /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r6v10 */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5;
                    float f3;
                    final StepCardUIState stepCardUIState;
                    Modifier.Companion companion5;
                    int i6;
                    ColumnScope Card = (ColumnScope) obj;
                    Composer composer3 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    Intrinsics.i(Card, "$this$Card");
                    int i7 = 1;
                    ?? r6 = 0;
                    if (composer3.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-587359314, iIntValue, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.ItineraryConnectedLegsRowUI.<anonymous>.<anonymous>.<anonymous> (ItineraryConnectedLegsRowUI.kt:119)");
                        }
                        Modifier.Companion companion6 = Modifier.INSTANCE;
                        float f4 = 0.0f;
                        Object obj4 = null;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion7 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion7.getStart(), composer3, 0);
                        long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        char c = ' ';
                        int i8 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                        ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor3 = companion8.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer3);
                        pk0.v(companion8, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
                        Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl3, Integer.valueOf(i8), composerM3915constructorimpl3));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion6, ((Dp) mutableState.getValue()).m7292unboximpl()), composer3, 0);
                        Modifier modifierHeight = IntrinsicKt.height(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), IntrinsicSize.Min);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion7.getTop(), composer3, 0);
                        long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i9 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer3, modifierHeight);
                        Function0<ComposeUiNode> constructor4 = companion8.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor4);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer3);
                        pk0.v(companion8, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
                        Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl4, Integer.valueOf(i9), composerM3915constructorimpl4));
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        composer3.startReplaceGroup(-1123040226);
                        final ItineraryListItemUiState itineraryListItemUiState2 = state;
                        List list = itineraryListItemUiState2.d;
                        ItineraryListItemSpecs itineraryListItemSpecs2 = itineraryListItemUiState2.b;
                        Iterator it = list.iterator();
                        final int i10 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                CollectionsKt.z0();
                                throw null;
                            }
                            ItineraryLegItemUiState itineraryLegItemUiState = (ItineraryLegItemUiState) next;
                            Modifier.Companion companion9 = Modifier.INSTANCE;
                            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion9, f4, i7, obj4);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopEnd(), r6);
                            long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, r6);
                            int i12 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> c));
                            CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default2);
                            ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor5 = companion10.getConstructor();
                            if (composer3.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor5);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composer3);
                            pk0.v(companion10, composerM3915constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl5, currentCompositionLocalMap5);
                            Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion10, composerM3915constructorimpl5, Integer.valueOf(i12), composerM3915constructorimpl5));
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m833width3ABfNKs(companion9, f2), 0.0f, i7, obj4);
                            ChaloPadding chaloPadding = itineraryListItemSpecs2.b;
                            float f5 = itineraryListItemSpecs2.c;
                            Modifier modifierC2 = ChaloThemeKt.c(modifierFillMaxHeight$default, chaloPadding);
                            int size = list.size();
                            int i13 = i10 == CollectionsKt.K(list) ? i7 : 0;
                            boolean z = i10 == 0 ? i7 : 0;
                            MutableFloatState mutableFloatState4 = mutableFloatState;
                            float floatValue = mutableFloatState4.getFloatValue();
                            MutableFloatState mutableFloatState5 = mutableFloatState2;
                            float floatValue2 = mutableFloatState5.getFloatValue();
                            List list2 = list;
                            Density density4 = density3;
                            int i14 = i13;
                            float fMo404toPx0680j_4 = density4.mo404toPx0680j_4(f5) + floatValue2;
                            ItineraryListItemSpecs itineraryListItemSpecs3 = itineraryListItemSpecs2;
                            if (size > 1) {
                                TopRightTrimmedRoundedRectangleShape topRightTrimmedRoundedRectangleShape = new TopRightTrimmedRoundedRectangleShape(floatValue, fMo404toPx0680j_4, i14 ^ 1, z);
                                modifierC2 = BorderKt.m275borderxT4_qwU(ClipKt.clip(modifierC2, topRightTrimmedRoundedRectangleShape), ChaloThemeHelper.a().b, ChaloColorTokenKt.c(ChaloColorToken.LightGray.f9814a), topRightTrimmedRoundedRectangleShape);
                            }
                            Object objRememberedValue9 = composer3.rememberedValue();
                            Composer.Companion companion11 = Composer.INSTANCE;
                            Object empty = companion11.getEmpty();
                            MutableFloatState mutableFloatState6 = mutableFloatState3;
                            if (objRememberedValue9 == empty) {
                                objRememberedValue9 = new t60(12, mutableFloatState4, mutableFloatState6);
                                composer3.updateRememberedValue(objRememberedValue9);
                            }
                            ItinerarySingleLegCardKt.e(OnGloballyPositionedModifierKt.onGloballyPositioned(modifierC2, (Function1) objRememberedValue9), itineraryLegItemUiState, Float.valueOf(mutableFloatState6.getFloatValue()), composer3, 0);
                            StepCardUIState stepCardUIState2 = itineraryLegItemUiState.g;
                            if (stepCardUIState2 == null) {
                                composer3.startReplaceGroup(-568658219);
                                composer3.endReplaceGroup();
                                companion5 = companion9;
                                f3 = 0.0f;
                                i6 = 0;
                                i5 = 1;
                            } else {
                                composer3.startReplaceGroup(-568658218);
                                boolean zChanged2 = composer3.changed(density4);
                                Object objRememberedValue10 = composer3.rememberedValue();
                                if (zChanged2 || objRememberedValue10 == companion11.getEmpty()) {
                                    i5 = 1;
                                    objRememberedValue10 = new za0(1, density4, mutableFloatState5, mutableFloatState4);
                                    composer3.updateRememberedValue(objRememberedValue10);
                                } else {
                                    i5 = 1;
                                }
                                f3 = 0.0f;
                                Modifier modifierM744offsetVpY3zN4$default = OffsetKt.m744offsetVpY3zN4$default(OnGloballyPositionedModifierKt.onGloballyPositioned(companion9, (Function1) objRememberedValue10), f5, 0.0f, 2, null);
                                boolean zChanged3 = composer3.changed(i10) | composer3.changed(itineraryListItemUiState2) | composer3.changed(stepCardUIState2);
                                Object objRememberedValue11 = composer3.rememberedValue();
                                if (zChanged3 || objRememberedValue11 == companion11.getEmpty()) {
                                    final MutableIntState mutableIntState5 = mutableIntState4;
                                    final MutableIntState mutableIntState6 = mutableIntState3;
                                    stepCardUIState = stepCardUIState2;
                                    companion5 = companion9;
                                    objRememberedValue11 = new Function0() { // from class: ac0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i15 = i10 + 1;
                                            if (i15 <= CollectionsKt.K(itineraryListItemUiState2.d)) {
                                                mutableIntState5.setIntValue(i15);
                                                MutableIntState mutableIntState7 = mutableIntState6;
                                                mutableIntState7.setIntValue(mutableIntState7.getIntValue() + 1);
                                            }
                                            UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1 = stepCardUIState.c;
                                            if (uiEventHandler$Companion$fromLambda$1 != null) {
                                                uiEventHandler$Companion$fromLambda$1.a();
                                            }
                                            return Unit.f17538a;
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue11);
                                } else {
                                    stepCardUIState = stepCardUIState2;
                                    companion5 = companion9;
                                }
                                i6 = 0;
                                ItineraryConnectedLegsRowUIKt.b(modifierM744offsetVpY3zN4$default, stepCardUIState, (Function0) objRememberedValue11, composer3, 0);
                                composer3.endReplaceGroup();
                            }
                            composer3.endNode();
                            if (i10 != CollectionsKt.K(list2)) {
                                composer3.startReplaceGroup(1254056433);
                                nf1.t(companion5, f5, composer3, i6);
                            } else {
                                composer3.startReplaceGroup(1244678158);
                                composer3.endReplaceGroup();
                            }
                            f4 = f3;
                            i7 = i5;
                            i10 = i11;
                            itineraryListItemSpecs2 = itineraryListItemSpecs3;
                            list = list2;
                            it = it;
                            obj4 = null;
                            r6 = 0;
                            c = ' ';
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, ((Dp) mutableState2.getValue()).m7292unboximpl()), composer3, 0);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 432, 0);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            TextUIState.ChaloTextUIState chaloTextUIState = itineraryListItemUiState.c;
            if (chaloTextUIState == null) {
                composer2.startReplaceGroup(736501799);
            } else {
                composer2.startReplaceGroup(736501800);
                boolean zChanged2 = composer2.changed(density3);
                Object objRememberedValue9 = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue9 == companion.getEmpty()) {
                    objRememberedValue9 = new f0(density3, mutableState, 15);
                    composer2.updateRememberedValue(objRememberedValue9);
                }
                ChaloTextViewKt.a(boxScopeInstance.align(ChaloThemeKt.c(OnGloballyPositionedModifierKt.onGloballyPositioned(companion3, (Function1) objRememberedValue9), itineraryListItemSpecs.f4586a), UiAlignmentKt.c(itineraryListItemSpecs.g)), chaloTextUIState, null, null, composer2, 0, 12);
            }
            composer2.endReplaceGroup();
            ItineraryCardCtaUIState itineraryCardCtaUIState = itineraryListItemUiState.e;
            if (itineraryCardCtaUIState == null) {
                composer2.startReplaceGroup(736941999);
            } else {
                composer2.startReplaceGroup(736942000);
                boolean zChanged3 = composer2.changed(density3);
                Object objRememberedValue10 = composer2.rememberedValue();
                if (zChanged3 || objRememberedValue10 == companion.getEmpty()) {
                    objRememberedValue10 = new f0(density3, mutableState2, 16);
                    composer2.updateRememberedValue(objRememberedValue10);
                }
                Modifier modifierAlign = boxScopeInstance.align(ChaloThemeKt.c(OnGloballyPositionedModifierKt.onGloballyPositioned(companion3, (Function1) objRememberedValue10), itineraryListItemSpecs.e), UiAlignmentKt.c(itineraryListItemSpecs.h));
                TextUIState.ChaloTextUIState chaloTextUIState2 = itineraryCardCtaUIState.b;
                ImageUIState imageUIState = itineraryCardCtaUIState.c;
                boolean zChanged4 = composer2.changed(itineraryCardCtaUIState);
                Object objRememberedValue11 = composer2.rememberedValue();
                if (zChanged4 || objRememberedValue11 == companion.getEmpty()) {
                    objRememberedValue11 = new xx(itineraryCardCtaUIState, 24);
                    composer2.updateRememberedValue(objRememberedValue11);
                }
                ChaloFilledButtonKt.i(modifierAlign, chaloTextUIState2, imageUIState, (Function0) objRememberedValue11, composer2, 0, 0);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            itineraryListItemUiState = state;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new v60(modifier, itineraryListItemUiState, i, 7));
        }
    }

    public static final void b(Modifier modifier, StepCardUIState stepCardUIState, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2074058064);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(stepCardUIState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2074058064, i2, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.StepCardUI (ItineraryConnectedLegsRowUI.kt:220)");
            }
            StepCardSpecs stepCardSpecs = stepCardUIState.f4612a;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(ClipKt.clip(modifier, ChaloThemeKt.d(stepCardSpecs.c)), ChaloColorTokenKt.c(stepCardSpecs.b), null, 2, null);
            boolean z = (i2 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new p80(function0, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierC = ChaloThemeKt.c(ClickableKt.m299clickableoSLSa3U$default(modifierM264backgroundbw27NRU$default, false, null, null, null, (Function0) objRememberedValue, 15, null), stepCardSpecs.f4611a);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            TextWithLeftAndTrailingRightIconComponentKt.a(BoxScopeInstance.INSTANCE.align(Modifier.INSTANCE, UiAlignmentKt.c(stepCardSpecs.d)), stepCardUIState.b, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ir(i, 17, modifier, stepCardUIState, function0));
        }
    }
}
