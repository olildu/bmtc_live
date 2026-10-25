package app.chalo.livetracking.universalsearch.data.model.api;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/api/PlacesAndStopsInfoApiModel;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PlacesAndStopsInfoApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4983a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final double f;
    public final double g;
    public final String h;
    public final String i;
    public final String j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/api/PlacesAndStopsInfoApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/universalsearch/data/model/api/PlacesAndStopsInfoApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PlacesAndStopsInfoApiModel> serializer() {
            return PlacesAndStopsInfoApiModel$$serializer.f4984a;
        }
    }

    public /* synthetic */ PlacesAndStopsInfoApiModel(int i, String str, String str2, String str3, String str4, String str5, double d, double d2, String str6, String str7, String str8) {
        if ((i & 1) == 0) {
            this.f4983a = null;
        } else {
            this.f4983a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = -1.0d;
        } else {
            this.f = d;
        }
        if ((i & 64) == 0) {
            this.g = -1.0d;
        } else {
            this.g = d2;
        }
        if ((i & 128) == 0) {
            this.h = ChaloTransitMode.BUS.getMode();
        } else {
            this.h = str6;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str7;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlacesAndStopsInfoApiModel)) {
            return false;
        }
        PlacesAndStopsInfoApiModel placesAndStopsInfoApiModel = (PlacesAndStopsInfoApiModel) obj;
        return Intrinsics.d(this.f4983a, placesAndStopsInfoApiModel.f4983a) && Intrinsics.d(this.b, placesAndStopsInfoApiModel.b) && Intrinsics.d(this.c, placesAndStopsInfoApiModel.c) && Intrinsics.d(this.d, placesAndStopsInfoApiModel.d) && Intrinsics.d(this.e, placesAndStopsInfoApiModel.e) && Double.compare(this.f, placesAndStopsInfoApiModel.f) == 0 && Double.compare(this.g, placesAndStopsInfoApiModel.g) == 0 && Intrinsics.d(this.h, placesAndStopsInfoApiModel.h) && Intrinsics.d(this.i, placesAndStopsInfoApiModel.i) && Intrinsics.d(this.j, placesAndStopsInfoApiModel.j);
    }

    public final int hashCode() {
        String str = this.f4983a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f);
        int i = (iHashCode5 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.g);
        int iE = nf1.e((i + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31, 31, this.h);
        String str6 = this.i;
        int iHashCode6 = (iE + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.j;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PlacesAndStopsInfoApiModel(resultType=", this.f4983a, ", description=", this.b, ", placeId=");
        cb0.t(sbE, this.c, ", stopId=", this.d, ", stopName=");
        sbE.append(this.e);
        sbE.append(", stopLat=");
        sbE.append(this.f);
        pk0.z(sbE, ", stopLon=", this.g, ", stationType=");
        cb0.t(sbE, this.h, ", stopAddress=", this.i, ", searchPartner=");
        return vo1.p(sbE, this.j, ")");
    }
}
