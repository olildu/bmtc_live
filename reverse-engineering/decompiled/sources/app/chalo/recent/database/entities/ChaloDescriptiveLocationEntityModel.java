package app.chalo.recent.database.entities;

import app.chalo.location.LatLng;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/recent/database/entities/ChaloDescriptiveLocationEntityModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ChaloDescriptiveLocationEntityModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8929a;
    public final String b;
    public final String c;
    public final String d;
    public final LatLng e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/recent/database/entities/ChaloDescriptiveLocationEntityModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/recent/database/entities/ChaloDescriptiveLocationEntityModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ChaloDescriptiveLocationEntityModel> serializer() {
            return ChaloDescriptiveLocationEntityModel$$serializer.f8930a;
        }
    }

    public /* synthetic */ ChaloDescriptiveLocationEntityModel(int i, String str, String str2, String str3, String str4, LatLng latLng) {
        if (30 != (i & 30)) {
            PluginExceptionsKt.b(ChaloDescriptiveLocationEntityModel$$serializer.f8930a.getDescriptor(), i, 30);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f8929a = null;
        } else {
            this.f8929a = str;
        }
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = latLng;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloDescriptiveLocationEntityModel)) {
            return false;
        }
        ChaloDescriptiveLocationEntityModel chaloDescriptiveLocationEntityModel = (ChaloDescriptiveLocationEntityModel) obj;
        return Intrinsics.d(this.f8929a, chaloDescriptiveLocationEntityModel.f8929a) && Intrinsics.d(this.b, chaloDescriptiveLocationEntityModel.b) && Intrinsics.d(this.c, chaloDescriptiveLocationEntityModel.c) && Intrinsics.d(this.d, chaloDescriptiveLocationEntityModel.d) && Intrinsics.d(this.e, chaloDescriptiveLocationEntityModel.e);
    }

    public final int hashCode() {
        String str = this.f8929a;
        return this.e.hashCode() + nf1.e(nf1.e(nf1.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ChaloDescriptiveLocationEntityModel(locationDescription=", this.f8929a, ", locationTitle=", this.b, ", placeId=");
        cb0.t(sbE, this.c, ", searchPartner=", this.d, ", latLng=");
        sbE.append(this.e);
        sbE.append(")");
        return sbE.toString();
    }

    public ChaloDescriptiveLocationEntityModel(String str, String locationTitle, String placeId, String searchPartner, LatLng latLng) {
        Intrinsics.i(locationTitle, "locationTitle");
        Intrinsics.i(placeId, "placeId");
        Intrinsics.i(searchPartner, "searchPartner");
        Intrinsics.i(latLng, "latLng");
        this.f8929a = str;
        this.b = locationTitle;
        this.c = placeId;
        this.d = searchPartner;
        this.e = latLng;
    }
}
