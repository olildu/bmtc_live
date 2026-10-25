package app.chalo.models.productbooking.productcapability;

import defpackage.uf0;
import defpackage.wb;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/productbooking/productcapability/CapabilitiesApiModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CapabilitiesApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new wb(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f5670a;
    public final BookingSupport b;
    public final String c;
    public final List d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/productbooking/productcapability/CapabilitiesApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/productbooking/productcapability/CapabilitiesApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CapabilitiesApiModel> serializer() {
            return CapabilitiesApiModel$$serializer.f5671a;
        }
    }

    public /* synthetic */ CapabilitiesApiModel(int i, Boolean bool, BookingSupport bookingSupport, String str, List list) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(CapabilitiesApiModel$$serializer.f5671a.getDescriptor(), i, 15);
            throw null;
        }
        this.f5670a = bool;
        this.b = bookingSupport;
        this.c = str;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CapabilitiesApiModel)) {
            return false;
        }
        CapabilitiesApiModel capabilitiesApiModel = (CapabilitiesApiModel) obj;
        return Intrinsics.d(this.f5670a, capabilitiesApiModel.f5670a) && Intrinsics.d(this.b, capabilitiesApiModel.b) && Intrinsics.d(this.c, capabilitiesApiModel.c) && Intrinsics.d(this.d, capabilitiesApiModel.d);
    }

    public final int hashCode() {
        Boolean bool = this.f5670a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        BookingSupport bookingSupport = this.b;
        int iHashCode2 = (iHashCode + (bookingSupport == null ? 0 : bookingSupport.hashCode())) * 31;
        String str = this.c;
        return this.d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CapabilitiesApiModel(showJourneyApplicable=");
        sb.append(this.f5670a);
        sb.append(", bookingSupport=");
        sb.append(this.b);
        sb.append(", bookingFlowType=");
        return uf0.p(this.c, ", validationSupport=", ")", sb, this.d);
    }

    public CapabilitiesApiModel(String str, List validationSupport) {
        Boolean bool = Boolean.FALSE;
        Intrinsics.i(validationSupport, "validationSupport");
        this.f5670a = bool;
        this.b = null;
        this.c = str;
        this.d = validationSupport;
    }
}
