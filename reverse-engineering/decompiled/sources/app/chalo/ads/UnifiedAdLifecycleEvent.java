package app.chalo.ads;

import defpackage.cb0;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lapp/chalo/ads/UnifiedAdLifecycleEvent;", "", "Requested", "Loaded", "Rendered", "Failed", "Impression", "Click", "PaidImpression", "Lapp/chalo/ads/UnifiedAdLifecycleEvent$Click;", "Lapp/chalo/ads/UnifiedAdLifecycleEvent$Failed;", "Lapp/chalo/ads/UnifiedAdLifecycleEvent$Impression;", "Lapp/chalo/ads/UnifiedAdLifecycleEvent$Loaded;", "Lapp/chalo/ads/UnifiedAdLifecycleEvent$PaidImpression;", "Lapp/chalo/ads/UnifiedAdLifecycleEvent$Rendered;", "Lapp/chalo/ads/UnifiedAdLifecycleEvent$Requested;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class UnifiedAdLifecycleEvent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/UnifiedAdLifecycleEvent$Click;", "Lapp/chalo/ads/UnifiedAdLifecycleEvent;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Click extends UnifiedAdLifecycleEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UnifiedAdCreativeType f845a;

        public Click(UnifiedAdCreativeType creativeType) {
            Intrinsics.i(creativeType, "creativeType");
            this.f845a = creativeType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Click) && this.f845a == ((Click) obj).f845a;
        }

        public final int hashCode() {
            return this.f845a.hashCode();
        }

        public final String toString() {
            return "Click(creativeType=" + this.f845a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/UnifiedAdLifecycleEvent$Failed;", "Lapp/chalo/ads/UnifiedAdLifecycleEvent;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Failed extends UnifiedAdLifecycleEvent {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Failed(errorCode=0, errorMessage=null, creativeType=null, additionalAnalyticsProperties=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/UnifiedAdLifecycleEvent$Impression;", "Lapp/chalo/ads/UnifiedAdLifecycleEvent;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Impression extends UnifiedAdLifecycleEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UnifiedAdCreativeType f846a;

        public Impression(UnifiedAdCreativeType creativeType) {
            Intrinsics.i(creativeType, "creativeType");
            this.f846a = creativeType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Impression) && this.f846a == ((Impression) obj).f846a;
        }

        public final int hashCode() {
            return this.f846a.hashCode();
        }

        public final String toString() {
            return "Impression(creativeType=" + this.f846a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/UnifiedAdLifecycleEvent$Loaded;", "Lapp/chalo/ads/UnifiedAdLifecycleEvent;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loaded extends UnifiedAdLifecycleEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UnifiedAdCreativeType f847a;
        public final long b;

        public Loaded(UnifiedAdCreativeType unifiedAdCreativeType, long j) {
            this.f847a = unifiedAdCreativeType;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.f847a == loaded.f847a && this.b == loaded.b;
        }

        public final int hashCode() {
            int iHashCode = this.f847a.hashCode() * 31;
            long j = this.b;
            return iHashCode + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            return "Loaded(creativeType=" + this.f847a + ", loadTimeMs=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/UnifiedAdLifecycleEvent$PaidImpression;", "Lapp/chalo/ads/UnifiedAdLifecycleEvent;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaidImpression extends UnifiedAdLifecycleEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UnifiedAdCreativeType f848a;
        public final double b;
        public final String c;
        public final String d;

        public PaidImpression(UnifiedAdCreativeType creativeType, double d, String str) {
            Intrinsics.i(creativeType, "creativeType");
            this.f848a = creativeType;
            this.b = d;
            this.c = str;
            this.d = "USD";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaidImpression)) {
                return false;
            }
            PaidImpression paidImpression = (PaidImpression) obj;
            return this.f848a == paidImpression.f848a && Double.compare(this.b, paidImpression.b) == 0 && Intrinsics.d(this.c, paidImpression.c) && Intrinsics.d(this.d, paidImpression.d);
        }

        public final int hashCode() {
            int iHashCode = this.f848a.hashCode() * 31;
            long jDoubleToLongBits = Double.doubleToLongBits(this.b);
            return this.d.hashCode() + nf1.e((iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PaidImpression(creativeType=");
            sb.append(this.f848a);
            sb.append(", revenue=");
            sb.append(this.b);
            cb0.t(sb, ", network=", this.c, ", currencyCode=", this.d);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/UnifiedAdLifecycleEvent$Rendered;", "Lapp/chalo/ads/UnifiedAdLifecycleEvent;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Rendered extends UnifiedAdLifecycleEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UnifiedAdCreativeType f849a;

        public Rendered(UnifiedAdCreativeType creativeType) {
            Intrinsics.i(creativeType, "creativeType");
            this.f849a = creativeType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Rendered) && this.f849a == ((Rendered) obj).f849a;
        }

        public final int hashCode() {
            return this.f849a.hashCode() * 961;
        }

        public final String toString() {
            return "Rendered(creativeType=" + this.f849a + ", widthDp=0, heightDp=0)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/UnifiedAdLifecycleEvent$Requested;", "Lapp/chalo/ads/UnifiedAdLifecycleEvent;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Requested extends UnifiedAdLifecycleEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Requested f850a = new Requested();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Requested);
        }

        public final int hashCode() {
            return -1399854869;
        }

        public final String toString() {
            return "Requested";
        }
    }
}
