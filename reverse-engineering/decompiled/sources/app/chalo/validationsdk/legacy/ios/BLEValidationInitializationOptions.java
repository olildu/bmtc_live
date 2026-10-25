package app.chalo.validationsdk.legacy.ios;

import defpackage.cb0;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.p7;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/validationsdk/legacy/ios/BLEValidationInitializationOptions;", "", "Companion", "$serializer", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class BLEValidationInitializationOptions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] n = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new p7(13)), null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewProductType f10669a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final ViewProductPass k;
    public final ViewProductMobileTicket l;
    public final ViewProductInstantTicket m;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/validationsdk/legacy/ios/BLEValidationInitializationOptions$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/validationsdk/legacy/ios/BLEValidationInitializationOptions;", "serializer", "()Lkotlinx/serialization/KSerializer;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<BLEValidationInitializationOptions> serializer() {
            return BLEValidationInitializationOptions$$serializer.f10670a;
        }
    }

    public /* synthetic */ BLEValidationInitializationOptions(int i, ViewProductType viewProductType, String str, String str2, int i2, int i3, int i4, String str3, String str4, String str5, String str6, ViewProductPass viewProductPass, ViewProductMobileTicket viewProductMobileTicket, ViewProductInstantTicket viewProductInstantTicket) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.b(BLEValidationInitializationOptions$$serializer.f10670a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f10669a = viewProductType;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = viewProductPass;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = viewProductMobileTicket;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = viewProductInstantTicket;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BLEValidationInitializationOptions)) {
            return false;
        }
        BLEValidationInitializationOptions bLEValidationInitializationOptions = (BLEValidationInitializationOptions) obj;
        return this.f10669a == bLEValidationInitializationOptions.f10669a && Intrinsics.d(this.b, bLEValidationInitializationOptions.b) && Intrinsics.d(this.c, bLEValidationInitializationOptions.c) && this.d == bLEValidationInitializationOptions.d && this.e == bLEValidationInitializationOptions.e && this.f == bLEValidationInitializationOptions.f && Intrinsics.d(this.g, bLEValidationInitializationOptions.g) && Intrinsics.d(this.h, bLEValidationInitializationOptions.h) && Intrinsics.d(this.i, bLEValidationInitializationOptions.i) && Intrinsics.d(this.j, bLEValidationInitializationOptions.j) && Intrinsics.d(this.k, bLEValidationInitializationOptions.k) && Intrinsics.d(this.l, bLEValidationInitializationOptions.l) && Intrinsics.d(this.m, bLEValidationInitializationOptions.m);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(nf1.e((((((nf1.e(nf1.e(this.f10669a.hashCode() * 31, 31, this.b), 31, this.c) + this.d) * 31) + this.e) * 31) + this.f) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        ViewProductPass viewProductPass = this.k;
        int iHashCode = (iE + (viewProductPass == null ? 0 : viewProductPass.hashCode())) * 31;
        ViewProductMobileTicket viewProductMobileTicket = this.l;
        int iHashCode2 = (iHashCode + (viewProductMobileTicket == null ? 0 : viewProductMobileTicket.hashCode())) * 31;
        ViewProductInstantTicket viewProductInstantTicket = this.m;
        return iHashCode2 + (viewProductInstantTicket != null ? viewProductInstantTicket.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BLEValidationInitializationOptions(type=");
        sb.append(this.f10669a);
        sb.append(", tone=");
        sb.append(this.b);
        sb.append(", qrCode=");
        cb0.o(this.d, this.c, ", activationTime=", ", bleOnboardingTutorialAppearanceCount=", sb);
        hq0.p(this.e, this.f, ", timeoutToShowQRinSeconds=", ", bleTutorialGif=", sb);
        cb0.t(sb, this.g, ", bleOnboardingTutorialGif=", this.h, ", bleTapToPayGif=");
        cb0.t(sb, this.i, ", blePermissionTutorialGif=", this.j, ", pass=");
        sb.append(this.k);
        sb.append(", mobileTicket=");
        sb.append(this.l);
        sb.append(", instantTicket=");
        sb.append(this.m);
        sb.append(")");
        return sb.toString();
    }
}
