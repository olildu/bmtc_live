package app.chalo.premiumbus.data.models.app;

import app.chalo.location.LatLng;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.to0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PBStopPlaceSelectedAppModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PBStopPlaceSelectedAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g = {null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new to0(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7095a;
    public final String b;
    public final String c;
    public final String d;
    public final LatLng e;
    public final PremiumBusSelectedLocationType f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PBStopPlaceSelectedAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/app/PBStopPlaceSelectedAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PBStopPlaceSelectedAppModel> serializer() {
            return PBStopPlaceSelectedAppModel$$serializer.f7096a;
        }
    }

    public /* synthetic */ PBStopPlaceSelectedAppModel(int i, String str, String str2, String str3, String str4, LatLng latLng, PremiumBusSelectedLocationType premiumBusSelectedLocationType) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(PBStopPlaceSelectedAppModel$$serializer.f7096a.getDescriptor(), i, 63);
            throw null;
        }
        this.f7095a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = latLng;
        this.f = premiumBusSelectedLocationType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PBStopPlaceSelectedAppModel)) {
            return false;
        }
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel = (PBStopPlaceSelectedAppModel) obj;
        return Intrinsics.d(this.f7095a, pBStopPlaceSelectedAppModel.f7095a) && Intrinsics.d(this.b, pBStopPlaceSelectedAppModel.b) && Intrinsics.d(this.c, pBStopPlaceSelectedAppModel.c) && Intrinsics.d(this.d, pBStopPlaceSelectedAppModel.d) && Intrinsics.d(this.e, pBStopPlaceSelectedAppModel.e) && this.f == pBStopPlaceSelectedAppModel.f;
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f7095a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        LatLng latLng = this.e;
        return this.f.hashCode() + ((iHashCode + (latLng != null ? latLng.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PBStopPlaceSelectedAppModel(id=", this.f7095a, ", searchPartner=", this.b, ", name=");
        cb0.t(sbE, this.c, ", description=", this.d, ", latLng=");
        sbE.append(this.e);
        sbE.append(", locationType=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }

    public PBStopPlaceSelectedAppModel(String id, String searchPartner, String name, String str, LatLng latLng, PremiumBusSelectedLocationType locationType) {
        Intrinsics.i(id, "id");
        Intrinsics.i(searchPartner, "searchPartner");
        Intrinsics.i(name, "name");
        Intrinsics.i(locationType, "locationType");
        this.f7095a = id;
        this.b = searchPartner;
        this.c = name;
        this.d = str;
        this.e = latLng;
        this.f = locationType;
    }
}
