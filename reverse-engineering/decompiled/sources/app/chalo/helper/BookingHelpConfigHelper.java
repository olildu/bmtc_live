package app.chalo.helper;

import app.chalo.domain.GetBookingHelpFaqsUseCase;
import app.chalo.domain.GetProductCapabilitiesUseCase;
import app.chalo.scenes.args.BookingCancellationTarget;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/helper/BookingHelpConfigHelper;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BookingHelpConfigHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetProductCapabilitiesUseCase f2826a;
    public final GetBookingHelpFaqsUseCase b;

    public BookingHelpConfigHelper(GetProductCapabilitiesUseCase getProductCapabilitiesUseCase, GetBookingHelpFaqsUseCase getBookingHelpFaqsUseCase) {
        this.f2826a = getProductCapabilitiesUseCase;
        this.b = getBookingHelpFaqsUseCase;
    }

    public static BookingCancellationTarget b(String productType, String productSubType, String bookingId, boolean z) {
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(bookingId, "bookingId");
        if (z) {
            return null;
        }
        return (productType.equals("mobileTicket") && productSubType.equals("ondcMetroTicket")) ? new BookingCancellationTarget.Ondc(bookingId) : new BookingCancellationTarget.DirectMetro(bookingId);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        if (r10 == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, java.lang.String r8, java.lang.String r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10, boolean r11) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof app.chalo.helper.BookingHelpConfigHelper$getBookingHelpAvailability$1
            if (r0 == 0) goto L13
            r0 = r10
            app.chalo.helper.BookingHelpConfigHelper$getBookingHelpAvailability$1 r0 = (app.chalo.helper.BookingHelpConfigHelper$getBookingHelpAvailability$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.helper.BookingHelpConfigHelper$getBookingHelpAvailability$1 r0 = new app.chalo.helper.BookingHelpConfigHelper$getBookingHelpAvailability$1
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r10)     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L8d
            goto L61
        L2b:
            r7 = move-exception
            goto L8e
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.ResultKt.b(r10)     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L8d
            goto L4a
        L39:
            kotlin.ResultKt.b(r10)
            if (r11 == 0) goto L3f
            goto L8d
        L3f:
            app.chalo.domain.GetProductCapabilitiesUseCase r10 = r6.f2826a     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L8d
            r0.label = r4     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L8d
            java.lang.Object r10 = r10.a(r7, r8, r9, r0)     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L8d
            if (r10 != r1) goto L4a
            goto L60
        L4a:
            app.chalo.models.productbooking.productcapability.ProductCapabilityAppModel r10 = (app.chalo.models.productbooking.productcapability.ProductCapabilityAppModel) r10     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L8d
            app.chalo.models.productbooking.productcapability.BookingSupportAppModel r7 = r10.b     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L8d
            if (r7 == 0) goto L8d
            boolean r7 = r7.f5669a     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L8d
            if (r7 != r4) goto L8d
            app.chalo.domain.GetBookingHelpFaqsUseCase r7 = r6.b     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L8d
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L8d
            app.chalo.models.bookinghelp.BookingHelpFaqGroupType r8 = app.chalo.models.bookinghelp.BookingHelpFaqGroupType.Generic     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L8d
            java.lang.Object r10 = r7.a(r8, r0)     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L8d
            if (r10 != r1) goto L61
        L60:
            return r1
        L61:
            app.chalo.utils.ChaloUseCaseResult r10 = (app.chalo.utils.ChaloUseCaseResult) r10     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L8d
            boolean r7 = r10 instanceof app.chalo.utils.ChaloUseCaseResult.Failure     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L8d
            if (r7 == 0) goto L68
            goto L8d
        L68:
            boolean r7 = r10 instanceof app.chalo.utils.ChaloUseCaseResult.Success     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L8d
            if (r7 == 0) goto L87
            app.chalo.utils.ChaloUseCaseResult$Success r10 = (app.chalo.utils.ChaloUseCaseResult.Success) r10     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L8d
            java.lang.Object r7 = r10.f10419a     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L8d
            r8 = r7
            java.util.List r8 = (java.util.List) r8     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L8d
            java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L8d
            boolean r8 = r8.isEmpty()     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L8d
            if (r8 != 0) goto L7c
            goto L7d
        L7c:
            r7 = r5
        L7d:
            java.util.List r7 = (java.util.List) r7     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L8d
            if (r7 == 0) goto L8d
            app.chalo.models.bookinghelp.BookingHelpAvailabilityAppModel r8 = new app.chalo.models.bookinghelp.BookingHelpAvailabilityAppModel     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L8d
            r8.<init>(r7)     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L8d
            return r8
        L87:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L8d
            r7.<init>()     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L8d
            throw r7     // Catch: java.util.concurrent.CancellationException -> L2b java.lang.Exception -> L8d
        L8d:
            return r5
        L8e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.helper.BookingHelpConfigHelper.a(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl, boolean):java.lang.Object");
    }
}
