package app.chalo.checkout.ui.screen.postpayment;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.features.checkout.CheckoutProductType;
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
@DebugMetadata(c = "app.chalo.checkout.ui.screen.postpayment.CheckoutPostPaymentComponent$handleProcessPostPaymentIntent$1", f = "CheckoutPostPaymentComponent.kt", l = {TypedValues.PositionType.TYPE_POSITION_TYPE, 522, 525, 529, 535, 540, 541, 542, 566, 569, 573, 577, 581}, m = "invokeSuspend", v = 1)
final class CheckoutPostPaymentComponent$handleProcessPostPaymentIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CheckoutPostPaymentComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1581a;

        static {
            int[] iArr = new int[CheckoutProductType.values().length];
            try {
                iArr[CheckoutProductType.WALLET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckoutProductType.CARD_RECHARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckoutProductType.ELECTRICITY_BILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CheckoutProductType.NCMC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CheckoutProductType.PREMIUM_RESERVE_TICKET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CheckoutProductType.INSTANT_TICKET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CheckoutProductType.SUPER_PASS_RIDE_PASS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CheckoutProductType.SUPER_PASS_MAGIC_PASS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CheckoutProductType.METRO_TICKET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CheckoutProductType.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CheckoutProductType.ONDC_TICKET.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CheckoutProductType.ONDC_METRO_TICKET.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CheckoutProductType.M_TICKET.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CheckoutProductType.MULTI_MODAL_GROUP_TICKET.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            f1581a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutPostPaymentComponent$handleProcessPostPaymentIntent$1(CheckoutPostPaymentComponent checkoutPostPaymentComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = checkoutPostPaymentComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutPostPaymentComponent$handleProcessPostPaymentIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutPostPaymentComponent$handleProcessPostPaymentIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0126  */
    /* JADX WARN: Code duplicated, block: B:63:0x0217 A[DONT_INVERT, PHI: r10
      0x0217: PHI (r10v4 int) = 
      (r10v0 int)
      (r10v0 int)
      (r10v0 int)
      (r10v0 int)
      (r10v0 int)
      (r10v0 int)
      (r10v0 int)
      (r10v0 int)
      (r10v1 int)
      (r10v3 int)
      (r10v5 int)
     binds: [B:54:0x01d5, B:51:0x01c8, B:48:0x01bb, B:45:0x01ac, B:30:0x00f3, B:27:0x00e3, B:24:0x00d3, B:21:0x00c3, B:62:0x020b, B:43:0x0147, B:7:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0219  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0143, code lost:
    
        if (r9 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0208, code lost:
    
        if (r2 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0226, code lost:
    
        if (kotlinx.coroutines.DelayKt.b(4000, r23) == r1) goto L66;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.ui.screen.postpayment.CheckoutPostPaymentComponent$handleProcessPostPaymentIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
