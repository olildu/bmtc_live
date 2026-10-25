package app.chalo.wallet.ui.access;

import app.chalo.walletframework.wallet.data.model.WalletStatus;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
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
@DebugMetadata(c = "app.chalo.wallet.ui.access.WalletAccessManagerImpl$syncWalletAndFetchReclaimTime$2", f = "WalletAccessManagerImpl.kt", l = {263, 290, 308, 310, 384}, m = "invokeSuspend", v = 1)
final class WalletAccessManagerImpl$syncWalletAndFetchReclaimTime$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WalletTypeIdentifier $walletTypeIdentifier;
    Object L$0;
    int label;
    final /* synthetic */ WalletAccessManagerImpl this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10807a;

        static {
            int[] iArr = new int[WalletStatus.values().length];
            try {
                iArr[WalletStatus.USER_NOT_LOGGED_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletStatus.DOES_NOT_EXIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletStatus.ACTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletStatus.BLOCKED_FOR_BACKEND_RECLAIM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WalletStatus.BLOCKED_FOR_APP_RECLAIM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WalletStatus.FULL_KYC_NEEDED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[WalletStatus.BLOCKED_USER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[WalletStatus.CHALO_TIME_UNAVAILABLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[WalletStatus.KYC_INITIATED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[WalletStatus.WALLET_FETCH_PENDING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[WalletStatus.WALLET_TIMED_OUT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f10807a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletAccessManagerImpl$syncWalletAndFetchReclaimTime$2(WalletAccessManagerImpl walletAccessManagerImpl, WalletTypeIdentifier walletTypeIdentifier, Continuation continuation) {
        super(2, continuation);
        this.this$0 = walletAccessManagerImpl;
        this.$walletTypeIdentifier = walletTypeIdentifier;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalletAccessManagerImpl$syncWalletAndFetchReclaimTime$2(this.this$0, this.$walletTypeIdentifier, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WalletAccessManagerImpl$syncWalletAndFetchReclaimTime$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c4, code lost:
    
        if (r4.h(r2, r17) == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0299, code lost:
    
        if (r3.h(r2, r17) == r1) goto L85;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.wallet.ui.access.WalletAccessManagerImpl$syncWalletAndFetchReclaimTime$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
