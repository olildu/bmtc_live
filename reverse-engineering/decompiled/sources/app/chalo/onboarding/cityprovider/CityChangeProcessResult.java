package app.chalo.onboarding.cityprovider;

import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/onboarding/cityprovider/CityChangeProcessResult;", "", "CityUpdated", "InProgress", "Lapp/chalo/onboarding/cityprovider/CityChangeProcessResult$CityUpdated;", "Lapp/chalo/onboarding/cityprovider/CityChangeProcessResult$InProgress;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CityChangeProcessResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/cityprovider/CityChangeProcessResult$CityUpdated;", "Lapp/chalo/onboarding/cityprovider/CityChangeProcessResult;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CityUpdated extends CityChangeProcessResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CityAppModel f6606a;

        public CityUpdated(CityAppModel city) {
            Intrinsics.i(city, "city");
            this.f6606a = city;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CityUpdated) && Intrinsics.d(this.f6606a, ((CityUpdated) obj).f6606a);
        }

        public final int hashCode() {
            return this.f6606a.hashCode();
        }

        public final String toString() {
            return "CityUpdated(city=" + this.f6606a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/cityprovider/CityChangeProcessResult$InProgress;", "Lapp/chalo/onboarding/cityprovider/CityChangeProcessResult;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InProgress extends CityChangeProcessResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InProgress f6607a = new InProgress();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InProgress);
        }

        public final int hashCode() {
            return -2144622102;
        }

        public final String toString() {
            return "InProgress";
        }
    }
}
