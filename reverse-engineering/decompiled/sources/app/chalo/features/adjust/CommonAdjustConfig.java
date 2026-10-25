package app.chalo.features.adjust;

import defpackage.f1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/adjust/CommonAdjustConfig;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonAdjustConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2626a;
    public final AdjustLogLevel b;
    public final AdjustUrlStrategyConfig c;
    public final f1 d;
    public final a e;

    public CommonAdjustConfig(String appToken, AdjustLogLevel logLevel, AdjustUrlStrategyConfig adjustUrlStrategyConfig, f1 f1Var, a aVar) {
        Intrinsics.i(appToken, "appToken");
        Intrinsics.i(logLevel, "logLevel");
        this.f2626a = appToken;
        this.b = logLevel;
        this.c = adjustUrlStrategyConfig;
        this.d = f1Var;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAdjustConfig)) {
            return false;
        }
        CommonAdjustConfig commonAdjustConfig = (CommonAdjustConfig) obj;
        return Intrinsics.d(this.f2626a, commonAdjustConfig.f2626a) && this.b == commonAdjustConfig.b && this.c.equals(commonAdjustConfig.c) && this.d.equals(commonAdjustConfig.d) && this.e.equals(commonAdjustConfig.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f2626a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CommonAdjustConfig(appToken=" + this.f2626a + ", logLevel=" + this.b + ", urlStrategyConfig=" + this.c + ", deeplinkListener=" + this.d + ", attributionChangedListener=" + this.e + ")";
    }
}
