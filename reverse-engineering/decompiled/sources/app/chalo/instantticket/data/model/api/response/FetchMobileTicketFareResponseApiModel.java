package app.chalo.instantticket.data.model.api.response;

import defpackage.a30;
import defpackage.gf;
import defpackage.uf0;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/instantticket/data/model/api/response/FetchMobileTicketFareResponseApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class FetchMobileTicketFareResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3863a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final String e;
    public final List f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/instantticket/data/model/api/response/FetchMobileTicketFareResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/instantticket/data/model/api/response/FetchMobileTicketFareResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<FetchMobileTicketFareResponseApiModel> serializer() {
            return FetchMobileTicketFareResponseApiModel$$serializer.f3864a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new a30(19)), null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new a30(20))};
    }

    public /* synthetic */ FetchMobileTicketFareResponseApiModel(int i, List list, Integer num, Integer num2, String str, String str2, List list2) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(FetchMobileTicketFareResponseApiModel$$serializer.f3864a.getDescriptor(), i, 63);
            throw null;
        }
        this.f3863a = list;
        this.b = num;
        this.c = num2;
        this.d = str;
        this.e = str2;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchMobileTicketFareResponseApiModel)) {
            return false;
        }
        FetchMobileTicketFareResponseApiModel fetchMobileTicketFareResponseApiModel = (FetchMobileTicketFareResponseApiModel) obj;
        return Intrinsics.d(this.f3863a, fetchMobileTicketFareResponseApiModel.f3863a) && Intrinsics.d(this.b, fetchMobileTicketFareResponseApiModel.b) && Intrinsics.d(this.c, fetchMobileTicketFareResponseApiModel.c) && Intrinsics.d(this.d, fetchMobileTicketFareResponseApiModel.d) && Intrinsics.d(this.e, fetchMobileTicketFareResponseApiModel.e) && Intrinsics.d(this.f, fetchMobileTicketFareResponseApiModel.f);
    }

    public final int hashCode() {
        List list = this.f3863a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list2 = this.f;
        return iHashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FetchMobileTicketFareResponseApiModel(passengerDetails=");
        sb.append(this.f3863a);
        sb.append(", roundingLogic=");
        sb.append(this.b);
        sb.append(", totalAvailableSeats=");
        gf.w(this.c, ", fareNote=", this.d, ", passengerSelectionPolicy=", sb);
        return uf0.p(this.e, ", appliedRules=", ")", sb, this.f);
    }
}
