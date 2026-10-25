package app.chalo.productpurchase.productselection.data.models.api;

import defpackage.dd;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/MTicketFareRouteStageResponseApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MTicketFareRouteStageResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8573a;
    public final String b;
    public final String c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/MTicketFareRouteStageResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/MTicketFareRouteStageResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MTicketFareRouteStageResponseApiModel> serializer() {
            return MTicketFareRouteStageResponseApiModel$$serializer.f8574a;
        }
    }

    public /* synthetic */ MTicketFareRouteStageResponseApiModel(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(MTicketFareRouteStageResponseApiModel$$serializer.f8574a.getDescriptor(), i, 15);
            throw null;
        }
        this.f8573a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketFareRouteStageResponseApiModel)) {
            return false;
        }
        MTicketFareRouteStageResponseApiModel mTicketFareRouteStageResponseApiModel = (MTicketFareRouteStageResponseApiModel) obj;
        return Intrinsics.d(this.f8573a, mTicketFareRouteStageResponseApiModel.f8573a) && Intrinsics.d(this.b, mTicketFareRouteStageResponseApiModel.b) && Intrinsics.d(this.c, mTicketFareRouteStageResponseApiModel.c) && Intrinsics.d(this.d, mTicketFareRouteStageResponseApiModel.d);
    }

    public final int hashCode() {
        String str = this.f8573a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return r30.i(dd.e("MTicketFareRouteStageResponseApiModel(startStageId=", this.f8573a, ", startStageName=", this.b, ", endStageId="), this.c, ", endStageName=", this.d, ")");
    }
}
