package app.chalo.premiumbus.prebookedtickets.domain;

import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.providers.UserProfileDetailsProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/domain/AcknowledgePremiumReserveTicketCancellationUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AcknowledgePremiumReserveTicketCancellationUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f7293a;
    public final UserProfileDetailsProvider b;

    public AcknowledgePremiumReserveTicketCancellationUseCase(PremiumBusRepository premiumBusRepository, UserProfileDetailsProvider userProfileDetailsProvider) {
        this.f7293a = premiumBusRepository;
        this.b = userProfileDetailsProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (r8.f(r7, r9, r2, r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, app.chalo.premiumbus.data.models.entity.PremiumReserveTicketAckType r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof app.chalo.premiumbus.prebookedtickets.domain.AcknowledgePremiumReserveTicketCancellationUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r9
            app.chalo.premiumbus.prebookedtickets.domain.AcknowledgePremiumReserveTicketCancellationUseCase$invoke$1 r0 = (app.chalo.premiumbus.prebookedtickets.domain.AcknowledgePremiumReserveTicketCancellationUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.premiumbus.prebookedtickets.domain.AcknowledgePremiumReserveTicketCancellationUseCase$invoke$1 r0 = new app.chalo.premiumbus.prebookedtickets.domain.AcknowledgePremiumReserveTicketCancellationUseCase$invoke$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r9)
            goto L72
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.L$2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.L$1
            app.chalo.premiumbus.data.repository.PremiumBusRepository r8 = (app.chalo.premiumbus.data.repository.PremiumBusRepository) r8
            java.lang.Object r2 = r0.L$0
            app.chalo.premiumbus.data.models.entity.PremiumReserveTicketAckType r2 = (app.chalo.premiumbus.data.models.entity.PremiumReserveTicketAckType) r2
            kotlin.ResultKt.b(r9)
            goto L5c
        L42:
            kotlin.ResultKt.b(r9)
            r0.L$0 = r8
            app.chalo.premiumbus.data.repository.PremiumBusRepository r9 = r6.f7293a
            r0.L$1 = r9
            r0.L$2 = r7
            r0.label = r4
            app.chalo.providers.UserProfileDetailsProvider r2 = r6.b
            java.lang.Object r2 = r2.k(r0)
            if (r2 != r1) goto L58
            goto L71
        L58:
            r5 = r2
            r2 = r8
            r8 = r9
            r9 = r5
        L5c:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L62
            java.lang.String r9 = ""
        L62:
            r4 = 0
            r0.L$0 = r4
            r0.L$1 = r4
            r0.L$2 = r4
            r0.label = r3
            java.lang.Object r7 = r8.f(r7, r9, r2, r0)
            if (r7 != r1) goto L72
        L71:
            return r1
        L72:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.prebookedtickets.domain.AcknowledgePremiumReserveTicketCancellationUseCase.a(java.lang.String, app.chalo.premiumbus.data.models.entity.PremiumReserveTicketAckType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
