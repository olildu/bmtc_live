package app.chalo.instantticket.ui.faredetails;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.instantticket.data.model.app.response.PassengerSelectionPolicy;
import app.chalo.productbooking.common.data.models.app.FareDetailsData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.instantticket.ui.faredetails.FareDetailsComponent$fetchFare$2", f = "FareDetailsComponent.kt", l = {TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR, 616, 626, 652, 662}, m = "invokeSuspend", v = 1)
final class FareDetailsComponent$fetchFare$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $couponId;
    final /* synthetic */ FareDetailsData $fareDetails;
    final /* synthetic */ FareDetailsScreenType $screenType;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ FareDetailsComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3907a;

        static {
            int[] iArr = new int[PassengerSelectionPolicy.values().length];
            try {
                iArr[PassengerSelectionPolicy.Multiple.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PassengerSelectionPolicy.Single.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f3907a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FareDetailsComponent$fetchFare$2(FareDetailsComponent fareDetailsComponent, FareDetailsScreenType fareDetailsScreenType, String str, FareDetailsData fareDetailsData, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fareDetailsComponent;
        this.$screenType = fareDetailsScreenType;
        this.$couponId = str;
        this.$fareDetails = fareDetailsData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FareDetailsComponent$fetchFare$2(this.this$0, this.$screenType, this.$couponId, this.$fareDetails, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FareDetailsComponent$fetchFare$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:112:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:119:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:121:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:123:0x0308  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e0 A[LOOP:4: B:36:0x00da->B:38:0x00e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0109  */
    /* JADX WARN: Code duplicated, block: B:46:0x0110  */
    /* JADX WARN: Code duplicated, block: B:48:0x011f  */
    /* JADX WARN: Code duplicated, block: B:50:0x012c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0144 A[LOOP:2: B:51:0x013e->B:53:0x0144, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x016b A[LOOP:3: B:55:0x0165->B:57:0x016b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x018d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x018f  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:79:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:82:0x0210  */
    /* JADX WARN: Code duplicated, block: B:85:0x0222 A[LOOP:0: B:83:0x021c->B:85:0x0222, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x0232  */
    /* JADX WARN: Code duplicated, block: B:88:0x023c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0241  */
    /* JADX WARN: Code duplicated, block: B:92:0x024c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0291  */
    /* JADX WARN: Code duplicated, block: B:96:0x0298  */
    /* JADX WARN: Code duplicated, block: B:98:0x029b  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b3, code lost:
    
        if (r11 == r1) goto L78;
     */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.instantticket.ui.faredetails.FareDetailsComponent$fetchFare$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
