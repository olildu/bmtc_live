package app.chalo.walletframework.wallet.domain;

import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.data.ClosedLoopWalletSetupConfig;
import app.chalo.data.WalletEnableConfig;
import app.chalo.data.WalletSetupConfiguration;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.features.wallet.WalletSyncRequest;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.model.appmodel.AllWalletsSyncResponseAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletMetaResponseAppModel;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolver;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolverError;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/WalletSyncOrchestratorImpl;", "Lapp/chalo/walletframework/wallet/domain/WalletSyncOrchestrator;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WalletSyncOrchestratorImpl implements WalletSyncOrchestrator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetWalletSetupConfigurationUseCase f11079a;
    public final UserProfileDetailsProvider b;
    public final WalletRepository c;
    public final WalletSyncUseCase d;
    public final WalletResolver e;
    public final CrashlyticsLogger f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11080a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[WalletResolverError.values().length];
            try {
                iArr[WalletResolverError.NOT_LOGGED_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletResolverError.WALLET_NOT_CACHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11080a = iArr;
            int[] iArr2 = new int[WalletSyncFailureReason.values().length];
            try {
                iArr2[WalletSyncFailureReason.KYC_NOT_DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[WalletSyncFailureReason.BLOCKED_FOR_APP_RECLAIM.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[WalletSyncFailureReason.CHALO_TIME_NOT_AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[WalletSyncFailureReason.API_FETCH_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[WalletSyncFailureReason.WALLET_TIMED_OUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[WalletSyncFailureReason.USER_NOT_LOGGED_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    public WalletSyncOrchestratorImpl(GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase, UserProfileDetailsProvider userProfileDetailsProvider, WalletRepository walletRepository, WalletSyncUseCase walletSyncUseCase, WalletResolver walletResolver, CrashlyticsLogger crashlyticsLogger) {
        this.f11079a = getWalletSetupConfigurationUseCase;
        this.b = userProfileDetailsProvider;
        this.c = walletRepository;
        this.d = walletSyncUseCase;
        this.e = walletResolver;
        this.f = crashlyticsLogger;
    }

    public static LinkedHashMap e(List list) {
        List list2 = list;
        int iG = MapsKt.g(CollectionsKt.v(list2, 10));
        if (iG < 16) {
            iG = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
        for (Object obj : list2) {
            WalletMetaResponseAppModel meta = (WalletMetaResponseAppModel) obj;
            Intrinsics.i(meta, "meta");
            String str = meta.c;
            linkedHashMap.put(str == null ? WalletTypeIdentifier.Companion.c() : WalletTypeIdentifier.Companion.a(str), obj);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        if (r8 == r1) goto L31;
     */
    @Override // app.chalo.walletframework.wallet.domain.WalletSyncOrchestrator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.domain.WalletSyncOrchestratorImpl.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.walletframework.wallet.domain.WalletSyncOrchestrator
    public final Object b(WalletSyncRequest walletSyncRequest, ContinuationImpl continuationImpl, boolean z) {
        return g(walletSyncRequest, continuationImpl, z);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:101:0x01d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:103:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:110:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:112:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:114:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:115:0x0200 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0202  */
    /* JADX WARN: Code duplicated, block: B:117:0x0206  */
    /* JADX WARN: Code duplicated, block: B:119:0x020e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0212  */
    /* JADX WARN: Code duplicated, block: B:127:0x0231  */
    /* JADX WARN: Code duplicated, block: B:129:0x023b  */
    /* JADX WARN: Code duplicated, block: B:131:0x023f  */
    /* JADX WARN: Code duplicated, block: B:136:0x025c  */
    /* JADX WARN: Code duplicated, block: B:138:0x021f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x01e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x011a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:? A[LOOP:1: B:61:0x010a->B:153:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0106  */
    /* JADX WARN: Code duplicated, block: B:63:0x0110  */
    /* JADX WARN: Code duplicated, block: B:68:0x012a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0133  */
    /* JADX WARN: Code duplicated, block: B:72:0x0138  */
    /* JADX WARN: Code duplicated, block: B:77:0x016a  */
    /* JADX WARN: Code duplicated, block: B:79:0x017e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0188 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:82:0x018c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01cb  */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0251, code lost:
    
        if (r1 == r3) goto L133;
     */
    @Override // app.chalo.walletframework.wallet.domain.WalletSyncOrchestrator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(boolean r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.domain.WalletSyncOrchestratorImpl.c(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0096  */
    /* JADX WARN: Code duplicated, block: B:40:0x00af A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:59:0x0104  */
    /* JADX WARN: Code duplicated, block: B:62:0x0109  */
    /* JADX WARN: Code duplicated, block: B:66:0x011c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x011d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0125  */
    /* JADX WARN: Code duplicated, block: B:71:0x012b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0133  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f9, code lost:
    
        if (r9.c.t(r10, r11, r0) == r1) goto L65;
     */
    @Override // app.chalo.walletframework.wallet.domain.WalletSyncOrchestrator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r10, boolean r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.domain.WalletSyncOrchestratorImpl.d(app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0066  */
    /* JADX WARN: Code duplicated, block: B:22:0x0076  */
    /* JADX WARN: Code duplicated, block: B:23:0x0080  */
    /* JADX WARN: Code duplicated, block: B:25:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x009f -> B:30:0x00a4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object f(java.util.List r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9, boolean r10) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof app.chalo.walletframework.wallet.domain.WalletSyncOrchestratorImpl$executeSyncRequestsSequentially$1
            if (r0 == 0) goto L13
            r0 = r9
            app.chalo.walletframework.wallet.domain.WalletSyncOrchestratorImpl$executeSyncRequestsSequentially$1 r0 = (app.chalo.walletframework.wallet.domain.WalletSyncOrchestratorImpl$executeSyncRequestsSequentially$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.walletframework.wallet.domain.WalletSyncOrchestratorImpl$executeSyncRequestsSequentially$1 r0 = new app.chalo.walletframework.wallet.domain.WalletSyncOrchestratorImpl$executeSyncRequestsSequentially$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            boolean r8 = r0.Z$0
            java.lang.Object r10 = r0.L$3
            app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r10 = (app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier) r10
            java.lang.Object r2 = r0.L$2
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r4 = r0.L$1
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r0.L$0
            java.util.Map r5 = (java.util.Map) r5
            kotlin.ResultKt.b(r9)
            goto La4
        L3a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L42:
            kotlin.ResultKt.b(r9)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            r9 = 10
            int r9 = kotlin.collections.CollectionsKt.v(r8, r9)
            int r9 = kotlin.collections.MapsKt.g(r9)
            r2 = 16
            if (r9 >= r2) goto L56
            r9 = r2
        L56:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r9)
            java.util.Iterator r8 = r8.iterator()
            r4 = r8
        L60:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto Lbd
            java.lang.Object r8 = r4.next()
            app.chalo.features.wallet.WalletSyncRequest r8 = (app.chalo.features.wallet.WalletSyncRequest) r8
            java.lang.String r9 = "request"
            kotlin.jvm.internal.Intrinsics.i(r8, r9)
            boolean r9 = r8 instanceof app.chalo.features.wallet.WalletSyncRequest.ClosedLoop
            if (r9 == 0) goto L80
            r9 = r8
            app.chalo.features.wallet.WalletSyncRequest$ClosedLoop r9 = (app.chalo.features.wallet.WalletSyncRequest.ClosedLoop) r9
            java.lang.String r9 = r9.b
            app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r9 = app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier.Companion.a(r9)
            goto L8c
        L80:
            app.chalo.features.wallet.WalletSyncRequest$SemiClosed r9 = app.chalo.features.wallet.WalletSyncRequest.SemiClosed.f2769a
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto Lb7
            app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r9 = app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier.Companion.c()
        L8c:
            r0.L$0 = r2
            r0.L$1 = r4
            r0.L$2 = r2
            r0.L$3 = r9
            r0.Z$0 = r10
            r0.label = r3
            java.lang.Object r8 = r7.g(r8, r0, r10)
            if (r8 != r1) goto L9f
            return r1
        L9f:
            r5 = r9
            r9 = r8
            r8 = r10
            r10 = r5
            r5 = r2
        La4:
            kotlin.Pair r6 = new kotlin.Pair
            r6.<init>(r10, r9)
            java.lang.Object r9 = r6.d()
            java.lang.Object r10 = r6.e()
            r2.put(r9, r10)
            r10 = r8
            r2 = r5
            goto L60
        Lb7:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        Lbd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.domain.WalletSyncOrchestratorImpl.f(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl, boolean):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(WalletSyncRequest walletSyncRequest, ContinuationImpl continuationImpl, boolean z) {
        WalletSyncOrchestratorImpl$executeWalletSync$1 walletSyncOrchestratorImpl$executeWalletSync$1;
        WalletSyncAttemptFailureReason walletSyncAttemptFailureReason;
        if (continuationImpl instanceof WalletSyncOrchestratorImpl$executeWalletSync$1) {
            walletSyncOrchestratorImpl$executeWalletSync$1 = (WalletSyncOrchestratorImpl$executeWalletSync$1) continuationImpl;
            int i = walletSyncOrchestratorImpl$executeWalletSync$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSyncOrchestratorImpl$executeWalletSync$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSyncOrchestratorImpl$executeWalletSync$1 = new WalletSyncOrchestratorImpl$executeWalletSync$1(this, continuationImpl);
            }
        } else {
            walletSyncOrchestratorImpl$executeWalletSync$1 = new WalletSyncOrchestratorImpl$executeWalletSync$1(this, continuationImpl);
        }
        Object objC = walletSyncOrchestratorImpl$executeWalletSync$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletSyncOrchestratorImpl$executeWalletSync$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            walletSyncOrchestratorImpl$executeWalletSync$1.label = 1;
            objC = this.d.c(walletSyncRequest, walletSyncOrchestratorImpl$executeWalletSync$1, z);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objC;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            return new ChaloUseCaseResult.Success(((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a);
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        switch (WhenMappings.b[((WalletSyncFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).ordinal()]) {
            case 1:
                walletSyncAttemptFailureReason = WalletSyncAttemptFailureReason.KYC_NOT_DONE;
                break;
            case 2:
                walletSyncAttemptFailureReason = WalletSyncAttemptFailureReason.BLOCKED_FOR_APP_RECLAIM;
                break;
            case 3:
                walletSyncAttemptFailureReason = WalletSyncAttemptFailureReason.CHALO_TIME_NOT_AVAILABLE;
                break;
            case 4:
                walletSyncAttemptFailureReason = WalletSyncAttemptFailureReason.SYNC_API_FETCH_FAILED;
                break;
            case 5:
                walletSyncAttemptFailureReason = WalletSyncAttemptFailureReason.WALLET_TIMED_OUT;
                break;
            case 6:
                walletSyncAttemptFailureReason = WalletSyncAttemptFailureReason.USER_NOT_LOGGED_IN;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new ChaloUseCaseResult.Failure(walletSyncAttemptFailureReason);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(String str, ContinuationImpl continuationImpl) throws Throwable {
        WalletSyncOrchestratorImpl$fetchAllWalletsFromBackend$1 walletSyncOrchestratorImpl$fetchAllWalletsFromBackend$1;
        Object objA;
        if (continuationImpl instanceof WalletSyncOrchestratorImpl$fetchAllWalletsFromBackend$1) {
            walletSyncOrchestratorImpl$fetchAllWalletsFromBackend$1 = (WalletSyncOrchestratorImpl$fetchAllWalletsFromBackend$1) continuationImpl;
            int i = walletSyncOrchestratorImpl$fetchAllWalletsFromBackend$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSyncOrchestratorImpl$fetchAllWalletsFromBackend$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSyncOrchestratorImpl$fetchAllWalletsFromBackend$1 = new WalletSyncOrchestratorImpl$fetchAllWalletsFromBackend$1(this, continuationImpl);
            }
        } else {
            walletSyncOrchestratorImpl$fetchAllWalletsFromBackend$1 = new WalletSyncOrchestratorImpl$fetchAllWalletsFromBackend$1(this, continuationImpl);
        }
        Object objR = walletSyncOrchestratorImpl$fetchAllWalletsFromBackend$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletSyncOrchestratorImpl$fetchAllWalletsFromBackend$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objR);
                WalletRepository walletRepository = this.c;
                walletSyncOrchestratorImpl$fetchAllWalletsFromBackend$1.label = 1;
                objR = walletRepository.r(str, walletSyncOrchestratorImpl$fetchAllWalletsFromBackend$1);
                if (objR == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objR);
            }
            objA = ((AllWalletsSyncResponseAppModel) objR).f11001a;
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        Throwable thA = Result.a(objA);
        if (thA == null) {
            return objA;
        }
        if (thA instanceof CancellationException) {
            throw thA;
        }
        this.f.b(thA);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable i(ContinuationImpl continuationImpl) {
        WalletSyncOrchestratorImpl$getSyncEnabledWalletTypeIdentifiers$1 walletSyncOrchestratorImpl$getSyncEnabledWalletTypeIdentifiers$1;
        if (continuationImpl instanceof WalletSyncOrchestratorImpl$getSyncEnabledWalletTypeIdentifiers$1) {
            walletSyncOrchestratorImpl$getSyncEnabledWalletTypeIdentifiers$1 = (WalletSyncOrchestratorImpl$getSyncEnabledWalletTypeIdentifiers$1) continuationImpl;
            int i = walletSyncOrchestratorImpl$getSyncEnabledWalletTypeIdentifiers$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSyncOrchestratorImpl$getSyncEnabledWalletTypeIdentifiers$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSyncOrchestratorImpl$getSyncEnabledWalletTypeIdentifiers$1 = new WalletSyncOrchestratorImpl$getSyncEnabledWalletTypeIdentifiers$1(this, continuationImpl);
            }
        } else {
            walletSyncOrchestratorImpl$getSyncEnabledWalletTypeIdentifiers$1 = new WalletSyncOrchestratorImpl$getSyncEnabledWalletTypeIdentifiers$1(this, continuationImpl);
        }
        Object objB = walletSyncOrchestratorImpl$getSyncEnabledWalletTypeIdentifiers$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletSyncOrchestratorImpl$getSyncEnabledWalletTypeIdentifiers$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            walletSyncOrchestratorImpl$getSyncEnabledWalletTypeIdentifiers$1.label = 1;
            objB = this.f11079a.b(walletSyncOrchestratorImpl$getSyncEnabledWalletTypeIdentifiers$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        WalletEnableConfig walletEnableConfig = ((WalletSetupConfiguration) objB).f2412a;
        ListBuilder listBuilderY = CollectionsKt.y();
        if (walletEnableConfig.f2410a) {
            listBuilderY.add(WalletTypeIdentifier.Companion.c());
        }
        List list = walletEnableConfig.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ClosedLoopWalletSetupConfig) obj).b) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            listBuilderY.add(WalletTypeIdentifier.Companion.a(((ClosedLoopWalletSetupConfig) obj2).f2344a));
        }
        return listBuilderY.g();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:22:0x007b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007c -> B:24:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object j(java.util.List r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof app.chalo.walletframework.wallet.domain.WalletSyncOrchestratorImpl$readCachedWallets$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.walletframework.wallet.domain.WalletSyncOrchestratorImpl$readCachedWallets$1 r0 = (app.chalo.walletframework.wallet.domain.WalletSyncOrchestratorImpl$readCachedWallets$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.walletframework.wallet.domain.WalletSyncOrchestratorImpl$readCachedWallets$1 r0 = new app.chalo.walletframework.wallet.domain.WalletSyncOrchestratorImpl$readCachedWallets$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r7 = r0.L$3
            java.lang.Object r2 = r0.L$2
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r4 = r0.L$1
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r0.L$0
            java.util.Map r5 = (java.util.Map) r5
            kotlin.ResultKt.b(r8)
            goto L7d
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            kotlin.ResultKt.b(r8)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r2 = 10
            int r2 = kotlin.collections.CollectionsKt.v(r7, r2)
            int r2 = kotlin.collections.MapsKt.g(r2)
            r4 = 16
            if (r2 >= r4) goto L53
            r2 = r4
        L53:
            r8.<init>(r2)
            java.util.Iterator r7 = r7.iterator()
            r4 = r7
            r2 = r8
        L5c:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L84
            java.lang.Object r7 = r4.next()
            r8 = r7
            app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r8 = (app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier) r8
            r0.L$0 = r2
            r0.L$1 = r4
            r0.L$2 = r2
            r0.L$3 = r7
            r0.label = r3
            app.chalo.walletframework.wallet.domain.resolver.WalletResolver r5 = r6.e
            java.lang.Object r8 = r5.e(r8, r0)
            if (r8 != r1) goto L7c
            return r1
        L7c:
            r5 = r2
        L7d:
            app.chalo.utils.ChaloUseCaseResult r8 = (app.chalo.utils.ChaloUseCaseResult) r8
            r2.put(r7, r8)
            r2 = r5
            goto L5c
        L84:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.domain.WalletSyncOrchestratorImpl.j(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0126  */
    /* JADX WARN: Code duplicated, block: B:58:0x014e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ea, code lost:
    
        if (r15 == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0140, code lost:
    
        if (r11.c.t(r15, r2, r0) == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0142, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0140 -> B:57:0x0143). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.util.List r12, app.chalo.walletframework.wallet.domain.WalletClassificationResult r13, boolean r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.domain.WalletSyncOrchestratorImpl.k(java.util.List, app.chalo.walletframework.wallet.domain.WalletClassificationResult, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
