package app.chalo.walletframework.wallet.domain;

import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolver;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolverError;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/GetWalletStatusWithoutSyncUseCase;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetWalletStatusWithoutSyncUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletRepository f11058a;
    public final UserProfileDetailsProvider b;
    public final CheckIsWalletTimedOutUseCase c;
    public final WalletResolver d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11059a;

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
            f11059a = iArr;
        }
    }

    public GetWalletStatusWithoutSyncUseCase(WalletRepository walletRepository, UserProfileDetailsProvider userProfileDetailsProvider, CheckIsWalletTimedOutUseCase checkIsWalletTimedOutUseCase, WalletResolver walletResolver) {
        this.f11058a = walletRepository;
        this.b = userProfileDetailsProvider;
        this.c = checkIsWalletTimedOutUseCase;
        this.d = walletResolver;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0104  */
    /* JADX WARN: Code duplicated, block: B:61:0x010c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bc, code lost:
    
        if (r12 == r1) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.domain.GetWalletStatusWithoutSyncUseCase.a(app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
