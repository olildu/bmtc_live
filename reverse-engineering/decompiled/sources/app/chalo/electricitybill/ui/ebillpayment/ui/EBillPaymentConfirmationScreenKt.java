package app.chalo.electricitybill.ui.ebillpayment.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSnackbarKt;
import app.chalo.compose.components.ShadowElementKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.dialogs.TncDialogUIKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.electricitybill.ui.base.CustomerInfoUIKt;
import app.chalo.electricitybill.ui.base.TransactionInfoViewKt;
import app.chalo.electricitybill.ui.ebillpayment.EBillPaymentConfirmationComponent;
import app.chalo.electricitybill.ui.ebillpayment.EBillPaymentConfirmationUISpecs;
import app.chalo.electricitybill.ui.ebillpayment.EBillPaymentConfirmationViewState;
import app.chalo.electricitybill.ui.ebillpayment.TotalAmountUISpecs;
import app.chalo.electricitybill.ui.ebillpayment.TotalAmountUIState;
import app.chalo.electricitybill.ui.uistate.CustomerInfoUIState;
import app.chalo.electricitybill.ui.uistate.TransactionInfoUIState;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.dialog.TnCDialogUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.snackbar.SnackbarUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.b3;
import defpackage.c6;
import defpackage.pk0;
import defpackage.r1;
import defpackage.t8;
import defpackage.w00;
import defpackage.x00;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/electricitybill/ui/ebillpayment/EBillPaymentConfirmationViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EBillPaymentConfirmationScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(EBillPaymentConfirmationComponent eBillPaymentConfirmationComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(443685192);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(eBillPaymentConfirmationComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(443685192, i2, -1, "app.chalo.electricitybill.ui.ebillpayment.ui.EBillPaymentConfirmationScreen (EBillPaymentConfirmationScreen.kt:39)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(eBillPaymentConfirmationComponent.t0(), composerStartRestartGroup);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(eBillPaymentConfirmationComponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new EBillPaymentConfirmationScreenKt$EBillPaymentConfirmationScreen$1$1(eBillPaymentConfirmationComponent, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(eBillPaymentConfirmationComponent, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i2 & 14);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            LoadingDialogUIState loadingDialogUIState = ((EBillPaymentConfirmationViewState) mutableStateA.getValue()).h;
            if (loadingDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-127870727);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                t8.m(composerStartRestartGroup, -127870726, loadingDialogUIState, composerStartRestartGroup, 0);
            }
            c((EBillPaymentConfirmationViewState) mutableStateA.getValue(), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            b(((EBillPaymentConfirmationViewState) mutableStateA.getValue()).j, composerStartRestartGroup, 0);
            TnCDialogUIState tnCDialogUIState = ((EBillPaymentConfirmationViewState) mutableStateA.getValue()).i;
            if (tnCDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-2083264732);
            } else {
                composerStartRestartGroup.startReplaceGroup(-2083264731);
                TncDialogUIKt.d(tnCDialogUIState, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w00(eBillPaymentConfirmationComponent, i, 2));
        }
    }

    public static final void b(SnackbarUIState snackbarUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1357072313);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(snackbarUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1357072313, i2, -1, "app.chalo.electricitybill.ui.ebillpayment.ui.EBillPaymentConfirmationScreenSnackBar (EBillPaymentConfirmationScreen.kt:125)");
            }
            Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(bottomCenter, false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (snackbarUIState == null) {
                composerStartRestartGroup.startReplaceGroup(483265965);
            } else {
                composerStartRestartGroup.startReplaceGroup(483265966);
                ChaloSnackbarKt.b(snackbarUIState, null, composerStartRestartGroup, 0, 2);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new x00(snackbarUIState, i, 1));
        }
    }

    public static final void c(EBillPaymentConfirmationViewState eBillPaymentConfirmationViewState, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(501960933);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(eBillPaymentConfirmationViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(501960933, i2, -1, "app.chalo.electricitybill.ui.ebillpayment.ui.EBillPaymentConfirmationScreenUI (EBillPaymentConfirmationScreen.kt:61)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            EBillPaymentConfirmationUISpecs eBillPaymentConfirmationUISpecs = eBillPaymentConfirmationViewState.f2578a;
            TotalAmountUIState totalAmountUIState = eBillPaymentConfirmationViewState.f;
            DividerUIState dividerUIState = eBillPaymentConfirmationViewState.g;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(BackgroundKt.m264backgroundbw27NRU$default(companion, ChaloColorTokenKt.c(eBillPaymentConfirmationUISpecs.f2577a), null, 2, null), 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(BackgroundKt.m264backgroundbw27NRU$default(companion, ChaloColorTokenKt.c(eBillPaymentConfirmationUISpecs.f2577a), null, 2, null), 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i6), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloToolBarKt.b(eBillPaymentConfirmationViewState.b, null, null, composerStartRestartGroup, 0, 14);
            TextKt.c(eBillPaymentConfirmationViewState.c, ChaloThemeKt.c(companion, eBillPaymentConfirmationUISpecs.b), null, null, composerStartRestartGroup, 0, 12);
            CustomerInfoUIState customerInfoUIState = eBillPaymentConfirmationViewState.d;
            if (customerInfoUIState == null) {
                composerStartRestartGroup.startReplaceGroup(893394831);
                composerStartRestartGroup.endReplaceGroup();
                i3 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(893394832);
                i3 = 0;
                CustomerInfoUIKt.a(null, customerInfoUIState, composerStartRestartGroup, 0);
                DividerUIStateKt.a(null, dividerUIState, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.endReplaceGroup();
            }
            TransactionInfoUIState transactionInfoUIState = eBillPaymentConfirmationViewState.e;
            if (transactionInfoUIState == null) {
                composerStartRestartGroup.startReplaceGroup(893539818);
                composerStartRestartGroup.endReplaceGroup();
                i4 = 1;
            } else {
                composerStartRestartGroup.startReplaceGroup(893539819);
                TransactionInfoViewKt.a(null, transactionInfoUIState, composerStartRestartGroup, i3);
                i4 = 1;
                DividerUIStateKt.a(null, dividerUIState, composerStartRestartGroup, i3, 1);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            Modifier modifierAlign = boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion, 0.0f, i4, null), companion2.getBottomEnd());
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, i3);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i3);
            int i7 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
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
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i7), composerM3915constructorimpl3));
            ShadowElementKt.a(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), totalAmountUIState.f2580a.c.c), 0L, 0L, composerStartRestartGroup, 0, 6);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloRoundedCardKt.a(totalAmountUIState.f2580a.c, null, ComposableLambdaKt.rememberComposableLambda(-1500739897, true, new c6(eBillPaymentConfirmationViewState, 24), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w00(eBillPaymentConfirmationViewState, i, 3));
        }
    }

    public static final void d(TotalAmountUIState totalAmountUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-717884265);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(totalAmountUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-717884265, i2, -1, "app.chalo.electricitybill.ui.ebillpayment.ui.TotalAmountBottomCard (EBillPaymentConfirmationScreen.kt:108)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            TotalAmountUISpecs totalAmountUISpecs = totalAmountUIState.f2580a;
            Modifier modifierC = ChaloThemeKt.c(companion, totalAmountUISpecs.f2579a);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TransactionInfoViewKt.a(null, totalAmountUIState.b, composerStartRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, totalAmountUISpecs.b), composerStartRestartGroup, 0);
            if (b3.s(0, 0, composerStartRestartGroup, SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), totalAmountUISpecs.d), totalAmountUIState.c)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w00(totalAmountUIState, i, 4));
        }
    }
}
