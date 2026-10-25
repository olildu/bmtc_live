package app.chalo.home.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.home.data.repository.TicketRepository;
import app.chalo.models.mticketing.MTicketUtilsHelper;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.usecase.GetProductConfigFromProductIdUseCase;
import app.chalo.usecase.GetValidationProcessFlowDetailsForValidationProductUseCase;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/RunPreActivationChecksUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RunPreActivationChecksUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetValidationProcessFlowDetailsForValidationProductUseCase f3077a;
    public final BasicInfoContract b;
    public final MTicketUtilsHelper c;
    public final CoroutineContextProvider d;
    public final TicketRepository e;
    public final GetProductConfigFromProductIdUseCase f;

    public RunPreActivationChecksUseCase(GetValidationProcessFlowDetailsForValidationProductUseCase getValidationProcessFlowDetailsForValidationProductUseCase, BasicInfoContract basicInfoContract, MTicketUtilsHelper mTicketUtilsHelper, CoroutineContextProvider coroutineContextProvider, TicketRepository ticketRepository, GetProductConfigFromProductIdUseCase getProductConfigFromProductIdUseCase) {
        this.f3077a = getValidationProcessFlowDetailsForValidationProductUseCase;
        this.b = basicInfoContract;
        this.c = mTicketUtilsHelper;
        this.d = coroutineContextProvider;
        this.e = ticketRepository;
        this.f = getProductConfigFromProductIdUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    /* JADX WARN: Code duplicated, block: B:36:0x009b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6 A[PHI: r11 r12
      0x00a6: PHI (r11v6 app.chalo.superpass.data.models.entities.MagicSuperPass) = 
      (r11v3 app.chalo.superpass.data.models.entities.MagicSuperPass)
      (r11v15 app.chalo.superpass.data.models.entities.MagicSuperPass)
     binds: [B:37:0x00a3, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r12v14 java.lang.Object) = (r12v11 java.lang.Object), (r12v1 java.lang.Object) binds: [B:37:0x00a3, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
    
        if (r12 == r1) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.superpass.data.models.entities.MagicSuperPass r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.domain.RunPreActivationChecksUseCase.a(app.chalo.superpass.data.models.entities.MagicSuperPass, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca A[PHI: r2 r5 r9 r10
      0x00ca: PHI (r2v6 app.chalo.superpass.data.models.entities.RideBasedSuperPassValidationProperties) = 
      (r2v5 app.chalo.superpass.data.models.entities.RideBasedSuperPassValidationProperties)
      (r2v8 app.chalo.superpass.data.models.entities.RideBasedSuperPassValidationProperties)
     binds: [B:33:0x00c6, B:17:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x00ca: PHI (r5v4 app.chalo.superpass.data.models.entities.RideBasedSuperPass) = 
      (r5v2 app.chalo.superpass.data.models.entities.RideBasedSuperPass)
      (r5v6 app.chalo.superpass.data.models.entities.RideBasedSuperPass)
     binds: [B:33:0x00c6, B:17:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x00ca: PHI (r9v10 java.lang.String) = (r9v6 java.lang.String), (r9v13 java.lang.String) binds: [B:33:0x00c6, B:17:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x00ca: PHI (r10v13 java.lang.Object) = (r10v11 java.lang.Object), (r10v1 java.lang.Object) binds: [B:33:0x00c6, B:17:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:46:0x010e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0114  */
    /* JADX WARN: Code duplicated, block: B:50:0x011c  */
    /* JADX WARN: Code duplicated, block: B:53:0x012a  */
    /* JADX WARN: Code duplicated, block: B:57:0x013f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0148  */
    /* JADX WARN: Code duplicated, block: B:62:0x0150  */
    /* JADX WARN: Code duplicated, block: B:65:0x0158 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f9, code lost:
    
        if (r10 == r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016c, code lost:
    
        if (r10 == r1) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(app.chalo.superpass.data.models.entities.RideBasedSuperPass r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.domain.RunPreActivationChecksUseCase.b(app.chalo.superpass.data.models.entities.RideBasedSuperPass, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r9 == r1) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(app.chalo.home.domain.ChaloUserBookingType r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.domain.RunPreActivationChecksUseCase.c(app.chalo.home.domain.ChaloUserBookingType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
