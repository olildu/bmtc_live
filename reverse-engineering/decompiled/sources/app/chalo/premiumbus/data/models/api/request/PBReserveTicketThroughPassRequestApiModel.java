package app.chalo.premiumbus.data.models.api.request;

import defpackage.cb0;
import defpackage.nf1;
import defpackage.to0;
import defpackage.xs;
import java.util.ArrayList;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/request/PBReserveTicketThroughPassRequestApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PBReserveTicketThroughPassRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f = {null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new to0(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PBTicketSelectedTripDetailsApiRequestModel f6988a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/request/PBReserveTicketThroughPassRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/api/request/PBReserveTicketThroughPassRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PBReserveTicketThroughPassRequestApiModel> serializer() {
            return PBReserveTicketThroughPassRequestApiModel$$serializer.f6989a;
        }
    }

    public /* synthetic */ PBReserveTicketThroughPassRequestApiModel(int i, PBTicketSelectedTripDetailsApiRequestModel pBTicketSelectedTripDetailsApiRequestModel, String str, String str2, String str3, List list) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(PBReserveTicketThroughPassRequestApiModel$$serializer.f6989a.getDescriptor(), i, 31);
            throw null;
        }
        this.f6988a = pBTicketSelectedTripDetailsApiRequestModel;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PBReserveTicketThroughPassRequestApiModel)) {
            return false;
        }
        PBReserveTicketThroughPassRequestApiModel pBReserveTicketThroughPassRequestApiModel = (PBReserveTicketThroughPassRequestApiModel) obj;
        return Intrinsics.d(this.f6988a, pBReserveTicketThroughPassRequestApiModel.f6988a) && Intrinsics.d(this.b, pBReserveTicketThroughPassRequestApiModel.b) && Intrinsics.d(this.c, pBReserveTicketThroughPassRequestApiModel.c) && Intrinsics.d(this.d, pBReserveTicketThroughPassRequestApiModel.d) && Intrinsics.d(this.e, pBReserveTicketThroughPassRequestApiModel.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + nf1.e(nf1.e(nf1.e(this.f6988a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PBReserveTicketThroughPassRequestApiModel(tripDetail=");
        sb.append(this.f6988a);
        sb.append(", tripId=");
        sb.append(this.b);
        sb.append(", passId=");
        cb0.t(sb, this.c, ", city=", this.d, ", seats=");
        return xs.l(sb, this.e, ")");
    }

    public PBReserveTicketThroughPassRequestApiModel(PBTicketSelectedTripDetailsApiRequestModel tripDetail, String tripId, String passId, String city, ArrayList arrayList) {
        Intrinsics.i(tripDetail, "tripDetail");
        Intrinsics.i(tripId, "tripId");
        Intrinsics.i(passId, "passId");
        Intrinsics.i(city, "city");
        this.f6988a = tripDetail;
        this.b = tripId;
        this.c = passId;
        this.d = city;
        this.e = arrayList;
    }
}
