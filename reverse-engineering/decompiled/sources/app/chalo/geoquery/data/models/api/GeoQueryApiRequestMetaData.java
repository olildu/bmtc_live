package app.chalo.geoquery.data.models.api;

import defpackage.nf1;
import defpackage.r30;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/geoquery/data/models/api/GeoQueryApiRequestMetaData;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GeoQueryApiRequestMetaData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2795a;
    public final int b;
    public final String c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/geoquery/data/models/api/GeoQueryApiRequestMetaData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/geoquery/data/models/api/GeoQueryApiRequestMetaData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GeoQueryApiRequestMetaData> serializer() {
            return GeoQueryApiRequestMetaData$$serializer.f2796a;
        }
    }

    public /* synthetic */ GeoQueryApiRequestMetaData(int i, int i2, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(GeoQueryApiRequestMetaData$$serializer.f2796a.getDescriptor(), i, 15);
            throw null;
        }
        this.f2795a = str;
        this.b = i2;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeoQueryApiRequestMetaData)) {
            return false;
        }
        GeoQueryApiRequestMetaData geoQueryApiRequestMetaData = (GeoQueryApiRequestMetaData) obj;
        return Intrinsics.d(this.f2795a, geoQueryApiRequestMetaData.f2795a) && this.b == geoQueryApiRequestMetaData.b && Intrinsics.d(this.c, geoQueryApiRequestMetaData.c) && Intrinsics.d(this.d, geoQueryApiRequestMetaData.d);
    }

    public final int hashCode() {
        int iE = nf1.e(((this.f2795a.hashCode() * 31) + this.b) * 31, 31, this.c);
        String str = this.d;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return r30.i(xs.m(this.b, "GeoQueryApiRequestMetaData(locale=", this.f2795a, ", appVer=", ", deviceId="), this.c, ", userId=", this.d, ")");
    }

    public GeoQueryApiRequestMetaData(String str, int i, String deviceId, String str2) {
        Intrinsics.i(deviceId, "deviceId");
        this.f2795a = str;
        this.b = i;
        this.c = deviceId;
        this.d = str2;
    }
}
