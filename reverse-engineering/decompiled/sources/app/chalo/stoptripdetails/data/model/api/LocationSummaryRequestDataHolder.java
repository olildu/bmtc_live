package app.chalo.stoptripdetails.data.model.api;

import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import com.adjust.sdk.Constants;
import defpackage.hq0;
import defpackage.n21;
import defpackage.nf1;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/api/LocationSummaryRequestDataHolder;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LocationSummaryRequestDataHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f9479a;
    public final ChaloTransitMode b;
    public final int c;
    public final int d;
    public final String e;
    public final long f;
    public final String g;
    public final LatLng h;

    public LocationSummaryRequestDataHolder(LatLng requestLatLng, ChaloTransitMode chaloTransitMode, int i, int i2, String day, long j, String str, LatLng latLng) {
        Intrinsics.i(requestLatLng, "requestLatLng");
        Intrinsics.i(day, "day");
        this.f9479a = requestLatLng;
        this.b = chaloTransitMode;
        this.c = i;
        this.d = i2;
        this.e = day;
        this.f = j;
        this.g = str;
        this.h = latLng;
    }

    public final LinkedHashMap a() {
        LatLng latLng = this.f9479a;
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("lat", String.valueOf(latLng.f5134a)), new Pair("lon", String.valueOf(latLng.b)), new Pair("time", String.valueOf(this.f)), new Pair("day", this.e), new Pair("radius", String.valueOf(this.d)), new Pair("cards", String.valueOf(this.c)));
        LatLng latLng2 = this.h;
        if (latLng2 != null) {
            linkedHashMapK.put("currentLat", String.valueOf(latLng2.f5134a));
        }
        ChaloTransitMode chaloTransitMode = this.b;
        if (chaloTransitMode != null) {
        }
        String str = this.g;
        if (str != null) {
            linkedHashMapK.put(Constants.REFERRER_API_META, str);
        }
        return linkedHashMapK;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationSummaryRequestDataHolder)) {
            return false;
        }
        LocationSummaryRequestDataHolder locationSummaryRequestDataHolder = (LocationSummaryRequestDataHolder) obj;
        return Intrinsics.d(this.f9479a, locationSummaryRequestDataHolder.f9479a) && this.b == locationSummaryRequestDataHolder.b && this.c == locationSummaryRequestDataHolder.c && this.d == locationSummaryRequestDataHolder.d && Intrinsics.d(this.e, locationSummaryRequestDataHolder.e) && this.f == locationSummaryRequestDataHolder.f && Intrinsics.d(this.g, locationSummaryRequestDataHolder.g) && Intrinsics.d(this.h, locationSummaryRequestDataHolder.h);
    }

    public final int hashCode() {
        int iHashCode = this.f9479a.hashCode() * 31;
        ChaloTransitMode chaloTransitMode = this.b;
        int iE = nf1.e((((((iHashCode + (chaloTransitMode == null ? 0 : chaloTransitMode.hashCode())) * 31) + this.c) * 31) + this.d) * 31, 31, this.e);
        long j = this.f;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.g;
        int iHashCode2 = (i + (str == null ? 0 : str.hashCode())) * 31;
        LatLng latLng = this.h;
        return iHashCode2 + (latLng != null ? latLng.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocationSummaryRequestDataHolder(requestLatLng=");
        sb.append(this.f9479a);
        sb.append(", transitMode=");
        sb.append(this.b);
        sb.append(", numOfCards=");
        hq0.p(this.c, this.d, ", radius=", ", day=", sb);
        n21.p(this.f, this.e, ", timeSinceMidnightInSeconds=", sb);
        sb.append(", meta=");
        sb.append(this.g);
        sb.append(", userCurrentLatLng=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
