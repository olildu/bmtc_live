package app.chalo.behaviour.policy;

import app.chalo.location.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/behaviour/policy/CityAutoSelectionApplicable;", "", "Yes", "No", "Lapp/chalo/behaviour/policy/CityAutoSelectionApplicable$No;", "Lapp/chalo/behaviour/policy/CityAutoSelectionApplicable$Yes;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CityAutoSelectionApplicable {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/behaviour/policy/CityAutoSelectionApplicable$No;", "Lapp/chalo/behaviour/policy/CityAutoSelectionApplicable;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class No extends CityAutoSelectionApplicable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final No f999a = new No();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof No);
        }

        public final int hashCode() {
            return 135593421;
        }

        public final String toString() {
            return "No";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/behaviour/policy/CityAutoSelectionApplicable$Yes;", "Lapp/chalo/behaviour/policy/CityAutoSelectionApplicable;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Yes extends CityAutoSelectionApplicable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LatLng f1000a;

        public Yes(LatLng location) {
            Intrinsics.i(location, "location");
            this.f1000a = location;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Yes) && Intrinsics.d(this.f1000a, ((Yes) obj).f1000a);
        }

        public final int hashCode() {
            return this.f1000a.hashCode();
        }

        public final String toString() {
            return "Yes(location=" + this.f1000a + ")";
        }
    }
}
