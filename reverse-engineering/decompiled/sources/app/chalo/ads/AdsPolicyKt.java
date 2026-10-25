package app.chalo.ads;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.InspectionModeKt;
import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.koin.core.context.GlobalContext;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AdsPolicyKt {
    public static final boolean a(Composer composer) {
        composer.startReplaceGroup(815553545);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(815553545, 0, -1, "app.chalo.ads.rememberIsAdvertisingPermitted (AdsPolicy.kt:24)");
        }
        if (((Boolean) composer.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = Boolean.valueOf(((SdkIntegrationPolicyManager) GlobalContext.f18817a.a().c.d.d(Reflection.a(SdkIntegrationPolicyManager.class), null, null)).f1078a.e);
            composer.updateRememberedValue(objRememberedValue);
        }
        boolean zBooleanValue = ((Boolean) objRememberedValue).booleanValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return zBooleanValue;
    }
}
