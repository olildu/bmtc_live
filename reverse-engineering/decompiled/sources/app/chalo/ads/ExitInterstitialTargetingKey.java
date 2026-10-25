package app.chalo.ads;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ads/ExitInterstitialTargetingKey;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ExitInterstitialTargetingKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f781a;
    public final String b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/ExitInterstitialTargetingKey$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ExitInterstitialTargetingKey(String str, String str2) {
        this.f781a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExitInterstitialTargetingKey)) {
            return false;
        }
        ExitInterstitialTargetingKey exitInterstitialTargetingKey = (ExitInterstitialTargetingKey) obj;
        return Intrinsics.d(this.f781a, exitInterstitialTargetingKey.f781a) && Intrinsics.d(this.b, exitInterstitialTargetingKey.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f781a.hashCode() * 31);
    }

    public final String toString() {
        return vo1.o("ExitInterstitialTargetingKey(cityName=", this.f781a, ", languageLocale=", this.b, ")");
    }
}
