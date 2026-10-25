package app.chalo.ondc.model.app.request;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ondc/model/app/request/ONDCFetchFareRequestAppModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ONDCFetchFareRequestAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6775a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ondc/model/app/request/ONDCFetchFareRequestAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ondc/model/app/request/ONDCFetchFareRequestAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ONDCFetchFareRequestAppModel> serializer() {
            return ONDCFetchFareRequestAppModel$$serializer.f6776a;
        }
    }

    public /* synthetic */ ONDCFetchFareRequestAppModel(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (59 != (i & 59)) {
            PluginExceptionsKt.b(ONDCFetchFareRequestAppModel$$serializer.f6776a.getDescriptor(), i, 59);
            throw null;
        }
        this.f6775a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        this.d = str4;
        this.e = str5;
        this.f = str6;
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ONDCFetchFareRequestAppModel)) {
            return false;
        }
        ONDCFetchFareRequestAppModel oNDCFetchFareRequestAppModel = (ONDCFetchFareRequestAppModel) obj;
        return Intrinsics.d(this.f6775a, oNDCFetchFareRequestAppModel.f6775a) && Intrinsics.d(this.b, oNDCFetchFareRequestAppModel.b) && Intrinsics.d(this.c, oNDCFetchFareRequestAppModel.c) && Intrinsics.d(this.d, oNDCFetchFareRequestAppModel.d) && Intrinsics.d(this.e, oNDCFetchFareRequestAppModel.e) && Intrinsics.d(this.f, oNDCFetchFareRequestAppModel.f) && Intrinsics.d(this.g, oNDCFetchFareRequestAppModel.g);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f6775a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iE2 = nf1.e(nf1.e(nf1.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str2 = this.g;
        return iE2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ONDCFetchFareRequestAppModel(city=", this.f6775a, ", endStopId=", this.b, ", routeId=");
        cb0.t(sbE, this.c, ", startStopId=", this.d, ", providerId=");
        cb0.t(sbE, this.e, ", tripFulfillmentId=", this.f, ", transactionId=");
        return vo1.p(sbE, this.g, ")");
    }

    public ONDCFetchFareRequestAppModel(String str, String endStopId, String str2, String startStopId, String providerId, String tripFulfillmentId, String str3) {
        Intrinsics.i(endStopId, "endStopId");
        Intrinsics.i(startStopId, "startStopId");
        Intrinsics.i(providerId, "providerId");
        Intrinsics.i(tripFulfillmentId, "tripFulfillmentId");
        this.f6775a = str;
        this.b = endStopId;
        this.c = str2;
        this.d = startStopId;
        this.e = providerId;
        this.f = tripFulfillmentId;
        this.g = str3;
    }
}
