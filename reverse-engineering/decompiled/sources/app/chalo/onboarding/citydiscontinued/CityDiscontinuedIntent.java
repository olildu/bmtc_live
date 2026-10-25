package app.chalo.onboarding.citydiscontinued;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/onboarding/citydiscontinued/CityDiscontinuedIntent;", "", "InitializationIntent", "OnSupportedCitiesButtonClicked", "OnBackPressed", "Lapp/chalo/onboarding/citydiscontinued/CityDiscontinuedIntent$InitializationIntent;", "Lapp/chalo/onboarding/citydiscontinued/CityDiscontinuedIntent$OnBackPressed;", "Lapp/chalo/onboarding/citydiscontinued/CityDiscontinuedIntent$OnSupportedCitiesButtonClicked;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CityDiscontinuedIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/citydiscontinued/CityDiscontinuedIntent$InitializationIntent;", "Lapp/chalo/onboarding/citydiscontinued/CityDiscontinuedIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends CityDiscontinuedIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6554a;

        public InitializationIntent(String selectedCity) {
            Intrinsics.i(selectedCity, "selectedCity");
            this.f6554a = selectedCity;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitializationIntent) && Intrinsics.d(this.f6554a, ((InitializationIntent) obj).f6554a);
        }

        public final int hashCode() {
            return this.f6554a.hashCode();
        }

        public final String toString() {
            return vo1.B("InitializationIntent(selectedCity=", this.f6554a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/citydiscontinued/CityDiscontinuedIntent$OnBackPressed;", "Lapp/chalo/onboarding/citydiscontinued/CityDiscontinuedIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnBackPressed extends CityDiscontinuedIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnBackPressed f6555a = new OnBackPressed();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/citydiscontinued/CityDiscontinuedIntent$OnSupportedCitiesButtonClicked;", "Lapp/chalo/onboarding/citydiscontinued/CityDiscontinuedIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnSupportedCitiesButtonClicked extends CityDiscontinuedIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnSupportedCitiesButtonClicked f6556a = new OnSupportedCitiesButtonClicked();
    }
}
