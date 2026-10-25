package app.chalo.onboarding.cityselection.ui;

import app.chalo.models.BasicCityInfoAppModel;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lapp/chalo/onboarding/cityselection/ui/CitySelectionIntent;", "", "InitialisationIntent", "RetryFetchIntent", "BackClickedIntent", "SearchQueryEnteredIntent", "SearchPanelClickedIntent", "CityClickedIntent", "VoteForCityClickedIntent", "Lapp/chalo/onboarding/cityselection/ui/CitySelectionIntent$BackClickedIntent;", "Lapp/chalo/onboarding/cityselection/ui/CitySelectionIntent$CityClickedIntent;", "Lapp/chalo/onboarding/cityselection/ui/CitySelectionIntent$InitialisationIntent;", "Lapp/chalo/onboarding/cityselection/ui/CitySelectionIntent$RetryFetchIntent;", "Lapp/chalo/onboarding/cityselection/ui/CitySelectionIntent$SearchPanelClickedIntent;", "Lapp/chalo/onboarding/cityselection/ui/CitySelectionIntent$SearchQueryEnteredIntent;", "Lapp/chalo/onboarding/cityselection/ui/CitySelectionIntent$VoteForCityClickedIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CitySelectionIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/cityselection/ui/CitySelectionIntent$BackClickedIntent;", "Lapp/chalo/onboarding/cityselection/ui/CitySelectionIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BackClickedIntent extends CitySelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BackClickedIntent f6617a = new BackClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClickedIntent);
        }

        public final int hashCode() {
            return 1799357621;
        }

        public final String toString() {
            return "BackClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/cityselection/ui/CitySelectionIntent$CityClickedIntent;", "Lapp/chalo/onboarding/cityselection/ui/CitySelectionIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CityClickedIntent extends CitySelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BasicCityInfoAppModel f6618a;

        static {
            BasicCityInfoAppModel.Companion companion = BasicCityInfoAppModel.INSTANCE;
        }

        public CityClickedIntent(BasicCityInfoAppModel city) {
            Intrinsics.i(city, "city");
            this.f6618a = city;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CityClickedIntent) && Intrinsics.d(this.f6618a, ((CityClickedIntent) obj).f6618a);
        }

        public final int hashCode() {
            return this.f6618a.hashCode();
        }

        public final String toString() {
            return "CityClickedIntent(city=" + this.f6618a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/cityselection/ui/CitySelectionIntent$InitialisationIntent;", "Lapp/chalo/onboarding/cityselection/ui/CitySelectionIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitialisationIntent extends CitySelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InitialisationIntent f6619a = new InitialisationIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InitialisationIntent);
        }

        public final int hashCode() {
            return -1793751446;
        }

        public final String toString() {
            return "InitialisationIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/cityselection/ui/CitySelectionIntent$RetryFetchIntent;", "Lapp/chalo/onboarding/cityselection/ui/CitySelectionIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RetryFetchIntent extends CitySelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RetryFetchIntent f6620a = new RetryFetchIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryFetchIntent);
        }

        public final int hashCode() {
            return -353937835;
        }

        public final String toString() {
            return "RetryFetchIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/cityselection/ui/CitySelectionIntent$SearchPanelClickedIntent;", "Lapp/chalo/onboarding/cityselection/ui/CitySelectionIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchPanelClickedIntent extends CitySelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SearchPanelClickedIntent f6621a = new SearchPanelClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SearchPanelClickedIntent);
        }

        public final int hashCode() {
            return -1774646546;
        }

        public final String toString() {
            return "SearchPanelClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/cityselection/ui/CitySelectionIntent$SearchQueryEnteredIntent;", "Lapp/chalo/onboarding/cityselection/ui/CitySelectionIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchQueryEnteredIntent extends CitySelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6622a;

        public SearchQueryEnteredIntent(String query) {
            Intrinsics.i(query, "query");
            this.f6622a = query;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchQueryEnteredIntent) && Intrinsics.d(this.f6622a, ((SearchQueryEnteredIntent) obj).f6622a);
        }

        public final int hashCode() {
            return this.f6622a.hashCode();
        }

        public final String toString() {
            return vo1.B("SearchQueryEnteredIntent(query=", this.f6622a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/cityselection/ui/CitySelectionIntent$VoteForCityClickedIntent;", "Lapp/chalo/onboarding/cityselection/ui/CitySelectionIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VoteForCityClickedIntent extends CitySelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final VoteForCityClickedIntent f6623a = new VoteForCityClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof VoteForCityClickedIntent);
        }

        public final int hashCode() {
            return 644259680;
        }

        public final String toString() {
            return "VoteForCityClickedIntent";
        }
    }
}
