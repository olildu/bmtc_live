package app.chalo.walletframework.wallet.domain;

import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/RegisterClosedLoopWalletUseCase;", "", "RegisterClosedLoopWalletFailureReason", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RegisterClosedLoopWalletUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletRepository f11070a;
    public final UserProfileDetailsProvider b;
    public final CityProvider c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/RegisterClosedLoopWalletUseCase$RegisterClosedLoopWalletFailureReason;", "", "<init>", "(Ljava/lang/String;I)V", "USER_NOT_LOGGED_IN", "CITY_NOT_AVAILABLE", "INVALID_WALLET_TYPE", "SERVER_ERROR", "LOCAL_ERROR", "PARSE_ERROR", "UNKNOWN", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum RegisterClosedLoopWalletFailureReason {
        USER_NOT_LOGGED_IN,
        CITY_NOT_AVAILABLE,
        INVALID_WALLET_TYPE,
        SERVER_ERROR,
        LOCAL_ERROR,
        PARSE_ERROR,
        UNKNOWN;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        public static EnumEntries<RegisterClosedLoopWalletFailureReason> getEntries() {
            return $ENTRIES;
        }
    }

    public RegisterClosedLoopWalletUseCase(WalletRepository walletRepository, UserProfileDetailsProvider userProfileDetailsProvider, CityProvider cityProvider) {
        this.f11070a = walletRepository;
        this.b = userProfileDetailsProvider;
        this.c = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
    
        if (r10 == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.domain.RegisterClosedLoopWalletUseCase.a(app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
