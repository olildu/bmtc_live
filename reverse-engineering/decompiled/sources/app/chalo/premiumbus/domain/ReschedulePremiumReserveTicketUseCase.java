package app.chalo.premiumbus.domain;

import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/premiumbus/domain/ReschedulePremiumReserveTicketUseCase;", "", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReschedulePremiumReserveTicketUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f7242a;
    public final FetchPremiumReserveTicketAndStoreLocallyUseCase b;
    public int c = 1;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/premiumbus/domain/ReschedulePremiumReserveTicketUseCase$Companion;", "", "", "MAX_HISTORY_CALL_ATTEMPTS", "I", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ReschedulePremiumReserveTicketUseCase(PremiumBusRepository premiumBusRepository, FetchPremiumReserveTicketAndStoreLocallyUseCase fetchPremiumReserveTicketAndStoreLocallyUseCase) {
        this.f7242a = premiumBusRepository;
        this.b = fetchPremiumReserveTicketAndStoreLocallyUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r0 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r13, java.lang.String r14, java.lang.String r15, app.chalo.data.PremiumBusProductModificationReasonAppModel r16, java.util.List r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            r12 = this;
            r0 = r18
            boolean r1 = r0 instanceof app.chalo.premiumbus.domain.ReschedulePremiumReserveTicketUseCase$invoke$1
            if (r1 == 0) goto L16
            r1 = r0
            app.chalo.premiumbus.domain.ReschedulePremiumReserveTicketUseCase$invoke$1 r1 = (app.chalo.premiumbus.domain.ReschedulePremiumReserveTicketUseCase$invoke$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.label = r2
        L14:
            r8 = r1
            goto L1c
        L16:
            app.chalo.premiumbus.domain.ReschedulePremiumReserveTicketUseCase$invoke$1 r1 = new app.chalo.premiumbus.domain.ReschedulePremiumReserveTicketUseCase$invoke$1
            r1.<init>(r12, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r8.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r8.label
            app.chalo.premiumbus.domain.ReschedulePremiumReserveTicketResult$ParsingError r9 = app.chalo.premiumbus.domain.ReschedulePremiumReserveTicketResult.ParsingError.f7237a
            r10 = 2
            r11 = 1
            if (r2 == 0) goto L3f
            if (r2 == r11) goto L3b
            if (r2 != r10) goto L33
            kotlin.ResultKt.b(r0)     // Catch: app.chalo.premiumbus.data.exceptions.PBUserRescheduleFailedException -> L30 java.lang.Exception -> L66 app.chalo.network.exception.ChaloLocalException -> L69 java.lang.Throwable -> L75
            goto L63
        L30:
            r0 = move-exception
            r13 = r0
            goto L6c
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3b:
            kotlin.ResultKt.b(r0)     // Catch: app.chalo.premiumbus.data.exceptions.PBUserRescheduleFailedException -> L30 java.lang.Exception -> L66 app.chalo.network.exception.ChaloLocalException -> L69 java.lang.Throwable -> L75 java.lang.Throwable -> L75
            goto L54
        L3f:
            kotlin.ResultKt.b(r0)
            app.chalo.premiumbus.data.repository.PremiumBusRepository r2 = r12.f7242a     // Catch: app.chalo.premiumbus.data.exceptions.PBUserRescheduleFailedException -> L30 java.lang.Exception -> L66 app.chalo.network.exception.ChaloLocalException -> L69 java.lang.Throwable -> L75 java.lang.Throwable -> L75
            r8.label = r11     // Catch: app.chalo.premiumbus.data.exceptions.PBUserRescheduleFailedException -> L30 java.lang.Exception -> L66 app.chalo.network.exception.ChaloLocalException -> L69 java.lang.Throwable -> L75 java.lang.Throwable -> L75
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            java.lang.Object r0 = r2.P(r3, r4, r5, r6, r7, r8)     // Catch: app.chalo.premiumbus.data.exceptions.PBUserRescheduleFailedException -> L30 java.lang.Exception -> L66 app.chalo.network.exception.ChaloLocalException -> L69 java.lang.Throwable -> L75 java.lang.Throwable -> L75
            if (r0 != r1) goto L54
            goto L62
        L54:
            app.chalo.premiumbus.data.models.app.PBRescheduleResponseAppModel r0 = (app.chalo.premiumbus.data.models.app.PBRescheduleResponseAppModel) r0     // Catch: app.chalo.premiumbus.data.exceptions.PBUserRescheduleFailedException -> L30 java.lang.Exception -> L66 app.chalo.network.exception.ChaloLocalException -> L69 java.lang.Throwable -> L75 java.lang.Throwable -> L75
            r12.c = r11     // Catch: app.chalo.premiumbus.data.exceptions.PBUserRescheduleFailedException -> L30 java.lang.Exception -> L66 app.chalo.network.exception.ChaloLocalException -> L69 java.lang.Throwable -> L75 java.lang.Throwable -> L75
            java.lang.String r13 = r0.f7093a     // Catch: app.chalo.premiumbus.data.exceptions.PBUserRescheduleFailedException -> L30 java.lang.Exception -> L66 app.chalo.network.exception.ChaloLocalException -> L69 java.lang.Throwable -> L75 java.lang.Throwable -> L75
            r8.label = r10     // Catch: app.chalo.premiumbus.data.exceptions.PBUserRescheduleFailedException -> L30 java.lang.Exception -> L66 app.chalo.network.exception.ChaloLocalException -> L69 java.lang.Throwable -> L75 java.lang.Throwable -> L75
            java.lang.Object r0 = r12.b(r13, r8)     // Catch: app.chalo.premiumbus.data.exceptions.PBUserRescheduleFailedException -> L30 java.lang.Exception -> L66 app.chalo.network.exception.ChaloLocalException -> L69 java.lang.Throwable -> L75 java.lang.Throwable -> L75
            if (r0 != r1) goto L63
        L62:
            return r1
        L63:
            app.chalo.premiumbus.domain.ReschedulePremiumReserveTicketResult r0 = (app.chalo.premiumbus.domain.ReschedulePremiumReserveTicketResult) r0     // Catch: app.chalo.premiumbus.data.exceptions.PBUserRescheduleFailedException -> L30 java.lang.Exception -> L66 app.chalo.network.exception.ChaloLocalException -> L69 java.lang.Throwable -> L75 java.lang.Throwable -> L75
            return r0
        L66:
            app.chalo.premiumbus.domain.ReschedulePremiumReserveTicketResult$UnknownError r9 = app.chalo.premiumbus.domain.ReschedulePremiumReserveTicketResult.UnknownError.f7241a
            goto L75
        L69:
            app.chalo.premiumbus.domain.ReschedulePremiumReserveTicketResult$LocalError r9 = app.chalo.premiumbus.domain.ReschedulePremiumReserveTicketResult.LocalError.f7236a
            goto L75
        L6c:
            app.chalo.premiumbus.domain.ReschedulePremiumReserveTicketResult$ServerError r9 = new app.chalo.premiumbus.domain.ReschedulePremiumReserveTicketResult$ServerError
            java.lang.String r13 = r13.getMessage()
            r9.<init>(r13)
        L75:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.domain.ReschedulePremiumReserveTicketUseCase.a(java.lang.String, java.lang.String, java.lang.String, app.chalo.data.PremiumBusProductModificationReasonAppModel, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        ReschedulePremiumReserveTicketUseCase$makeHistoryCall$1 reschedulePremiumReserveTicketUseCase$makeHistoryCall$1;
        if (continuationImpl instanceof ReschedulePremiumReserveTicketUseCase$makeHistoryCall$1) {
            reschedulePremiumReserveTicketUseCase$makeHistoryCall$1 = (ReschedulePremiumReserveTicketUseCase$makeHistoryCall$1) continuationImpl;
            int i = reschedulePremiumReserveTicketUseCase$makeHistoryCall$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reschedulePremiumReserveTicketUseCase$makeHistoryCall$1.label = i - Integer.MIN_VALUE;
            } else {
                reschedulePremiumReserveTicketUseCase$makeHistoryCall$1 = new ReschedulePremiumReserveTicketUseCase$makeHistoryCall$1(this, continuationImpl);
            }
        } else {
            reschedulePremiumReserveTicketUseCase$makeHistoryCall$1 = new ReschedulePremiumReserveTicketUseCase$makeHistoryCall$1(this, continuationImpl);
        }
        Object objA = reschedulePremiumReserveTicketUseCase$makeHistoryCall$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reschedulePremiumReserveTicketUseCase$makeHistoryCall$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            if (this.c > 3) {
                return ReschedulePremiumReserveTicketResult.TicketSyncFailedError.f7240a;
            }
            reschedulePremiumReserveTicketUseCase$makeHistoryCall$1.L$0 = str;
            reschedulePremiumReserveTicketUseCase$makeHistoryCall$1.label = 1;
            objA = this.b.a(str, reschedulePremiumReserveTicketUseCase$makeHistoryCall$1);
            if (objA != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
            return objA;
        }
        str = (String) reschedulePremiumReserveTicketUseCase$makeHistoryCall$1.L$0;
        ResultKt.b(objA);
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            return new ReschedulePremiumReserveTicketResult.Success(str);
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        this.c++;
        reschedulePremiumReserveTicketUseCase$makeHistoryCall$1.L$0 = null;
        reschedulePremiumReserveTicketUseCase$makeHistoryCall$1.label = 2;
        Object objB = b(str, reschedulePremiumReserveTicketUseCase$makeHistoryCall$1);
        return objB == obj ? obj : objB;
    }
}
