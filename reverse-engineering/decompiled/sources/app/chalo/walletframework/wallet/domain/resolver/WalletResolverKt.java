package app.chalo.walletframework.wallet.domain.resolver;

import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"framework-wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WalletResolverKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11101a;

        static {
            int[] iArr = new int[WalletResolverError.values().length];
            try {
                iArr[WalletResolverError.WALLET_NOT_CACHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletResolverError.NOT_LOGGED_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11101a = iArr;
        }
    }

    public static final WalletResolverSimplifiedResult a(ChaloUseCaseResult chaloUseCaseResult) {
        Intrinsics.i(chaloUseCaseResult, "<this>");
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            return new WalletResolverSimplifiedResult.Wallet((WalletAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a);
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = WhenMappings.f11101a[((WalletResolverError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).ordinal()];
        if (i == 1) {
            return new WalletResolverSimplifiedResult.Wallet(null);
        }
        if (i == 2) {
            return WalletResolverSimplifiedResult.UserNotLogged.f11102a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
