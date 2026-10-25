package app.chalo.checkout.ui.screen.checkout.razorpay.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.checkout.paymentprovider.razorpay.RazorPaySdkProvider;
import app.chalo.checkout.paymentprovider.razorpay.RazorpaySdk;
import app.chalo.checkout.ui.screen.checkout.razorpay.CheckoutComponent;
import app.chalo.checkout.ui.screen.checkout.razorpay.CheckoutViewState;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.ChaloToolBarKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.webview.WebViewComponent_androidKt;
import app.chalo.uistate.webview.PlatformWebViewContract;
import app.chalo.uistate.webview.WebViewUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.ch;
import defpackage.fj;
import defpackage.pk0;
import defpackage.s4;
import defpackage.yn;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lapp/chalo/uistate/webview/WebViewUIState;", "webViewState", "checkout_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CheckoutScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(CheckoutComponent checkoutComponent, RazorPaySdkProvider razorPaySdkProvider, Composer composer, int i) {
        int i2;
        Intrinsics.i(razorPaySdkProvider, "razorPaySdkProvider");
        Composer composerStartRestartGroup = composer.startRestartGroup(965442202);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(checkoutComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(razorPaySdkProvider) : composerStartRestartGroup.changedInstance(razorPaySdkProvider) ? 32 : 16;
        }
        boolean z = false;
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(965442202, i2, -1, "app.chalo.checkout.ui.screen.checkout.razorpay.compose.CheckoutScreen (CheckoutScreen.kt:39)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(checkoutComponent.t0(), composerStartRestartGroup);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new WebViewUIState("", null, null, 30), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(checkoutComponent);
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && composerStartRestartGroup.changedInstance(razorPaySdkProvider))) {
                z = true;
            }
            boolean z2 = zChangedInstance | z;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new CheckoutScreenKt$CheckoutScreen$1$1(checkoutComponent, razorPaySdkProvider, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(checkoutComponent, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i2 & 14);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(checkoutComponent);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new yn(checkoutComponent, 6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            BackHandlerKt.a(false, (Function0) objRememberedValue3, 0, 0, composerStartRestartGroup, 3);
            b((CheckoutViewState) mutableStateA.getValue(), (WebViewUIState) mutableState.getValue(), razorPaySdkProvider, composerStartRestartGroup, (i2 << 3) & 896);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fj(checkoutComponent, razorPaySdkProvider, i, 26));
        }
    }

    public static final void b(CheckoutViewState checkoutViewState, WebViewUIState webViewUIState, RazorPaySdkProvider razorPaySdkProvider, Composer composer, int i) {
        int i2;
        WebViewUIState webViewUIState2;
        Composer composer2;
        Composer composer3;
        PlatformWebViewContract platformWebViewContract;
        int i3;
        int i4;
        PlatformWebViewContract platformWebViewContract2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1954889744);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(checkoutViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            webViewUIState2 = webViewUIState;
            i2 |= composerStartRestartGroup.changed(webViewUIState2) ? 32 : 16;
        } else {
            webViewUIState2 = webViewUIState;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(razorPaySdkProvider) : composerStartRestartGroup.changedInstance(razorPaySdkProvider) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1954889744, i2, -1, "app.chalo.checkout.ui.screen.checkout.razorpay.compose.CheckoutScreenContent (CheckoutScreen.kt:89)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).Y, null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (Intrinsics.d(checkoutViewState.b, Boolean.TRUE)) {
                composerStartRestartGroup.startReplaceGroup(984550640);
                i3 = 980584252;
                composer3 = composerStartRestartGroup;
                platformWebViewContract = null;
                ChaloLoadingDialogKt.b(null, false, null, composer3, 0, 7);
            } else {
                composer3 = composerStartRestartGroup;
                platformWebViewContract = null;
                i3 = 980584252;
                composer3.startReplaceGroup(980584252);
            }
            composer3.endReplaceGroup();
            if (checkoutViewState.c) {
                composer3.startReplaceGroup(984638525);
                Composer composer4 = composer3;
                i4 = 1;
                ChaloToolBarKt.a(ComposableSingletons$CheckoutScreenKt.f1498a, null, 0.0f, 0L, null, null, composer4, 6, 62);
                composer3 = composer4;
            } else {
                i4 = 1;
                composer3.startReplaceGroup(i3);
            }
            composer3.endReplaceGroup();
            Modifier modifierM264backgroundbw27NRU$default2 = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, i4, platformWebViewContract), ChaloTheme.a(composer3, 0).Y, null, 2, null);
            int i6 = ((i2 & 896) == 256 || ((i2 & 512) != 0 && composer3.changedInstance(razorPaySdkProvider))) ? i4 : 0;
            Object objRememberedValue = composer3.rememberedValue();
            if (i6 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ch(razorPaySdkProvider, 23);
                composer3.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            RazorpaySdk razorpaySdkC = razorPaySdkProvider.c();
            if (razorpaySdkC == null) {
                composer3.startReplaceGroup(985313704);
                composer3.endReplaceGroup();
                platformWebViewContract2 = platformWebViewContract;
            } else {
                composer3.startReplaceGroup(985313705);
                boolean zChanged = composer3.changed(razorpaySdkC);
                Object objRememberedValue2 = composer3.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new CheckoutScreen_androidKt$getWebviewPlatformContract$1();
                    composer3.updateRememberedValue(objRememberedValue2);
                }
                platformWebViewContract2 = (PlatformWebViewContract) objRememberedValue2;
                composer3.endReplaceGroup();
            }
            Composer composer5 = composer3;
            WebViewComponent_androidKt.b(webViewUIState2, modifierM264backgroundbw27NRU$default2, function1, platformWebViewContract2, composer5, (i2 >> 3) & 14, 0);
            composer2 = composer5;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new s4(i, 25, checkoutViewState, webViewUIState, razorPaySdkProvider));
        }
    }
}
