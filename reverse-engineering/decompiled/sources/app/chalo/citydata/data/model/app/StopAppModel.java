package app.chalo.citydata.data.model.app;

import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.dd;
import defpackage.i71;
import defpackage.n21;
import defpackage.nf1;
import defpackage.r30;
import defpackage.ra1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/data/model/app/StopAppModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class StopAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ra1(7)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1727a;
    public final String b;
    public final LatLng c;
    public final ChaloTransitMode d;
    public final String e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/app/StopAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/app/StopAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<StopAppModel> serializer() {
            return StopAppModel$$serializer.f1728a;
        }
    }

    public /* synthetic */ StopAppModel(int i, String str, String str2, LatLng latLng, ChaloTransitMode chaloTransitMode, String str3, String str4) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(StopAppModel$$serializer.f1728a.getDescriptor(), i, 31);
            throw null;
        }
        this.f1727a = str;
        this.b = str2;
        this.c = latLng;
        this.d = chaloTransitMode;
        this.e = str3;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopAppModel)) {
            return false;
        }
        StopAppModel stopAppModel = (StopAppModel) obj;
        return Intrinsics.d(this.f1727a, stopAppModel.f1727a) && Intrinsics.d(this.b, stopAppModel.b) && Intrinsics.d(this.c, stopAppModel.c) && this.d == stopAppModel.d && Intrinsics.d(this.e, stopAppModel.e) && Intrinsics.d(this.f, stopAppModel.f);
    }

    public final int hashCode() {
        int iC = n21.c(this.d, i71.d(this.c, nf1.e(this.f1727a.hashCode() * 31, 31, this.b), 31), 31);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("StopAppModel(stopId=", this.f1727a, ", stopName=", this.b, ", stopLocation=");
        sbE.append(this.c);
        sbE.append(", transitMode=");
        sbE.append(this.d);
        sbE.append(", stopAddress=");
        return r30.i(sbE, this.e, ", partnerStopCode=", this.f, ")");
    }

    public StopAppModel(String stopId, String stopName, LatLng stopLocation, ChaloTransitMode transitMode, String str, String str2) {
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        Intrinsics.i(stopLocation, "stopLocation");
        Intrinsics.i(transitMode, "transitMode");
        this.f1727a = stopId;
        this.b = stopName;
        this.c = stopLocation;
        this.d = transitMode;
        this.e = str;
        this.f = str2;
    }
}
