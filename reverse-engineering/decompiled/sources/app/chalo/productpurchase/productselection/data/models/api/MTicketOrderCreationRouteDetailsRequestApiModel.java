package app.chalo.productpurchase.productselection.data.models.api;

import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/MTicketOrderCreationRouteDetailsRequestApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MTicketOrderCreationRouteDetailsRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8579a;
    public final String b;
    public final String c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/MTicketOrderCreationRouteDetailsRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/MTicketOrderCreationRouteDetailsRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MTicketOrderCreationRouteDetailsRequestApiModel> serializer() {
            return MTicketOrderCreationRouteDetailsRequestApiModel$$serializer.f8580a;
        }
    }

    public /* synthetic */ MTicketOrderCreationRouteDetailsRequestApiModel(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(MTicketOrderCreationRouteDetailsRequestApiModel$$serializer.f8580a.getDescriptor(), i, 15);
            throw null;
        }
        this.f8579a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketOrderCreationRouteDetailsRequestApiModel)) {
            return false;
        }
        MTicketOrderCreationRouteDetailsRequestApiModel mTicketOrderCreationRouteDetailsRequestApiModel = (MTicketOrderCreationRouteDetailsRequestApiModel) obj;
        return Intrinsics.d(this.f8579a, mTicketOrderCreationRouteDetailsRequestApiModel.f8579a) && Intrinsics.d(this.b, mTicketOrderCreationRouteDetailsRequestApiModel.b) && Intrinsics.d(this.c, mTicketOrderCreationRouteDetailsRequestApiModel.c) && Intrinsics.d(this.d, mTicketOrderCreationRouteDetailsRequestApiModel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nf1.e(nf1.e(this.f8579a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return r30.i(dd.e("MTicketOrderCreationRouteDetailsRequestApiModel(startStageId=", this.f8579a, ", startStageName=", this.b, ", endStageId="), this.c, ", endStageName=", this.d, ")");
    }

    public MTicketOrderCreationRouteDetailsRequestApiModel(String startStageId, String startStageName, String endStageId, String endStageName) {
        Intrinsics.i(startStageId, "startStageId");
        Intrinsics.i(startStageName, "startStageName");
        Intrinsics.i(endStageId, "endStageId");
        Intrinsics.i(endStageName, "endStageName");
        this.f8579a = startStageId;
        this.b = startStageName;
        this.c = endStageId;
        this.d = endStageName;
    }
}
