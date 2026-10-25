package app.chalo.citydata.data.model.app.response;

import app.chalo.models.LocationAppModel;
import defpackage.dd;
import defpackage.nf1;
import defpackage.ra1;
import defpackage.xs;
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/data/model/app/response/StopDetailsAppModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class StopDetailsAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f = {null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ra1(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1745a;
    public final String b;
    public final String c;
    public final LocationAppModel d;
    public final List e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/app/response/StopDetailsAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/app/response/StopDetailsAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<StopDetailsAppModel> serializer() {
            return StopDetailsAppModel$$serializer.f1746a;
        }
    }

    public /* synthetic */ StopDetailsAppModel(int i, String str, String str2, String str3, LocationAppModel locationAppModel, List list) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(StopDetailsAppModel$$serializer.f1746a.getDescriptor(), i, 31);
            throw null;
        }
        this.f1745a = str;
        this.b = str2;
        this.c = str3;
        this.d = locationAppModel;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopDetailsAppModel)) {
            return false;
        }
        StopDetailsAppModel stopDetailsAppModel = (StopDetailsAppModel) obj;
        return Intrinsics.d(this.f1745a, stopDetailsAppModel.f1745a) && Intrinsics.d(this.b, stopDetailsAppModel.b) && Intrinsics.d(this.c, stopDetailsAppModel.c) && Intrinsics.d(this.d, stopDetailsAppModel.d) && Intrinsics.d(this.e, stopDetailsAppModel.e);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f1745a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (this.d.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        List list = this.e;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("StopDetailsAppModel(stopId=", this.f1745a, ", stopName=", this.b, ", stopDescription=");
        sbE.append(this.c);
        sbE.append(", location=");
        sbE.append(this.d);
        sbE.append(", imageUrls=");
        return xs.l(sbE, this.e, ")");
    }

    public StopDetailsAppModel(String stopId, String stopName, String str, LocationAppModel locationAppModel, List list) {
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        this.f1745a = stopId;
        this.b = stopName;
        this.c = str;
        this.d = locationAppModel;
        this.e = list;
    }
}
