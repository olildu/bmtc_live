package app.chalo.buildconfig;

import com.adjust.sdk.AdjustConfig;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloBuildConfigKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1168a;

        static {
            int[] iArr = new int[Environment.values().length];
            try {
                iArr[Environment.PRODUCTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Environment.DEVELOPMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Environment.PREPROD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1168a = iArr;
        }
    }

    public static final String a(Environment environment) {
        Intrinsics.i(environment, "<this>");
        int i = WhenMappings.f1168a[environment.ordinal()];
        if (i == 1) {
            return AdjustConfig.ENVIRONMENT_PRODUCTION;
        }
        if (i == 2) {
            return PaymentConstants.ENVIRONMENT.DEV;
        }
        if (i == 3) {
            return "preprod";
        }
        throw new NoWhenBranchMatchedException();
    }
}
