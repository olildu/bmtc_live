package app.chalo.usecase;

import app.chalo.ridefeedbacktracker.RideFeedbackTracker;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/usecase/GetRideFeedbackDataUseCase;", "", "ChaloFeedbackConfigFailureReason", "FeedbackFilter", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetRideFeedbackDataUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloFeedbackConfigDataUseCase f10191a;
    public final RideFeedbackTracker b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/usecase/GetRideFeedbackDataUseCase$ChaloFeedbackConfigFailureReason;", "", "<init>", "(Ljava/lang/String;I)V", "FEEDBACK_ALREADY_TAKEN", "CONFIG_NOT_AVAILABLE", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum ChaloFeedbackConfigFailureReason {
        FEEDBACK_ALREADY_TAKEN,
        CONFIG_NOT_AVAILABLE;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        public static EnumEntries<ChaloFeedbackConfigFailureReason> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/usecase/GetRideFeedbackDataUseCase$FeedbackFilter;", "", "<init>", "(Ljava/lang/String;I)V", "CONDUCTOR_VALIDATION", "TITO_RIDE", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum FeedbackFilter {
        CONDUCTOR_VALIDATION,
        TITO_RIDE;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        public static EnumEntries<FeedbackFilter> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10192a;

        static {
            int[] iArr = new int[FeedbackFilter.values().length];
            try {
                iArr[FeedbackFilter.TITO_RIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FeedbackFilter.CONDUCTOR_VALIDATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10192a = iArr;
        }
    }

    public GetRideFeedbackDataUseCase(ChaloFeedbackConfigDataUseCase chaloFeedbackConfigDataUseCase, RideFeedbackTracker rideFeedbackTracker) {
        this.f10191a = chaloFeedbackConfigDataUseCase;
        this.b = rideFeedbackTracker;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(FeedbackFilter feedbackFilter, ContinuationImpl continuationImpl) {
        GetRideFeedbackDataUseCase$invoke$1 getRideFeedbackDataUseCase$invoke$1;
        FeedbackConfig feedbackConfig;
        if (continuationImpl instanceof GetRideFeedbackDataUseCase$invoke$1) {
            getRideFeedbackDataUseCase$invoke$1 = (GetRideFeedbackDataUseCase$invoke$1) continuationImpl;
            int i = getRideFeedbackDataUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRideFeedbackDataUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getRideFeedbackDataUseCase$invoke$1 = new GetRideFeedbackDataUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getRideFeedbackDataUseCase$invoke$1 = new GetRideFeedbackDataUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = getRideFeedbackDataUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getRideFeedbackDataUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            getRideFeedbackDataUseCase$invoke$1.L$0 = feedbackFilter;
            getRideFeedbackDataUseCase$invoke$1.label = 1;
            objA = this.f10191a.a(getRideFeedbackDataUseCase$invoke$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            feedbackFilter = (FeedbackFilter) getRideFeedbackDataUseCase$invoke$1.L$0;
            ResultKt.b(objA);
        }
        FeedbackConfigDataForCity feedbackConfigDataForCity = (FeedbackConfigDataForCity) objA;
        int i3 = WhenMappings.f10192a[feedbackFilter.ordinal()];
        if (i3 == 1) {
            feedbackConfig = feedbackConfigDataForCity.b;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            feedbackConfig = feedbackConfigDataForCity.c;
        }
        return feedbackConfig == null ? new ChaloUseCaseResult.Failure(ChaloFeedbackConfigFailureReason.CONFIG_NOT_AVAILABLE) : new ChaloUseCaseResult.Success(new FeedbackDataAppModel(feedbackConfig.f10165a, feedbackConfig.b));
    }
}
