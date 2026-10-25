package app.chalo.checkout.ui.screen.postpayment.compose;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.checkout.ui.screen.postpayment.CheckoutPostPaymentComponent;
import app.chalo.checkout.ui.screen.postpayment.PostPaymentViewState;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.GenericSuccessScreenWithImageMsgAndCtaKt;
import app.chalo.compose.NewGenericErrorScreenWithMsgAndRetryKt;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.success.StandardSuccessScreenUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.pk0;
import defpackage.t8;
import defpackage.wb;
import defpackage.zr0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "checkout_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PostPaymentMainScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(CheckoutPostPaymentComponent checkoutPostPaymentComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1855913266);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(checkoutPostPaymentComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1855913266, i2, -1, "app.chalo.checkout.ui.screen.postpayment.compose.CheckoutPostPaymentScreen (PostPaymentMainScreen.kt:18)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(checkoutPostPaymentComponent.t0(), composerStartRestartGroup);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new wb(8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.a(false, (Function0) objRememberedValue, 0, 384, composerStartRestartGroup, 3);
            b((PostPaymentViewState) mutableStateA.getValue(), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zr0(checkoutPostPaymentComponent, i, 2));
        }
    }

    public static final void b(PostPaymentViewState postPaymentViewState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1984322304);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(postPaymentViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1984322304, i2, -1, "app.chalo.checkout.ui.screen.postpayment.compose.PostPaymentScreenContent (PostPaymentMainScreen.kt:31)");
            }
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
            LoadingDialogUIState loadingDialogUIState = postPaymentViewState.f1597a;
            StandardSuccessScreenUIState.SuccessWithGifMsgAndCta successWithGifMsgAndCta = postPaymentViewState.c;
            StandardErrorScreenUIState.NewErrorWithMsgAndRetry newErrorWithMsgAndRetry = postPaymentViewState.b;
            if (loadingDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(950954049);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                t8.m(composerStartRestartGroup, 950954050, loadingDialogUIState, composerStartRestartGroup, 0);
            }
            if (newErrorWithMsgAndRetry != null) {
                composerStartRestartGroup.startReplaceGroup(951066363);
                NewGenericErrorScreenWithMsgAndRetryKt.a(null, newErrorWithMsgAndRetry, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (successWithGifMsgAndCta != null) {
                    composerStartRestartGroup.startReplaceGroup(951245047);
                    GenericSuccessScreenWithImageMsgAndCtaKt.a(null, successWithGifMsgAndCta, composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(949844188);
                }
                composerStartRestartGroup.endReplaceGroup();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new zr0(postPaymentViewState, i, 3));
        }
    }
}
