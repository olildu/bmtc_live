package app.chalo.productpurchase.passpurchase.domain;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/domain/MPassVerificationTimingDetails;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MPassVerificationTimingDetails {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8332a;
    public final String b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/domain/MPassVerificationTimingDetails$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/passpurchase/domain/MPassVerificationTimingDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MPassVerificationTimingDetails> serializer() {
            return MPassVerificationTimingDetails$$serializer.f8333a;
        }
    }

    public MPassVerificationTimingDetails() {
        this.f8332a = "";
        this.b = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MPassVerificationTimingDetails)) {
            return false;
        }
        MPassVerificationTimingDetails mPassVerificationTimingDetails = (MPassVerificationTimingDetails) obj;
        return Intrinsics.d(this.f8332a, mPassVerificationTimingDetails.f8332a) && Intrinsics.d(this.b, mPassVerificationTimingDetails.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8332a.hashCode() * 31);
    }

    public final String toString() {
        return vo1.o("MPassVerificationTimingDetails(verificationTimeRequired=", this.f8332a, ", verificationOfficeTimings=", this.b, ")");
    }

    public /* synthetic */ MPassVerificationTimingDetails(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f8332a = "";
        } else {
            this.f8332a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
    }
}
