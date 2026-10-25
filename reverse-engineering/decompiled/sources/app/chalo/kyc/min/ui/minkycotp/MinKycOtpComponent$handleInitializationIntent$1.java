package app.chalo.kyc.min.ui.minkycotp;

import app.chalo.walletframework.wallet.data.model.WalletStatus;
import app.chalo.walletframework.wallet.domain.WalletSyncAttemptFailureReason;
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
@DebugMetadata(c = "app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent$handleInitializationIntent$1", f = "MinKycOtpComponent.kt", l = {330, 339, 343, 352, 353, 367, 370}, m = "invokeSuspend", v = 1)
final class MinKycOtpComponent$handleInitializationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MinKycOtpIntent.InitializationIntent $intent;
    int label;
    final /* synthetic */ MinKycOtpComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4142a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[WalletSyncAttemptFailureReason.values().length];
            try {
                iArr[WalletSyncAttemptFailureReason.USER_NOT_LOGGED_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletSyncAttemptFailureReason.BLOCKED_FOR_APP_RECLAIM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletSyncAttemptFailureReason.CHALO_TIME_NOT_AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletSyncAttemptFailureReason.SYNC_API_FETCH_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WalletSyncAttemptFailureReason.NO_INFORMATION_AVAILABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WalletSyncAttemptFailureReason.WALLET_TIMED_OUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[WalletSyncAttemptFailureReason.KYC_NOT_DONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f4142a = iArr;
            int[] iArr2 = new int[WalletStatus.values().length];
            try {
                iArr2[WalletStatus.BLOCKED_FOR_BACKEND_RECLAIM.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[WalletStatus.CHALO_TIME_UNAVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[WalletStatus.BLOCKED_USER.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[WalletStatus.BLOCKED_FOR_APP_RECLAIM.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[WalletStatus.WALLET_TIMED_OUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[WalletStatus.ACTIVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[WalletStatus.FULL_KYC_NEEDED.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[WalletStatus.DOES_NOT_EXIST.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[WalletStatus.WALLET_FETCH_PENDING.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[WalletStatus.USER_NOT_LOGGED_IN.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[WalletStatus.KYC_INITIATED.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MinKycOtpComponent$handleInitializationIntent$1(MinKycOtpComponent minKycOtpComponent, MinKycOtpIntent.InitializationIntent initializationIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = minKycOtpComponent;
        this.$intent = initializationIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MinKycOtpComponent$handleInitializationIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MinKycOtpComponent$handleInitializationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:30:0x0089 A[PHI: r7
      0x0089: PHI (r7v14 java.lang.Object) = (r7v13 java.lang.Object), (r7v0 java.lang.Object) binds: [B:28:0x0086, B:7:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x008f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00db  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f8  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r7 == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00af, code lost:
    
        if (app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent.F0(r7, r6) == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bd, code lost:
    
        if (r7.J0(r1, r6) == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e4, code lost:
    
        if (app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent.F0(r7, r6) == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f2, code lost:
    
        if (r7.J0(r1, r6) == r0) goto L53;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent$handleInitializationIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
