package app.chalo.premiumbus.domains;

import app.chalo.premiumbus.data.models.app.PremiumBusTripPollingResponseAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusTripStatus;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.providers.cityprovider.CityProvider;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domains/FetchPremiumBusBookingsTripDetailsUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchPremiumBusBookingsTripDetailsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f7265a;
    public final CityProvider b;

    public FetchPremiumBusBookingsTripDetailsUseCase(PremiumBusRepository premiumBusRepository, CityProvider cityProvider) {
        this.f7265a = premiumBusRepository;
        this.b = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        if (b(r6, r0) == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7, boolean r8) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof app.chalo.premiumbus.domains.FetchPremiumBusBookingsTripDetailsUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r7
            app.chalo.premiumbus.domains.FetchPremiumBusBookingsTripDetailsUseCase$invoke$1 r0 = (app.chalo.premiumbus.domains.FetchPremiumBusBookingsTripDetailsUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.premiumbus.domains.FetchPremiumBusBookingsTripDetailsUseCase$invoke$1 r0 = new app.chalo.premiumbus.domains.FetchPremiumBusBookingsTripDetailsUseCase$invoke$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.L$0
            java.util.List r6 = (java.util.List) r6
            kotlin.ResultKt.b(r7)     // Catch: app.chalo.premiumbus.data.exceptions.PBTripDetailsFetchFailedException -> L2e java.lang.Exception -> L64 app.chalo.network.exception.NetworkSuccessResponseParseException -> L6c app.chalo.network.exception.ChaloLocalException -> L74
            goto L5e
        L2e:
            r6 = move-exception
            goto L7c
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            boolean r8 = r0.Z$0
            kotlin.ResultKt.b(r7)     // Catch: app.chalo.premiumbus.data.exceptions.PBTripDetailsFetchFailedException -> L2e java.lang.Exception -> L64 app.chalo.network.exception.NetworkSuccessResponseParseException -> L6c app.chalo.network.exception.ChaloLocalException -> L74
            goto L4e
        L3e:
            kotlin.ResultKt.b(r7)
            app.chalo.premiumbus.data.repository.PremiumBusRepository r7 = r5.f7265a     // Catch: app.chalo.premiumbus.data.exceptions.PBTripDetailsFetchFailedException -> L2e java.lang.Exception -> L64 app.chalo.network.exception.NetworkSuccessResponseParseException -> L6c app.chalo.network.exception.ChaloLocalException -> L74
            r0.Z$0 = r8     // Catch: app.chalo.premiumbus.data.exceptions.PBTripDetailsFetchFailedException -> L2e java.lang.Exception -> L64 app.chalo.network.exception.NetworkSuccessResponseParseException -> L6c app.chalo.network.exception.ChaloLocalException -> L74
            r0.label = r4     // Catch: app.chalo.premiumbus.data.exceptions.PBTripDetailsFetchFailedException -> L2e java.lang.Exception -> L64 app.chalo.network.exception.NetworkSuccessResponseParseException -> L6c app.chalo.network.exception.ChaloLocalException -> L74
            java.io.Serializable r7 = r7.O(r6, r0)     // Catch: app.chalo.premiumbus.data.exceptions.PBTripDetailsFetchFailedException -> L2e java.lang.Exception -> L64 app.chalo.network.exception.NetworkSuccessResponseParseException -> L6c app.chalo.network.exception.ChaloLocalException -> L74
            if (r7 != r1) goto L4e
            goto L5d
        L4e:
            r6 = r7
            java.util.List r6 = (java.util.List) r6     // Catch: app.chalo.premiumbus.data.exceptions.PBTripDetailsFetchFailedException -> L2e java.lang.Exception -> L64 app.chalo.network.exception.NetworkSuccessResponseParseException -> L6c app.chalo.network.exception.ChaloLocalException -> L74
            if (r8 == 0) goto L5e
            r0.L$0 = r6     // Catch: app.chalo.premiumbus.data.exceptions.PBTripDetailsFetchFailedException -> L2e java.lang.Exception -> L64 app.chalo.network.exception.NetworkSuccessResponseParseException -> L6c app.chalo.network.exception.ChaloLocalException -> L74
            r0.label = r3     // Catch: app.chalo.premiumbus.data.exceptions.PBTripDetailsFetchFailedException -> L2e java.lang.Exception -> L64 app.chalo.network.exception.NetworkSuccessResponseParseException -> L6c app.chalo.network.exception.ChaloLocalException -> L74
            java.lang.Object r7 = r5.b(r6, r0)     // Catch: app.chalo.premiumbus.data.exceptions.PBTripDetailsFetchFailedException -> L2e java.lang.Exception -> L64 app.chalo.network.exception.NetworkSuccessResponseParseException -> L6c app.chalo.network.exception.ChaloLocalException -> L74
            if (r7 != r1) goto L5e
        L5d:
            return r1
        L5e:
            app.chalo.utils.ChaloUseCaseResult$Success r7 = new app.chalo.utils.ChaloUseCaseResult$Success     // Catch: app.chalo.premiumbus.data.exceptions.PBTripDetailsFetchFailedException -> L2e java.lang.Exception -> L64 app.chalo.network.exception.NetworkSuccessResponseParseException -> L6c app.chalo.network.exception.ChaloLocalException -> L74
            r7.<init>(r6)     // Catch: app.chalo.premiumbus.data.exceptions.PBTripDetailsFetchFailedException -> L2e java.lang.Exception -> L64 app.chalo.network.exception.NetworkSuccessResponseParseException -> L6c app.chalo.network.exception.ChaloLocalException -> L74
            return r7
        L64:
            app.chalo.utils.ChaloUseCaseResult$Failure r6 = new app.chalo.utils.ChaloUseCaseResult$Failure
            app.chalo.premiumbus.domains.PremiumBusTripDetailsError r7 = app.chalo.premiumbus.domains.PremiumBusTripDetailsError.UNKNOWN_ERROR
            r6.<init>(r7)
            goto La1
        L6c:
            app.chalo.utils.ChaloUseCaseResult$Failure r6 = new app.chalo.utils.ChaloUseCaseResult$Failure
            app.chalo.premiumbus.domains.PremiumBusTripDetailsError r7 = app.chalo.premiumbus.domains.PremiumBusTripDetailsError.PARSE_ERROR
            r6.<init>(r7)
            goto La1
        L74:
            app.chalo.utils.ChaloUseCaseResult$Failure r6 = new app.chalo.utils.ChaloUseCaseResult$Failure
            app.chalo.premiumbus.domains.PremiumBusTripDetailsError r7 = app.chalo.premiumbus.domains.PremiumBusTripDetailsError.LOCAL_ERROR
            r6.<init>(r7)
            goto La1
        L7c:
            app.chalo.network.model.GenericChaloErrorResponse r6 = r6.getGenericChaloErrorResponse()
            if (r6 == 0) goto L8a
            int r6 = r6.f6497a
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r6)
            goto L8b
        L8a:
            r7 = 0
        L8b:
            if (r7 != 0) goto L8e
            goto L99
        L8e:
            int r6 = r7.intValue()
            r7 = 1001(0x3e9, float:1.403E-42)
            if (r6 != r7) goto L99
            app.chalo.premiumbus.domains.PremiumBusTripDetailsError r6 = app.chalo.premiumbus.domains.PremiumBusTripDetailsError.BOOKING_NOT_EXIST
            goto L9b
        L99:
            app.chalo.premiumbus.domains.PremiumBusTripDetailsError r6 = app.chalo.premiumbus.domains.PremiumBusTripDetailsError.SERVER_ERROR
        L9b:
            app.chalo.utils.ChaloUseCaseResult$Failure r7 = new app.chalo.utils.ChaloUseCaseResult$Failure
            r7.<init>(r6)
            r6 = r7
        La1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.domains.FetchPremiumBusBookingsTripDetailsUseCase.a(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl, boolean):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(List list, ContinuationImpl continuationImpl) {
        FetchPremiumBusBookingsTripDetailsUseCase$updatePremiumTripStatus$1 fetchPremiumBusBookingsTripDetailsUseCase$updatePremiumTripStatus$1;
        Iterator it;
        if (continuationImpl instanceof FetchPremiumBusBookingsTripDetailsUseCase$updatePremiumTripStatus$1) {
            fetchPremiumBusBookingsTripDetailsUseCase$updatePremiumTripStatus$1 = (FetchPremiumBusBookingsTripDetailsUseCase$updatePremiumTripStatus$1) continuationImpl;
            int i = fetchPremiumBusBookingsTripDetailsUseCase$updatePremiumTripStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchPremiumBusBookingsTripDetailsUseCase$updatePremiumTripStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchPremiumBusBookingsTripDetailsUseCase$updatePremiumTripStatus$1 = new FetchPremiumBusBookingsTripDetailsUseCase$updatePremiumTripStatus$1(this, continuationImpl);
            }
        } else {
            fetchPremiumBusBookingsTripDetailsUseCase$updatePremiumTripStatus$1 = new FetchPremiumBusBookingsTripDetailsUseCase$updatePremiumTripStatus$1(this, continuationImpl);
        }
        Object obj = fetchPremiumBusBookingsTripDetailsUseCase$updatePremiumTripStatus$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchPremiumBusBookingsTripDetailsUseCase$updatePremiumTripStatus$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            it = list.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) fetchPremiumBusBookingsTripDetailsUseCase$updatePremiumTripStatus$1.L$0;
            ResultKt.b(obj);
        }
        while (it.hasNext()) {
            PremiumBusTripPollingResponseAppModel premiumBusTripPollingResponseAppModel = (PremiumBusTripPollingResponseAppModel) it.next();
            String str = premiumBusTripPollingResponseAppModel.f7107a;
            PremiumBusTripStatus premiumBusTripStatus = premiumBusTripPollingResponseAppModel.e;
            fetchPremiumBusBookingsTripDetailsUseCase$updatePremiumTripStatus$1.L$0 = it;
            fetchPremiumBusBookingsTripDetailsUseCase$updatePremiumTripStatus$1.label = 1;
            if (this.f7265a.h(str, premiumBusTripStatus, fetchPremiumBusBookingsTripDetailsUseCase$updatePremiumTripStatus$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.f17538a;
    }
}
