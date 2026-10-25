package app.chalo.busesaroundyou;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import app.chalo.ads.UnifiedAdCapability_androidKt;
import app.chalo.ads.UnifiedAdHostsKt;
import app.chalo.ads.UnifiedAdSlotSpec;
import app.chalo.ads.UnifiedAdSlotSpecs;
import app.chalo.busesaroundyou.BusesAroundYouScreenKt;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloSnackbarKt;
import app.chalo.compose.components.buttons.ChaloCircularBackButtonKt;
import app.chalo.compose.components.chalomap.ChaloMap_androidKt;
import app.chalo.compose.insets.PlatformInsets_androidKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.button.IconButtonUIState;
import app.chalo.uistate.components.map.ChaloMapUIState;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.android.gms.wallet.WalletConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.b0;
import defpackage.dd;
import defpackage.dq;
import defpackage.e0;
import defpackage.l3;
import defpackage.l6;
import defpackage.pk0;
import defpackage.r1;
import defpackage.rd;
import defpackage.u6;
import defpackage.vd;
import defpackage.wd;
import defpackage.xd;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002¨\u0006\u0006²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/chalo/busesaroundyou/BusesAroundYouViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "showUnifiedAd", "", "bannerHeightDp", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BusesAroundYouScreenKt {
    public static final void a(SnackbarUIState snackbarUIState, float f, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-119660843);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(snackbarUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-119660843, i2, -1, "app.chalo.busesaroundyou.BusesAroundYouMapScreenSnackBar (BusesAroundYouScreen.kt:161)");
            }
            Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(bottomCenter, false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (snackbarUIState == null) {
                composerStartRestartGroup.startReplaceGroup(580496456);
            } else {
                composerStartRestartGroup.startReplaceGroup(580496457);
                ChaloSnackbarKt.b(snackbarUIState, PaddingKt.m788paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, f, 7, null), composerStartRestartGroup, 0, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new wd(snackbarUIState, f, i, 0));
        }
    }

    public static final void b(Modifier modifier, Modifier modifier2, ChaloMapUIState chaloMapUIState, IconButtonUIState iconButtonUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(238372230);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(chaloMapUIState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(iconButtonUIState) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(238372230, i2, -1, "app.chalo.busesaroundyou.BusesAroundYouMapUI (BusesAroundYouScreen.kt:128)");
            }
            Modifier modifierClipToBounds = ClipKt.clipToBounds(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getBottomEnd(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierClipToBounds);
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
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i4 = i2 >> 6;
            ChaloMap_androidKt.c(chaloMapUIState, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composerStartRestartGroup, (i4 & 14) | 48);
            e(modifier2, iconButtonUIState, composerStartRestartGroup, ((i2 >> 3) & 14) | (i4 & 112));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u6(modifier, modifier2, chaloMapUIState, iconButtonUIState, i, 3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(BusesAroundYouComponent busesAroundYouComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1416480653);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(busesAroundYouComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1416480653, i2, -1, "app.chalo.busesaroundyou.BusesAroundYouScreen (BusesAroundYouScreen.kt:40)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(busesAroundYouComponent.t0(), composerStartRestartGroup);
            float fA = PlatformInsets_androidKt.a(0, composerStartRestartGroup, 1);
            UnifiedAdSlotSpec unifiedAdSlotSpec = UnifiedAdSlotSpecs.d;
            Set set = UnifiedAdCapability_androidKt.f828a;
            Intrinsics.i(unifiedAdSlotSpec, "<this>");
            boolean zChanged = composerStartRestartGroup.changed(true);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            boolean zChanged2 = composerStartRestartGroup.changed(true);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableIntState mutableIntState = (MutableIntState) objRememberedValue2;
            float intValue = (!((Boolean) mutableState.getValue()).booleanValue() || mutableIntState.getIntValue() <= 0) ? 0 : mutableIntState.getIntValue();
            float fM7278constructorimpl = Dp.m7278constructorimpl(Dp.m7278constructorimpl(intValue) + fA);
            BusesAroundYouViewState busesAroundYouViewState = (BusesAroundYouViewState) mutableStateA.getValue();
            boolean zBooleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            boolean zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(mutableIntState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new l3(16, mutableState, mutableIntState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function0 function0 = (Function0) objRememberedValue3;
            boolean zChanged4 = composerStartRestartGroup.changed(mutableIntState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new vd(mutableIntState, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Function1 function1 = (Function1) objRememberedValue4;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(busesAroundYouComponent);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new rd(busesAroundYouComponent, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            d(busesAroundYouViewState, fA, unifiedAdSlotSpec, zBooleanValue, function0, function1, (Function1) objRememberedValue5, fM7278constructorimpl, composerStartRestartGroup, 0);
            a(((BusesAroundYouViewState) mutableStateA.getValue()).e, Dp.m7278constructorimpl(Dp.m7278constructorimpl(intValue) + fA), composerStartRestartGroup, 0);
            ConfirmationDialogUiState confirmationDialogUiState = ((BusesAroundYouViewState) mutableStateA.getValue()).f;
            if (confirmationDialogUiState == null) {
                composerStartRestartGroup.startReplaceGroup(-319972459);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                dd.l(composerStartRestartGroup, -319972458, confirmationDialogUiState, composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e0(busesAroundYouComponent, i, 9));
        }
    }

    public static final void d(final BusesAroundYouViewState busesAroundYouViewState, final float f, final UnifiedAdSlotSpec unifiedAdSlotSpec, final boolean z, final Function0 function0, final Function1 function1, final Function1 function2, final float f2, Composer composer, final int i) {
        int i2;
        boolean z2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1252006484);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(busesAroundYouViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(unifiedAdSlotSpec) : composerStartRestartGroup.changedInstance(unifiedAdSlotSpec) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(f2) ? 8388608 : 4194304;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 4793491) != 4793490, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1252006484, i2, -1, "app.chalo.busesaroundyou.BusesAroundYouScreenUI (BusesAroundYouScreen.kt:83)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            int i4 = i2;
            ChaloToolBarKt.b(busesAroundYouViewState.b, null, null, composerStartRestartGroup, 0, 14);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(dq.a(columnScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getBottomCenter(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            b(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), PaddingKt.m788paddingqDBjuR0$default(ChaloThemeKt.c(companion, busesAroundYouViewState.f1186a.f1185a), 0.0f, 0.0f, 0.0f, f2, 7, null), busesAroundYouViewState.c, busesAroundYouViewState.d, composerStartRestartGroup, 6);
            composerStartRestartGroup = composerStartRestartGroup;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-178555939);
                Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), 0.0f, 0.0f, 0.0f, f, 7, null);
                boolean z3 = (458752 & i4) == 131072;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    z2 = false;
                    objRememberedValue = new xd(function1, 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    z2 = false;
                }
                Function2 function3 = (Function2) objRememberedValue;
                boolean z4 = (57344 & i4) == 16384 ? true : z2;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new l6(function0, 2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                UnifiedAdHostsKt.a(unifiedAdSlotSpec, modifierM788paddingqDBjuR0$default, false, 0L, 0.0f, function3, (Function1) objRememberedValue2, function2, composerStartRestartGroup, ((i4 >> 6) & 14) | ((i4 << 9) & 1879048192), WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(-182748782);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: yd
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    BusesAroundYouScreenKt.d(busesAroundYouViewState, f, unifiedAdSlotSpec, z, function0, function1, function2, f2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void e(Modifier modifier, IconButtonUIState iconButtonUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(682377883);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(iconButtonUIState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(682377883, i2, -1, "app.chalo.busesaroundyou.ChaloMapMyLocationButton (BusesAroundYouScreen.kt:150)");
            }
            ChaloCircularBackButtonKt.b(iconButtonUIState, modifier, composerStartRestartGroup, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b0(i, 13, modifier, iconButtonUIState));
        }
    }
}
