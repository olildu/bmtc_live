package app.chalo.helper;

import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.home.data.repository.TicketRepository;
import app.chalo.models.LastRideInfo;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/helper/FeedbackFeatureImpl;", "Lapp/chalo/helper/FeedbackFeature;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FeedbackFeatureImpl implements FeedbackFeature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TicketRepository f2834a;
    public final CrashlyticsLogger b;
    public final CityProvider c;

    public FeedbackFeatureImpl(TicketRepository ticketRepository, CrashlyticsLogger crashlyticsLogger, CityProvider cityProvider) {
        this.f2834a = ticketRepository;
        this.b = crashlyticsLogger;
        this.c = cityProvider;
    }

    @Override // app.chalo.helper.FeedbackFeature
    public final Object a(ContinuationImpl continuationImpl) {
        String lowerCase;
        String strB = CityProviderKt.b(this.c);
        if (strB != null) {
            lowerCase = strB.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = "";
        }
        return this.f2834a.e(lowerCase, continuationImpl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.helper.FeedbackFeature
    public final Object b(LastRideInfo lastRideInfo, ContinuationImpl continuationImpl) {
        FeedbackFeatureImpl$storeLastRideInfo$1 feedbackFeatureImpl$storeLastRideInfo$1;
        String lowerCase;
        if (continuationImpl instanceof FeedbackFeatureImpl$storeLastRideInfo$1) {
            feedbackFeatureImpl$storeLastRideInfo$1 = (FeedbackFeatureImpl$storeLastRideInfo$1) continuationImpl;
            int i = feedbackFeatureImpl$storeLastRideInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                feedbackFeatureImpl$storeLastRideInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                feedbackFeatureImpl$storeLastRideInfo$1 = new FeedbackFeatureImpl$storeLastRideInfo$1(this, continuationImpl);
            }
        } else {
            feedbackFeatureImpl$storeLastRideInfo$1 = new FeedbackFeatureImpl$storeLastRideInfo$1(this, continuationImpl);
        }
        Object obj = feedbackFeatureImpl$storeLastRideInfo$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = feedbackFeatureImpl$storeLastRideInfo$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                if (lastRideInfo != null) {
                    String strB = CityProviderKt.b(this.c);
                    if (strB != null) {
                        lowerCase = strB.toLowerCase(Locale.ROOT);
                        Intrinsics.h(lowerCase, "toLowerCase(...)");
                    } else {
                        lowerCase = "";
                    }
                    TicketRepository ticketRepository = this.f2834a;
                    feedbackFeatureImpl$storeLastRideInfo$1.label = 1;
                    if (ticketRepository.b(lowerCase, lastRideInfo, feedbackFeatureImpl$storeLastRideInfo$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
        } catch (Exception e) {
            this.b.i(e);
        }
        return Unit.f17538a;
    }
}
