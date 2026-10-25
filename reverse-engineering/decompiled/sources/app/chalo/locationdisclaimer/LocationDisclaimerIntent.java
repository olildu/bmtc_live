package app.chalo.locationdisclaimer;

import app.chalo.constants.Source;
import defpackage.gf;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/locationdisclaimer/LocationDisclaimerIntent;", "", "ViewCreatedIntent", "OnStartIntent", "GoToSettingsBtnClicked", "Lapp/chalo/locationdisclaimer/LocationDisclaimerIntent$GoToSettingsBtnClicked;", "Lapp/chalo/locationdisclaimer/LocationDisclaimerIntent$OnStartIntent;", "Lapp/chalo/locationdisclaimer/LocationDisclaimerIntent$ViewCreatedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class LocationDisclaimerIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/locationdisclaimer/LocationDisclaimerIntent$GoToSettingsBtnClicked;", "Lapp/chalo/locationdisclaimer/LocationDisclaimerIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GoToSettingsBtnClicked extends LocationDisclaimerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GoToSettingsBtnClicked f5169a = new GoToSettingsBtnClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoToSettingsBtnClicked);
        }

        public final int hashCode() {
            return 1344072529;
        }

        public final String toString() {
            return "GoToSettingsBtnClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/locationdisclaimer/LocationDisclaimerIntent$OnStartIntent;", "Lapp/chalo/locationdisclaimer/LocationDisclaimerIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnStartIntent extends LocationDisclaimerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnStartIntent f5170a = new OnStartIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnStartIntent);
        }

        public final int hashCode() {
            return 2040745087;
        }

        public final String toString() {
            return "OnStartIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/locationdisclaimer/LocationDisclaimerIntent$ViewCreatedIntent;", "Lapp/chalo/locationdisclaimer/LocationDisclaimerIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ViewCreatedIntent extends LocationDisclaimerIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Source f5171a;

        public ViewCreatedIntent(Source previousScreenSource) {
            Intrinsics.i(previousScreenSource, "previousScreenSource");
            this.f5171a = previousScreenSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewCreatedIntent) && this.f5171a == ((ViewCreatedIntent) obj).f5171a;
        }

        public final int hashCode() {
            return this.f5171a.hashCode();
        }

        public final String toString() {
            return gf.f(this.f5171a, "ViewCreatedIntent(previousScreenSource=", ")");
        }
    }
}
