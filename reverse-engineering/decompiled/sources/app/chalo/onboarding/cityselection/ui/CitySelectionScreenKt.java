package app.chalo.onboarding.cityselection.ui;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
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
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.StandardErrorScreenKt;
import app.chalo.compose.components.ChaloCircularProgressIndicatorKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.CircularProgressIndicatorUIState;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.utils.SafeFocusRequester;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.bn;
import defpackage.c6;
import defpackage.cp;
import defpackage.d0;
import defpackage.dp;
import defpackage.fp;
import defpackage.g2;
import defpackage.g5;
import defpackage.gf;
import defpackage.h0;
import defpackage.mh;
import defpackage.mk;
import defpackage.pk0;
import defpackage.s4;
import defpackage.tm0;
import defpackage.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0006²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/chalo/onboarding/cityselection/ui/CitySelectionUIState;", "viewState", "Landroidx/compose/ui/unit/Dp;", "toolbarHeaderHeight", "", "headerOffset", "onboarding_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CitySelectionScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    public static final void a(CitySelectionUIState citySelectionUIState, Modifier modifier, SafeFocusRequester safeFocusRequester, Composer composer, int i) {
        int i2;
        Composer composer2;
        final float f;
        MutableState mutableState;
        ?? r9;
        float f2;
        CitySelectionSearchPanelUIState citySelectionSearchPanelUIState;
        final CitySelectionUIState citySelectionUIState2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-982154903);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(citySelectionUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(safeFocusRequester) ? 256 : 128;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-982154903, i3, -1, "app.chalo.onboarding.cityselection.ui.CitySelectionContent (CitySelectionScreen.kt:119)");
            }
            final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            CitySelectionUISpec citySelectionUISpec = citySelectionUIState.f6635a;
            CitySelectionSearchPanelUIState citySelectionSearchPanelUIState2 = citySelectionUIState.f;
            float fMo404toPx0680j_4 = density.mo404toPx0680j_4(citySelectionUISpec.f);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = gf.b(0, null, 2, null, composerStartRestartGroup);
            }
            final MutableState mutableState2 = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState3 = (MutableState) objRememberedValue2;
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Animatable animatable = (Animatable) objRememberedValue3;
            Boolean boolValueOf = Boolean.valueOf(i(citySelectionSearchPanelUIState2));
            int i4 = i3 & 14;
            boolean zChanged = (i4 == 4) | composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(fMo404toPx0680j_4) | composerStartRestartGroup.changedInstance(animatable);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                f = fMo404toPx0680j_4;
                mutableState = mutableState3;
                r9 = 0;
                f2 = 0.0f;
                citySelectionSearchPanelUIState = citySelectionSearchPanelUIState2;
                citySelectionUIState2 = citySelectionUIState;
                objRememberedValue4 = new CitySelectionScreenKt$CitySelectionContent$1$1(citySelectionUIState2, density, f, animatable, mutableState2, mutableState, null);
                mutableState2 = mutableState2;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                r9 = 0;
                f2 = 0.0f;
                citySelectionUIState2 = citySelectionUIState;
                citySelectionSearchPanelUIState = citySelectionSearchPanelUIState2;
                f = fMo404toPx0680j_4;
                mutableState = mutableState3;
            }
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, (int) r9);
            Boolean boolValueOf2 = Boolean.valueOf(i(citySelectionSearchPanelUIState));
            ?? r5 = (i4 == 4 ? 1 : r9) | (composerStartRestartGroup.changed(lazyListStateRememberLazyListState) ? 1 : 0);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (r5 != 0 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new CitySelectionScreenKt$CitySelectionContent$2$1(citySelectionUIState2, lazyListStateRememberLazyListState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, (int) r9);
            boolean zChanged2 = composerStartRestartGroup.changed(i(citySelectionSearchPanelUIState));
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue6 == companion.getEmpty()) {
                final MutableState mutableState4 = mutableState;
                NestedScrollConnection nestedScrollConnection = new NestedScrollConnection() { // from class: app.chalo.onboarding.cityselection.ui.CitySelectionScreenKt$CitySelectionContent$connection$1$1
                    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
                    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
                    public final /* bridge */ Object mo557onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
                        return tm0.a(this, j, j2, continuation);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
                    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
                    public final long mo558onPostScrollDzOQY0M(long j, long j2, int i5) {
                        if (CitySelectionScreenKt.i(citySelectionUIState2.f)) {
                            return Offset.INSTANCE.m4381getZeroF1C5BW0();
                        }
                        float fM7292unboximpl = ((Dp) mutableState2.getValue()).m7292unboximpl();
                        MutableState mutableState5 = mutableState4;
                        float fFloatValue = ((Number) mutableState5.getValue()).floatValue();
                        float fMo404toPx0680j_5 = density.mo404toPx0680j_4(fM7292unboximpl) - f;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax));
                        if (fIntBitsToFloat <= 0.0f) {
                            return Offset.INSTANCE.m4381getZeroF1C5BW0();
                        }
                        float fD = RangesKt.d(fIntBitsToFloat + fFloatValue, -fMo404toPx0680j_5, 0.0f);
                        float f3 = fD - fFloatValue;
                        mutableState5.setValue(Float.valueOf(fD));
                        return Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & BodyPartID.bodyIdMax));
                    }

                    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
                    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
                    public final /* bridge */ Object mo559onPreFlingQWom1Mo(long j, Continuation continuation) {
                        return tm0.c(this, j, continuation);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
                    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
                    public final long mo560onPreScrollOzD1aCk(long j, int i5) {
                        if (CitySelectionScreenKt.i(citySelectionUIState2.f)) {
                            return Offset.INSTANCE.m4381getZeroF1C5BW0();
                        }
                        float fM7292unboximpl = ((Dp) mutableState2.getValue()).m7292unboximpl();
                        MutableState mutableState5 = mutableState4;
                        float fFloatValue = ((Number) mutableState5.getValue()).floatValue();
                        float fMo404toPx0680j_5 = density.mo404toPx0680j_4(fM7292unboximpl) - f;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
                        if (fIntBitsToFloat >= 0.0f) {
                            return Offset.INSTANCE.m4381getZeroF1C5BW0();
                        }
                        float fD = RangesKt.d(fIntBitsToFloat + fFloatValue, -fMo404toPx0680j_5, 0.0f);
                        float f3 = fD - fFloatValue;
                        mutableState5.setValue(Float.valueOf(fD));
                        return Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & BodyPartID.bodyIdMax));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(nestedScrollConnection);
                objRememberedValue6 = nestedScrollConnection;
            }
            Modifier modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(SizeKt.fillMaxSize$default(modifier, f2, 1, null), (CitySelectionScreenKt$CitySelectionContent$connection$1$1) objRememberedValue6, null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r9);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, r9);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierNestedScroll$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            float fMo404toPx0680j_5 = density.mo404toPx0680j_4(((Dp) mutableState2.getValue()).m7292unboximpl());
            if (f > fMo404toPx0680j_5) {
                f = fMo404toPx0680j_5;
            }
            float fD = RangesKt.d(((Number) mutableState.getValue()).floatValue() + fMo404toPx0680j_5, f, fMo404toPx0680j_5);
            if (fD < f2) {
                fD = f2;
            }
            float fMo400toDpu2uoSUM = density.mo400toDpu2uoSUM(fD);
            float fMo400toDpu2uoSUM2 = density.mo400toDpu2uoSUM(fD - fMo404toPx0680j_5);
            List list = citySelectionUIState2.g;
            DividerUIState dividerUIState = citySelectionUIState2.h;
            ChaloPadding chaloPadding = citySelectionUISpec.c;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            int i6 = 14;
            composer2 = composerStartRestartGroup;
            c(lazyListStateRememberLazyListState, list, dividerUIState, chaloPadding, ChaloThemeKt.c(SizeKt.fillMaxSize$default(companion3, f2, 1, null), ChaloThemeKt.b(citySelectionUISpec.e, fMo400toDpu2uoSUM, f2, 14)), composer2, 0);
            ToolbarUIState toolbarUIState = citySelectionUIState2.d;
            ImageUIState imageUIState = citySelectionUIState2.e;
            CitySelectionSearchPanelUIState citySelectionSearchPanelUIState3 = citySelectionUIState2.f;
            ChaloPadding chaloPadding2 = citySelectionUISpec.f6634a;
            ChaloPadding chaloPadding3 = citySelectionUISpec.b;
            ChaloPadding chaloPadding4 = citySelectionUISpec.d;
            Object objRememberedValue7 = composer2.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new g5(mutableState2, i6);
                composer2.updateRememberedValue(objRememberedValue7);
            }
            h(toolbarUIState, imageUIState, citySelectionSearchPanelUIState3, chaloPadding2, chaloPadding3, chaloPadding4, safeFocusRequester, (Function1) objRememberedValue7, OffsetKt.m744offsetVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, fMo400toDpu2uoSUM2, 1, null), composer2, 12582912 | ((i3 << 12) & 3670016));
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s4(i, 28, citySelectionUIState, modifier, safeFocusRequester));
        }
    }

    public static final void b(ImageUIState imageUIState, CitySelectionSearchPanelUIState citySelectionSearchPanelUIState, ChaloPadding chaloPadding, ChaloPadding chaloPadding2, SafeFocusRequester safeFocusRequester, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-876054821);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(imageUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(citySelectionSearchPanelUIState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(chaloPadding) : composerStartRestartGroup.changedInstance(chaloPadding) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(chaloPadding2) : composerStartRestartGroup.changedInstance(chaloPadding2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(safeFocusRequester) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-876054821, i2, -1, "app.chalo.onboarding.cityselection.ui.CitySelectionHeader (CitySelectionScreen.kt:394)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            int i4 = i2;
            CommonImageKt.a(imageUIState, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), chaloPadding2), false, composerStartRestartGroup, i2 & 14, 4);
            g(citySelectionSearchPanelUIState, safeFocusRequester, ChaloThemeKt.c(boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), companion.getBottomCenter()), chaloPadding), composerStartRestartGroup, ((i4 >> 3) & 14) | ((i4 >> 9) & 112));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new g2((Object) imageUIState, (Object) citySelectionSearchPanelUIState, (Object) chaloPadding, (Object) chaloPadding2, (Object) safeFocusRequester, modifier, i, 4));
        }
    }

    public static final void c(LazyListState lazyListState, List cities, DividerUIState itemDivider, ChaloPadding paddingAroundDivider, Modifier modifier, Composer composer, int i) {
        Object objInvoke;
        Intrinsics.i(lazyListState, "lazyListState");
        Intrinsics.i(cities, "cities");
        Intrinsics.i(itemDivider, "itemDivider");
        Intrinsics.i(paddingAroundDivider, "paddingAroundDivider");
        Composer composerStartRestartGroup = composer.startRestartGroup(164400910);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(lazyListState) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(cities) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(itemDivider) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(paddingAroundDivider) : composerStartRestartGroup.changedInstance(paddingAroundDivider) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(164400910, i2, -1, "app.chalo.onboarding.cityselection.ui.CitySelectionList (CitySelectionScreen.kt:299)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            boolean zChangedInstance = ((i2 & 7168) == 2048 || ((i2 & 4096) != 0 && composerStartRestartGroup.changedInstance(paddingAroundDivider))) | composerStartRestartGroup.changedInstance(cities) | ((i2 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new u(17, cities, paddingAroundDivider, itemDivider);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int i3 = i2;
            LazyDslKt.LazyColumn(modifierFillMaxWidth$default, lazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, (i2 << 3) & 112, TypedValues.PositionType.TYPE_CURVE_FIT);
            cp cpVar = new cp(3);
            List<CitySelectionListItemsUIState> list = cities;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
            for (CitySelectionListItemsUIState citySelectionListItemsUIState : list) {
                if (citySelectionListItemsUIState instanceof CitySelectionListItemsUIState.CityListFooterUIState) {
                    objInvoke = cpVar.invoke(((CitySelectionListItemsUIState.CityListFooterUIState) citySelectionListItemsUIState).f6624a);
                } else {
                    if (!(citySelectionListItemsUIState instanceof CitySelectionListItemsUIState.CityListItemUIState)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objInvoke = cpVar.invoke(((CitySelectionListItemsUIState.CityListItemUIState) citySelectionListItemsUIState).f6625a);
                }
                arrayList.add((String) objInvoke);
            }
            boolean z = (i3 & 14) == 4;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new CitySelectionScreenKt$CitySelectionList$2$1(lazyListState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(arrayList, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h0((Object) lazyListState, (Object) cities, (Object) itemDivider, (Object) paddingAroundDivider, modifier, i, 10));
        }
    }

    public static final void d(CircularProgressIndicatorUIState circularProgressIndicatorUIState, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-108770997);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(circularProgressIndicatorUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        int i4 = 1;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            modifier = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-108770997, i3, -1, "app.chalo.onboarding.cityselection.ui.CitySelectionLoadingScreen (CitySelectionScreen.kt:467)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ChaloCircularProgressIndicatorKt.a(null, circularProgressIndicatorUIState, composerStartRestartGroup, (i3 << 3) & 112, 1);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fp(circularProgressIndicatorUIState, modifier, i, i4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(CitySelectionComponent citySelectionComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1020839396);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(citySelectionComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1020839396, i2, -1, "app.chalo.onboarding.cityselection.ui.CitySelectionScreen (CitySelectionScreen.kt:65)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(citySelectionComponent.t0(), composerStartRestartGroup);
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new SafeFocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SafeFocusRequester safeFocusRequester = (SafeFocusRequester) objRememberedValue;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(citySelectionComponent);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new dp(citySelectionComponent, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            BackHandlerKt.a(false, (Function0) objRememberedValue2, 0, 0, composerStartRestartGroup, 3);
            Boolean boolValueOf = Boolean.valueOf(i(((CitySelectionUIState) mutableStateA.getValue()).f));
            boolean zChanged = composerStartRestartGroup.changed(mutableStateA) | composerStartRestartGroup.changed(softwareKeyboardController);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new CitySelectionScreenKt$CitySelectionScreen$2$1(safeFocusRequester, softwareKeyboardController, mutableStateA, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
            f((CitySelectionUIState) mutableStateA.getValue(), safeFocusRequester, composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new mk(citySelectionComponent, i, 15));
        }
    }

    public static final void f(CitySelectionUIState citySelectionUIState, SafeFocusRequester safeFocusRequester, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1506252631);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(citySelectionUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(safeFocusRequester) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1506252631, i2, -1, "app.chalo.onboarding.cityselection.ui.CitySelectionScreen (CitySelectionScreen.kt:93)");
            }
            CircularProgressIndicatorUIState circularProgressIndicatorUIState = citySelectionUIState.b;
            StandardErrorScreenUIState standardErrorScreenUIState = citySelectionUIState.c;
            if (circularProgressIndicatorUIState != null) {
                composerStartRestartGroup.startReplaceGroup(1046335473);
                d(citySelectionUIState.b, null, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (standardErrorScreenUIState != null) {
                composerStartRestartGroup.startReplaceGroup(1046440904);
                StandardErrorScreenKt.c(standardErrorScreenUIState, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composerStartRestartGroup, 48, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1046603220);
                a(citySelectionUIState, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), safeFocusRequester, composerStartRestartGroup, ((i2 << 3) & 896) | (i2 & 14) | 48);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new fp(citySelectionUIState, safeFocusRequester, i, 0));
        }
    }

    public static final void g(CitySelectionSearchPanelUIState citySelectionSearchPanelUIState, SafeFocusRequester safeFocusRequester, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1116394232);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(citySelectionSearchPanelUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(safeFocusRequester) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1116394232, i2, -1, "app.chalo.onboarding.cityselection.ui.CitySelectionSearchPanel (CitySelectionScreen.kt:419)");
            }
            if (citySelectionSearchPanelUIState instanceof CitySelectionSearchPanelUIState.SearchBarCard) {
                composerStartRestartGroup.startReplaceGroup(-1725915333);
                CitySelectionSearchPanelUISpec citySelectionSearchPanelUISpec = ((CitySelectionSearchPanelUIState.SearchBarCard) citySelectionSearchPanelUIState).f6632a;
                ChaloRoundedCardKt.a(citySelectionSearchPanelUISpec.d, SizeKt.m814height3ABfNKs(modifier, citySelectionSearchPanelUISpec.f6631a), ComposableLambdaKt.rememberComposableLambda(170150943, true, new c6(citySelectionSearchPanelUIState, 14), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(citySelectionSearchPanelUIState instanceof CitySelectionSearchPanelUIState.SearchBarTextField)) {
                    throw pk0.p(composerStartRestartGroup, -886960430);
                }
                composerStartRestartGroup.startReplaceGroup(-1724990479);
                CitySelectionSearchPanelUISpec citySelectionSearchPanelUISpec2 = ((CitySelectionSearchPanelUIState.SearchBarTextField) citySelectionSearchPanelUIState).f6633a;
                ChaloRoundedCardKt.a(citySelectionSearchPanelUISpec2.d, SizeKt.m814height3ABfNKs(modifier, citySelectionSearchPanelUISpec2.f6631a), ComposableLambdaKt.rememberComposableLambda(-1327292536, true, new d0(24, citySelectionSearchPanelUIState, safeFocusRequester), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new s4(i, 27, citySelectionSearchPanelUIState, safeFocusRequester, modifier));
        }
    }

    public static final void h(ToolbarUIState toolbar, ImageUIState headerImage, CitySelectionSearchPanelUIState searchPanel, ChaloPadding paddingAroundHeader, ChaloPadding paddingAroundSearchPanel, ChaloPadding paddingAroundHeaderImage, SafeFocusRequester safeFocusRequester, Function1 onHeightChange, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.i(toolbar, "toolbar");
        Intrinsics.i(headerImage, "headerImage");
        Intrinsics.i(searchPanel, "searchPanel");
        Intrinsics.i(paddingAroundHeader, "paddingAroundHeader");
        Intrinsics.i(paddingAroundSearchPanel, "paddingAroundSearchPanel");
        Intrinsics.i(paddingAroundHeaderImage, "paddingAroundHeaderImage");
        Intrinsics.i(safeFocusRequester, "safeFocusRequester");
        Intrinsics.i(onHeightChange, "onHeightChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(329678048);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(toolbar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(headerImage) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(searchPanel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(paddingAroundHeader) : composerStartRestartGroup.changedInstance(paddingAroundHeader) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(paddingAroundSearchPanel) : composerStartRestartGroup.changedInstance(paddingAroundSearchPanel) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? composerStartRestartGroup.changed(paddingAroundHeaderImage) : composerStartRestartGroup.changedInstance(paddingAroundHeaderImage) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(safeFocusRequester) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onHeightChange) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if (composerStartRestartGroup.shouldExecute((38347923 & i2) != 38347922, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(329678048, i2, -1, "app.chalo.onboarding.cityselection.ui.CitySelectionToolbarAndHeader (CitySelectionScreen.kt:265)");
            }
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            boolean zChanged = ((29360128 & i2) == 8388608) | composerStartRestartGroup.changed(density);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new mh(onHeightChange, density, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier, (Function1) objRememberedValue);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned);
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
            int i4 = i2;
            ChaloToolBarKt.b(toolbar, companion2, null, composerStartRestartGroup, (i2 & 14) | 48, 12);
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), paddingAroundHeader);
            int i5 = i4 >> 6;
            b(headerImage, searchPanel, paddingAroundSearchPanel, paddingAroundHeaderImage, safeFocusRequester, modifierC, composerStartRestartGroup, ((i4 >> 3) & WebSocketProtocol.PAYLOAD_SHORT) | (i5 & 896) | (i5 & 7168) | (i5 & 57344));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new bn(toolbar, headerImage, searchPanel, paddingAroundHeader, paddingAroundSearchPanel, paddingAroundHeaderImage, safeFocusRequester, onHeightChange, modifier, i));
        }
    }

    public static final boolean i(CitySelectionSearchPanelUIState citySelectionSearchPanelUIState) {
        if (citySelectionSearchPanelUIState instanceof CitySelectionSearchPanelUIState.SearchBarCard) {
            return false;
        }
        if (citySelectionSearchPanelUIState instanceof CitySelectionSearchPanelUIState.SearchBarTextField) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }
}
