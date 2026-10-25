package app.chalo.livetracking.tripplanner.domain;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/livetracking/tripplanner/domain/MakeTripPlannerCallFailureReason;", "", "LocalError", "ServerError", "ParsingError", "UnknownError", "Lapp/chalo/livetracking/tripplanner/domain/MakeTripPlannerCallFailureReason$LocalError;", "Lapp/chalo/livetracking/tripplanner/domain/MakeTripPlannerCallFailureReason$ParsingError;", "Lapp/chalo/livetracking/tripplanner/domain/MakeTripPlannerCallFailureReason$ServerError;", "Lapp/chalo/livetracking/tripplanner/domain/MakeTripPlannerCallFailureReason$UnknownError;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MakeTripPlannerCallFailureReason {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/domain/MakeTripPlannerCallFailureReason$LocalError;", "Lapp/chalo/livetracking/tripplanner/domain/MakeTripPlannerCallFailureReason;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocalError extends MakeTripPlannerCallFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LocalError f4703a = new LocalError();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/domain/MakeTripPlannerCallFailureReason$ParsingError;", "Lapp/chalo/livetracking/tripplanner/domain/MakeTripPlannerCallFailureReason;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ParsingError extends MakeTripPlannerCallFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ParsingError f4704a = new ParsingError();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/domain/MakeTripPlannerCallFailureReason$ServerError;", "Lapp/chalo/livetracking/tripplanner/domain/MakeTripPlannerCallFailureReason;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ServerError extends MakeTripPlannerCallFailureReason {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ServerError);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ServerError(msg=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/domain/MakeTripPlannerCallFailureReason$UnknownError;", "Lapp/chalo/livetracking/tripplanner/domain/MakeTripPlannerCallFailureReason;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UnknownError extends MakeTripPlannerCallFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UnknownError f4705a = new UnknownError();
    }

    public final String a() {
        if (equals(LocalError.f4703a)) {
            return "LocalError";
        }
        if (equals(ParsingError.f4704a)) {
            return "ParsingError";
        }
        if (this instanceof ServerError) {
            return "ServerError";
        }
        if (equals(UnknownError.f4705a)) {
            return "UnknownError";
        }
        throw new NoWhenBranchMatchedException();
    }
}
