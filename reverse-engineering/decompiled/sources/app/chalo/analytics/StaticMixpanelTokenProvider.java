package app.chalo.analytics;

import app.chalo.buildconfig.Environment;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/analytics/StaticMixpanelTokenProvider;", "Lapp/chalo/analytics/MixpanelTokenProvider;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StaticMixpanelTokenProvider implements MixpanelTokenProvider {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f874a;

        static {
            int[] iArr = new int[Environment.values().length];
            try {
                iArr[Environment.DEVELOPMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Environment.PRODUCTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Environment.PREPROD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f874a = iArr;
        }
    }

    @Override // app.chalo.analytics.MixpanelTokenProvider
    public final String a(Environment environment) {
        Intrinsics.i(environment, "environment");
        int i = WhenMappings.f874a[environment.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return "80a6dae2a0fe1078a4cd896ec834dde4";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof StaticMixpanelTokenProvider);
    }

    public final int hashCode() {
        return -1346271474;
    }

    public final String toString() {
        return "StaticMixpanelTokenProvider(debugToken=80a6dae2a0fe1078a4cd896ec834dde4, prodToken=80a6dae2a0fe1078a4cd896ec834dde4, preprodToken=80a6dae2a0fe1078a4cd896ec834dde4)";
    }
}
