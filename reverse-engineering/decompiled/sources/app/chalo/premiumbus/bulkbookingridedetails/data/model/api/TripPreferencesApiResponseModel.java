package app.chalo.premiumbus.bulkbookingridedetails.data.model.api;

import defpackage.cb0;
import defpackage.dd;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/data/model/api/TripPreferencesApiResponseModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TripPreferencesApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6884a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/data/model/api/TripPreferencesApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/bulkbookingridedetails/data/model/api/TripPreferencesApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TripPreferencesApiResponseModel> serializer() {
            return TripPreferencesApiResponseModel$$serializer.f6885a;
        }
    }

    public /* synthetic */ TripPreferencesApiResponseModel(int i, String str, String str2, String str3, String str4, String str5) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(TripPreferencesApiResponseModel$$serializer.f6885a.getDescriptor(), i, 31);
            throw null;
        }
        this.f6884a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripPreferencesApiResponseModel)) {
            return false;
        }
        TripPreferencesApiResponseModel tripPreferencesApiResponseModel = (TripPreferencesApiResponseModel) obj;
        return Intrinsics.d(this.f6884a, tripPreferencesApiResponseModel.f6884a) && Intrinsics.d(this.b, tripPreferencesApiResponseModel.b) && Intrinsics.d(this.c, tripPreferencesApiResponseModel.c) && Intrinsics.d(this.d, tripPreferencesApiResponseModel.d) && Intrinsics.d(this.e, tripPreferencesApiResponseModel.e);
    }

    public final int hashCode() {
        String str = this.f6884a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("TripPreferencesApiResponseModel(routeId=", this.f6884a, ", startStopId=", this.b, ", startStopName=");
        cb0.t(sbE, this.c, ", endStopId=", this.d, ", endStopName=");
        return vo1.p(sbE, this.e, ")");
    }
}
