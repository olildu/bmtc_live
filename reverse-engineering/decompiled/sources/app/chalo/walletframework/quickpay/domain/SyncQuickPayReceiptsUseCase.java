package app.chalo.walletframework.quickpay.domain;

import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.walletframework.quickpay.data.repository.QuickPayRepository;
import app.chalo.walletframework.wallet.domain.GetWalletIdUseCase;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/quickpay/domain/SyncQuickPayReceiptsUseCase;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SyncQuickPayReceiptsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QuickPayRepository f10943a;
    public final UserProfileDetailsProvider b;
    public final GetWalletIdUseCase c;

    public SyncQuickPayReceiptsUseCase(QuickPayRepository quickPayRepository, UserProfileDetailsProvider userProfileDetailsProvider, GetWalletIdUseCase getWalletIdUseCase) {
        this.f10943a = quickPayRepository;
        this.b = userProfileDetailsProvider;
        this.c = getWalletIdUseCase;
    }
}
