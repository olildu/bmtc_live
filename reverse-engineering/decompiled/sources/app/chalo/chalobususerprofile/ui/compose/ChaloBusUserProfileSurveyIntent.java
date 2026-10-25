package app.chalo.chalobususerprofile.ui.compose;

import app.chalo.chalobususerprofile.data.model.TimingVariability;
import app.chalo.constants.Source;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import defpackage.gf;
import defpackage.hq0;
import defpackage.uf0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0012\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0082\u0001\u0012\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent;", "", "InitializationIntent", "BackClicked", "SkipClicked", "NextClicked", "TimeFieldClicked", "TimePickerDismissed", "TimePickerSelectionChanged", "TimePickerDoneClicked", "SuccessBackToHomeClicked", "HomeLocationSelected", "WorkLocationSelected", "WorkTimingStartTimeChanged", "WorkTimingStartVariabilityChanged", "WorkTimingEndTimeChanged", "WorkTimingEndVariabilityChanged", "FrequencySelected", "CancelBtnClickedIntent", "RetryBtnClickedIntent", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$BackClicked;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$CancelBtnClickedIntent;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$FrequencySelected;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$HomeLocationSelected;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$InitializationIntent;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$NextClicked;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$RetryBtnClickedIntent;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$SkipClicked;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$SuccessBackToHomeClicked;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$TimeFieldClicked;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$TimePickerDismissed;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$TimePickerDoneClicked;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$TimePickerSelectionChanged;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$WorkLocationSelected;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$WorkTimingEndTimeChanged;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$WorkTimingEndVariabilityChanged;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$WorkTimingStartTimeChanged;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$WorkTimingStartVariabilityChanged;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChaloBusUserProfileSurveyIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$BackClicked;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BackClicked extends ChaloBusUserProfileSurveyIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BackClicked f1207a = new BackClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$CancelBtnClickedIntent;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CancelBtnClickedIntent extends ChaloBusUserProfileSurveyIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CancelBtnClickedIntent f1208a = new CancelBtnClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CancelBtnClickedIntent);
        }

        public final int hashCode() {
            return 1587701157;
        }

        public final String toString() {
            return "CancelBtnClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$FrequencySelected;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FrequencySelected extends ChaloBusUserProfileSurveyIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelFrequency f1209a;

        public FrequencySelected(TravelFrequency frequency) {
            Intrinsics.i(frequency, "frequency");
            this.f1209a = frequency;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FrequencySelected) && this.f1209a == ((FrequencySelected) obj).f1209a;
        }

        public final int hashCode() {
            return this.f1209a.hashCode();
        }

        public final String toString() {
            return "FrequencySelected(frequency=" + this.f1209a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$HomeLocationSelected;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HomeLocationSelected extends ChaloBusUserProfileSurveyIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecentPlaceAppModel f1210a;

        public HomeLocationSelected(RecentPlaceAppModel place) {
            Intrinsics.i(place, "place");
            this.f1210a = place;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HomeLocationSelected) && Intrinsics.d(this.f1210a, ((HomeLocationSelected) obj).f1210a);
        }

        public final int hashCode() {
            return this.f1210a.hashCode();
        }

        public final String toString() {
            return "HomeLocationSelected(place=" + this.f1210a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$InitializationIntent;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends ChaloBusUserProfileSurveyIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Source f1211a;

        public InitializationIntent(Source source) {
            Intrinsics.i(source, "source");
            this.f1211a = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitializationIntent) && this.f1211a == ((InitializationIntent) obj).f1211a;
        }

        public final int hashCode() {
            return this.f1211a.hashCode();
        }

        public final String toString() {
            return gf.f(this.f1211a, "InitializationIntent(source=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$NextClicked;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NextClicked extends ChaloBusUserProfileSurveyIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NextClicked f1212a = new NextClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$RetryBtnClickedIntent;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RetryBtnClickedIntent extends ChaloBusUserProfileSurveyIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RetryBtnClickedIntent f1213a = new RetryBtnClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryBtnClickedIntent);
        }

        public final int hashCode() {
            return -539700085;
        }

        public final String toString() {
            return "RetryBtnClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$SkipClicked;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SkipClicked extends ChaloBusUserProfileSurveyIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SkipClicked f1214a = new SkipClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$SuccessBackToHomeClicked;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SuccessBackToHomeClicked extends ChaloBusUserProfileSurveyIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SuccessBackToHomeClicked f1215a = new SuccessBackToHomeClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$TimeFieldClicked;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimeFieldClicked extends ChaloBusUserProfileSurveyIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TimePickerType f1216a;

        public TimeFieldClicked(TimePickerType type) {
            Intrinsics.i(type, "type");
            this.f1216a = type;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TimeFieldClicked) && this.f1216a == ((TimeFieldClicked) obj).f1216a;
        }

        public final int hashCode() {
            return this.f1216a.hashCode();
        }

        public final String toString() {
            return "TimeFieldClicked(type=" + this.f1216a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$TimePickerDismissed;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TimePickerDismissed extends ChaloBusUserProfileSurveyIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TimePickerDismissed f1217a = new TimePickerDismissed();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$TimePickerDoneClicked;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TimePickerDoneClicked extends ChaloBusUserProfileSurveyIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TimePickerDoneClicked f1218a = new TimePickerDoneClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$TimePickerSelectionChanged;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimePickerSelectionChanged extends ChaloBusUserProfileSurveyIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1219a;
        public final int b;
        public final String c;

        public TimePickerSelectionChanged(int i, int i2, String amPm) {
            Intrinsics.i(amPm, "amPm");
            this.f1219a = i;
            this.b = i2;
            this.c = amPm;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TimePickerSelectionChanged)) {
                return false;
            }
            TimePickerSelectionChanged timePickerSelectionChanged = (TimePickerSelectionChanged) obj;
            return this.f1219a == timePickerSelectionChanged.f1219a && this.b == timePickerSelectionChanged.b && Intrinsics.d(this.c, timePickerSelectionChanged.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (((this.f1219a * 31) + this.b) * 31);
        }

        public final String toString() {
            return vo1.p(uf0.s(this.f1219a, this.b, "TimePickerSelectionChanged(hour12=", ", minute=", ", amPm="), this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$WorkLocationSelected;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WorkLocationSelected extends ChaloBusUserProfileSurveyIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecentPlaceAppModel f1220a;

        public WorkLocationSelected(RecentPlaceAppModel place) {
            Intrinsics.i(place, "place");
            this.f1220a = place;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WorkLocationSelected) && Intrinsics.d(this.f1220a, ((WorkLocationSelected) obj).f1220a);
        }

        public final int hashCode() {
            return this.f1220a.hashCode();
        }

        public final String toString() {
            return "WorkLocationSelected(place=" + this.f1220a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$WorkTimingEndTimeChanged;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WorkTimingEndTimeChanged extends ChaloBusUserProfileSurveyIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f1221a;

        public WorkTimingEndTimeChanged(long j) {
            this.f1221a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WorkTimingEndTimeChanged) && this.f1221a == ((WorkTimingEndTimeChanged) obj).f1221a;
        }

        public final int hashCode() {
            long j = this.f1221a;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            return hq0.e(this.f1221a, "WorkTimingEndTimeChanged(timeMs=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$WorkTimingEndVariabilityChanged;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WorkTimingEndVariabilityChanged extends ChaloBusUserProfileSurveyIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TimingVariability f1222a;

        public WorkTimingEndVariabilityChanged(TimingVariability variability) {
            Intrinsics.i(variability, "variability");
            this.f1222a = variability;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WorkTimingEndVariabilityChanged) && this.f1222a == ((WorkTimingEndVariabilityChanged) obj).f1222a;
        }

        public final int hashCode() {
            return this.f1222a.hashCode();
        }

        public final String toString() {
            return "WorkTimingEndVariabilityChanged(variability=" + this.f1222a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$WorkTimingStartTimeChanged;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WorkTimingStartTimeChanged extends ChaloBusUserProfileSurveyIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f1223a;

        public WorkTimingStartTimeChanged(long j) {
            this.f1223a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WorkTimingStartTimeChanged) && this.f1223a == ((WorkTimingStartTimeChanged) obj).f1223a;
        }

        public final int hashCode() {
            long j = this.f1223a;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            return hq0.e(this.f1223a, "WorkTimingStartTimeChanged(timeMs=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent$WorkTimingStartVariabilityChanged;", "Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WorkTimingStartVariabilityChanged extends ChaloBusUserProfileSurveyIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TimingVariability f1224a;

        public WorkTimingStartVariabilityChanged(TimingVariability variability) {
            Intrinsics.i(variability, "variability");
            this.f1224a = variability;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WorkTimingStartVariabilityChanged) && this.f1224a == ((WorkTimingStartVariabilityChanged) obj).f1224a;
        }

        public final int hashCode() {
            return this.f1224a.hashCode();
        }

        public final String toString() {
            return "WorkTimingStartVariabilityChanged(variability=" + this.f1224a + ")";
        }
    }
}
