package app.chalo.livetracking.universalsearch.data.model.api;

import androidx.webkit.Profile;
import app.chalo.livetracking.universalsearch.data.enums.SearchFlowSourceType;
import app.chalo.location.LatLng;
import defpackage.cb0;
import defpackage.dd;
import defpackage.i71;
import defpackage.nf1;
import defpackage.p7;
import defpackage.pk0;
import defpackage.vo1;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/api/AutoCompleteResultApiRequestModel;", "", "Companion", "Place", Profile.DEFAULT_PROFILE_NAME, "Lapp/chalo/livetracking/universalsearch/data/model/api/AutoCompleteResultApiRequestModel$Default;", "Lapp/chalo/livetracking/universalsearch/data/model/api/AutoCompleteResultApiRequestModel$Place;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class AutoCompleteResultApiRequestModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Object g = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new p7(5));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4968a;
    public final String b;
    public final LatLng c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/api/AutoCompleteResultApiRequestModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/universalsearch/data/model/api/AutoCompleteResultApiRequestModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<AutoCompleteResultApiRequestModel> serializer() {
            return (KSerializer) AutoCompleteResultApiRequestModel.g.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/api/AutoCompleteResultApiRequestModel$Default;", "Lapp/chalo/livetracking/universalsearch/data/model/api/AutoCompleteResultApiRequestModel;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Default extends AutoCompleteResultApiRequestModel {
        public final String h;
        public final String i;
        public final String j;
        public final String k;
        public final String l;
        public final String m;
        public final LatLng n;
        public final String o;
        public final int p;
        public final SearchFlowSourceType q;
        public final String r;
        public final boolean s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Default(String query, String source, String str, String cityName, String str2, String str3, LatLng latLng, String timeZoneId, int i, SearchFlowSourceType searchSourceFlow, String str4, boolean z) {
            super(query, source, latLng, str2, str3, str4);
            Intrinsics.i(query, "query");
            Intrinsics.i(source, "source");
            Intrinsics.i(cityName, "cityName");
            Intrinsics.i(latLng, "latLng");
            Intrinsics.i(timeZoneId, "timeZoneId");
            Intrinsics.i(searchSourceFlow, "searchSourceFlow");
            this.h = query;
            this.i = source;
            this.j = str;
            this.k = cityName;
            this.l = str2;
            this.m = str3;
            this.n = latLng;
            this.o = timeZoneId;
            this.p = i;
            this.q = searchSourceFlow;
            this.r = str4;
            this.s = z;
        }

        @Override // app.chalo.livetracking.universalsearch.data.model.api.AutoCompleteResultApiRequestModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF() {
            return this.r;
        }

        @Override // app.chalo.livetracking.universalsearch.data.model.api.AutoCompleteResultApiRequestModel
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getE() {
            return this.m;
        }

        @Override // app.chalo.livetracking.universalsearch.data.model.api.AutoCompleteResultApiRequestModel
        /* JADX INFO: renamed from: c, reason: from getter */
        public final LatLng getC() {
            return this.n;
        }

        @Override // app.chalo.livetracking.universalsearch.data.model.api.AutoCompleteResultApiRequestModel
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getF4968a() {
            return this.h;
        }

        @Override // app.chalo.livetracking.universalsearch.data.model.api.AutoCompleteResultApiRequestModel
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getB() {
            return this.i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Default)) {
                return false;
            }
            Default r5 = (Default) obj;
            return Intrinsics.d(this.h, r5.h) && Intrinsics.d(this.i, r5.i) && Intrinsics.d(this.j, r5.j) && Intrinsics.d(this.k, r5.k) && Intrinsics.d(this.l, r5.l) && Intrinsics.d(this.m, r5.m) && Intrinsics.d(this.n, r5.n) && Intrinsics.d(this.o, r5.o) && this.p == r5.p && this.q == r5.q && Intrinsics.d(this.r, r5.r) && this.s == r5.s;
        }

        @Override // app.chalo.livetracking.universalsearch.data.model.api.AutoCompleteResultApiRequestModel
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getD() {
            return this.l;
        }

        public final int hashCode() {
            int iE = nf1.e(this.h.hashCode() * 31, 31, this.i);
            String str = this.j;
            int iE2 = nf1.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.k);
            String str2 = this.l;
            int iHashCode = (this.q.hashCode() + ((nf1.e(i71.d(this.n, nf1.e((iE2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.m), 31), 31, this.o) + this.p) * 31)) * 31;
            String str3 = this.r;
            return ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.s ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("Default(query=", this.h, ", source=", this.i, ", searchFilter=");
            cb0.t(sbE, this.j, ", cityName=", this.k, ", userId=");
            cb0.t(sbE, this.l, ", currentLanguage=", this.m, ", latLng=");
            sbE.append(this.n);
            sbE.append(", timeZoneId=");
            sbE.append(this.o);
            sbE.append(", timeoutInMilliSec=");
            sbE.append(this.p);
            sbE.append(", searchSourceFlow=");
            sbE.append(this.q);
            sbE.append(", category=");
            sbE.append(this.r);
            sbE.append(", isForMTicket=");
            sbE.append(this.s);
            sbE.append(")");
            return sbE.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/api/AutoCompleteResultApiRequestModel$Place;", "Lapp/chalo/livetracking/universalsearch/data/model/api/AutoCompleteResultApiRequestModel;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Place extends AutoCompleteResultApiRequestModel {
        public final String h;
        public final String i;
        public final String j;
        public final LatLng k;
        public final int l;
        public final String m;
        public final String n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Place(String countryId, String query, String source, LatLng latLng, int i, String str, String str2) {
            super(query, source, latLng, str, str2, null);
            Intrinsics.i(countryId, "countryId");
            Intrinsics.i(query, "query");
            Intrinsics.i(source, "source");
            this.h = countryId;
            this.i = query;
            this.j = source;
            this.k = latLng;
            this.l = i;
            this.m = str;
            this.n = str2;
        }

        @Override // app.chalo.livetracking.universalsearch.data.model.api.AutoCompleteResultApiRequestModel
        /* JADX INFO: renamed from: a */
        public final String getF() {
            return null;
        }

        @Override // app.chalo.livetracking.universalsearch.data.model.api.AutoCompleteResultApiRequestModel
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getE() {
            return this.n;
        }

        @Override // app.chalo.livetracking.universalsearch.data.model.api.AutoCompleteResultApiRequestModel
        /* JADX INFO: renamed from: c, reason: from getter */
        public final LatLng getC() {
            return this.k;
        }

        @Override // app.chalo.livetracking.universalsearch.data.model.api.AutoCompleteResultApiRequestModel
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getF4968a() {
            return this.i;
        }

        @Override // app.chalo.livetracking.universalsearch.data.model.api.AutoCompleteResultApiRequestModel
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getB() {
            return this.j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Place)) {
                return false;
            }
            Place place = (Place) obj;
            return Intrinsics.d(this.h, place.h) && Intrinsics.d(this.i, place.i) && Intrinsics.d(this.j, place.j) && Intrinsics.d(this.k, place.k) && this.l == place.l && Intrinsics.d(this.m, place.m) && this.n.equals(place.n);
        }

        @Override // app.chalo.livetracking.universalsearch.data.model.api.AutoCompleteResultApiRequestModel
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getD() {
            return this.m;
        }

        public final int hashCode() {
            int iE = nf1.e(nf1.e(this.h.hashCode() * 31, 31, this.i), 31, this.j);
            LatLng latLng = this.k;
            int iHashCode = (((iE + (latLng == null ? 0 : latLng.hashCode())) * 31) + this.l) * 31;
            String str = this.m;
            return nf1.e((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.n);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("Place(countryId=", this.h, ", query=", this.i, ", source=");
            sbE.append(this.j);
            sbE.append(", latLng=");
            sbE.append(this.k);
            sbE.append(", timeoutInMilliSec=");
            pk0.t(this.l, ", userId=", this.m, ", currentLanguage=", sbE);
            return vo1.p(sbE, this.n, ", category=null)");
        }
    }

    public AutoCompleteResultApiRequestModel(String str, String str2, LatLng latLng, String str3, String str4, String str5) {
        this.f4968a = str;
        this.b = str2;
        this.c = latLng;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public String getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public String getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public LatLng getC() {
        return this.c;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public String getF4968a() {
        return this.f4968a;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public String getB() {
        return this.b;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public String getD() {
        return this.d;
    }
}
