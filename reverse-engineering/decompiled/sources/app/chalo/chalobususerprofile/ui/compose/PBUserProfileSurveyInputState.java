package app.chalo.chalobususerprofile.ui.compose;

import app.chalo.chalobususerprofile.data.model.TimingVariability;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/PBUserProfileSurveyInputState;", "", "HomeLocationInputPBUserProfile", "WorkLocationInputPBUserProfile", "WorkTimingInputPBUserProfile", "TravelFrequencyInputPBUserProfile", "Lapp/chalo/chalobususerprofile/ui/compose/PBUserProfileSurveyInputState$HomeLocationInputPBUserProfile;", "Lapp/chalo/chalobususerprofile/ui/compose/PBUserProfileSurveyInputState$TravelFrequencyInputPBUserProfile;", "Lapp/chalo/chalobususerprofile/ui/compose/PBUserProfileSurveyInputState$WorkLocationInputPBUserProfile;", "Lapp/chalo/chalobususerprofile/ui/compose/PBUserProfileSurveyInputState$WorkTimingInputPBUserProfile;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PBUserProfileSurveyInputState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1231a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/PBUserProfileSurveyInputState$HomeLocationInputPBUserProfile;", "Lapp/chalo/chalobususerprofile/ui/compose/PBUserProfileSurveyInputState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HomeLocationInputPBUserProfile extends PBUserProfileSurveyInputState {
        public final boolean b;
        public final RecentPlaceAppModel c;

        public HomeLocationInputPBUserProfile(boolean z, RecentPlaceAppModel recentPlaceAppModel) {
            super(z);
            this.b = z;
            this.c = recentPlaceAppModel;
        }

        @Override // app.chalo.chalobususerprofile.ui.compose.PBUserProfileSurveyInputState
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF1231a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HomeLocationInputPBUserProfile)) {
                return false;
            }
            HomeLocationInputPBUserProfile homeLocationInputPBUserProfile = (HomeLocationInputPBUserProfile) obj;
            return this.b == homeLocationInputPBUserProfile.b && Intrinsics.d(this.c, homeLocationInputPBUserProfile.c);
        }

        public final int hashCode() {
            int i = (this.b ? 1231 : 1237) * 31;
            RecentPlaceAppModel recentPlaceAppModel = this.c;
            return i + (recentPlaceAppModel == null ? 0 : recentPlaceAppModel.hashCode());
        }

        public final String toString() {
            return "HomeLocationInputPBUserProfile(isSkipped=" + this.b + ", selectedPlace=" + this.c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/PBUserProfileSurveyInputState$TravelFrequencyInputPBUserProfile;", "Lapp/chalo/chalobususerprofile/ui/compose/PBUserProfileSurveyInputState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TravelFrequencyInputPBUserProfile extends PBUserProfileSurveyInputState {
        public final boolean b;
        public final TravelFrequency c;

        public TravelFrequencyInputPBUserProfile(boolean z, TravelFrequency travelFrequency) {
            super(z);
            this.b = z;
            this.c = travelFrequency;
        }

        @Override // app.chalo.chalobususerprofile.ui.compose.PBUserProfileSurveyInputState
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF1231a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TravelFrequencyInputPBUserProfile)) {
                return false;
            }
            TravelFrequencyInputPBUserProfile travelFrequencyInputPBUserProfile = (TravelFrequencyInputPBUserProfile) obj;
            return this.b == travelFrequencyInputPBUserProfile.b && this.c == travelFrequencyInputPBUserProfile.c;
        }

        public final int hashCode() {
            int i = (this.b ? 1231 : 1237) * 31;
            TravelFrequency travelFrequency = this.c;
            return i + (travelFrequency == null ? 0 : travelFrequency.hashCode());
        }

        public final String toString() {
            return "TravelFrequencyInputPBUserProfile(isSkipped=" + this.b + ", selectedFrequency=" + this.c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/PBUserProfileSurveyInputState$WorkLocationInputPBUserProfile;", "Lapp/chalo/chalobususerprofile/ui/compose/PBUserProfileSurveyInputState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WorkLocationInputPBUserProfile extends PBUserProfileSurveyInputState {
        public final boolean b;
        public final RecentPlaceAppModel c;

        public WorkLocationInputPBUserProfile(boolean z, RecentPlaceAppModel recentPlaceAppModel) {
            super(z);
            this.b = z;
            this.c = recentPlaceAppModel;
        }

        @Override // app.chalo.chalobususerprofile.ui.compose.PBUserProfileSurveyInputState
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF1231a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WorkLocationInputPBUserProfile)) {
                return false;
            }
            WorkLocationInputPBUserProfile workLocationInputPBUserProfile = (WorkLocationInputPBUserProfile) obj;
            return this.b == workLocationInputPBUserProfile.b && Intrinsics.d(this.c, workLocationInputPBUserProfile.c);
        }

        public final int hashCode() {
            int i = (this.b ? 1231 : 1237) * 31;
            RecentPlaceAppModel recentPlaceAppModel = this.c;
            return i + (recentPlaceAppModel == null ? 0 : recentPlaceAppModel.hashCode());
        }

        public final String toString() {
            return "WorkLocationInputPBUserProfile(isSkipped=" + this.b + ", selectedPlace=" + this.c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/PBUserProfileSurveyInputState$WorkTimingInputPBUserProfile;", "Lapp/chalo/chalobususerprofile/ui/compose/PBUserProfileSurveyInputState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WorkTimingInputPBUserProfile extends PBUserProfileSurveyInputState {
        public final boolean b;
        public final Long c;
        public final TimingVariability d;
        public final Long e;
        public final TimingVariability f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WorkTimingInputPBUserProfile(boolean z, Long l, TimingVariability startVariability, Long l2, TimingVariability endVariability) {
            super(z);
            Intrinsics.i(startVariability, "startVariability");
            Intrinsics.i(endVariability, "endVariability");
            this.b = z;
            this.c = l;
            this.d = startVariability;
            this.e = l2;
            this.f = endVariability;
        }

        public static WorkTimingInputPBUserProfile b(WorkTimingInputPBUserProfile workTimingInputPBUserProfile, boolean z, Long l, TimingVariability timingVariability, Long l2, TimingVariability timingVariability2, int i) {
            if ((i & 1) != 0) {
                z = workTimingInputPBUserProfile.b;
            }
            boolean z2 = z;
            if ((i & 2) != 0) {
                l = workTimingInputPBUserProfile.c;
            }
            Long l3 = l;
            if ((i & 4) != 0) {
                timingVariability = workTimingInputPBUserProfile.d;
            }
            TimingVariability startVariability = timingVariability;
            if ((i & 8) != 0) {
                l2 = workTimingInputPBUserProfile.e;
            }
            Long l4 = l2;
            if ((i & 16) != 0) {
                timingVariability2 = workTimingInputPBUserProfile.f;
            }
            TimingVariability endVariability = timingVariability2;
            workTimingInputPBUserProfile.getClass();
            Intrinsics.i(startVariability, "startVariability");
            Intrinsics.i(endVariability, "endVariability");
            return new WorkTimingInputPBUserProfile(z2, l3, startVariability, l4, endVariability);
        }

        @Override // app.chalo.chalobususerprofile.ui.compose.PBUserProfileSurveyInputState
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF1231a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WorkTimingInputPBUserProfile)) {
                return false;
            }
            WorkTimingInputPBUserProfile workTimingInputPBUserProfile = (WorkTimingInputPBUserProfile) obj;
            return this.b == workTimingInputPBUserProfile.b && Intrinsics.d(this.c, workTimingInputPBUserProfile.c) && this.d == workTimingInputPBUserProfile.d && Intrinsics.d(this.e, workTimingInputPBUserProfile.e) && this.f == workTimingInputPBUserProfile.f;
        }

        public final int hashCode() {
            int i = (this.b ? 1231 : 1237) * 31;
            Long l = this.c;
            int iHashCode = (this.d.hashCode() + ((i + (l == null ? 0 : l.hashCode())) * 31)) * 31;
            Long l2 = this.e;
            return this.f.hashCode() + ((iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "WorkTimingInputPBUserProfile(isSkipped=" + this.b + ", startTimeMs=" + this.c + ", startVariability=" + this.d + ", endTimeMs=" + this.e + ", endVariability=" + this.f + ")";
        }
    }

    public PBUserProfileSurveyInputState(boolean z) {
        this.f1231a = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getF1231a() {
        return this.f1231a;
    }
}
