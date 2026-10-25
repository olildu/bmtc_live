package app.chalo.ads;

import defpackage.dd;
import defpackage.nf1;
import defpackage.t10;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ads/ExitInterstitialAdConfig;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ExitInterstitialAdConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f770a;
    public final String b;
    public final String c;
    public final boolean d;
    public final int e;
    public final int f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ads/ExitInterstitialAdConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ads/ExitInterstitialAdConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ExitInterstitialAdConfig> serializer() {
            return ExitInterstitialAdConfig$$serializer.f771a;
        }
    }

    public ExitInterstitialAdConfig(int i, String str, String str2, String str3, boolean z, int i2) {
        this.f770a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = i;
        this.f = i2;
    }

    public final ExitInterstitialAdConfig a() {
        String expId = StringsKt.u0(this.f770a).toString();
        String expName = StringsKt.u0(this.b).toString();
        String variant = StringsKt.u0(this.c).toString();
        int i = this.e;
        int i2 = i < 0 ? 0 : i;
        int i3 = this.f;
        int i4 = i3 < 0 ? 0 : i3;
        Intrinsics.i(expId, "expId");
        Intrinsics.i(expName, "expName");
        Intrinsics.i(variant, "variant");
        return new ExitInterstitialAdConfig(i2, expId, expName, variant, this.d, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExitInterstitialAdConfig)) {
            return false;
        }
        ExitInterstitialAdConfig exitInterstitialAdConfig = (ExitInterstitialAdConfig) obj;
        return Intrinsics.d(this.f770a, exitInterstitialAdConfig.f770a) && Intrinsics.d(this.b, exitInterstitialAdConfig.b) && Intrinsics.d(this.c, exitInterstitialAdConfig.c) && this.d == exitInterstitialAdConfig.d && this.e == exitInterstitialAdConfig.e && this.f == exitInterstitialAdConfig.f;
    }

    public final int hashCode() {
        return ((((nf1.e(nf1.e(this.f770a.hashCode() * 31, 31, this.b), 31, this.c) + (this.d ? 1231 : 1237)) * 31) + this.e) * 31) + this.f;
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ExitInterstitialAdConfig(expId=", this.f770a, ", expName=", this.b, ", variant=");
        t10.s(this.c, ", isEnabled=", ", cooldownMinutes=", sbE, this.d);
        return xs.h(this.e, this.f, ", showEveryNthExit=", ")", sbE);
    }

    public /* synthetic */ ExitInterstitialAdConfig(int i, String str, String str2, String str3, boolean z, int i2, int i3) {
        if ((i & 1) == 0) {
            this.f770a = "";
        } else {
            this.f770a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = 0;
        } else {
            this.e = i2;
        }
        if ((i & 32) == 0) {
            this.f = 0;
        } else {
            this.f = i3;
        }
    }

    public /* synthetic */ ExitInterstitialAdConfig(int i) {
        this(0, "", "", "", false, 0);
    }
}
