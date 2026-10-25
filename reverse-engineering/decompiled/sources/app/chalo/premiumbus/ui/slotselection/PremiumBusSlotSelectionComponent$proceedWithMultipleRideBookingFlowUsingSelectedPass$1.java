package app.chalo.premiumbus.ui.slotselection;

import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.uistate.dialog.DateAvailabilityStatus;
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
@DebugMetadata(c = "app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$proceedWithMultipleRideBookingFlowUsingSelectedPass$1", f = "PremiumBusSlotSelectionComponent.kt", l = {2966, 2970, 2975, 2986, 2990, 3029, 3124, 3128}, m = "invokeSuspend", v = 1)
final class PremiumBusSlotSelectionComponent$proceedWithMultipleRideBookingFlowUsingSelectedPass$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $passId;
    final /* synthetic */ String $productSubType;
    final /* synthetic */ PBAvailableSlotsTripAppModel $slot;
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ PremiumBusSlotSelectionComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7856a;

        static {
            int[] iArr = new int[DateAvailabilityStatus.values().length];
            try {
                iArr[DateAvailabilityStatus.NEARBY_SLOTS_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DateAvailabilityStatus.FEW_SEATS_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DateAvailabilityStatus.AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DateAvailabilityStatus.SOLD_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DateAvailabilityStatus.NOT_AVAILABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DateAvailabilityStatus.NO_SLOTS_AVAILABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DateAvailabilityStatus.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f7856a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSlotSelectionComponent$proceedWithMultipleRideBookingFlowUsingSelectedPass$1(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, String str, String str2, PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusSlotSelectionComponent;
        this.$productSubType = str;
        this.$passId = str2;
        this.$slot = pBAvailableSlotsTripAppModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PremiumBusSlotSelectionComponent$proceedWithMultipleRideBookingFlowUsingSelectedPass$1 premiumBusSlotSelectionComponent$proceedWithMultipleRideBookingFlowUsingSelectedPass$1 = new PremiumBusSlotSelectionComponent$proceedWithMultipleRideBookingFlowUsingSelectedPass$1(this.this$0, this.$productSubType, this.$passId, this.$slot, continuation);
        premiumBusSlotSelectionComponent$proceedWithMultipleRideBookingFlowUsingSelectedPass$1.L$0 = obj;
        return premiumBusSlotSelectionComponent$proceedWithMultipleRideBookingFlowUsingSelectedPass$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusSlotSelectionComponent$proceedWithMultipleRideBookingFlowUsingSelectedPass$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x039b  */
    /* JADX WARN: Code duplicated, block: B:104:0x03af  */
    /* JADX WARN: Code duplicated, block: B:105:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:110:0x0413  */
    /* JADX WARN: Code duplicated, block: B:112:0x043f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0450  */
    /* JADX WARN: Code duplicated, block: B:117:0x0453  */
    /* JADX WARN: Code duplicated, block: B:119:0x0469  */
    /* JADX WARN: Code duplicated, block: B:120:0x046c A[PHI: r24
      0x046c: PHI (r24v5 kotlin.coroutines.intrinsics.CoroutineSingletons) = (r24v4 kotlin.coroutines.intrinsics.CoroutineSingletons), (r24v7 kotlin.coroutines.intrinsics.CoroutineSingletons) binds: [B:116:0x0450, B:118:0x0467] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:125:0x0480  */
    /* JADX WARN: Code duplicated, block: B:128:0x049c  */
    /* JADX WARN: Code duplicated, block: B:130:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:132:0x04ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:134:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:138:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:141:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:143:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:145:0x04ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:147:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:154:0x0520  */
    /* JADX WARN: Code duplicated, block: B:156:0x0531  */
    /* JADX WARN: Code duplicated, block: B:162:0x0545  */
    /* JADX WARN: Code duplicated, block: B:168:0x0579  */
    /* JADX WARN: Code duplicated, block: B:172:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:176:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:178:0x05db  */
    /* JADX WARN: Code duplicated, block: B:179:0x05de  */
    /* JADX WARN: Code duplicated, block: B:182:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:184:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:187:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:190:0x0604  */
    /* JADX WARN: Code duplicated, block: B:193:0x0611  */
    /* JADX WARN: Code duplicated, block: B:197:0x0617  */
    /* JADX WARN: Code duplicated, block: B:199:0x061b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:202:0x0622  */
    /* JADX WARN: Code duplicated, block: B:206:0x063e  */
    /* JADX WARN: Code duplicated, block: B:207:0x0643  */
    /* JADX WARN: Code duplicated, block: B:211:0x0662  */
    /* JADX WARN: Code duplicated, block: B:214:0x0676  */
    /* JADX WARN: Code duplicated, block: B:218:0x05cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x0613 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:220:0x060e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:? A[LOOP:1: B:188:0x05fe->B:221:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x04bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x04fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:231:0x044a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x047a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x053b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x054f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:? A[LOOP:8: B:160:0x053f->B:247:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0126  */
    /* JADX WARN: Code duplicated, block: B:30:0x0131  */
    /* JADX WARN: Code duplicated, block: B:33:0x0147  */
    /* JADX WARN: Code duplicated, block: B:36:0x0150  */
    /* JADX WARN: Code duplicated, block: B:38:0x015c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0161  */
    /* JADX WARN: Code duplicated, block: B:41:0x0165  */
    /* JADX WARN: Code duplicated, block: B:46:0x0184  */
    /* JADX WARN: Code duplicated, block: B:49:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:52:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:55:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:58:0x0210  */
    /* JADX WARN: Code duplicated, block: B:68:0x0250  */
    /* JADX WARN: Code duplicated, block: B:70:0x025e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0267  */
    /* JADX WARN: Code duplicated, block: B:75:0x0277  */
    /* JADX WARN: Code duplicated, block: B:76:0x027a  */
    /* JADX WARN: Code duplicated, block: B:81:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:86:0x032e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0332  */
    /* JADX WARN: Code duplicated, block: B:91:0x0350  */
    /* JADX WARN: Code duplicated, block: B:93:0x035f  */
    /* JADX WARN: Code duplicated, block: B:94:0x036c  */
    /* JADX WARN: Code duplicated, block: B:98:0x038b  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x017a, code lost:
    
        if (r0 == r12) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$proceedWithMultipleRideBookingFlowUsingSelectedPass$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
