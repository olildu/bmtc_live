package app.chalo.ondc.model.api.request;

import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ondc/model/api/request/OndcFarePassengerDetailApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class OndcFarePassengerDetailApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6744a;
    public final String b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ondc/model/api/request/OndcFarePassengerDetailApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ondc/model/api/request/OndcFarePassengerDetailApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<OndcFarePassengerDetailApiModel> serializer() {
            return OndcFarePassengerDetailApiModel$$serializer.f6745a;
        }
    }

    public /* synthetic */ OndcFarePassengerDetailApiModel(int i, int i2, String str, String str2) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(OndcFarePassengerDetailApiModel$$serializer.f6745a.getDescriptor(), i, 3);
            throw null;
        }
        this.f6744a = i2;
        this.b = str;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OndcFarePassengerDetailApiModel)) {
            return false;
        }
        OndcFarePassengerDetailApiModel ondcFarePassengerDetailApiModel = (OndcFarePassengerDetailApiModel) obj;
        return this.f6744a == ondcFarePassengerDetailApiModel.f6744a && Intrinsics.d(this.b, ondcFarePassengerDetailApiModel.b) && Intrinsics.d(this.c, ondcFarePassengerDetailApiModel.c);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f6744a * 31, 31, this.b);
        String str = this.c;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return vo1.p(nf1.p(this.f6744a, "OndcFarePassengerDetailApiModel(count=", ", id=", this.b, ", name="), this.c, ")");
    }

    public OndcFarePassengerDetailApiModel(int i, String id, String str) {
        Intrinsics.i(id, "id");
        this.f6744a = i;
        this.b = id;
        this.c = str;
    }
}
