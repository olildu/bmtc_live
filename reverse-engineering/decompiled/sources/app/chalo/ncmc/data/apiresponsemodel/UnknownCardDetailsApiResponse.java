package app.chalo.ncmc.data.apiresponsemodel;

import defpackage.gf;
import defpackage.py;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/apiresponsemodel/UnknownCardDetailsApiResponse;", "Lapp/chalo/ncmc/data/apiresponsemodel/CardDetailsApiResponse;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UnknownCardDetailsApiResponse implements CardDetailsApiResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6111a;
    public final Boolean b;
    public final Long c;
    public final String d;
    public final Long e;
    public final int f;
    public final String g;
    public final Boolean h;
    public final Boolean i;
    public final Boolean j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/apiresponsemodel/UnknownCardDetailsApiResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/apiresponsemodel/UnknownCardDetailsApiResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UnknownCardDetailsApiResponse> serializer() {
            return UnknownCardDetailsApiResponse$$serializer.f6112a;
        }
    }

    public /* synthetic */ UnknownCardDetailsApiResponse(int i, String str, Boolean bool, Long l, String str2, Long l2, int i2, String str3, Boolean bool2, Boolean bool3, Boolean bool4) {
        if (32 != (i & 32)) {
            PluginExceptionsKt.b(UnknownCardDetailsApiResponse$$serializer.f6112a.getDescriptor(), i, 32);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f6111a = null;
        } else {
            this.f6111a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l2;
        }
        this.f = i2;
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = bool2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = bool3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = bool4;
        }
    }

    @Override // app.chalo.ncmc.data.apiresponsemodel.CardDetailsApiResponse
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF6111a() {
        return this.f6111a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnknownCardDetailsApiResponse)) {
            return false;
        }
        UnknownCardDetailsApiResponse unknownCardDetailsApiResponse = (UnknownCardDetailsApiResponse) obj;
        return Intrinsics.d(this.f6111a, unknownCardDetailsApiResponse.f6111a) && Intrinsics.d(this.b, unknownCardDetailsApiResponse.b) && Intrinsics.d(this.c, unknownCardDetailsApiResponse.c) && Intrinsics.d(this.d, unknownCardDetailsApiResponse.d) && Intrinsics.d(this.e, unknownCardDetailsApiResponse.e) && this.f == unknownCardDetailsApiResponse.f && Intrinsics.d(this.g, unknownCardDetailsApiResponse.g) && Intrinsics.d(this.h, unknownCardDetailsApiResponse.h) && Intrinsics.d(this.i, unknownCardDetailsApiResponse.i) && Intrinsics.d(this.j, unknownCardDetailsApiResponse.j);
    }

    public final int hashCode() {
        String str = this.f6111a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode5 = (((iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31) + this.f) * 31;
        String str3 = this.g;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.h;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.i;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.j;
        return iHashCode8 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnknownCardDetailsApiResponse(cardId=");
        sb.append(this.f6111a);
        sb.append(", isCardRechargeEnabled=");
        sb.append(this.b);
        sb.append(", rechargeLimit=");
        py.t(this.c, ", type=", this.d, ", cardIssueDate=", sb);
        sb.append(this.e);
        sb.append(", cardBalance=");
        sb.append(this.f);
        sb.append(", cvv=");
        gf.v(this.h, this.g, ", isCardBlocked=", ", isEligibleForUnlink=", sb);
        sb.append(this.i);
        sb.append(", isEligibleToBlockCard=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
