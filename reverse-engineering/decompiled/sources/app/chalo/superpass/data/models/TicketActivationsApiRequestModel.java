package app.chalo.superpass.data.models;

import defpackage.dd;
import defpackage.nf1;
import defpackage.qh1;
import defpackage.uf0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/superpass/data/models/TicketActivationsApiRequestModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TicketActivationsApiRequestModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new qh1(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9537a;
    public final String b;
    public final String c;
    public final List d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/superpass/data/models/TicketActivationsApiRequestModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/superpass/data/models/TicketActivationsApiRequestModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TicketActivationsApiRequestModel> serializer() {
            return TicketActivationsApiRequestModel$$serializer.f9538a;
        }
    }

    public /* synthetic */ TicketActivationsApiRequestModel(int i, String str, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(TicketActivationsApiRequestModel$$serializer.f9538a.getDescriptor(), i, 15);
            throw null;
        }
        this.f9537a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketActivationsApiRequestModel)) {
            return false;
        }
        TicketActivationsApiRequestModel ticketActivationsApiRequestModel = (TicketActivationsApiRequestModel) obj;
        return Intrinsics.d(this.f9537a, ticketActivationsApiRequestModel.f9537a) && Intrinsics.d(this.b, ticketActivationsApiRequestModel.b) && Intrinsics.d(this.c, ticketActivationsApiRequestModel.c) && Intrinsics.d(this.d, ticketActivationsApiRequestModel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nf1.e(nf1.e(this.f9537a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return uf0.p(this.c, ", activationTime=", ")", dd.e("TicketActivationsApiRequestModel(city=", this.f9537a, ", agency=", this.b, ", ticketId="), this.d);
    }

    public TicketActivationsApiRequestModel(String city, String agency, String ticketId, ArrayList arrayList) {
        Intrinsics.i(city, "city");
        Intrinsics.i(agency, "agency");
        Intrinsics.i(ticketId, "ticketId");
        this.f9537a = city;
        this.b = agency;
        this.c = ticketId;
        this.d = arrayList;
    }
}
