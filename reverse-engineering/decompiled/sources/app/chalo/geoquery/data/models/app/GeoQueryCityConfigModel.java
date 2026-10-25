package app.chalo.geoquery.data.models.app;

import com.google.firebase.messaging.ServiceStarter;
import defpackage.hq0;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/geoquery/data/models/app/GeoQueryCityConfigModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GeoQueryCityConfigModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2816a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final int h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Lapp/chalo/geoquery/data/models/app/GeoQueryCityConfigModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/geoquery/data/models/app/GeoQueryCityConfigModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "MAP_OVERLAY_RADIUS_IN_METERS", "I", "NEW_QUERY_THRESHOLD_IN_METERS", "MAP_ZOOM_LEVEL", "", "INITIAL_POLLING_DELAY_IN_MILLIS", "J", "POLLING_DELAY_STEP_COUNT_IN_MILLIS", "INITIAL_REQUEST_BURST_IN_MILLIS", "BURST_REQUEST_ALLOWED_COUNT", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GeoQueryCityConfigModel> serializer() {
            return GeoQueryCityConfigModel$$serializer.f2817a;
        }
    }

    public /* synthetic */ GeoQueryCityConfigModel(int i, String str, int i2, int i3, int i4, long j, long j2, long j3, int i5) {
        this.f2816a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = 1000;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = ServiceStarter.ERROR_UNKNOWN;
        } else {
            this.c = i3;
        }
        if ((i & 8) == 0) {
            this.d = 15;
        } else {
            this.d = i4;
        }
        if ((i & 16) == 0) {
            this.e = 9000L;
        } else {
            this.e = j;
        }
        if ((i & 32) == 0) {
            this.f = 1000L;
        } else {
            this.f = j2;
        }
        if ((i & 64) == 0) {
            this.g = 5000L;
        } else {
            this.g = j3;
        }
        if ((i & 128) == 0) {
            this.h = 2;
        } else {
            this.h = i5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeoQueryCityConfigModel)) {
            return false;
        }
        GeoQueryCityConfigModel geoQueryCityConfigModel = (GeoQueryCityConfigModel) obj;
        return Intrinsics.d(this.f2816a, geoQueryCityConfigModel.f2816a) && this.b == geoQueryCityConfigModel.b && this.c == geoQueryCityConfigModel.c && this.d == geoQueryCityConfigModel.d && this.e == geoQueryCityConfigModel.e && this.f == geoQueryCityConfigModel.f && this.g == geoQueryCityConfigModel.g && this.h == geoQueryCityConfigModel.h;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.f2816a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31;
        long j = this.e;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.g;
        return ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.h;
    }

    public final String toString() {
        StringBuilder sbM = xs.m(this.b, "GeoQueryCityConfigModel(city=", this.f2816a, ", mapOverlayRadius=", ", newQueryThreshold=");
        hq0.p(this.c, this.d, ", mapZoomLevel=", ", initialPollingDelay=", sbM);
        sbM.append(this.e);
        xs.r(this.f, ", pollingDelayStepCount=", ", initialRequestBurst=", sbM);
        sbM.append(this.g);
        sbM.append(", burstRequestAllowedCount=");
        sbM.append(this.h);
        sbM.append(")");
        return sbM.toString();
    }

    public GeoQueryCityConfigModel(String city, int i) {
        city = (i & 1) != 0 ? "" : city;
        Intrinsics.i(city, "city");
        this.f2816a = city;
        this.b = 1000;
        this.c = ServiceStarter.ERROR_UNKNOWN;
        this.d = 15;
        this.e = 9000L;
        this.f = 1000L;
        this.g = 5000L;
        this.h = 2;
    }
}
