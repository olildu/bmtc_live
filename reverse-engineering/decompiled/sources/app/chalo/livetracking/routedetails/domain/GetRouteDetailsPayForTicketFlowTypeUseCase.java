package app.chalo.livetracking.routedetails.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.ProductBookingHelper;
import app.chalo.domain.GetInstantTicketFeatureConfigUseCase;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/domain/GetRouteDetailsPayForTicketFlowTypeUseCase;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetRouteDetailsPayForTicketFlowTypeUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetInstantTicketFeatureConfigUseCase f4436a;
    public final GetWalletSetupConfigurationUseCase b;
    public final BasicInfoContract c;
    public final ProductBookingHelper d;

    public GetRouteDetailsPayForTicketFlowTypeUseCase(GetInstantTicketFeatureConfigUseCase getInstantTicketFeatureConfigUseCase, GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase, BasicInfoContract basicInfoContract, ProductBookingHelper productBookingHelper) {
        this.f4436a = getInstantTicketFeatureConfigUseCase;
        this.b = getWalletSetupConfigurationUseCase;
        this.c = basicInfoContract;
        this.d = productBookingHelper;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if (r8 == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum a(boolean r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof app.chalo.livetracking.routedetails.domain.GetRouteDetailsPayForTicketFlowTypeUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.livetracking.routedetails.domain.GetRouteDetailsPayForTicketFlowTypeUseCase$invoke$1 r0 = (app.chalo.livetracking.routedetails.domain.GetRouteDetailsPayForTicketFlowTypeUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.livetracking.routedetails.domain.GetRouteDetailsPayForTicketFlowTypeUseCase$invoke$1 r0 = new app.chalo.livetracking.routedetails.domain.GetRouteDetailsPayForTicketFlowTypeUseCase$invoke$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            boolean r7 = r0.Z$0
            kotlin.ResultKt.b(r8)
            goto L89
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            boolean r7 = r0.Z$0
            kotlin.ResultKt.b(r8)
            goto L6b
        L3d:
            boolean r7 = r0.Z$0
            kotlin.ResultKt.b(r8)
            goto L53
        L43:
            kotlin.ResultKt.b(r8)
            r0.Z$0 = r7
            r0.label = r5
            app.chalo.contract.ProductBookingHelper r8 = r6.d
            java.lang.Boolean r8 = r8.c()
            if (r8 != r1) goto L53
            goto L88
        L53:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L5e
            app.chalo.livetracking.routedetails.domain.PayForTicketFlowType r7 = app.chalo.livetracking.routedetails.domain.PayForTicketFlowType.ONDC_TICKET
            return r7
        L5e:
            r0.Z$0 = r7
            r0.label = r4
            app.chalo.domain.GetInstantTicketFeatureConfigUseCase r8 = r6.f4436a
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L6b
            goto L88
        L6b:
            app.chalo.data.InstantTicketFeatureConfigForCity r8 = (app.chalo.data.InstantTicketFeatureConfigForCity) r8
            app.chalo.contract.BasicInfoContract r2 = r6.c
            int r2 = r2.h()
            boolean r8 = r8.a(r2)
            if (r8 == 0) goto L7c
            app.chalo.livetracking.routedetails.domain.PayForTicketFlowType r7 = app.chalo.livetracking.routedetails.domain.PayForTicketFlowType.INSTANT_TICKET
            return r7
        L7c:
            r0.Z$0 = r7
            r0.label = r3
            app.chalo.domain.GetWalletSetupConfigurationUseCase r8 = r6.b
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L89
        L88:
            return r1
        L89:
            app.chalo.data.WalletSetupConfiguration r8 = (app.chalo.data.WalletSetupConfiguration) r8
            boolean r0 = r8.b()
            if (r0 == 0) goto L98
            boolean r8 = r8.a()
            if (r8 == 0) goto L98
            goto L99
        L98:
            r5 = 0
        L99:
            if (r5 == 0) goto La0
            if (r7 == 0) goto La0
            app.chalo.livetracking.routedetails.domain.PayForTicketFlowType r7 = app.chalo.livetracking.routedetails.domain.PayForTicketFlowType.PAY_FOR_TICKET
            return r7
        La0:
            if (r5 != 0) goto La7
            if (r7 == 0) goto La7
            app.chalo.livetracking.routedetails.domain.PayForTicketFlowType r7 = app.chalo.livetracking.routedetails.domain.PayForTicketFlowType.M_TICKET_TRIP_INFO
            return r7
        La7:
            if (r5 == 0) goto Lac
            app.chalo.livetracking.routedetails.domain.PayForTicketFlowType r7 = app.chalo.livetracking.routedetails.domain.PayForTicketFlowType.QUICK_PAY
            return r7
        Lac:
            app.chalo.livetracking.routedetails.domain.PayForTicketFlowType r7 = app.chalo.livetracking.routedetails.domain.PayForTicketFlowType.PRODUCT_SELECTION
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.routedetails.domain.GetRouteDetailsPayForTicketFlowTypeUseCase.a(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Enum");
    }
}
