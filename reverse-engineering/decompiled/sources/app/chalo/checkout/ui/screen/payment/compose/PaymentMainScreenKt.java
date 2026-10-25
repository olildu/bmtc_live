package app.chalo.checkout.ui.screen.payment.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.checkout.paymentprovider.inai.InaiPlatformContext;
import app.chalo.checkout.paymentprovider.inai.InaiPlatformContextProvider_androidKt;
import app.chalo.checkout.ui.screen.payment.PaymentBottomSheetUiType;
import app.chalo.checkout.ui.screen.payment.PaymentMainComponent;
import app.chalo.checkout.ui.screen.payment.PaymentScreenUiSpec;
import app.chalo.checkout.ui.screen.payment.PaymentViewState;
import app.chalo.checkout.ui.screen.upi.NoUpiAppsErrorUiState;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.StandardErrorScreenKt;
import app.chalo.compose.components.ChaloCircularProgressIndicatorKt;
import app.chalo.compose.components.ChaloSnackbarKt;
import app.chalo.compose.components.CircularProgressIndicatorUIState;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.bottomsheet.BottomSheetEventHandler;
import app.chalo.uistate.bottomsheet.BottomSheetUiState;
import app.chalo.uistate.bottomsheet.BottomSheetUiStateKt;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.dd;
import defpackage.eq0;
import defpackage.fk0;
import defpackage.pk0;
import defpackage.pq0;
import defpackage.t1;
import defpackage.t8;
import defpackage.u50;
import defpackage.x00;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "adLoadedSuccessfully", "checkout_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PaymentMainScreenKt {
    public static final void a(PaymentViewState paymentViewState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1992083422);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(paymentViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1992083422, i2, -1, "app.chalo.checkout.ui.screen.payment.compose.MainScreen (PaymentMainScreen.kt:191)");
            }
            LoadingDialogUIState loadingDialogUIState = paymentViewState.h;
            if (loadingDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1700967117);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                t8.m(composerStartRestartGroup, 1700967118, loadingDialogUIState, composerStartRestartGroup, 0);
            }
            ToolbarUIState toolbarUIState = paymentViewState.b;
            List list = paymentViewState.d;
            NoUpiAppsErrorUiState noUpiAppsErrorUiState = paymentViewState.e;
            composerStartRestartGroup.startReplaceGroup(1701309884);
            composerStartRestartGroup.endReplaceGroup();
            PaymentMethodMainScreenItemsKt.a(toolbarUIState, list, noUpiAppsErrorUiState, null, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new pq0(paymentViewState, i, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(PaymentMainComponent paymentMainComponent, Composer composer, int i) {
        int i2;
        BottomSheetEventHandler bottomSheetEventHandler;
        Composer composerStartRestartGroup = composer.startRestartGroup(-455581520);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(paymentMainComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-455581520, i2, -1, "app.chalo.checkout.ui.screen.payment.compose.PaymentMainScreen (PaymentMainScreen.kt:50)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(paymentMainComponent.t0(), composerStartRestartGroup);
            BottomSheetUiState bottomSheetUiState = ((PaymentViewState) mutableStateA.getValue()).g;
            SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState((bottomSheetUiState == null || (bottomSheetEventHandler = bottomSheetUiState.b) == null) ? false : bottomSheetEventHandler.f, null, composerStartRestartGroup, 0, 2);
            InaiPlatformContext inaiPlatformContextA = InaiPlatformContextProvider_androidKt.a(composerStartRestartGroup);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(paymentMainComponent) | composerStartRestartGroup.changedInstance(inaiPlatformContextA);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new PaymentMainScreenKt$PaymentMainScreen$1$1(paymentMainComponent, inaiPlatformContextA, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(paymentMainComponent, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i2 & 14);
            boolean zIsVisible = sheetStateRememberModalBottomSheetState.isVisible();
            boolean zChanged = composerStartRestartGroup.changed(mutableStateA);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new t1(mutableStateA, 22);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            BackHandlerKt.a(zIsVisible, (Function0) objRememberedValue2, 0, 0, composerStartRestartGroup, 2);
            PaymentBottomSheetUiType paymentBottomSheetUiType = ((PaymentViewState) mutableStateA.getValue()).f;
            boolean zChanged2 = composerStartRestartGroup.changed(mutableStateA) | composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new PaymentMainScreenKt$PaymentMainScreen$3$1(sheetStateRememberModalBottomSheetState, mutableStateA, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(paymentBottomSheetUiType, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
            c((PaymentViewState) mutableStateA.getValue(), sheetStateRememberModalBottomSheetState, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fk0(paymentMainComponent, i, 17));
        }
    }

    public static final void c(PaymentViewState paymentViewState, SheetState sheetState, Composer composer, int i) {
        int i2;
        SheetState sheetState2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1035515987);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(paymentViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(sheetState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1035515987, i2, -1, "app.chalo.checkout.ui.screen.payment.compose.PaymentMainScreenContent (PaymentMainScreen.kt:104)");
            }
            d(paymentViewState, composerStartRestartGroup, i2 & 14);
            PaymentBottomSheetUiType paymentBottomSheetUiType = paymentViewState.f;
            if (paymentBottomSheetUiType == null) {
                composerStartRestartGroup.startReplaceGroup(-1693035513);
                composerStartRestartGroup.endReplaceGroup();
                sheetState2 = sheetState;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1693035512);
                sheetState2 = sheetState;
                BottomSheetUiStateKt.a(null, paymentViewState.g, sheetState2, ComposableLambdaKt.rememberComposableLambda(1411032846, true, new u50(22, paymentViewState, paymentBottomSheetUiType), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 << 3) & 896) | 27648, 1);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            sheetState2 = sheetState;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eq0(paymentViewState, sheetState2, i, 1));
        }
    }

    public static final void d(PaymentViewState paymentViewState, Composer composer, int i) {
        int i2;
        Modifier modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-583666479);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(paymentViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-583666479, i2, -1, "app.chalo.checkout.ui.screen.payment.compose.PaymentScreen (PaymentMainScreen.kt:156)");
            }
            ConfirmationDialogUiState confirmationDialogUiState = paymentViewState.c;
            CircularProgressIndicatorUIState circularProgressIndicatorUIState = paymentViewState.i;
            StandardErrorScreenUIState standardErrorScreenUIState = paymentViewState.k;
            PaymentScreenUiSpec paymentScreenUiSpec = paymentViewState.f1577a;
            if (confirmationDialogUiState == null) {
                composerStartRestartGroup.startReplaceGroup(-1980350080);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                dd.l(composerStartRestartGroup, -1980350079, confirmationDialogUiState, composerStartRestartGroup, 0);
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloColorTokenKt.c(paymentScreenUiSpec.b), null, 2, null);
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
            if (standardErrorScreenUIState != null) {
                composerStartRestartGroup.startReplaceGroup(1036384067);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
                ToolbarUIState toolbarUIState = paymentViewState.b;
                if (toolbarUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(236416864);
                    composerStartRestartGroup.endReplaceGroup();
                    modifier = null;
                } else {
                    composerStartRestartGroup.startReplaceGroup(236416865);
                    modifier = null;
                    ChaloToolBarKt.d(toolbarUIState, null, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                StandardErrorScreenKt.c(standardErrorScreenUIState, modifier, composerStartRestartGroup, 0, 2);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1036637709);
                if (circularProgressIndicatorUIState != null) {
                    composerStartRestartGroup.startReplaceGroup(1036700701);
                    ChaloCircularProgressIndicatorKt.a(boxScopeInstance.align(companion, UiAlignmentKt.c(paymentScreenUiSpec.d)), circularProgressIndicatorUIState, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1036979515);
                    a(paymentViewState, composerStartRestartGroup, i2 & 14);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            e(paymentViewState.j, composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new pq0(paymentViewState, i, 0));
        }
    }

    public static final void e(SnackbarUIState snackbarUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2052497280);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(snackbarUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2052497280, i2, -1, "app.chalo.checkout.ui.screen.payment.compose.PaymentScreenErrorSnackbar (PaymentMainScreen.kt:253)");
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
                composerStartRestartGroup.startReplaceGroup(1991491365);
            } else {
                composerStartRestartGroup.startReplaceGroup(1991491366);
                ChaloSnackbarKt.b(snackbarUIState, null, composerStartRestartGroup, i2 & 14, 2);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new x00(snackbarUIState, i, 3));
        }
    }
}
