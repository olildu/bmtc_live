package app.chalo.livetracking.tripplanner.domain;

import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0005²\u0006\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/domain/ProcessTripPlannerItineraryForUiUseCase;", "", "", "scheduledStringFromFirstLeg", "firstModeFromStopName", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessTripPlannerItineraryForUiUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CurrencyFeature f4708a;
    public final TimeUtilsContract b;
    public final ProcessTripPlannerLegForUiUseCase c;

    public ProcessTripPlannerItineraryForUiUseCase(CurrencyFeature currencyFeature, TimeUtilsContract timeUtilsContract, ProcessTripPlannerLegForUiUseCase processTripPlannerLegForUiUseCase) {
        this.f4708a = currencyFeature;
        this.b = timeUtilsContract;
        this.c = processTripPlannerLegForUiUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x010d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0136 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0137  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0137 -> B:48:0x013c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel r32, java.lang.String r33, app.chalo.providers.stringprovider.StringEnum r34, app.chalo.providers.stringprovider.StringEnum r35, kotlin.coroutines.jvm.internal.ContinuationImpl r36) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.tripplanner.domain.ProcessTripPlannerItineraryForUiUseCase.a(app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel, java.lang.String, app.chalo.providers.stringprovider.StringEnum, app.chalo.providers.stringprovider.StringEnum, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
