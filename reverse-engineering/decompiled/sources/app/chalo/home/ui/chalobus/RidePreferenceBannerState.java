package app.chalo.home.ui.chalobus;

import defpackage.cb0;
import defpackage.i71;
import defpackage.nf1;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/home/ui/chalobus/RidePreferenceBannerState;", "", "Hidden", "SaveRideEligible", "TimeAutoSet", "ConfirmTimeUpdate", "Lapp/chalo/home/ui/chalobus/RidePreferenceBannerState$ConfirmTimeUpdate;", "Lapp/chalo/home/ui/chalobus/RidePreferenceBannerState$Hidden;", "Lapp/chalo/home/ui/chalobus/RidePreferenceBannerState$SaveRideEligible;", "Lapp/chalo/home/ui/chalobus/RidePreferenceBannerState$TimeAutoSet;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RidePreferenceBannerState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/RidePreferenceBannerState$ConfirmTimeUpdate;", "Lapp/chalo/home/ui/chalobus/RidePreferenceBannerState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConfirmTimeUpdate extends RidePreferenceBannerState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f3300a;
        public final long b;

        public ConfirmTimeUpdate(long j, long j2) {
            this.f3300a = j;
            this.b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfirmTimeUpdate)) {
                return false;
            }
            ConfirmTimeUpdate confirmTimeUpdate = (ConfirmTimeUpdate) obj;
            return this.f3300a == confirmTimeUpdate.f3300a && this.b == confirmTimeUpdate.b;
        }

        public final int hashCode() {
            long j = this.f3300a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.b;
            return i + ((int) ((j2 >>> 32) ^ j2));
        }

        public final String toString() {
            return uf0.m(this.b, ")", i71.g(this.f3300a, "ConfirmTimeUpdate(newTime=", ", previousTime="));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/RidePreferenceBannerState$Hidden;", "Lapp/chalo/home/ui/chalobus/RidePreferenceBannerState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Hidden extends RidePreferenceBannerState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Hidden f3301a = new Hidden();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Hidden);
        }

        public final int hashCode() {
            return -1764894260;
        }

        public final String toString() {
            return "Hidden";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/RidePreferenceBannerState$SaveRideEligible;", "Lapp/chalo/home/ui/chalobus/RidePreferenceBannerState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SaveRideEligible extends RidePreferenceBannerState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f3302a;
        public final String b;
        public final String c;
        public final String d;
        public final long e;

        public SaveRideEligible(boolean z, String fromStopName, String toStopName, String time, long j) {
            Intrinsics.i(fromStopName, "fromStopName");
            Intrinsics.i(toStopName, "toStopName");
            Intrinsics.i(time, "time");
            this.f3302a = z;
            this.b = fromStopName;
            this.c = toStopName;
            this.d = time;
            this.e = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SaveRideEligible)) {
                return false;
            }
            SaveRideEligible saveRideEligible = (SaveRideEligible) obj;
            return this.f3302a == saveRideEligible.f3302a && Intrinsics.d(this.b, saveRideEligible.b) && Intrinsics.d(this.c, saveRideEligible.c) && Intrinsics.d(this.d, saveRideEligible.d) && this.e == saveRideEligible.e;
        }

        public final int hashCode() {
            int iE = nf1.e(nf1.e(nf1.e((this.f3302a ? 1231 : 1237) * 31, 31, this.b), 31, this.c), 31, this.d);
            long j = this.e;
            return iE + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SaveRideEligible(isSavedAlready=");
            sb.append(this.f3302a);
            sb.append(", fromStopName=");
            sb.append(this.b);
            sb.append(", toStopName=");
            cb0.t(sb, this.c, ", time=", this.d, ", suggestedTime=");
            return uf0.m(this.e, ")", sb);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/RidePreferenceBannerState$TimeAutoSet;", "Lapp/chalo/home/ui/chalobus/RidePreferenceBannerState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimeAutoSet extends RidePreferenceBannerState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TimeAutoSet f3303a = new TimeAutoSet();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TimeAutoSet);
        }

        public final int hashCode() {
            return -2076716604;
        }

        public final String toString() {
            return "TimeAutoSet";
        }
    }
}
