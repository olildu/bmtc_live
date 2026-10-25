package app.chalo.citydata.data.model.app.request;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/data/model/app/request/GetRouteDetailsMetaQueryParameterApiModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GetRouteDetailsMetaQueryParameterApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1731a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/app/request/GetRouteDetailsMetaQueryParameterApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/app/request/GetRouteDetailsMetaQueryParameterApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GetRouteDetailsMetaQueryParameterApiModel> serializer() {
            return GetRouteDetailsMetaQueryParameterApiModel$$serializer.f1732a;
        }
    }

    public GetRouteDetailsMetaQueryParameterApiModel(int i, int i2, String str, String city, String androidModel, String str2) {
        Intrinsics.i(city, "city");
        Intrinsics.i(androidModel, "androidModel");
        this.f1731a = str;
        this.b = city;
        this.c = androidModel;
        this.d = i;
        this.e = i2;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetRouteDetailsMetaQueryParameterApiModel)) {
            return false;
        }
        GetRouteDetailsMetaQueryParameterApiModel getRouteDetailsMetaQueryParameterApiModel = (GetRouteDetailsMetaQueryParameterApiModel) obj;
        return Intrinsics.d(this.f1731a, getRouteDetailsMetaQueryParameterApiModel.f1731a) && Intrinsics.d(this.b, getRouteDetailsMetaQueryParameterApiModel.b) && Intrinsics.d(this.c, getRouteDetailsMetaQueryParameterApiModel.c) && this.d == getRouteDetailsMetaQueryParameterApiModel.d && this.e == getRouteDetailsMetaQueryParameterApiModel.e && Intrinsics.d(this.f, getRouteDetailsMetaQueryParameterApiModel.f);
    }

    public final int hashCode() {
        String str = this.f1731a;
        int iE = (((nf1.e(nf1.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c) + this.d) * 31) + this.e) * 31;
        String str2 = this.f;
        return iE + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("GetRouteDetailsMetaQueryParameterApiModel(userId=", this.f1731a, ", city=", this.b, ", androidModel=");
        cb0.o(this.d, this.c, ", androidVersionCode=", ", osVersion=", sbE);
        sbE.append(this.e);
        sbE.append(", language=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }

    public /* synthetic */ GetRouteDetailsMetaQueryParameterApiModel(int i, String str, String str2, String str3, int i2, int i3, String str4) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(GetRouteDetailsMetaQueryParameterApiModel$$serializer.f1732a.getDescriptor(), i, 63);
            throw null;
        }
        this.f1731a = str;
        this.b = str2;
        this.c = str3;
        this.d = i2;
        this.e = i3;
        this.f = str4;
    }
}
