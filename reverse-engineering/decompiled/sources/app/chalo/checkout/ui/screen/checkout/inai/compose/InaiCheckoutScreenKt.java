package app.chalo.checkout.ui.screen.checkout.inai.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import app.chalo.checkout.paymentprovider.inai.InaiPlatformContext;
import app.chalo.checkout.paymentprovider.inai.InaiPlatformContextProvider_androidKt;
import app.chalo.checkout.ui.screen.checkout.inai.InaiCheckoutComponent;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.w00;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/inai/InaiCheckoutViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "checkout_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class InaiCheckoutScreenKt {
    public static final void a(InaiCheckoutComponent inaiCheckoutComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1014054049);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(inaiCheckoutComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1014054049, i2, -1, "app.chalo.checkout.ui.screen.checkout.inai.compose.InaiCheckoutScreen (InaiCheckoutScreen.kt:13)");
            }
            SubscribeAsStateKt.a(inaiCheckoutComponent.t0(), composerStartRestartGroup);
            InaiPlatformContext inaiPlatformContextA = InaiPlatformContextProvider_androidKt.a(composerStartRestartGroup);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(inaiCheckoutComponent) | composerStartRestartGroup.changedInstance(inaiPlatformContextA);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new InaiCheckoutScreenKt$InaiCheckoutScreen$1$1(inaiCheckoutComponent, inaiPlatformContextA, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(inaiCheckoutComponent, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i2 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w00(inaiCheckoutComponent, i, 26));
        }
    }
}
