package app.chalo.walletframework.wallet.domain;

import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.walletframework.wallet.data.model.CachedWalletStatus;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletStatusResponse;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/MergeCachedWalletAndFetchedWalletUseCase;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MergeCachedWalletAndFetchedWalletUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletRepository f11062a;
    public final GetWalletSetupConfigurationUseCase b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11063a;

        static {
            int[] iArr = new int[WalletStatusResponse.values().length];
            try {
                iArr[WalletStatusResponse.FULL_KYC_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletStatusResponse.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletStatusResponse.RECLAIM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletStatusResponse.BLOCKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f11063a = iArr;
        }
    }

    public MergeCachedWalletAndFetchedWalletUseCase(WalletRepository walletRepository, GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase) {
        this.f11062a = walletRepository;
        this.b = getWalletSetupConfigurationUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum a(String str, String str2, long j, CachedWalletStatus cachedWalletStatus, WalletStatusResponse walletStatusResponse, ContinuationImpl continuationImpl) {
        MergeCachedWalletAndFetchedWalletUseCase$getCachedWalletStatusAfterMerging$1 mergeCachedWalletAndFetchedWalletUseCase$getCachedWalletStatusAfterMerging$1;
        if (continuationImpl instanceof MergeCachedWalletAndFetchedWalletUseCase$getCachedWalletStatusAfterMerging$1) {
            mergeCachedWalletAndFetchedWalletUseCase$getCachedWalletStatusAfterMerging$1 = (MergeCachedWalletAndFetchedWalletUseCase$getCachedWalletStatusAfterMerging$1) continuationImpl;
            int i = mergeCachedWalletAndFetchedWalletUseCase$getCachedWalletStatusAfterMerging$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mergeCachedWalletAndFetchedWalletUseCase$getCachedWalletStatusAfterMerging$1.label = i - Integer.MIN_VALUE;
            } else {
                mergeCachedWalletAndFetchedWalletUseCase$getCachedWalletStatusAfterMerging$1 = new MergeCachedWalletAndFetchedWalletUseCase$getCachedWalletStatusAfterMerging$1(this, continuationImpl);
            }
        } else {
            mergeCachedWalletAndFetchedWalletUseCase$getCachedWalletStatusAfterMerging$1 = new MergeCachedWalletAndFetchedWalletUseCase$getCachedWalletStatusAfterMerging$1(this, continuationImpl);
        }
        Object objC = mergeCachedWalletAndFetchedWalletUseCase$getCachedWalletStatusAfterMerging$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mergeCachedWalletAndFetchedWalletUseCase$getCachedWalletStatusAfterMerging$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            int i3 = WhenMappings.f11063a[walletStatusResponse.ordinal()];
            if (i3 == 1) {
                return CachedWalletStatus.FULL_KYC_NEEDED;
            }
            if (i3 != 2) {
                if (i3 == 3) {
                    return CachedWalletStatus.BLOCKED_FOR_BACKEND_RECLAIM;
                }
                if (i3 == 4) {
                    return CachedWalletStatus.BLOCKED_USER;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (cachedWalletStatus == CachedWalletStatus.BLOCKED_FOR_APP_RECLAIM) {
                mergeCachedWalletAndFetchedWalletUseCase$getCachedWalletStatusAfterMerging$1.label = 1;
                objC = c(str, str2, j, mergeCachedWalletAndFetchedWalletUseCase$getCachedWalletStatusAfterMerging$1);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return CachedWalletStatus.ACTIVE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objC);
        if (!((Boolean) objC).booleanValue()) {
            return CachedWalletStatus.BLOCKED_FOR_APP_RECLAIM;
        }
        return CachedWalletStatus.ACTIVE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r13 == r0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(app.chalo.walletframework.wallet.data.model.appmodel.WalletResponseAppModel r10, long r11, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof app.chalo.walletframework.wallet.domain.MergeCachedWalletAndFetchedWalletUseCase$invoke$1
            if (r0 == 0) goto L14
            r0 = r13
            app.chalo.walletframework.wallet.domain.MergeCachedWalletAndFetchedWalletUseCase$invoke$1 r0 = (app.chalo.walletframework.wallet.domain.MergeCachedWalletAndFetchedWalletUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r8 = r0
            goto L1a
        L14:
            app.chalo.walletframework.wallet.domain.MergeCachedWalletAndFetchedWalletUseCase$invoke$1 r0 = new app.chalo.walletframework.wallet.domain.MergeCachedWalletAndFetchedWalletUseCase$invoke$1
            r0.<init>(r9, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r8.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L43
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r10 = r8.L$0
            app.chalo.walletframework.wallet.data.model.appmodel.WalletResponseAppModel r10 = (app.chalo.walletframework.wallet.data.model.appmodel.WalletResponseAppModel) r10
            kotlin.ResultKt.b(r13)
            goto L7b
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            long r11 = r8.J$0
            java.lang.Object r10 = r8.L$0
            app.chalo.walletframework.wallet.data.model.appmodel.WalletResponseAppModel r10 = (app.chalo.walletframework.wallet.data.model.appmodel.WalletResponseAppModel) r10
            kotlin.ResultKt.b(r13)
        L41:
            r4 = r11
            goto L59
        L43:
            kotlin.ResultKt.b(r13)
            java.lang.String r13 = r10.b
            java.lang.String r1 = r10.f11014a
            r8.L$0 = r10
            r8.J$0 = r11
            r8.label = r3
            app.chalo.walletframework.wallet.data.repository.WalletRepository r3 = r9.f11062a
            java.lang.Object r13 = r3.J(r13, r1, r8)
            if (r13 != r0) goto L41
            goto L7a
        L59:
            app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel r13 = (app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel) r13
            if (r13 == 0) goto L66
            app.chalo.walletframework.wallet.data.model.CachedWalletStatus r11 = r13.getC()
            if (r11 == 0) goto L66
        L63:
            r6 = r11
            r11 = r2
            goto L69
        L66:
            app.chalo.walletframework.wallet.data.model.CachedWalletStatus r11 = app.chalo.walletframework.wallet.data.model.CachedWalletStatus.BLOCKED_FOR_APP_RECLAIM
            goto L63
        L69:
            java.lang.String r2 = r10.b
            java.lang.String r3 = r10.f11014a
            app.chalo.walletframework.wallet.data.model.appmodel.WalletStatusResponse r7 = r10.c
            r8.L$0 = r10
            r8.label = r11
            r1 = r9
            java.lang.Enum r13 = r1.a(r2, r3, r4, r6, r7, r8)
            if (r13 != r0) goto L7b
        L7a:
            return r0
        L7b:
            app.chalo.walletframework.wallet.data.model.CachedWalletStatus r13 = (app.chalo.walletframework.wallet.data.model.CachedWalletStatus) r13
            app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel r10 = app.chalo.walletframework.wallet.data.mapper.WalletOneAppModelToAnotherAppModelMapperKt.b(r10, r13)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.domain.MergeCachedWalletAndFetchedWalletUseCase.b(app.chalo.walletframework.wallet.data.model.appmodel.WalletResponseAppModel, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (r12 == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r8, java.lang.String r9, long r10, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof app.chalo.walletframework.wallet.domain.MergeCachedWalletAndFetchedWalletUseCase$isAppReclaimDurationOver$1
            if (r0 == 0) goto L13
            r0 = r12
            app.chalo.walletframework.wallet.domain.MergeCachedWalletAndFetchedWalletUseCase$isAppReclaimDurationOver$1 r0 = (app.chalo.walletframework.wallet.domain.MergeCachedWalletAndFetchedWalletUseCase$isAppReclaimDurationOver$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.walletframework.wallet.domain.MergeCachedWalletAndFetchedWalletUseCase$isAppReclaimDurationOver$1 r0 = new app.chalo.walletframework.wallet.domain.MergeCachedWalletAndFetchedWalletUseCase$isAppReclaimDurationOver$1
            r0.<init>(r7, r12)
        L18:
            java.lang.Object r12 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r8 = r0.J$1
            long r10 = r0.J$0
            kotlin.ResultKt.b(r12)
            goto L6a
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            long r10 = r0.J$0
            kotlin.ResultKt.b(r12)
            goto L4c
        L3c:
            kotlin.ResultKt.b(r12)
            r0.J$0 = r10
            r0.label = r4
            app.chalo.walletframework.wallet.data.repository.WalletRepository r12 = r7.f11062a
            java.lang.Object r12 = r12.o(r8, r9, r0)
            if (r12 != r1) goto L4c
            goto L69
        L4c:
            java.lang.Number r12 = (java.lang.Number) r12
            long r8 = r12.longValue()
            r5 = -1
            int r12 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r12 != 0) goto L5b
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L5b:
            r0.J$0 = r10
            r0.J$1 = r8
            r0.label = r3
            app.chalo.domain.GetWalletSetupConfigurationUseCase r12 = r7.b
            java.lang.Object r12 = r12.b(r0)
            if (r12 != r1) goto L6a
        L69:
            return r1
        L6a:
            app.chalo.data.WalletSetupConfiguration r12 = (app.chalo.data.WalletSetupConfiguration) r12
            long r0 = r12.b
            long r10 = r10 - r8
            int r8 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r8 < 0) goto L74
            goto L75
        L74:
            r4 = 0
        L75:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.domain.MergeCachedWalletAndFetchedWalletUseCase.c(java.lang.String, java.lang.String, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
