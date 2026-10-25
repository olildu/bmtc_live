package app.chalo.chalobususerprofile.ui.compose;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/PBUserProfileSurveyStepNavigator;", "", "Finish", "Result", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PBUserProfileSurveyStepNavigator {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/PBUserProfileSurveyStepNavigator$Finish;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "CLOSE_FLOW", "SHOW_SUCCESS", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum Finish {
        NONE,
        CLOSE_FLOW,
        SHOW_SUCCESS;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        public static EnumEntries<Finish> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/PBUserProfileSurveyStepNavigator$Result;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f1232a;
        public final int b;
        public final Finish c;

        public Result(List updatedSequence, int i, Finish finish) {
            Intrinsics.i(updatedSequence, "updatedSequence");
            Intrinsics.i(finish, "finish");
            this.f1232a = updatedSequence;
            this.b = i;
            this.c = finish;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return false;
            }
            Result result = (Result) obj;
            return Intrinsics.d(this.f1232a, result.f1232a) && this.b == result.b && this.c == result.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + (((this.f1232a.hashCode() * 31) + this.b) * 31);
        }

        public final String toString() {
            return "Result(updatedSequence=" + this.f1232a + ", newIndex=" + this.b + ", finish=" + this.c + ")";
        }
    }

    public static Finish a(List list) {
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (!((PBUserProfileSurveyInputState) it.next()).getF1231a()) {
                    return Finish.SHOW_SUCCESS;
                }
            }
        }
        return Finish.CLOSE_FLOW;
    }

    public static PBUserProfileSurveyInputState b(PBUserProfileSurveyInputState pBUserProfileSurveyInputState, boolean z) {
        if (pBUserProfileSurveyInputState instanceof PBUserProfileSurveyInputState.HomeLocationInputPBUserProfile) {
            return new PBUserProfileSurveyInputState.HomeLocationInputPBUserProfile(z, ((PBUserProfileSurveyInputState.HomeLocationInputPBUserProfile) pBUserProfileSurveyInputState).c);
        }
        if (pBUserProfileSurveyInputState instanceof PBUserProfileSurveyInputState.WorkLocationInputPBUserProfile) {
            return new PBUserProfileSurveyInputState.WorkLocationInputPBUserProfile(z, ((PBUserProfileSurveyInputState.WorkLocationInputPBUserProfile) pBUserProfileSurveyInputState).c);
        }
        if (pBUserProfileSurveyInputState instanceof PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile) {
            return PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile.b((PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile) pBUserProfileSurveyInputState, z, null, null, null, null, 30);
        }
        if (pBUserProfileSurveyInputState instanceof PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile) {
            return new PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile(z, ((PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile) pBUserProfileSurveyInputState).c);
        }
        throw new NoWhenBranchMatchedException();
    }
}
