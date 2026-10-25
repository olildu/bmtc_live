package app.chalo.home.ui.history;

import app.chalo.features.productsync.constants.SuperPassApplicationStatus;
import app.chalo.features.productsync.constants.SuperPassStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.history.MyTicketsComponent$handleOnProductStatusCtaClickedIntent$1", f = "MyTicketsComponent.kt", l = {2598, 2623, 2662, 2663, 2667}, m = "invokeSuspend", v = 1)
final class MyTicketsComponent$handleOnProductStatusCtaClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MyTicketsViewIntent.OnProductStatusCtaClickedIntent $intent;
    int label;
    final /* synthetic */ MyTicketsComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3397a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[SuperPassStatus.values().length];
            try {
                iArr[SuperPassStatus.UNUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuperPassStatus.USED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SuperPassStatus.INACTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SuperPassStatus.EXPIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SuperPassStatus.CANCELLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SuperPassStatus.PAYMENT_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SuperPassStatus.PAYMENT_PROCESSING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SuperPassStatus.FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f3397a = iArr;
            int[] iArr2 = new int[SuperPassApplicationStatus.values().length];
            try {
                iArr2[SuperPassApplicationStatus.UNVERIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[SuperPassApplicationStatus.VERIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[SuperPassApplicationStatus.REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[SuperPassApplicationStatus.PAYMENT_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTicketsComponent$handleOnProductStatusCtaClickedIntent$1(MyTicketsViewIntent.OnProductStatusCtaClickedIntent onProductStatusCtaClickedIntent, MyTicketsComponent myTicketsComponent, Continuation continuation) {
        super(2, continuation);
        this.$intent = onProductStatusCtaClickedIntent;
        this.this$0 = myTicketsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MyTicketsComponent$handleOnProductStatusCtaClickedIntent$1(this.$intent, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MyTicketsComponent$handleOnProductStatusCtaClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f5, code lost:
    
        if (r8.m1(((app.chalo.home.domain.ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) r1).d, true, (app.chalo.home.domain.ChaloUserBookingType.SuperPassBooking) r1, r7) == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x013e, code lost:
    
        if (r8.m1(((app.chalo.home.domain.ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking) r1).d, true, (app.chalo.home.domain.ChaloUserBookingType.SuperPassBooking) r1, r7) == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0188, code lost:
    
        if (app.chalo.home.ui.history.MyTicketsComponent.F0(r8, r1, r7) == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a1, code lost:
    
        if (app.chalo.home.ui.history.MyTicketsComponent.G0(r8, r1, r7) == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01b4, code lost:
    
        if (app.chalo.home.ui.history.MyTicketsComponent.H0(r8, r1, r7) == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01b6, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.history.MyTicketsComponent$handleOnProductStatusCtaClickedIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
