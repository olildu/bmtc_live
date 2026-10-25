package app.chalo.models;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.t10;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/CardDetails;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CardDetails {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5571a;
    public final String b;
    public final String c;
    public final String d;
    public final SavedCardDetails e;
    public final long f;
    public final long g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/CardDetails$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/CardDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CardDetails> serializer() {
            return CardDetails$$serializer.f5572a;
        }
    }

    public /* synthetic */ CardDetails(int i, String str, String str2, String str3, String str4, SavedCardDetails savedCardDetails, long j, long j2) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(CardDetails$$serializer.f5572a.getDescriptor(), i, 127);
            throw null;
        }
        this.f5571a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = savedCardDetails;
        this.f = j;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardDetails)) {
            return false;
        }
        CardDetails cardDetails = (CardDetails) obj;
        return Intrinsics.d(this.f5571a, cardDetails.f5571a) && Intrinsics.d(this.b, cardDetails.b) && Intrinsics.d(this.c, cardDetails.c) && Intrinsics.d(this.d, cardDetails.d) && Intrinsics.d(this.e, cardDetails.e) && this.f == cardDetails.f && this.g == cardDetails.g;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + nf1.e(nf1.e(nf1.e(this.f5571a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31;
        long j = this.f;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.g;
        return i + ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        StringBuilder sbE = dd.e("CardDetails(tokenId=", this.f5571a, ", token=", this.b, ", entity=");
        cb0.t(sbE, this.c, ", method=", this.d, ", savedCard=");
        sbE.append(this.e);
        sbE.append(", usedAt=");
        sbE.append(this.f);
        return t10.g(this.g, ", createdAt=", ")", sbE);
    }
}
