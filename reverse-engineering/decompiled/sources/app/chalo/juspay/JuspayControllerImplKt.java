package app.chalo.juspay;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JuspayControllerImplKt {
    public static final JuspaySdkStatus a(JuspayInitiateResult juspayInitiateResult) {
        if (Intrinsics.d(juspayInitiateResult, JuspayInitiateResult.Ready.f4049a)) {
            return JuspaySdkStatus.Ready.f4073a;
        }
        if (Intrinsics.d(juspayInitiateResult, JuspayInitiateResult.Abandoned.f4047a)) {
            return JuspaySdkStatus.Abandoned.f4069a;
        }
        if (juspayInitiateResult instanceof JuspayInitiateResult.Failed) {
            return ((JuspayInitiateResult.Failed) juspayInitiateResult).f4048a;
        }
        if (Intrinsics.d(juspayInitiateResult, JuspayInitiateResult.SdkStateUnknown.f4050a)) {
            return new JuspaySdkStatus.InitiationFailed(null, "juspay sdk state unknown");
        }
        throw new NoWhenBranchMatchedException();
    }
}
