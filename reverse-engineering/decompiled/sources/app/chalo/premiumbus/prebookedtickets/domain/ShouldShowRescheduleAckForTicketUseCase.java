package app.chalo.premiumbus.prebookedtickets.domain;

import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/domain/ShouldShowRescheduleAckForTicketUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShouldShowRescheduleAckForTicketUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f7321a;

    public ShouldShowRescheduleAckForTicketUseCase(PremiumBusRepository premiumBusRepository) {
        this.f7321a = premiumBusRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        if (r12 == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof app.chalo.premiumbus.prebookedtickets.domain.ShouldShowRescheduleAckForTicketUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r12
            app.chalo.premiumbus.prebookedtickets.domain.ShouldShowRescheduleAckForTicketUseCase$invoke$1 r0 = (app.chalo.premiumbus.prebookedtickets.domain.ShouldShowRescheduleAckForTicketUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.premiumbus.prebookedtickets.domain.ShouldShowRescheduleAckForTicketUseCase$invoke$1 r0 = new app.chalo.premiumbus.prebookedtickets.domain.ShouldShowRescheduleAckForTicketUseCase$invoke$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            java.lang.String r3 = "message"
            java.lang.String r4 = " bookingId: "
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L42
            if (r2 == r6) goto L3a
            if (r2 != r5) goto L32
            java.lang.Object r11 = r0.L$0
            app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel r11 = (app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel) r11
            kotlin.ResultKt.b(r12)
            goto L85
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            java.lang.Object r11 = r0.L$0
            app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel r11 = (app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel) r11
            kotlin.ResultKt.b(r12)
            goto L78
        L42:
            kotlin.ResultKt.b(r12)
            boolean r12 = r11.e()
            app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel r2 = r11.f7113a
            java.lang.String r7 = r2.f7114a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "isSystemRescheduled: "
            r8.<init>(r9)
            r8.append(r12)
            r8.append(r4)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            kotlin.jvm.internal.Intrinsics.i(r8, r3)
            if (r12 != 0) goto L69
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L69:
            java.lang.String r12 = r2.g
            r0.L$0 = r11
            r0.label = r6
            app.chalo.premiumbus.data.repository.PremiumBusRepository r2 = r10.f7321a
            app.chalo.premiumbus.data.repository.PremiumBusRepositoryImpl$getAckInfoForGivenBooking$$inlined$map$1 r12 = r2.r(r12, r7)
            if (r12 != r1) goto L78
            goto L84
        L78:
            kotlinx.coroutines.flow.Flow r12 = (kotlinx.coroutines.flow.Flow) r12
            r0.L$0 = r11
            r0.label = r5
            java.lang.Object r12 = kotlinx.coroutines.flow.FlowKt.v(r12, r0)
            if (r12 != r1) goto L85
        L84:
            return r1
        L85:
            app.chalo.premiumbus.data.models.app.PremiumReserveTicketAckAppModel r12 = (app.chalo.premiumbus.data.models.app.PremiumReserveTicketAckAppModel) r12
            app.chalo.premiumbus.data.models.app.PremiumReserveTicketBookingPropertiesAppModel r11 = r11.f7113a
            java.lang.String r11 = r11.f7114a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "bookingAckInfo: "
            r0.<init>(r1)
            r0.append(r12)
            r0.append(r4)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            kotlin.jvm.internal.Intrinsics.i(r11, r3)
            r11 = 0
            if (r12 == 0) goto Laa
            boolean r12 = r12.f
            if (r12 != 0) goto Laa
            goto Lab
        Laa:
            r6 = r11
        Lab:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r6)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.domain.ShouldShowRescheduleAckForTicketUseCase.a(app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
