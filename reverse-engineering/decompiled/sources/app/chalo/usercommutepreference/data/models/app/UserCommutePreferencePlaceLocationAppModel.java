package app.chalo.usercommutepreference.data.models.app;

import defpackage.cb0;
import defpackage.dd;
import defpackage.dn1;
import defpackage.nf1;
import defpackage.pk0;
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/usercommutepreference/data/models/app/UserCommutePreferencePlaceLocationAppModel;", "", "Companion", "Place", "Stop", "Lapp/chalo/usercommutepreference/data/models/app/UserCommutePreferencePlaceLocationAppModel$Place;", "Lapp/chalo/usercommutepreference/data/models/app/UserCommutePreferencePlaceLocationAppModel$Stop;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class UserCommutePreferencePlaceLocationAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f10249a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new dn1(11));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/usercommutepreference/data/models/app/UserCommutePreferencePlaceLocationAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/usercommutepreference/data/models/app/UserCommutePreferencePlaceLocationAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<UserCommutePreferencePlaceLocationAppModel> serializer() {
            return (KSerializer) UserCommutePreferencePlaceLocationAppModel.f10249a.getValue();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract String getC();

    /* JADX INFO: renamed from: b */
    public abstract String getB();

    /* JADX INFO: renamed from: c */
    public abstract double getF();

    /* JADX INFO: renamed from: d */
    public abstract double getG();

    /* JADX INFO: renamed from: e */
    public abstract String getH();

    /* JADX INFO: renamed from: f */
    public abstract UserCommutePreferenceStopPlaceResultType getI();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/usercommutepreference/data/models/app/UserCommutePreferencePlaceLocationAppModel$Place;", "Lapp/chalo/usercommutepreference/data/models/app/UserCommutePreferencePlaceLocationAppModel;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Place extends UserCommutePreferencePlaceLocationAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] i = {null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new dn1(12))};
        public final String b;
        public final String c;
        public final String d;
        public final double e;
        public final double f;
        public final String g;
        public final UserCommutePreferenceStopPlaceResultType h;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/usercommutepreference/data/models/app/UserCommutePreferencePlaceLocationAppModel$Place$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/usercommutepreference/data/models/app/UserCommutePreferencePlaceLocationAppModel$Place;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Place> serializer() {
                return UserCommutePreferencePlaceLocationAppModel$Place$$serializer.f10250a;
            }
        }

        public /* synthetic */ Place(int i2, String str, String str2, String str3, double d, double d2, String str4, UserCommutePreferenceStopPlaceResultType userCommutePreferenceStopPlaceResultType) {
            if (63 != (i2 & 63)) {
                PluginExceptionsKt.b(UserCommutePreferencePlaceLocationAppModel$Place$$serializer.f10250a.getDescriptor(), i2, 63);
                throw null;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = d;
            this.f = d2;
            this.g = str4;
            if ((i2 & 64) == 0) {
                this.h = UserCommutePreferenceStopPlaceResultType.PLACE;
            } else {
                this.h = userCommutePreferenceStopPlaceResultType;
            }
        }

        @Override // app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getC() {
            return this.c;
        }

        @Override // app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getB() {
            return this.b;
        }

        @Override // app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel
        /* JADX INFO: renamed from: c, reason: from getter */
        public final double getF() {
            return this.e;
        }

        @Override // app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel
        /* JADX INFO: renamed from: d, reason: from getter */
        public final double getG() {
            return this.f;
        }

        @Override // app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getH() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Place)) {
                return false;
            }
            Place place = (Place) obj;
            return Intrinsics.d(this.b, place.b) && Intrinsics.d(this.c, place.c) && Intrinsics.d(this.d, place.d) && Double.compare(this.e, place.e) == 0 && Double.compare(this.f, place.f) == 0 && Intrinsics.d(this.g, place.g) && this.h == place.h;
        }

        @Override // app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel
        /* JADX INFO: renamed from: f, reason: from getter */
        public final UserCommutePreferenceStopPlaceResultType getI() {
            return this.h;
        }

        public final int hashCode() {
            int iE = nf1.e(nf1.e(this.b.hashCode() * 31, 31, this.c), 31, this.d);
            long jDoubleToLongBits = Double.doubleToLongBits(this.e);
            int i2 = (iE + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
            long jDoubleToLongBits2 = Double.doubleToLongBits(this.f);
            return this.h.hashCode() + nf1.e((i2 + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31, 31, this.g);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("Place(id=", this.b, ", cityId=", this.c, ", description=");
            sbE.append(this.d);
            sbE.append(", latitude=");
            sbE.append(this.e);
            pk0.z(sbE, ", longitude=", this.f, ", searchPartner=");
            sbE.append(this.g);
            sbE.append(", type=");
            sbE.append(this.h);
            sbE.append(")");
            return sbE.toString();
        }

        public Place(String id, String cityId, String description, double d, double d2, String searchPartner, UserCommutePreferenceStopPlaceResultType type) {
            Intrinsics.i(id, "id");
            Intrinsics.i(cityId, "cityId");
            Intrinsics.i(description, "description");
            Intrinsics.i(searchPartner, "searchPartner");
            Intrinsics.i(type, "type");
            this.b = id;
            this.c = cityId;
            this.d = description;
            this.e = d;
            this.f = d2;
            this.g = searchPartner;
            this.h = type;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/usercommutepreference/data/models/app/UserCommutePreferencePlaceLocationAppModel$Stop;", "Lapp/chalo/usercommutepreference/data/models/app/UserCommutePreferencePlaceLocationAppModel;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Stop extends UserCommutePreferencePlaceLocationAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] j = {null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new dn1(13))};
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final double f;
        public final double g;
        public final String h;
        public final UserCommutePreferenceStopPlaceResultType i;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/usercommutepreference/data/models/app/UserCommutePreferencePlaceLocationAppModel$Stop$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/usercommutepreference/data/models/app/UserCommutePreferencePlaceLocationAppModel$Stop;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Stop> serializer() {
                return UserCommutePreferencePlaceLocationAppModel$Stop$$serializer.f10251a;
            }
        }

        public /* synthetic */ Stop(int i, String str, String str2, String str3, String str4, double d, double d2, String str5, UserCommutePreferenceStopPlaceResultType userCommutePreferenceStopPlaceResultType) {
            if (127 != (i & 127)) {
                PluginExceptionsKt.b(UserCommutePreferencePlaceLocationAppModel$Stop$$serializer.f10251a.getDescriptor(), i, 127);
                throw null;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = d;
            this.g = d2;
            this.h = str5;
            if ((i & 128) == 0) {
                this.i = UserCommutePreferenceStopPlaceResultType.STOP;
            } else {
                this.i = userCommutePreferenceStopPlaceResultType;
            }
        }

        @Override // app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getC() {
            return this.c;
        }

        @Override // app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getB() {
            return this.b;
        }

        @Override // app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel
        /* JADX INFO: renamed from: c, reason: from getter */
        public final double getF() {
            return this.f;
        }

        @Override // app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel
        /* JADX INFO: renamed from: d, reason: from getter */
        public final double getG() {
            return this.g;
        }

        @Override // app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getH() {
            return this.h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Stop)) {
                return false;
            }
            Stop stop = (Stop) obj;
            return Intrinsics.d(this.b, stop.b) && Intrinsics.d(this.c, stop.c) && Intrinsics.d(this.d, stop.d) && Intrinsics.d(this.e, stop.e) && Double.compare(this.f, stop.f) == 0 && Double.compare(this.g, stop.g) == 0 && Intrinsics.d(this.h, stop.h) && this.i == stop.i;
        }

        @Override // app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel
        /* JADX INFO: renamed from: f, reason: from getter */
        public final UserCommutePreferenceStopPlaceResultType getI() {
            return this.i;
        }

        public final int hashCode() {
            int iE = nf1.e(nf1.e(this.b.hashCode() * 31, 31, this.c), 31, this.d);
            String str = this.e;
            int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
            long jDoubleToLongBits = Double.doubleToLongBits(this.f);
            int i = (iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
            long jDoubleToLongBits2 = Double.doubleToLongBits(this.g);
            return this.i.hashCode() + nf1.e((i + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31, 31, this.h);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("Stop(id=", this.b, ", cityId=", this.c, ", stopName=");
            cb0.t(sbE, this.d, ", stopAddress=", this.e, ", latitude=");
            sbE.append(this.f);
            pk0.z(sbE, ", longitude=", this.g, ", searchPartner=");
            sbE.append(this.h);
            sbE.append(", type=");
            sbE.append(this.i);
            sbE.append(")");
            return sbE.toString();
        }

        public Stop(String id, String cityId, String stopName, String str, double d, double d2, String searchPartner, UserCommutePreferenceStopPlaceResultType type) {
            Intrinsics.i(id, "id");
            Intrinsics.i(cityId, "cityId");
            Intrinsics.i(stopName, "stopName");
            Intrinsics.i(searchPartner, "searchPartner");
            Intrinsics.i(type, "type");
            this.b = id;
            this.c = cityId;
            this.d = stopName;
            this.e = str;
            this.f = d;
            this.g = d2;
            this.h = searchPartner;
            this.i = type;
        }
    }
}
