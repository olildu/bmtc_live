package app.chalo.bookingsuccess;

import app.chalo.premiumbus.data.models.app.PassTierType;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.bookingsuccess.DefaultBookingSuccessFlowDelegate$initialize$1", f = "DefaultBookingSuccessFlowDelegate.kt", l = {EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY, 76, EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID, EACTags.HISTORICAL_BYTES, 94, 101, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD, 117, 119, 120, 133, 150, 151, 152, 153}, m = "invokeSuspend", v = 1)
final class DefaultBookingSuccessFlowDelegate$initialize$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ DefaultBookingSuccessFlowDelegate this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1156a;

        static {
            int[] iArr = new int[PassTierType.values().length];
            try {
                iArr[PassTierType.PREMIUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PassTierType.VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PassTierType.REGULAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PassTierType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f1156a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultBookingSuccessFlowDelegate$initialize$1(DefaultBookingSuccessFlowDelegate defaultBookingSuccessFlowDelegate, Continuation continuation) {
        super(2, continuation);
        this.this$0 = defaultBookingSuccessFlowDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DefaultBookingSuccessFlowDelegate$initialize$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultBookingSuccessFlowDelegate$initialize$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0261  */
    /* JADX WARN: Code duplicated, block: B:114:0x02b9 A[PHI: r0 r1
      0x02b9: PHI (r0v74 java.lang.String) = (r0v72 java.lang.String), (r0v76 java.lang.String) binds: [B:112:0x02b6, B:9:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x02b9: PHI (r1v44 java.lang.Object) = (r1v43 java.lang.Object), (r1v46 java.lang.Object) binds: [B:112:0x02b6, B:9:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x02d0 A[PHI: r0 r1 r2
      0x02d0: PHI (r0v77 java.lang.String) = (r0v74 java.lang.String), (r0v80 java.lang.String) binds: [B:115:0x02cd, B:8:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x02d0: PHI (r1v47 java.lang.String) = (r1v45 java.lang.String), (r1v50 java.lang.String) binds: [B:115:0x02cd, B:8:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x02d0: PHI (r2v39 java.lang.Object) = (r2v38 java.lang.Object), (r2v42 java.lang.Object) binds: [B:115:0x02cd, B:8:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:120:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:31:0x010d A[PHI: r0 r1
      0x010d: PHI (r0v24 app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel) = 
      (r0v22 app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel)
      (r0v29 app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel)
     binds: [B:29:0x0109, B:21:0x00c4] A[DONT_GENERATE, DONT_INLINE]
      0x010d: PHI (r1v11 java.lang.Object) = (r1v10 java.lang.Object), (r1v13 java.lang.Object) binds: [B:29:0x0109, B:21:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0119  */
    /* JADX WARN: Code duplicated, block: B:34:0x011e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0134 A[PHI: r0 r1
      0x0134: PHI (r0v30 java.lang.Object) = (r0v26 java.lang.Object), (r0v34 java.lang.Object) binds: [B:36:0x0130, B:20:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x0134: PHI (r1v14 java.lang.String) = (r1v12 java.lang.String), (r1v15 java.lang.String) binds: [B:36:0x0130, B:20:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x01ca A[PHI: r0 r1
      0x01ca: PHI (r0v45 app.chalo.premiumbus.data.models.app.PassTierType) = (r0v42 app.chalo.premiumbus.data.models.app.PassTierType), (r0v50 app.chalo.premiumbus.data.models.app.PassTierType) binds: [B:60:0x01c6, B:14:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r1v22 java.lang.Object) = (r1v21 java.lang.Object), (r1v27 java.lang.Object) binds: [B:60:0x01c6, B:14:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x01d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:66:0x01da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:77:0x020c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0224  */
    /* JADX WARN: Code duplicated, block: B:84:0x0236  */
    /* JADX WARN: Code duplicated, block: B:85:0x0238 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0245  */
    /* JADX WARN: Code duplicated, block: B:94:0x024f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0251 A[ADDED_TO_REGION] */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0277, code lost:
    
        if (r0 == r6) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x030f, code lost:
    
        if (r0 == r6) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0148, code lost:
    
        if (r2 == r6) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0176, code lost:
    
        if (r0 == r6) goto L126;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.bookingsuccess.DefaultBookingSuccessFlowDelegate$initialize$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
